package com.cdc.apihub.mx.AuditFirma.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.AuditFirma.client.model.Domicilio;

public class Persona {
	@SerializedName("primerNombre")
	private String primerNombre = null;
	@SerializedName("segundoNombre")
	private String segundoNombre = null;
	@SerializedName("apellidoPaterno")
	private String apellidoPaterno = null;
	@SerializedName("apellidoMaterno")
	private String apellidoMaterno = null;
	@SerializedName("apellidoAdicional")
	private String apellidoAdicional = null;
	@SerializedName("RFC")
	private String RFC = null;
	@SerializedName("domicilio")
	private Domicilio domicilio = null;

	public Persona primerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
		return this;
	}

	@ApiModelProperty(example = "MARGARITO", required = true, value = "Primer nombre del cliente como se consulto.")
	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public Persona segundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
		return this;
	}

	@ApiModelProperty(example = "FLORENCIO", value = "Segundo nombre del cliente como se consulto.")
	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public Persona apellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
		return this;
	}

	@ApiModelProperty(example = "LOPEZ", required = true, value = "Apellido paterno del cliente como se consulto.")
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public Persona apellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
		return this;
	}

	@ApiModelProperty(example = "CALIXTO", required = true, value = "Apellido materno del cliente como se consulto.")
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public Persona apellidoAdicional(String apellidoAdicional) {
		this.apellidoAdicional = apellidoAdicional;
		return this;
	}

	@ApiModelProperty(example = "PEREZ", value = "Apellido adicional del cliente como se consulto.")
	public String getApellidoAdicional() {
		return apellidoAdicional;
	}

	public void setApellidoAdicional(String apellidoAdicional) {
		this.apellidoAdicional = apellidoAdicional;
	}

	public Persona RFC(String RFC) {
		this.RFC = RFC;
		return this;
	}

	@ApiModelProperty(example = "LOCM840804", value = "Se refiere al RFC del cliente.")
	public String getRFC() {
		return RFC;
	}

	public void setRFC(String RFC) {
		this.RFC = RFC;
	}

	public Persona domicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Persona persona = (Persona) o;
		return Objects.equals(this.primerNombre, persona.primerNombre)
				&& Objects.equals(this.segundoNombre, persona.segundoNombre)
				&& Objects.equals(this.apellidoPaterno, persona.apellidoPaterno)
				&& Objects.equals(this.apellidoMaterno, persona.apellidoMaterno)
				&& Objects.equals(this.apellidoAdicional, persona.apellidoAdicional)
				&& Objects.equals(this.RFC, persona.RFC) && Objects.equals(this.domicilio, persona.domicilio);
	}

	@Override
	public int hashCode() {
		return Objects.hash(primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, apellidoAdicional, RFC,
				domicilio);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Persona {\n");

		sb.append("    primerNombre: ").append(toIndentedString(primerNombre)).append("\n");
		sb.append("    segundoNombre: ").append(toIndentedString(segundoNombre)).append("\n");
		sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
		sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
		sb.append("    apellidoAdicional: ").append(toIndentedString(apellidoAdicional)).append("\n");
		sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
		sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
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
