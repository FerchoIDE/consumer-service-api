package com.posadas.consumer.api;

import com.posadas.consumer.api.model.base.ContentFacility;
import com.posadas.consumer.api.model.base.ContentHotel;
import com.posadas.consumer.api.model.base.ContentRate;
import com.posadas.consumer.api.model.base.ContentRoom;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.util.LinkedMultiValueMap;

/**
 * @author Fernando
 */
public interface ConsumerServiceApi {
	
	public String getEndPointResponse(int timeoutInSeconds, String url, HttpMethod method, HttpEntity<?> entity,
			LinkedMultiValueMap<?, ?> bodyMap);

	public String MappXMLToObjectJson(String xmlString);

	public List<ContentHotel> MappXMLToObjectModelHotels(String xmlString);

	public List<ContentRoom> MappXMLToObjectModelRooms(String xmlString);

	public List<ContentFacility> MappXMLToObjectModelFacility(String xmlString);

	public List<ContentRate> MappXMLToObjectModelRate(String xmlString);


}