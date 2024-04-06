package backend.joffre.service;

import java.util.List;

import backend.joffre.model.TipodeCambio;

public interface TipodeCambioService {

	void inserta(TipodeCambio tipodeCambio);

	List<TipodeCambio> buscarTodas();

	void guardar(TipodeCambio tipodeCambio);

	TipodeCambio guardarusuario(TipodeCambio tipodeCambio);

	void actualiza(TipodeCambio tipodeCambio);

	void elimina(TipodeCambio tipodeCambio);

	void eliminar(int idtipodeCambio);

	TipodeCambio get(int tipodeCambioId);

	TipodeCambio actualizarusuario(TipodeCambio tipodeCambio);
}
