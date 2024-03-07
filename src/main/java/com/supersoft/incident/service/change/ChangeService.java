package com.supersoft.incident.service.change;


import com.supersoft.incident.model.change.Change;
import com.supersoft.incident.repository.change.ChangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChangeService {

    @Autowired
    private ChangeRepository changeRepository;

    public void createChange(Change change) {
        changeRepository.save(change);
    }

    public List<Change> viewChanges(String email) {
        return changeRepository.findByEmail(email);
    }
}
