package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2RhApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService estuService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2RhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estu = new Estudiante();
		//estu.setId(4);
		estu.setNombre("Bryan");
		estu.setApellido("Hidalgo");
		estu.setCiudad("Quito");
		estu.setGenero("F");
		estu.setCedula("0620436841");
		this.estuService.insertar(estu);
//		System.out.println(this.estuService.buscar(2));
//		this.estuService.eliminar(3);
		
		
		//Primero forma para actualizar
//		estu.setCiudad("Riobamba");
//		this.estuService.actualizar(estu);
		
		//Segunda forma de actualizar
		//1. Siempre se debe definir la PK
//		Estudiante estu2 = this.estuService.buscar(1);
//		estu2.setCiudad("Guayaquil");
//		this.estuService.actualizar(estu2);
		 
	
		System.out.println("Finish!");
	}

}
