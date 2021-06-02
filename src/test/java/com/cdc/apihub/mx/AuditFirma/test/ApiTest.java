package com.cdc.apihub.mx.AuditFirma.test;

import com.cdc.apihub.mx.AuditFirma.client.ApiClient;
import com.cdc.apihub.mx.AuditFirma.client.ApiException;
import com.cdc.apihub.mx.AuditFirma.client.ApiResponse;
import com.cdc.apihub.mx.AuditFirma.client.api.SustFirmaApi;
import com.cdc.apihub.mx.AuditFirma.client.model.CatalogoEstados;
import com.cdc.apihub.mx.AuditFirma.client.model.CatalogoTipoPersona;
import com.cdc.apihub.mx.AuditFirma.client.model.Domicilio;
import com.cdc.apihub.mx.AuditFirma.client.model.Persona;
import com.cdc.apihub.mx.AuditFirma.client.model.SustitucionNIPPeticion;
import com.cdc.apihub.mx.AuditFirma.client.model.SustitucionNIPRespuesta;

import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import okhttp3.OkHttpClient;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;

public class ApiTest {

	private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());
	private ApiClient apiClient = null;
	private final SustFirmaApi api = new SustFirmaApi();

	private String keystoreFile = "your_path_for_your_keystore/keystore.jks";
	private String cdcCertFile = "your_path_for_certificate_of_cdc/cdc_cert.pem";
	private String keystorePassword = "your_super_secure_keystore_password";
	private String keyAlias = "your_key_alias";
	private String keyPassword = "your_super_secure_password";
	
	private String usernameCDC = "your_username_otrorgante";
	private String passwordCDC = "your_password_otorgante";	
	
	private String url = "the_url";
	private String xApiKey = "X_Api_Key";
	
	private SignerInterceptor interceptor;

	@Before()
	public void setUp() {

		interceptor = new SignerInterceptor(keystoreFile, cdcCertFile, keystorePassword, keyAlias, keyPassword);
		this.apiClient = api.getApiClient();
		this.apiClient.setBasePath(url);
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
			    .readTimeout(30, TimeUnit.SECONDS)
			    .addInterceptor(interceptor)
			    .build();
		apiClient.setHttpClient(okHttpClient);
	}

	@Test
	public void nipTest() throws ApiException {

		SustitucionNIPPeticion peticion = new SustitucionNIPPeticion();
		Persona persona = new Persona();
		Domicilio domicilio = new Domicilio();

		Integer estatusOK = 200;
		Integer estatusNoContent = 204;

		try {

			domicilio.setCalleNumero("AV 535 84");
			domicilio.setColonia("SAN JUAN DE ARAGON 1RA SECC");
			domicilio.setCiudad("CIUDAD DE MEXICO");
			domicilio.setEstado(CatalogoEstados.CDMX);

			persona.setPrimerNombre("NOMBRE");
			persona.setSegundoNombre("SEGUNDONOMBRE");
			persona.setApellidoPaterno("PATERNO");
			persona.setApellidoMaterno("MATERNO");
			persona.setApellidoAdicional(null);
			persona.setRFC("PUAP850316MI1");
			persona.setDomicilio(domicilio);

			peticion.setFolioCDC(763211111);
			peticion.setFechaConsulta("2021/04/15");
			peticion.setHoraConsulta("10/12/35");
			peticion.setTipoConsulta(CatalogoTipoPersona.PF);
			peticion.setUsuario("NGA9915CC5");
			peticion.setFechaAprobacionConsulta("2021/04/15");
			peticion.setHoraAprobacionConsulta("10/12/35");
			peticion.setIngresoNuevamenteNIP(true);
			peticion.setRespuestaLeyendaAutorizacion(true);
			peticion.setAceptaTerminosCondiciones(true);
			peticion.setNumeroFirma("1234F");
			peticion.setPersona(persona);

			ApiResponse<?> response = api.genericNIP(this.xApiKey, this.usernameCDC, this.passwordCDC, peticion);

			Assert.assertTrue(estatusOK.equals(response.getStatusCode()));

			if (estatusOK.equals(response.getStatusCode())) {
				SustitucionNIPRespuesta responseOK = (SustitucionNIPRespuesta) response.getData();
				logger.info(responseOK.toString());
			}

		} catch (ApiException e) {
			if (!estatusNoContent.equals(e.getCode())) {
				logger.info(e.getResponseBody());
			}
			Assert.assertTrue(estatusOK.equals(e.getCode()));
		}
	}

}
