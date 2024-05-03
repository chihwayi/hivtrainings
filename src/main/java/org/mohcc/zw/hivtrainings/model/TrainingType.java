package org.mohcc.zw.hivtrainings.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TrainingType {
	
	@Id
	private String typeId;	
	private String typeName;

}
