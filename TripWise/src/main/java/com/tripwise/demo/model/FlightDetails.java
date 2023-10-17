package com.tripwise.demo.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class FlightDetails {

	private Integer flightId;
	private FlightType type;
	private String source;
	private String destination;
	private boolean isDirect;
	private LocalDateTime departureTime;
	
}
