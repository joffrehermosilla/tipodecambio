package backend.joffre.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;

import backend.joffre.model.Perfil;





public interface PerfilService {

	void inserta(Perfil perfil);

	List<Perfil> buscarTodas();
	
	Page<Perfil> buscarTodas(Pageable pageable);
	
	Iterable<Perfil> buscarTodas(Integer pageSize, Integer offset);
	
	
    Iterable<Perfil> getAllPerfiles(Integer pageSize,Integer offset);
	
	void guardar(Perfil perfil);

	List<Perfil> saveAllPerfiles(List<Perfil> usuarios);
	
	Perfil guardarPerfil(Perfil perfil);
	
	void actualiza(Perfil perfil);

	void elimina(Perfil perfil);

	void eliminar(int idperfil);
	
	Perfil get(int perfilid);
	
	Perfil actualizarperfil(Perfil perfil);
	
}
