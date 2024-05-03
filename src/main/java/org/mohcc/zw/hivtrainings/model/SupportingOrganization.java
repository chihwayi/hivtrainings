package org.mohcc.zw.hivtrainings.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class SupportingOrganization {
	
	@Id
	private String organizationId;
	private String organizationName;

}
