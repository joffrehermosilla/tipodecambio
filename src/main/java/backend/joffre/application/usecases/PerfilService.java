package backend.joffre.application.usecases;


import java.util.List;
import java.util.Optional;

import backend.joffre.domain.models.Perfil;





public interface PerfilService {

	void inserta(Perfil perfil);

	List<Perfil> buscarTodas();

	
	Iterable<Perfil> buscarTodas(Integer pageSize, Integer offset);
	
	
    Iterable<Perfil> getAllPerfiles(Integer pageSize,Integer offset);
	
	void guardar(Perfil perfil);

	List<Perfil> saveAllPerfiles(List<Perfil> usuarios);
	
	Perfil guardarPerfil(Perfil perfil);
	
	void actualiza(Perfil perfil);

	void elimina(Perfil perfil);

	void eliminar(int idperfil);
	
	 Optional<Perfil> get(int perfilid);
	
	Perfil actualizarperfil(Perfil perfil);
	
}
