package org.mohcc.zw.hivtrainings.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Title {
	@Id
	private String title_id;
	private String title;

}
