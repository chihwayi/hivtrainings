package org.mohcc.zw.hivtrainings.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class VmmcReport {
    @Id
    private String training_id;         //TrainingData

    //BasicInformation
    private String basic_information_id;
    private String name;
    private String surname;
    private String sex;
    private String phone_number;
    private String designation;
    private String title;


    //ProgramArea
    private String programName;

    //ProgramAreaTraining
    private String programAreaTrainingName;

    //TrainingData
    private int number_of_days;
    private LocalDate start_date;
    private LocalDate end_date;
    private LocalDate certified_date;

    //Funding
    private String funderName;
    @ElementCollection
    private List<String> facilitator_name;

    @ElementCollection
    private List<String> method_name;

    //Facility
    private String facilityName;

    //District
    private String districtName;

    //Province
    private String provinceName;


    public VmmcReport() {
    }

}
