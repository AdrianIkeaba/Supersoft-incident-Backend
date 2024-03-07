package com.supersoft.incident.controller.change;


import com.supersoft.incident.model.change.Change;
import com.supersoft.incident.service.change.ChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ChangeController {

    @Autowired
    ChangeService changeService;

    @PostMapping("/create-change")
    public ResponseEntity<String> createChange(@RequestBody Change change) {
        try {
            changeService.createChange(change);
            return ResponseEntity.status(HttpStatus.CREATED).body("Change created successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unable to create Change");
        }
    }

    @GetMapping("/view-changes/{email}")
    public ResponseEntity<List<Change>> viewChanges(@PathVariable String email) {
            List<Change> changes = changeService.viewChanges(email);
            return new ResponseEntity<>(changes, HttpStatus.OK);
    }
}
