package backend.joffre.service;

import java.util.List;

import backend.joffre.model.Perfil;



public interface PerfilService {

	void inserta(Perfil perfil);

	List<Perfil> buscarTodas();

	void guardar(Perfil perfil);

	Perfil guardarusuario(Perfil perfil);
	
	void actualiza(Perfil perfil);

	void elimina(Perfil perfil);

	void eliminar(int idperfil);
	
	Perfil get(int perfilid);
	
	Perfil actualizarusuario(Perfil perfil);
	
}
