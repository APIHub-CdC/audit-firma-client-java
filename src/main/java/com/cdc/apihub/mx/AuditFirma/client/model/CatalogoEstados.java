package com.cdc.apihub.mx.AuditFirma.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CatalogoEstados.Adapter.class)
public enum CatalogoEstados {

	CDMX("CDMX"),

	AGS("AGS"),

	MOR("MOR"),

	BCN("BCN"),

	NAY("NAY"),

	BCS("BCS"),

	NL("NL"),

	CAM("CAM"),

	OAX("OAX"),

	CHS("CHS"),

	PUE("PUE"),

	CHI("CHI"),

	QRO("QRO"),

	COA("COA"),

	QR("QR"),

	COL("COL"),

	SLP("SLP"),

	DF("DF"),

	SIN("SIN"),

	DGO("DGO"),

	SON("SON"),

	EM("EM"),

	TAB("TAB"),

	GTO("GTO"),

	TAM("TAM"),

	GRO("GRO"),

	TLAX("TLAX"),

	HGO("HGO"),

	VER("VER"),

	JAL("JAL"),

	YUC("YUC"),

	MICH("MICH"),

	ZAC("ZAC");
	private String value;

	CatalogoEstados(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static CatalogoEstados fromValue(String text) {
		for (CatalogoEstados b : CatalogoEstados.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static class Adapter extends TypeAdapter<CatalogoEstados> {
		@Override
		public void write(final JsonWriter jsonWriter, final CatalogoEstados enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public CatalogoEstados read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return CatalogoEstados.fromValue(String.valueOf(value));
		}
	}
}
