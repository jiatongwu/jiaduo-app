package com.wt.jiaduo.config;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

@SuppressWarnings("rawtypes")
public class NullIntegerJsonSerializer extends JsonSerializer {

	public static final NullIntegerJsonSerializer INSTANCE = new NullIntegerJsonSerializer();
	
	@Override
	public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {

		if (value == null) {

			gen.writeString("");

		} else {

			gen.writeObject(value);

		}

	}

	@Override

	public Class handledType() {

		return Object.class;

	}

}
