package com.wt.jiaduo.config;

import java.util.Date;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;

public class CustomSerializerProvider extends DefaultSerializerProvider {

	/**
	 * 
	 */
	private static final long serialVersionUID = 514643841139286571L;

	public CustomSerializerProvider() {

		super();

	}

	public CustomSerializerProvider(SerializerProvider src, SerializationConfig config, SerializerFactory f) {

		super(src, config, f);

	}

	@Override

	public DefaultSerializerProvider createInstance(SerializationConfig config, SerializerFactory jsf) {

		return new CustomSerializerProvider(this, config, jsf);

	}

	
	@SuppressWarnings("unchecked")
	@Override
	public JsonSerializer<Object> findNullValueSerializer(BeanProperty property) throws JsonMappingException {

		JavaType type = property.getType();

		if (type.getRawClass().equals(String.class)) {

			return NullStringJsonSerializer.INSTANCE;

		}
		if (type.getRawClass().equals(Date.class)) {
			return NullDateJsonSerializer.INSTANCE;

		}
		if (type.getRawClass().equals(Integer.class)) {
			return NullIntegerJsonSerializer.INSTANCE;

		}

		if (type.isArrayType() || type.isCollectionLikeType()) {

			return NullArrayJsonSerializer.INSTANCE;

		}

		return super.findNullValueSerializer(property);

	}

}
