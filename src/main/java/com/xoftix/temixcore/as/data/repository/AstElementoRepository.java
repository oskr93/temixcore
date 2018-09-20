package com.xoftix.temixcore.as.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.xoftix.temixcore.as.data.AstElemento;
import com.xoftix.temixcore.common.data.type.TipoEstado;

@Repository
public interface AstElementoRepository extends JpaRepository<AstElemento, Long>, JpaSpecificationExecutor<AstElemento>  {
	public List<AstElemento> findByEstado(TipoEstado estado);
}
