package com.xoftix.temixcore.as.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.xoftix.temixcore.as.data.AstDataSource;
import com.xoftix.temixcore.common.data.type.TipoEstado;

@Repository
public interface AstDataSourceRepository extends JpaRepository<AstDataSource, Long>, JpaSpecificationExecutor<AstDataSource>  {
	public List<AstDataSource> findByEstado(TipoEstado estado);
}
