package com.cdc.apihub.mx.AuditFirma.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CatalogoTipoPersona.Adapter.class)
public enum CatalogoTipoPersona {

	PF("PF"),

	PM("PM");
	private String value;

	CatalogoTipoPersona(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static CatalogoTipoPersona fromValue(String text) {
		for (CatalogoTipoPersona b : CatalogoTipoPersona.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static class Adapter extends TypeAdapter<CatalogoTipoPersona> {
		@Override
		public void write(final JsonWriter jsonWriter, final CatalogoTipoPersona enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public CatalogoTipoPersona read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return CatalogoTipoPersona.fromValue(String.valueOf(value));
		}
	}
}
