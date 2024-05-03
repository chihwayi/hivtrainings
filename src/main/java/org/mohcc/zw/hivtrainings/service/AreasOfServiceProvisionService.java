package org.mohcc.zw.hivtrainings.service;

import org.mohcc.zw.hivtrainings.model.AreasOfServiceProvision;

import java.util.List;

public interface AreasOfServiceProvisionService {
    AreasOfServiceProvision saveAreasOfServiceProvision(AreasOfServiceProvision areasOfServiceProvision);
    AreasOfServiceProvision getAreasOfServiceProvisionById(String id);
    List<AreasOfServiceProvision> getAllAreasOfServiceProvisions();

    // Additional methods for business logic

}
