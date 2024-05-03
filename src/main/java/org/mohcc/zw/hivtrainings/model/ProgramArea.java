package org.mohcc.zw.hivtrainings.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProgramArea {
	
	@Id
	private String programId;
	private String programName;

}
