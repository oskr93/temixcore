package com.xoftix.temixcore.as.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.xoftix.temixcore.as.data.AstRecurso;
import com.xoftix.temixcore.common.data.type.TipoEstado;

@Repository
public interface AstRecursoRepository extends JpaRepository<AstRecurso, Long>, JpaSpecificationExecutor<AstRecurso> {
	public List<AstRecurso> findByEstado(TipoEstado estado);
}
