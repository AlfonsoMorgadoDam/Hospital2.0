package modelo;

import java.io.Serializable;

public class Paciente implements Serializable, Indicable<Integer>{
	
	
	private int id; // hasta 3000
	private String nombre, apellidos, direccion, fechanacimiento, telefono;
	
	public Paciente(int id, String nombre,  String apellidos, String direccion, String fechanacimiento, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos=apellidos;
		this.direccion = direccion;
		this.fechanacimiento = fechanacimiento;
		this.telefono = telefono;
	}

	@Override
	public Integer getKey() {
		
		return id;
	}

	@Override
	public void setKey(Integer t) {
		this.id=t;
		
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public String getTelefono() {
		return telefono;
	}
	
	
	

}
