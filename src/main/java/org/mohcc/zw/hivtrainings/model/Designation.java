package org.mohcc.zw.hivtrainings.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Designation {
	@Id
	private String designation_id;
	
	@Column(name = "title_id", nullable = false, unique = false)
	private String title_id;
	private String designation;

}
