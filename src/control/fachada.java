package control;

import java.util.ArrayList;

import dao.base.DAOMultiObjetosGenerica;
import dao.concretas.DaoLista;
import dao.concretas.DaoUnitario;
import dao.serializado.BorradorSerializado;
import dao.serializado.GrabadorSerializado;
import dao.serializado.RecuperadorIndexadoSerializado;
import modelo.Paciente;


public class fachada {
	
	public DaoUnitario<Paciente, Integer>DaoPaciente=new DaoUnitario<>("paciente.pac", new DAOMultiObjetosGenerica<>("paciente.pac", new GrabadorSerializado<>(), new RecuperadorIndexadoSerializado<>(),new BorradorSerializado<>()));
	public DaoUnitario<Paciente, Integer>DaoModificado;
	
	public boolean addPaciente (Paciente paciente) {
		return DaoPaciente.add(paciente);
	}
	
	public Paciente BuscarPaciente(Integer k) {
		return DaoPaciente.buscar(k);
		
	}
	public void ModificarPaciente(Integer k) {
		DaoModificado=new DaoUnitario<>("pacienteDos.pac", new DAOMultiObjetosGenerica<>("pacienteDos.pac", new GrabadorSerializado<>(), new RecuperadorIndexadoSerializado<>(),new BorradorSerializado<>()));
		int id=0;
		while (id<150) {
			Paciente recorrer = DaoPaciente.buscar(id);
			if (recorrer!=null) {
				if (id!=k) {
					DaoModificado.add(recorrer);
					
				}
				
			}
			id++;
		}
		DaoPaciente.borrar();
	int idDos=0;
		while (idDos<150) {
		Paciente añadido=DaoModificado.buscar(id);
			if (añadido!=null) {
				DaoPaciente.add(añadido);
			}
			idDos++;
		}
		DaoModificado.borrar();
	}
	
}
