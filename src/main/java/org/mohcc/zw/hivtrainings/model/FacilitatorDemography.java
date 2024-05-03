package org.mohcc.zw.hivtrainings.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class FacilitatorDemography {
    @Id
    private String facilitator_id;
    private String basic_information_id;
    private String name;
    private String surname;
    private String program_area_id;

    public FacilitatorDemography() {
    }

    public FacilitatorDemography(String facilitator_id, String basic_information_id, String name, String surname, String program_area_id) {
        this.facilitator_id = facilitator_id;
        this.basic_information_id = basic_information_id;
        this.name = name;
        this.surname = surname;
        this.program_area_id = program_area_id;
    }
}
