package com.gtc_corp.tech_proof.service;

import com.gtc_corp.tech_proof.entity.SchoolYear;

import java.util.List;

public interface SchoolYearService {
    List<SchoolYear> findAll();
    SchoolYear findById(Integer id);
    SchoolYear save(SchoolYear schoolYear);
    void deleteById(Integer id);
}
