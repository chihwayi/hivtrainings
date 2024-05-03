package org.mohcc.zw.hivtrainings.service;

import org.mohcc.zw.hivtrainings.model.RemarksComments;

import java.util.List;

public interface RemarksCommentsService {
    RemarksComments saveRemarksComments(RemarksComments remarksComments);
    RemarksComments getRemarksCommentsById(String id);
    List<RemarksComments> getAllRemarksComments();
}
