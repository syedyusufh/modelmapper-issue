package com.sample.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sample.model.map.SourceToDestinationMap;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Configuration
public class ModelMapperConfig {

	private SourceToDestinationMap sourceToDestinationMap;

	@Bean
	ModelMapper modelMapper() {

		var modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		modelMapper.addMappings(sourceToDestinationMap);

		return modelMapper;
	}

}
