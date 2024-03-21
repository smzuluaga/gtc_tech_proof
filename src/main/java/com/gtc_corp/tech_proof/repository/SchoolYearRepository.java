package com.gtc_corp.tech_proof.repository;

import com.gtc_corp.tech_proof.entity.SchoolYear;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolYearRepository extends JpaRepository<SchoolYear, Integer> {
}
