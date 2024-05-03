package org.mohcc.zw.hivtrainings.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TrainingMethod {
	
	@Id
	private String methodId;
	private String methodName;

}
