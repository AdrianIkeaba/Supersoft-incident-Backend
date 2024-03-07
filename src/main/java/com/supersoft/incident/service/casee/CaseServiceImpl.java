package com.supersoft.incident.service.casee;

import com.supersoft.incident.model.casee.Case;
import com.supersoft.incident.repository.casee.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CaseServiceImpl extends CaseService{

    @Autowired
    private CaseRepository caseRepository;

    @Override
    public List<Case> getAllCases(String email) {
        return caseRepository.findByEmail(email);
    }

}
