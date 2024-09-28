package com.sample.model.map;

import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;

import com.sample.model.dto.Destination;
import com.sample.model.dto.Source;

@Component
public class SourceToDestinationMap extends PropertyMap<Source, Destination> {

	@Override
	protected void configure() {

		map().setFName(source.getFirstName());
		map().setLName(source.getLastName());
	}

}
