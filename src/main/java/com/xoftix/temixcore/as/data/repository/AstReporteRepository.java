package com.xoftix.temixcore.as.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.xoftix.temixcore.as.data.AstReporte;

@Repository
public interface AstReporteRepository extends JpaRepository<AstReporte, Long>, JpaSpecificationExecutor<AstReporte>  {

}
