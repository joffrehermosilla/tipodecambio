package backend.joffre.application.services;

import org.springframework.stereotype.Service;

import backend.joffre.application.usecases.MonedaOrigenService;
import backend.joffre.domain.models.MonedaOrigen;
import backend.joffre.infrastructure.repositories.MonedaOrigenRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;

@Service
public class MonedaOrigenServiceImpl implements MonedaOrigenService {

	@Autowired
	MonedaOrigenRepository monedaorigenRepository;

	@Override
	public void inserta(MonedaOrigen monedaOrigen) {

		monedaorigenRepository.save(monedaOrigen);
	}

	@Override
	public Iterable<MonedaOrigen> buscarTodas(Integer pageSize, Integer offset) {

		return monedaorigenRepository.findAll(PageRequest.of(offset, pageSize));
	}

	@Override
	public Iterable<MonedaOrigen> getAllMonedaOrigen(Integer pageSize, Integer offset) {

		return monedaorigenRepository.findAll(PageRequest.of(offset, pageSize));
	}

	@Override
	public List<MonedaOrigen> buscarTodas() {

		return monedaorigenRepository.findAll();
	}

	@Override
	public void guardar(MonedaOrigen monedaOrigen) {

		monedaorigenRepository.save(monedaOrigen);
	}

	@Override
	public MonedaOrigen guardarmonedaOrigen(MonedaOrigen monedaOrigen) {

		return monedaorigenRepository.save(monedaOrigen);
	}

	@Override
	public void actualiza(MonedaOrigen monedaOrigen) {

		monedaorigenRepository.save(monedaOrigen);
	}

	@Override
	public void elimina(MonedaOrigen monedaOrigen) {

		monedaorigenRepository.delete(monedaOrigen);
	}

	@Override
	public void eliminar(int idmonedaOrigen) {
		monedaorigenRepository.deleteById(idmonedaOrigen);

	}

	@Override
	public Optional<MonedaOrigen> get(int monedaOrigenId) {

		return monedaorigenRepository.findById(monedaOrigenId);
	}

	@Override
	public MonedaOrigen actualizarMonedaOrigen(MonedaOrigen monedaOrigen) {

		return monedaorigenRepository.save(monedaOrigen);
	}

}
