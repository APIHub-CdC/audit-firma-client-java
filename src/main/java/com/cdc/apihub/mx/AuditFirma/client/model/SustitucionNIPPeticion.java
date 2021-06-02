package com.cdc.apihub.mx.AuditFirma.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.AuditFirma.client.model.CatalogoTipoPersona;
import com.cdc.apihub.mx.AuditFirma.client.model.Persona;

@ApiModel(description = "Datos para NIP.")
public class SustitucionNIPPeticion {
	@SerializedName("folioCDC")
	private Integer folioCDC = null;
	@SerializedName("fechaConsulta")
	private String fechaConsulta = null;
	@SerializedName("horaConsulta")
	private String horaConsulta = null;
	@SerializedName("tipoConsulta")
	private CatalogoTipoPersona tipoConsulta = null;
	@SerializedName("usuario")
	private String usuario = null;
	@SerializedName("fechaAprobacionConsulta")
	private String fechaAprobacionConsulta = null;
	@SerializedName("horaAprobacionConsulta")
	private String horaAprobacionConsulta = null;
	@SerializedName("ingresoNuevamenteNIP")
	private Boolean ingresoNuevamenteNIP = null;
	@SerializedName("respuestaLeyendaAutorizacion")
	private Boolean respuestaLeyendaAutorizacion = null;
	@SerializedName("aceptaTerminosCondiciones")
	private Boolean aceptaTerminosCondiciones = null;
	@SerializedName("numeroFirma")
	private String numeroFirma = null;
	@SerializedName("persona")
	private Persona persona = null;

	public SustitucionNIPPeticion folioCDC(Integer folioCDC) {
		this.folioCDC = folioCDC;
		return this;
	}

	@ApiModelProperty(example = "763211111", required = true, value = "Número de folio de consulta generado por Circulo de Crédito al concluir la consulta.")
	public Integer getFolioCDC() {
		return folioCDC;
	}

	public void setFolioCDC(Integer folioCDC) {
		this.folioCDC = folioCDC;
	}

	public SustitucionNIPPeticion fechaConsulta(String fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
		return this;
	}

	@ApiModelProperty(example = "2021/04/15", required = true, value = "Fecha en la que se realizo la consulta en Circulo de Crédito.")
	public String getFechaConsulta() {
		return fechaConsulta;
	}

	public void setFechaConsulta(String fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}

	public SustitucionNIPPeticion horaConsulta(String horaConsulta) {
		this.horaConsulta = horaConsulta;
		return this;
	}

	@ApiModelProperty(example = "10/12/35", required = true, value = "Se refiere a la hora en la que se realizó la consulta en Circulo de Crédito. (Formato de 24 horas).")
	public String getHoraConsulta() {
		return horaConsulta;
	}

	public void setHoraConsulta(String horaConsulta) {
		this.horaConsulta = horaConsulta;
	}

	public SustitucionNIPPeticion tipoConsulta(CatalogoTipoPersona tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public CatalogoTipoPersona getTipoConsulta() {
		return tipoConsulta;
	}

	public void setTipoConsulta(CatalogoTipoPersona tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	public SustitucionNIPPeticion usuario(String usuario) {
		this.usuario = usuario;
		return this;
	}

	@ApiModelProperty(example = "NGA9915CC5", required = true, value = "Se refiere al usuario de consulta del otorgante que realizo la consulta a Circulo de Crédito.")
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public SustitucionNIPPeticion fechaAprobacionConsulta(String fechaAprobacionConsulta) {
		this.fechaAprobacionConsulta = fechaAprobacionConsulta;
		return this;
	}

	@ApiModelProperty(example = "2021/04/15", required = true, value = "Se refiere a la fecha en la que el cliente aprueba ser consultado en Circulo de Crédito.")
	public String getFechaAprobacionConsulta() {
		return fechaAprobacionConsulta;
	}

	public void setFechaAprobacionConsulta(String fechaAprobacionConsulta) {
		this.fechaAprobacionConsulta = fechaAprobacionConsulta;
	}

	public SustitucionNIPPeticion horaAprobacionConsulta(String horaAprobacionConsulta) {
		this.horaAprobacionConsulta = horaAprobacionConsulta;
		return this;
	}

	@ApiModelProperty(example = "10/12/35", required = true, value = "Se refiere a la hora en la que el cliente aprueba ser consultado en Circulo de Crédito. (Formato de 24 horas).")
	public String getHoraAprobacionConsulta() {
		return horaAprobacionConsulta;
	}

	public void setHoraAprobacionConsulta(String horaAprobacionConsulta) {
		this.horaAprobacionConsulta = horaAprobacionConsulta;
	}

	public SustitucionNIPPeticion ingresoNuevamenteNIP(Boolean ingresoNuevamenteNIP) {
		this.ingresoNuevamenteNIP = ingresoNuevamenteNIP;
		return this;
	}

	@ApiModelProperty(example = "true", required = true, value = "Se refiere a sí el ciente confirmo el NIP para la aprobación de la consulta en Circulo de Crédito")
	public Boolean isIngresoNuevamenteNIP() {
		return ingresoNuevamenteNIP;
	}

	public void setIngresoNuevamenteNIP(Boolean ingresoNuevamenteNIP) {
		this.ingresoNuevamenteNIP = ingresoNuevamenteNIP;
	}

	public SustitucionNIPPeticion respuestaLeyendaAutorizacion(Boolean respuestaLeyendaAutorizacion) {
		this.respuestaLeyendaAutorizacion = respuestaLeyendaAutorizacion;
		return this;
	}

	@ApiModelProperty(example = "true", required = true, value = "Se refiere a la respuesta que el ciente da a la leyenda de autorización de consulta en Circulo de Crédito")
	public Boolean isRespuestaLeyendaAutorizacion() {
		return respuestaLeyendaAutorizacion;
	}

	public void setRespuestaLeyendaAutorizacion(Boolean respuestaLeyendaAutorizacion) {
		this.respuestaLeyendaAutorizacion = respuestaLeyendaAutorizacion;
	}

	public SustitucionNIPPeticion aceptaTerminosCondiciones(Boolean aceptaTerminosCondiciones) {
		this.aceptaTerminosCondiciones = aceptaTerminosCondiciones;
		return this;
	}

	@ApiModelProperty(example = "true", required = true, value = "Aceptación que compruebe la relación jurídica antes de la consulta")
	public Boolean isAceptaTerminosCondiciones() {
		return aceptaTerminosCondiciones;
	}

	public void setAceptaTerminosCondiciones(Boolean aceptaTerminosCondiciones) {
		this.aceptaTerminosCondiciones = aceptaTerminosCondiciones;
	}

	public SustitucionNIPPeticion numeroFirma(String numeroFirma) {
		this.numeroFirma = numeroFirma;
		return this;
	}

	@ApiModelProperty(example = "1234F", required = true, value = "Se refiere al nip o número de firma")
	public String getNumeroFirma() {
		return numeroFirma;
	}

	public void setNumeroFirma(String numeroFirma) {
		this.numeroFirma = numeroFirma;
	}

	public SustitucionNIPPeticion persona(Persona persona) {
		this.persona = persona;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SustitucionNIPPeticion sustitucionNIPPeticion = (SustitucionNIPPeticion) o;
		return Objects.equals(this.folioCDC, sustitucionNIPPeticion.folioCDC)
				&& Objects.equals(this.fechaConsulta, sustitucionNIPPeticion.fechaConsulta)
				&& Objects.equals(this.horaConsulta, sustitucionNIPPeticion.horaConsulta)
				&& Objects.equals(this.tipoConsulta, sustitucionNIPPeticion.tipoConsulta)
				&& Objects.equals(this.usuario, sustitucionNIPPeticion.usuario)
				&& Objects.equals(this.fechaAprobacionConsulta, sustitucionNIPPeticion.fechaAprobacionConsulta)
				&& Objects.equals(this.horaAprobacionConsulta, sustitucionNIPPeticion.horaAprobacionConsulta)
				&& Objects.equals(this.ingresoNuevamenteNIP, sustitucionNIPPeticion.ingresoNuevamenteNIP)
				&& Objects.equals(this.respuestaLeyendaAutorizacion,
						sustitucionNIPPeticion.respuestaLeyendaAutorizacion)
				&& Objects.equals(this.aceptaTerminosCondiciones, sustitucionNIPPeticion.aceptaTerminosCondiciones)
				&& Objects.equals(this.numeroFirma, sustitucionNIPPeticion.numeroFirma)
				&& Objects.equals(this.persona, sustitucionNIPPeticion.persona);
	}

	@Override
	public int hashCode() {
		return Objects.hash(folioCDC, fechaConsulta, horaConsulta, tipoConsulta, usuario, fechaAprobacionConsulta,
				horaAprobacionConsulta, ingresoNuevamenteNIP, respuestaLeyendaAutorizacion, aceptaTerminosCondiciones,
				numeroFirma, persona);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SustitucionNIPPeticion {\n");

		sb.append("    folioCDC: ").append(toIndentedString(folioCDC)).append("\n");
		sb.append("    fechaConsulta: ").append(toIndentedString(fechaConsulta)).append("\n");
		sb.append("    horaConsulta: ").append(toIndentedString(horaConsulta)).append("\n");
		sb.append("    tipoConsulta: ").append(toIndentedString(tipoConsulta)).append("\n");
		sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
		sb.append("    fechaAprobacionConsulta: ").append(toIndentedString(fechaAprobacionConsulta)).append("\n");
		sb.append("    horaAprobacionConsulta: ").append(toIndentedString(horaAprobacionConsulta)).append("\n");
		sb.append("    ingresoNuevamenteNIP: ").append(toIndentedString(ingresoNuevamenteNIP)).append("\n");
		sb.append("    respuestaLeyendaAutorizacion: ").append(toIndentedString(respuestaLeyendaAutorizacion))
				.append("\n");
		sb.append("    aceptaTerminosCondiciones: ").append(toIndentedString(aceptaTerminosCondiciones)).append("\n");
		sb.append("    numeroFirma: ").append(toIndentedString(numeroFirma)).append("\n");
		sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
