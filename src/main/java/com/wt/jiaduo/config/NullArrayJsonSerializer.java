package com.wt.jiaduo.config;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

@SuppressWarnings("rawtypes")
public class NullArrayJsonSerializer extends JsonSerializer {

	public static final NullArrayJsonSerializer INSTANCE = new NullArrayJsonSerializer();

	@Override

	public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {

		if (value == null) {

			gen.writeStartArray();

			gen.writeEndArray();

		} else {

			gen.writeObject(value);

		}

	}

	@Override
	public Class handledType() {

		return Object.class;

	}

}
