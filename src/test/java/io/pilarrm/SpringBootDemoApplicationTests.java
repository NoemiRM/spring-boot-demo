package io.pilarrm;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {
	@Autowired
	private EmpleadoRepository empleadoRepo;

	@Test
	@Sql(statements = {"insert into empleado (name,lastname) values('Pilar','Romero')"})
	public void test() {
		Empleado empleado = this.empleadoRepo.findByName("Pilar");
		Assert.assertThat(empleado.getName(),Is.is("Pilar"));
	}
	

}
