package com.cdc.apihub.mx.AuditFirma.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.AuditFirma.client.model.CatalogoEstados;

public class Domicilio {
	@SerializedName("calleNumero")
	private String calleNumero = null;
	@SerializedName("colonia")
	private String colonia = null;
	@SerializedName("ciudad")
	private String ciudad = null;
	@SerializedName("estado")
	private CatalogoEstados estado = null;

	public Domicilio calleNumero(String calleNumero) {
		this.calleNumero = calleNumero;
		return this;
	}

	@ApiModelProperty(example = "LOPE DE VEGA 39", required = true, value = "Se refiere a calle y numero del cliente como se capturo en su consulta.")
	public String getCalleNumero() {
		return calleNumero;
	}

	public void setCalleNumero(String calleNumero) {
		this.calleNumero = calleNumero;
	}

	public Domicilio colonia(String colonia) {
		this.colonia = colonia;
		return this;
	}

	@ApiModelProperty(example = "SAN RAFAEL", value = "Se refiere a la colonia del domicilio del cliente como se capturo en su consulta.")
	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public Domicilio ciudad(String ciudad) {
		this.ciudad = ciudad;
		return this;
	}

	@ApiModelProperty(example = "CDMX", value = "Se refiere a la ciudad del domicilio del cliente como se capturo en su consulta.")
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Domicilio estado(CatalogoEstados estado) {
		this.estado = estado;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public CatalogoEstados getEstado() {
		return estado;
	}

	public void setEstado(CatalogoEstados estado) {
		this.estado = estado;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Domicilio domicilio = (Domicilio) o;
		return Objects.equals(this.calleNumero, domicilio.calleNumero)
				&& Objects.equals(this.colonia, domicilio.colonia) && Objects.equals(this.ciudad, domicilio.ciudad)
				&& Objects.equals(this.estado, domicilio.estado);
	}

	@Override
	public int hashCode() {
		return Objects.hash(calleNumero, colonia, ciudad, estado);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Domicilio {\n");

		sb.append("    calleNumero: ").append(toIndentedString(calleNumero)).append("\n");
		sb.append("    colonia: ").append(toIndentedString(colonia)).append("\n");
		sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
		sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
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
