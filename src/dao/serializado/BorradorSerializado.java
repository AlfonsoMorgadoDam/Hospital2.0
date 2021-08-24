package dao.serializado;

import java.io.File;

import dao.base.IBorrador;

public class BorradorSerializado <T> implements IBorrador<T> {
	private boolean estado = false;
	
	@Override
	public boolean Borrar(String path) {
		File file = new File(path);

		try {
			boolean existe = file.exists();
			if (existe) {
				file.delete();
				System.out.println("se ha borrado");
				estado=true;
			}
			
		} catch (Exception e) {
			estado=false;
		}
		return estado;
	}

}
