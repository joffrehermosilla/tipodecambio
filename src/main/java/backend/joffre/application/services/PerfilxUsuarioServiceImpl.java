package backend.joffre.application.services;

import org.springframework.stereotype.Service;

import backend.joffre.application.usecases.PerfilxUsuarioService;
import backend.joffre.domain.models.PerfilxUsuario;
import backend.joffre.infrastructure.repositories.PerfilxUsuarioRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;

@Service
public class PerfilxUsuarioServiceImpl implements PerfilxUsuarioService {

	@Autowired
	PerfilxUsuarioRepository perfilUsuarioRepository;

	@Override
	public void inserta(PerfilxUsuario perfilxUsuario) {
		// TODO Auto-generated method stub
		perfilUsuarioRepository.save(perfilxUsuario);
	}

	@Override
	public Iterable<PerfilxUsuario> buscarTodas(Integer pageSize, Integer offset) {
		// TODO Auto-generated method stub
		return perfilUsuarioRepository.findAll(PageRequest.of(offset, pageSize));
	}

	@Override
	public Iterable<PerfilxUsuario> getAllPerfilxusuario(Integer pageSize, Integer offset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PerfilxUsuario> buscarTodas() {
		// TODO Auto-generated method stub
		return perfilUsuarioRepository.findAll();
	}

	@Override
	public void guardar(PerfilxUsuario perfilxUsuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public PerfilxUsuario guardarPerfilxusuario(PerfilxUsuario perfilxUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualiza(PerfilxUsuario perfilxUsuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void elimina(PerfilxUsuario perfilxUsuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(int idperfilxUsuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public PerfilxUsuario get(int perfilxUsuarioid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PerfilxUsuario actualizarPerfilxusuario(PerfilxUsuario perfilxUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
