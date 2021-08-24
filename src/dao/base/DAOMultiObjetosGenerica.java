package dao.base;

public class DAOMultiObjetosGenerica<T , K> {
	protected final IRecuperadorIndexado<T, K> recuperador;
	protected final IGrabador<T> grabador;
	protected final IBorrador<T> borrador; 
	protected boolean add = true;
	private String path;

	public DAOMultiObjetosGenerica(String path, IGrabador<T> grabador, IRecuperadorIndexado<T, K> recuperado, IBorrador<T> borrador) {
		super();
		this.path=path;
		this.grabador=grabador;
		this.recuperador = recuperado;
		this.borrador = borrador;
	}

	public boolean graba(T DTO) {
		return grabador.graba(path, DTO, add);
	}

	public T recupera(K k) {
		return recuperador.recupera(path, k);
	}

	public T recupera(int posicion) {
		return recuperador.recupera(path, posicion);
	}
	
	public boolean borrar() {
		return borrador.Borrar(path);
	}
}
