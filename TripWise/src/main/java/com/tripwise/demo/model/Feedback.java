package com.tripwise.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class Feedback {

	private Integer feedbackId;
	private LocalDateTime dateTime;
	
	@Column(columnDefinition = "TEXT")
	private String feedbackDescription;
	
	private Integer rating;
}
