package control;

import java.util.ArrayList;

import dao.base.DAOMultiObjetosGenerica;
import dao.concretas.DaoLista;
import dao.concretas.DaoUnitario;
import dao.serializado.GrabadorSerializado;
import dao.serializado.RecuperadorIndexadoSerializado;
import modelo.Paciente;


public class fachada {
	
	public DaoUnitario<Paciente, Integer>DaoPaciente=new DaoUnitario<>("paciente.pac", new DAOMultiObjetosGenerica<>("paciente.pac", new GrabadorSerializado<>(), new RecuperadorIndexadoSerializado<>()));

	public boolean addPaciente (Paciente paciente) {
		return DaoPaciente.add(paciente);
	}
	
	public Paciente BuscarPaciente(Integer k) {
		return DaoPaciente.buscar(k);
		
	}
	
}
