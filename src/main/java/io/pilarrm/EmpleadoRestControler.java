package io.pilarrm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/empleado")
public class EmpleadoRestControler {
	@Autowired
	private EmpleadoRepository empleadoRepo;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Empleado> list(){
		return this.empleadoRepo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void add(@RequestBody Empleado empleado){
		this.empleadoRepo.save(empleado);
		
	}
}
