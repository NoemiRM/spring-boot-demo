package io.pilarrm;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
	
	Empleado findByName(String name);

	@Cacheable("empleados")
	List<Empleado> findAll();
}
