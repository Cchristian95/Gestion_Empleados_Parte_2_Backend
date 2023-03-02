package com.backend.gestion.empleados.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//para idicar que es una tabla o modelo entity
@Entity
//para indicar el nombre de la tabla
@Table(name = "empleados")
public class Empleado {

	@Id
	// estrategia
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre", length = 60, nullable = false)
	private String nombre;

	@Column(name = "apellido", length = 60, nullable = false)
	private String apellido;
	
	@Column(name = "telefono", length = 60, nullable = false)
	private String telefono;
	
	@Column(name = "correo", length = 60, nullable = false)
	private String correo;
	
	@Column(name = "fecha_de_nacimiento", length = 60, nullable = false)
	private String fecha_de_nacimiento;
	
	@Column(name = "tipo_documento", length = 60, nullable = false)
	private String tipo_documento;
	
	@Column(name = "documento", length = 60, nullable = false)
	private String documento;

	// Generar constructor vacio, nomenclatura Java Beans
	public Empleado() {

	}

	public Empleado(Long id, String nombre, String apellido, String telefono, String correo, String fecha_de_nacimiento,
			String tipo_documento, String documento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.fecha_de_nacimiento = fecha_de_nacimiento;
		this.tipo_documento = tipo_documento;
		this.documento = documento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFecha_de_nacimiento() {
		return fecha_de_nacimiento;
	}

	public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
		this.fecha_de_nacimiento = fecha_de_nacimiento;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	

}
