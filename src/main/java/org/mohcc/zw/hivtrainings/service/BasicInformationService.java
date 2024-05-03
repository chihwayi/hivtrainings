package org.mohcc.zw.hivtrainings.service;

import org.mohcc.zw.hivtrainings.model.BasicInformation;
import org.mohcc.zw.hivtrainings.model.Facilitator;

import java.util.List;

public interface BasicInformationService {
    BasicInformation saveBasicInformation(BasicInformation basicInformation);
    BasicInformation getBasicInformationById(String id);
    List<BasicInformation> getAllBasicInformation();
    boolean existsById(String id);
    List<BasicInformation> getFacilitatorDetails(List<Facilitator> facilitators);
    List<BasicInformation> getDeserializedFacilitatorDetails(String serializedFacilitator);
}
