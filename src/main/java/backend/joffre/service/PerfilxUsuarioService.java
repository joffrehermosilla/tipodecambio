package backend.joffre.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;

import backend.joffre.model.PerfilxUsuario;



public interface PerfilxUsuarioService {
	
	void inserta(PerfilxUsuario perfilxUsuario);
	
	Page<PerfilxUsuario> buscarTodas(Pageable pageable);
	
	Iterable<PerfilxUsuario> buscarTodas(Integer pageSize, Integer offset);
	
	
    Iterable<PerfilxUsuario> getAllPerfilxusuario(Integer pageSize,Integer offset);
	
	List<PerfilxUsuario> buscarTodas();

	void guardar(PerfilxUsuario perfilxUsuario);

	PerfilxUsuario guardarPerfilxusuario(PerfilxUsuario perfilxUsuario);
	
	void actualiza(PerfilxUsuario perfilxUsuario);

	void elimina(PerfilxUsuario perfilxUsuario);

	void eliminar(int idperfilxUsuario);
	
	PerfilxUsuario get(int perfilxUsuarioid);
	
	PerfilxUsuario actualizarPerfilxusuario(PerfilxUsuario perfilxUsuario);
}
