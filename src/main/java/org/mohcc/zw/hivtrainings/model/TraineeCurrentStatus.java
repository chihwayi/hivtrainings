package org.mohcc.zw.hivtrainings.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class TraineeCurrentStatus {

    @Id
    private String status_id;
    private String status_description;
}
