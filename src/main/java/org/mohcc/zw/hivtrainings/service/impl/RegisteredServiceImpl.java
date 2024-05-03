package org.mohcc.zw.hivtrainings.service.impl;
import org.mohcc.zw.hivtrainings.model.Registered;
import org.mohcc.zw.hivtrainings.repository.RegisteredRepository;
import org.mohcc.zw.hivtrainings.service.RegisteredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisteredServiceImpl implements RegisteredService {

    private final RegisteredRepository registeredRepository;

    @Autowired
    public RegisteredServiceImpl(RegisteredRepository registeredRepository) {
        this.registeredRepository = registeredRepository;
    }

    @Override
    public List<Registered> getAllRegistered() {
        return registeredRepository.getRegisteredData();
    }
}
