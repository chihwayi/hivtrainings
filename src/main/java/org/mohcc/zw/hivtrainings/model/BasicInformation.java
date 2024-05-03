package org.mohcc.zw.hivtrainings.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BasicInformation {
    @Id
    @Column(length = 20) // Set the length for VARCHAR(20)
    private String basic_information_id;
    private String name;
    private String surname;
    private String sex;
    private String phone_number;
    private String designation_id;
    private String title_id;
    private String facility_id;
    private String district_id;
    private String province_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "basic_information_id")
    private AreasOfServiceProvision areasOfServiceProvision;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "basic_information_id")
    private RemarksComments remarksComments;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "basic_information_id")
    private Training training;
}
