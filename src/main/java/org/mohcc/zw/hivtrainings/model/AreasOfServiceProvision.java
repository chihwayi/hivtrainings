package org.mohcc.zw.hivtrainings.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AreasOfServiceProvision {
    @Id
    private String areas_of_service_provision_id;

    @Column(name = "basic_information_id", nullable = false, unique = true)
    private String basic_information_id;

    private String service_area;
    private String trainer;

}
