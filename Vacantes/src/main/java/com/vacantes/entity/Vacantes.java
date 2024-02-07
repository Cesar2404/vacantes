
	package com.vacantes.entity;

	import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	//JavaBean o Pojo

	@Entity
	@Table(name="Vacantes")

	public class Vacantes {
		@Id
		@GeneratedValue(strategy =GenerationType.IDENTITY)
		private Integer id;
		private String nombre;
		private String descripcion;
		private LocalDate fecha;
		private Double salario;
		private String estatus;
		private Integer destacado;
		private String imagen;
		private String detalles;
		private Integer idCategoria;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public LocalDate getFecha() {
			return fecha;
		}
		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
		}
		public Double getSalario() {
			return salario;
		}
		public void setSalario(Double salario) {
			this.salario = salario;
		}
		public String getEstatus() {
			return estatus;
		}
		public void setEstatus(String estatus) {
			this.estatus = estatus;
		}
		
		public Integer getDestacado() {
			return destacado;
		}
		public void setDestacado(Integer destacado) {
			this.destacado = destacado;
		}
		public String getImagen() {
			return imagen;
		}
		public void setImagen(String imagen) {
			this.imagen = imagen;
		}
		public String getDetalles() {
			return detalles;
		}
		public void setDetalles(String detalles) {
			this.detalles = detalles;
		}
		public Integer getIdCategoria() {
			return idCategoria;
		}
		public void setIdCategoria(Integer idCategoria) {
			this.idCategoria = idCategoria;
		}
		@Override
		public String toString() {
			return "Vacantes [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha
					+ ", salario=" + salario + ", estatus=" + estatus + ", destacado=" + destacado + ", imagen="
					+ imagen + ", detalles=" + detalles + ", idCategoria=" + idCategoria + "]";
		}
		
	
		
		
		
		
		
		

	}


