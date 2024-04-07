package backend.joffre.service;


import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;

import backend.joffre.model.Usuario;

public interface UsuarioService {
	
	void inserta(Usuario usuario);

	List<Usuario> buscarTodas();
	
	public Page<Usuario> buscarTodas(Pageable pageable);

	public Iterable<Usuario> buscarTodas(Integer pageSize, Integer offset);

	void guardar(Usuario usuario);

	List saveAllUsuarios(List<Usuario> usuarios);

	void actualiza(Usuario usuario);

	void elimina(Usuario Usuario);

	void eliminar(int idUsuario);
	
	Usuario get(int usuarioId);
	
	Usuario actualizarusuario(Usuario usuario);

	Object guardarusuario(Usuario usuario);
	public Iterable<Usuario> getAllUsuarios(Integer pageSize,Integer offset) ;
}
