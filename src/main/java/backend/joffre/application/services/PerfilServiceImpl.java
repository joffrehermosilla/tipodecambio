package backend.joffre.application.services;

import org.springframework.stereotype.Service;

import backend.joffre.application.usecases.PerfilService;
import backend.joffre.domain.models.Perfil;
import backend.joffre.infrastructure.repositories.PerfilRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;

@Service
public class PerfilServiceImpl implements PerfilService {

	@Autowired
	PerfilRepository perfilRepository;

	@Override
	public void inserta(Perfil perfil) {

		perfilRepository.save(perfil);
	}

	@Override
	public List<Perfil> buscarTodas() {

		return perfilRepository.findAll();
	}

	@Override
	public Iterable<Perfil> buscarTodas(Integer pageSize, Integer offset) {

		return perfilRepository.findAll(PageRequest.of(offset, pageSize));
	}

	@Override
	public void guardar(Perfil perfil) {
		perfilRepository.save(perfil);

	}

	@Override
	public void actualiza(Perfil perfil) {
		perfilRepository.save(perfil);

	}

	@Override
	public void elimina(Perfil perfil) {
		perfilRepository.delete(perfil);
	}

	@Override
	public void eliminar(int idperfil) {
		perfilRepository.deleteById(idperfil);

	}

	@Override
	public Optional<Perfil> get(int perfilid) {

		return perfilRepository.findById(perfilid);
	}

	@Override
	public Iterable<Perfil> getAllPerfiles(Integer pageSize, Integer offset) {

		return perfilRepository.findAll(PageRequest.of(offset, pageSize));
	}

	@Override
	public List<Perfil> saveAllPerfiles(List<Perfil> usuarios) {

		return perfilRepository.saveAll(usuarios);
	}

	@Override
	public Perfil guardarPerfil(Perfil perfil) {

		return perfilRepository.save(perfil);
	}

	@Override
	public Perfil actualizarperfil(Perfil perfil) {

		return perfilRepository.save(perfil);
	}

}
