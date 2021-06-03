package com.cdc.apihub.mx.AuditFirma.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Datos de respuesta para NIP.")
public class SustitucionNIPRespuesta {
	@SerializedName("folioCDC")
	private Integer folioCDC = null;

	public SustitucionNIPRespuesta folioCDC(Integer folioCDC) {
		this.folioCDC = folioCDC;
		return this;
	}

	@ApiModelProperty(example = "763211111", value = "Número de folio de consulta generado por Circulo de Crédito al concluir la consulta.")
	public Integer getFolioCDC() {
		return folioCDC;
	}

	public void setFolioCDC(Integer folioCDC) {
		this.folioCDC = folioCDC;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SustitucionNIPRespuesta sustitucionNIPRespuesta = (SustitucionNIPRespuesta) o;
		return Objects.equals(this.folioCDC, sustitucionNIPRespuesta.folioCDC);
	}

	@Override
	public int hashCode() {
		return Objects.hash(folioCDC);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SustitucionNIPRespuesta {\n");

		sb.append("    folioCDC: ").append(toIndentedString(folioCDC)).append("\n");
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
