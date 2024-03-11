package com.supersoft.incident.controller.casee;

import com.supersoft.incident.model.ICCResponse;
import com.supersoft.incident.model.casee.Case;
import com.supersoft.incident.service.casee.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CaseController {

    @Autowired
    private CaseService caseService;

    @PostMapping("/create-case")
    public ResponseEntity<ICCResponse> createCase(@RequestBody Case casee) {
        try {
            caseService.createCase(casee);
            ICCResponse iccResponse = new ICCResponse("Case Created Successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(iccResponse);
        } catch (Exception e) {
            ICCResponse iccResponse = new ICCResponse("Error creating Case");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(iccResponse);
        }
    }

    @GetMapping("/view-cases/{email}")
    public ResponseEntity<List<Case>> getCaseByEmail(@PathVariable String email) {
        List<Case> cases = caseService.getAllCases(email);
        return new ResponseEntity<>(cases, HttpStatus.OK);
    }
}
