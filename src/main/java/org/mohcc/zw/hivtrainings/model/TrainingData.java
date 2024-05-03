package org.mohcc.zw.hivtrainings.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TrainingData {
	@Id
	private String training_id;
	private String basic_information_id;
	private String program_id;

	@ElementCollection
	private List<String> facilitator_id;

	private String funder_id;
	private String program_area_training_id;
	private int number_of_days;
	private LocalDate start_date;
	private LocalDate end_date;
	private LocalDate certified_date;
	private String type_id;

	@ElementCollection
	private List<String> method_id;

	private String comments;
	private String remarks;
	private String current_status_id;

}
