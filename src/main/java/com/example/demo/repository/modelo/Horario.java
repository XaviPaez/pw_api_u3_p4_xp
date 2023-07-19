package com.example.demo.repository.modelo;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity(name = "Horario")
@Table(name = "horario")
public class Horario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hora_id_seq")
	@SequenceGenerator(name = "hora_id_seq", sequenceName = "hora_id_seq", allocationSize = 1)
	@Column(name = "hora_id")
	private Integer id;
	@Column(name = "hora_codigo")
	private String codigo;
	@Column(name = "hora_aula")
	private String aula;
	@Column(name = "hora_dia")
	private String dia;
	@Column(name = "hora_inicio")
	private LocalTime inicio;
	@Column(name = "hora_fin")
	private LocalTime fin;
	@Column(name = "hora_docente")
	private String docente;
	
	//SET Y GET
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public LocalTime getInicio() {
		return inicio;
	}
	public void setInicio(LocalTime inicio) {
		this.inicio = inicio;
	}
	public LocalTime getFin() {
		return fin;
	}
	public void setFin(LocalTime fin) {
		this.fin = fin;
	}
	public String getDocente() {
		return docente;
	}
	public void setDocente(String docente) {
		this.docente = docente;
	}
	
	//TOSTRING
	
	@Override
	public String toString() {
		return "Horario [id=" + id + ", codigo=" + codigo + ", aula=" + aula + ", dia=" + dia + ", inicio=" + inicio
				+ ", fin=" + fin + ", docente=" + docente + "]";
	}
	
	
	

}
