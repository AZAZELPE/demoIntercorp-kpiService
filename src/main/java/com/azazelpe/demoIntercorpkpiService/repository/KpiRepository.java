package com.azazelpe.demoIntercorpkpiService.repository;

import com.azazelpe.demoIntercorpkpiService.model.Kpi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KpiRepository extends JpaRepository<Kpi,Long> {
}
