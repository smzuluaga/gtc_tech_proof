package com.gtc_corp.tech_proof.service.impl;

import com.gtc_corp.tech_proof.entity.SchoolYear;
import com.gtc_corp.tech_proof.repository.SchoolYearRepository;
import com.gtc_corp.tech_proof.service.SchoolYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolYearServiceImpl implements SchoolYearService {

    @Autowired
    SchoolYearRepository schoolYearRepository;

    @Override
    public List<SchoolYear> findAll() {
        return schoolYearRepository.findAll();
    }

    @Override
    public SchoolYear findById(Integer id) {
        Optional<SchoolYear> schoolYear = schoolYearRepository.findById(id);
        return schoolYear.get();
    }

    @Override
    public SchoolYear save(SchoolYear schoolYear) {
        return schoolYearRepository.save(schoolYear);
    }

    @Override
    public void deleteById(Integer id) {
        schoolYearRepository.deleteById(id);
    }
}
