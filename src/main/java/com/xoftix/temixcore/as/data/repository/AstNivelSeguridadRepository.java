package com.xoftix.temixcore.as.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.xoftix.temixcore.as.data.AstNivelSeguridad;
import com.xoftix.temixcore.common.data.type.TipoEstado;

@Repository
public interface AstNivelSeguridadRepository extends JpaRepository<AstNivelSeguridad, Long>, JpaSpecificationExecutor<AstNivelSeguridad> {
	public List<AstNivelSeguridad> findByEstado(TipoEstado estado);
}
