package backend.joffre.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import backend.joffre.model.Usuario;
import backend.joffre.repository.UsuarioRepository;
import backend.joffre.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public void inserta(Usuario usuario) {

		usuarioRepository.save(usuario);
	}

	@Override
	public void guardar(Usuario usuario) {
		usuarioRepository.save(usuario);

	}

	@Override
	public Usuario guardarusuario(Usuario usuario) {

		return usuarioRepository.save(usuario);
	}

	@Override
	public void actualiza(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	@Override
	public void elimina(Optional<Usuario> optional) {
		usuarioRepository.deleteAll();

	}

	@Override
	public void eliminar(int idUsuario) {
		usuarioRepository.deleteById(idUsuario);
	}

	@Override
	public Optional<Usuario> get(int usuarioId) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(usuarioId);
	}

	@Override
	public Usuario actualizarusuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(usuario);
	}


	@Override
	public Iterable<Usuario> buscarTodas(Integer pageSize, Integer offset) {
		return usuarioRepository.findAll(PageRequest.of(offset, pageSize));
	}

	@Override
	public List<Usuario> buscarTodas() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

	@Override
	public List<Usuario> saveAllUsuarios(List<Usuario> usuarios) {
		// TODO Auto-generated method stub
		return usuarioRepository.saveAll(usuarios);
	}

}
