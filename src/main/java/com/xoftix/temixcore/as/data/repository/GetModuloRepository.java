package com.xoftix.temixcore.as.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.xoftix.temixcore.as.data.GetModulo;
import com.xoftix.temixcore.common.data.type.TipoEstado;

@Repository
public interface GetModuloRepository extends JpaRepository<GetModulo, Long>, JpaSpecificationExecutor<GetModulo>  {
	public List<GetModulo> findByEstado(TipoEstado estado);
}
