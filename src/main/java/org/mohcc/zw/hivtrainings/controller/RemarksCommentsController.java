package org.mohcc.zw.hivtrainings.controller;

import org.mohcc.zw.hivtrainings.model.RemarksComments;
import org.mohcc.zw.hivtrainings.service.RemarksCommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/remarks-comments")
public class RemarksCommentsController {

    private final RemarksCommentsService remarksCommentsService;

    @Autowired
    public RemarksCommentsController(RemarksCommentsService remarksCommentsService) {
        this.remarksCommentsService = remarksCommentsService;
    }

    @PostMapping("/save")
    public ResponseEntity<RemarksComments> saveRemarksComments(@RequestBody RemarksComments remarksComments) {
        RemarksComments savedRemarks = remarksCommentsService.saveRemarksComments(remarksComments);
        return ResponseEntity.ok(savedRemarks);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<RemarksComments> getRemarksCommentsById(@PathVariable String id) {
        RemarksComments remarks = remarksCommentsService.getRemarksCommentsById(id);
        return ResponseEntity.ok(remarks);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<RemarksComments>> getAllRemarksComments() {
        List<RemarksComments> remarksList = remarksCommentsService.getAllRemarksComments();
        return ResponseEntity.ok(remarksList);
    }

}
