package com.sample.config;

public class ModelMapperNativeInitializer {

	public static final Class<?>[] MODEL_MAPPER_CLASSES;

	private ModelMapperNativeInitializer() {
	}

	static {
		MODEL_MAPPER_CLASSES = new Class<?>[] { loadClass("com.sample.model.map.SourceToDestinationMap") };
	}

	private static Class<?> loadClass(String className) {

		try {
			return Class.forName(className);
		} catch (ClassNotFoundException ex) {
			throw new RuntimeException(ex);
		}
	}

}
