package org.mohcc.zw.hivtrainings.service.impl;

import org.mohcc.zw.hivtrainings.model.AreasOfServiceProvision;
import org.mohcc.zw.hivtrainings.repository.AreasOfServiceProvisionRepository;
import org.mohcc.zw.hivtrainings.service.AreasOfServiceProvisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreasOfServiceProvisionServiceImpl implements AreasOfServiceProvisionService {

    private final AreasOfServiceProvisionRepository areasOfServiceProvisionRepository;

    @Autowired
    public AreasOfServiceProvisionServiceImpl(AreasOfServiceProvisionRepository areasOfServiceProvisionRepository) {
        this.areasOfServiceProvisionRepository = areasOfServiceProvisionRepository;
    }

    @Override
    public AreasOfServiceProvision saveAreasOfServiceProvision(AreasOfServiceProvision areasOfServiceProvision) {
        // Add any business logic before saving
        return areasOfServiceProvisionRepository.save(areasOfServiceProvision);
    }

    @Override
    public AreasOfServiceProvision getAreasOfServiceProvisionById(String id) {
        return areasOfServiceProvisionRepository.findById(id).orElse(null);
    }

    @Override
    public List<AreasOfServiceProvision> getAllAreasOfServiceProvisions() {
        return areasOfServiceProvisionRepository.findAll();
    }

    // Additional methods for business logic can be added here

}

