package test;

import java.io.File;

import dao.base.DAOMultiObjetosGenerica;
import dao.concretas.DaoUnitario;
import dao.serializado.BorradorSerializado;
import dao.serializado.GrabadorSerializado;
import dao.serializado.RecuperadorIndexadoSerializado;
import modelo.Paciente;


public class pruebaborrar<T> {

public static	DaoUnitario<Paciente, Integer>DaoPrueba=new DaoUnitario<>("prueba.pru", new DAOMultiObjetosGenerica<>("paciente.pac", new GrabadorSerializado<>(), new RecuperadorIndexadoSerializado<>(), new BorradorSerializado<>()));
	
	public static void main(String[] args) {
		boolean creado=añadir();
		if (creado) {
			System.out.println("se ha credo el fichero");
		}
		boolean borrado=borrar();

		if (borrado) {
			System.out.println("se ha borrado el fichero");
		}
		
	}
	
	public static boolean añadir(){
		
		boolean estado=false;
		try {
			DaoPrueba.add(new Paciente(1, "a", "s", "a", "a", "a"));			
			estado=true;
		} catch (Exception e) {
			estado=false;
		}
		
		return estado;
		
	}
	
	public static boolean borrar() {
		boolean estado=false;
		try {
			DaoPrueba.borrar();			
			estado=true;
		} catch (Exception e) {
			estado=false;
		}
		
		return estado;
		
	
	}

}
