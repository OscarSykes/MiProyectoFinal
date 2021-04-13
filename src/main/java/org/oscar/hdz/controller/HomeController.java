package org.oscar.hdz.controller;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.List;

import org.oscar.hdz.model.Vacante;
import org.oscar.hdz.service.IntVacantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@Autowired
	private IntVacantesService serviceVacantes;
	
	@GetMapping("/")
	public String mostrarHome(Model model){
		//devuelve una vista (un archivo html)
		List<Vacante> vacantes = serviceVacantes.obtenerTodas();
		model.addAttribute("vacantes", vacantes);
		return "home";
	}
	@GetMapping("/mensaje")
	public String mensaje(Model model) {
		//formatear una fecha, obtenerla del sistema
		//formatear una fecha
		//personalizar una fecha
		LocalDate fecha = null;
		try {
			fecha = LocalDate.parse("23-12-2020", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			System.out.println("Fecha : " + fecha);
		}catch(DateTimeException ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		
		model.addAttribute("msg", "Hola mundo");
		//Actualmente thymeleaf no soporta LocalDate, por tanto convertirlo a Date
		model.addAttribute("fecha", java.sql.Date.valueOf(fecha));
		return "mensaje";
	}
	
	//****************************
	//metodo para manipular diversos tipos de datos
	
	@GetMapping("/vacante")
	public String vacante(Model model) {
		Integer id = 1000;
		String nombre = "Programador de Aplicaciones Web";
		LocalDate fecha = LocalDate.now();
		Double salario = 12500.00;
		Boolean vigente = true;
		model.addAttribute("id",id);
		model.addAttribute("nombre",nombre);
		model.addAttribute("fecha",fecha);
		model.addAttribute("salario",salario);
		model.addAttribute("vigente",vigente);
		return "vacante";
	}
	//una colección de datos
	@GetMapping("/lista")
	public String lista(Model model) {
		List<String> vacantes = new LinkedList<String>();
		vacantes.add("Contador Público");
		vacantes.add("Programador de Aplicaciones");
		vacantes.add("Técnico de Mantenimiento de Computadoras");
		vacantes.add("Arquitecto");
		vacantes.add("Ingeniero en Electrónica");
		
		//imprimir el arreglo
		for(String elemento : vacantes) {
			System.out.println(elemento);
		}
		model.addAttribute("vacantes",vacantes);
		return "vacante";
	}
	
	//un metodo que devuelva un objeto de tipo Vacante
	@GetMapping("/detalles")
	public String detalles(Model model) {
		Vacante v = new Vacante();
		System.out.println(v);
		v.setId(100);
		v.setNombre("Ingeniero Electrónico");
		v.setDescripcion("Relaciona con aplicaciones con IOT");
		v.setFecha(LocalDate.now());
		v.setSalario(12800.00);
		System.out.println(v);
		model.addAttribute("vacante",v);
		return "detalles";
	}
	//******************************************
	@GetMapping("/tabla")
	public String mostrarVacantes(Model model) {
		List<Vacante> vacantes = serviceVacantes.obtenerTodas();
		for(Vacante elemento : vacantes) {
			System.out.println(elemento.getId());
			System.out.println(elemento.getNombre());
			System.out.println(elemento.getDescripcion());
			System.out.println(elemento.getFecha());
			System.out.println(elemento.getSalario());
			System.out.println(elemento.getDestacado());
		}
		model.addAttribute("vacantes", vacantes);
		return "tabla";
	}

}
