package org.mohcc.zw.hivtrainings.service.impl;

import org.mohcc.zw.hivtrainings.model.RemarksComments;
import org.mohcc.zw.hivtrainings.repository.RemarksCommentsRepository;
import org.mohcc.zw.hivtrainings.service.RemarksCommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemarksCommentsServiceImpl implements RemarksCommentsService {

    private final RemarksCommentsRepository remarksCommentsRepository;

    @Autowired
    public RemarksCommentsServiceImpl(RemarksCommentsRepository remarksCommentsRepository) {
        this.remarksCommentsRepository = remarksCommentsRepository;
    }

    @Override
    public RemarksComments saveRemarksComments(RemarksComments remarksComments) {
        // Add any business logic before saving
        return remarksCommentsRepository.save(remarksComments);
    }

    @Override
    public RemarksComments getRemarksCommentsById(String id) {
        return remarksCommentsRepository.findById(id).orElse(null);
    }

    @Override
    public List<RemarksComments> getAllRemarksComments() {
        return remarksCommentsRepository.findAll();
    }

    // Additional methods for business logic can be added here

}
