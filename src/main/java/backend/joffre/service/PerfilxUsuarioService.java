package backend.joffre.service;

import java.util.List;

import backend.joffre.model.PerfilxUsuario;



public interface PerfilxUsuarioService {
	
	void inserta(PerfilxUsuario perfilxUsuario);

	List<PerfilxUsuario> buscarTodas();

	void guardar(PerfilxUsuario perfilxUsuario);

	PerfilxUsuario guardarusuario(PerfilxUsuario perfilxUsuario);
	
	void actualiza(PerfilxUsuario perfilxUsuario);

	void elimina(PerfilxUsuario perfilxUsuario);

	void eliminar(int idperfilxUsuario);
	
	PerfilxUsuario get(int perfilxUsuarioid);
	
	PerfilxUsuario actualizarusuario(PerfilxUsuario perfilxUsuario);
}
