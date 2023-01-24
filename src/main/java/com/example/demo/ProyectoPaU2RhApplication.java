package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.ICiudadanoSer;
import com.example.demo.uce.service.IEmpleadoSer;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2RhApplication implements CommandLineRunner{
//
//	@Autowired
//	private IEstudianteService estuService;
//	
//	@Autowired
//	private IEmpleadoSer emplService;
//
//	@Autowired
//	private ICiudadanoSer ciuService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2RhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//TODO Auto-generated method stub

		

		//Ejemplo de la clase
//		Ciudadano ciu2 = new Ciudadano();
//		ciu2.setNombre("Tania");
//		ciu2.setApellido("Hidalgo");
//		
//		
//		Empleado empl2 =  new Empleado();
//		empl2.setCiudadano(ciu2);
//		empl2.setSalario(new BigDecimal(2050));
//		empl2.setFechaIngreso(LocalDateTime.now());
//		ciu2.setEmpleado(empl2);
//		this.ciuService.guardar(ciu2);
		//ciu2.setEmpleado(empl2);---> OK sin CASCADE con la línea 57
		
		//La línea de abajo no funciona, porque como definí el CASCADE = ALL. Ya estoy insertando el empleado en la línea anterior(52).
		//Por eso, no me deja insertar nuevamente el mismo objeto.
		//this.emplService.insertar(empl2);
		

		
		
		
		
		System.out.println("Finish!");
	}

}
