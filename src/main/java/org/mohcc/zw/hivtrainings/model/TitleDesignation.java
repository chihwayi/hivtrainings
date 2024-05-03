package org.mohcc.zw.hivtrainings.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class TitleDesignation {
	@Id
	private String title_id;
	private String designation_id;
	private String title;
	private String designation;
	
	public TitleDesignation(String title_id, String designation_id, String title, String designation) {
		this.title_id = title_id;
		this.designation_id = designation_id;
		this.title = title;
		this.designation = designation;
	}
	public TitleDesignation() {
	}
	
	

}
