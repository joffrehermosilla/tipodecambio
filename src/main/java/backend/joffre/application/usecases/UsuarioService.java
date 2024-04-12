package backend.joffre.application.usecases;

import java.util.List;
import java.util.Optional;

import backend.joffre.domain.models.Usuario;

public interface UsuarioService {

	void inserta(Usuario usuario);

	List<Usuario> buscarTodas();

	Iterable<Usuario> buscarTodas(Integer pageSize, Integer offset);

	void guardar(Usuario usuario);

	List<Usuario> saveAllUsuarios(List<Usuario> usuarios);

	void actualiza(Usuario usuario);

	void elimina(Optional<Usuario> optional);

	void eliminar(int idUsuario);

	Optional<Usuario> get(int usuarioId);

	Usuario actualizarusuario(Usuario usuario);

	Object guardarusuario(Usuario usuario);

}
