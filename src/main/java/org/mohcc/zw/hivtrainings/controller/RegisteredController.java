package org.mohcc.zw.hivtrainings.controller;
import org.mohcc.zw.hivtrainings.model.Registered;
import org.mohcc.zw.hivtrainings.service.RegisteredService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/registered")
public class RegisteredController {

    private final RegisteredService registeredService;

    public RegisteredController(RegisteredService registeredService) {
        this.registeredService = registeredService;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Registered>> getAllRegistered() {
        List<Registered> registered = registeredService.getAllRegistered();
        return ResponseEntity.ok(registered);
    }
}
