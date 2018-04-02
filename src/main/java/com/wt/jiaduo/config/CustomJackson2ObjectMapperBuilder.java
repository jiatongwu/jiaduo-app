package com.wt.jiaduo.config;

import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomJackson2ObjectMapperBuilder extends Jackson2ObjectMapperBuilder {

	public CustomJackson2ObjectMapperBuilder() {

		super();

	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends ObjectMapper> T build() {
		// TODO Auto-generated method stub
		// return super.build();
		ObjectMapper objectMapper = super.build();

		objectMapper.setSerializerProvider(new CustomSerializerProvider());

		return (T) objectMapper;
	}

	// @Override
	//
	// public T build() {
	//
	// ObjectMapper objectMapper = super.build();
	//
	// objectMapper.setSerializerProvider(new CustomSerializerProvider());
	//
	// return (T) objectMapper;
	//
	// }

}
