package backend.joffre.service.impl;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import backend.joffre.model.TipodeCambio;
import backend.joffre.model.feignDTO.ExchangeRate;
import backend.joffre.model.feignDTO.Rates;
import backend.joffre.repository.TipodeCambioRepository;
import backend.joffre.service.TipodeCambioService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;

@Service
@RequiredArgsConstructor
public class TipodeCambioServiceImpl implements TipodeCambioService {

	@Autowired
	TipodeCambioRepository tipodeCambioRepository;

	private final ApiServiceProxy userFeignClient;

	@Override
	public void inserta(TipodeCambio tipodeCambio) {

		tipodeCambioRepository.save(tipodeCambio);
	}

	public ExchangeRate getExchangeRate() {
		return userFeignClient.getTipodeCambioDolares();
	}

	@Override
	public List<TipodeCambio> buscarTodas() {

		return tipodeCambioRepository.findAll();
	}

	@Override
	public Iterable<TipodeCambio> buscarTodas(Integer pageSize, Integer offset) {

		return tipodeCambioRepository.findAll(PageRequest.of(offset, pageSize));
	}

	@Override
	public Iterable<TipodeCambio> getAllTipodeCambio(Integer pageSize, Integer offset) {

		return tipodeCambioRepository.findAll(PageRequest.of(offset, pageSize));
	}

	@Override
	public void guardar(TipodeCambio tipodeCambio) {

		tipodeCambioRepository.save(tipodeCambio);
	}

	@Override
	public TipodeCambio guardarTipodeCambio(TipodeCambio tipodeCambio) {

		return tipodeCambioRepository.save(tipodeCambio);
	}

	@Override
	public void actualiza(TipodeCambio tipodeCambio) {
		tipodeCambioRepository.save(tipodeCambio);

	}

	@Override
	public void elimina(TipodeCambio tipodeCambio) {
		tipodeCambioRepository.delete(tipodeCambio);

	}

	@Override
	public void eliminar(int idtipodeCambio) {
		tipodeCambioRepository.deleteById(idtipodeCambio);
	}

	@Override
	public Optional<TipodeCambio> get(int tipodeCambioId) {
		return tipodeCambioRepository.findById(tipodeCambioId);
	}

	@Override
	public TipodeCambio actualizarTipodeCambio(TipodeCambio tipodeCambio) {

		return tipodeCambioRepository.save(tipodeCambio);
	}

}
