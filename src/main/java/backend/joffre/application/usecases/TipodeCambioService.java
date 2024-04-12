package backend.joffre.application.usecases;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import backend.joffre.domain.models.TipodeCambio;

public interface TipodeCambioService {

	void inserta(TipodeCambio tipodeCambio);

	List<TipodeCambio> buscarTodas();

	Iterable<TipodeCambio> buscarTodas(Integer pageSize, Integer offset);

	Iterable<TipodeCambio> getAllTipodeCambio(Integer pageSize, Integer offset);

	void guardar(TipodeCambio tipodeCambio);

	TipodeCambio guardarTipodeCambio(TipodeCambio tipodeCambio);

	void actualiza(TipodeCambio tipodeCambio);

	void elimina(TipodeCambio tipodeCambio);

	void eliminar(int TipodeCambio);

	Optional<TipodeCambio> get(int tipodeCambioId);

	TipodeCambio actualizarTipodeCambio(TipodeCambio tipodeCambio);
}
