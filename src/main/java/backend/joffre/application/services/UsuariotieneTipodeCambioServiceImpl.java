package backend.joffre.application.services;

import org.springframework.stereotype.Service;

import backend.joffre.application.usecases.UsuariotieneTipodeCambioService;
import backend.joffre.domain.models.UsuariotieneTipodeCambio;
import backend.joffre.infrastructure.repositories.UsuariotieneTipodeCambioRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;

@Service
public class UsuariotieneTipodeCambioServiceImpl implements UsuariotieneTipodeCambioService {

	@Autowired
	UsuariotieneTipodeCambioRepository usuariotieneTipodeCambioRepository;

	@Override
	public void inserta(UsuariotieneTipodeCambio usuariotieneTipodeCambio) {

		usuariotieneTipodeCambioRepository.save(usuariotieneTipodeCambio);
	}

	@Override
	public List<UsuariotieneTipodeCambio> buscarTodas() {

		return usuariotieneTipodeCambioRepository.findAll();
	}

	@Override
	public Iterable<UsuariotieneTipodeCambio> buscarTodas(Integer pageSize, Integer offset) {

		return usuariotieneTipodeCambioRepository.findAll(PageRequest.of(offset, pageSize));
	}

	@Override
	public Iterable<UsuariotieneTipodeCambio> getAllUsuariotienTipodeCambio(Integer pageSize, Integer offset) {

		return usuariotieneTipodeCambioRepository.findAll(PageRequest.of(offset, pageSize));
	}

	@Override
	public void guardar(UsuariotieneTipodeCambio UsuariotieneTipodeCambio) {
		usuariotieneTipodeCambioRepository.save(UsuariotieneTipodeCambio);

	}

	@Override
	public UsuariotieneTipodeCambio guardarUsuarioTipodeCambio(UsuariotieneTipodeCambio UsuariotieneTipodeCambio) {
	
		return usuariotieneTipodeCambioRepository.save(UsuariotieneTipodeCambio);
	}

	@Override
	public void actualiza(UsuariotieneTipodeCambio UsuariotieneTipodeCambio) {
	
		usuariotieneTipodeCambioRepository.save(UsuariotieneTipodeCambio);
	}

	@Override
	public void elimina(UsuariotieneTipodeCambio UsuariotieneTipodeCambio) {

		usuariotieneTipodeCambioRepository.delete(UsuariotieneTipodeCambio);
	}

	@Override
	public void eliminar(int UsuariotieneTipodeCambioId) {
		usuariotieneTipodeCambioRepository.deleteById(UsuariotieneTipodeCambioId);

	}

	@Override
	public Optional<UsuariotieneTipodeCambio> get(int UsuariotieneTipodeCambioId) {

		return usuariotieneTipodeCambioRepository.findById(UsuariotieneTipodeCambioId);
	}

	@Override
	public UsuariotieneTipodeCambio actualizarUsariotienTipodeCambio(
			UsuariotieneTipodeCambio UsuariotieneTipodeCambioId) {

		return usuariotieneTipodeCambioRepository.save(UsuariotieneTipodeCambioId);
	}

}
