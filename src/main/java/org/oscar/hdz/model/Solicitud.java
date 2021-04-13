package org.oscar.hdz.model;

import java.time.LocalDate;

public class Solicitud {
	private Integer id;
	private LocalDate fecha;	//fecha en que aplicó para la oferta de trabajp
	private String comentarios;	//información adicional
	private String archivos;	//nombre del archivo(PDF, DOCX del C.V.)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public String getArchivos() {
		return archivos;
	}
	public void setArchivos(String archivos) {
		this.archivos = archivos;
	}
	@Override
	public String toString() {
		return "Solicitud [id=" + id + ", fecha=" + fecha + ", comentarios=" + comentarios + ", archivos=" + archivos
				+ "]";
	}
	
	
}
