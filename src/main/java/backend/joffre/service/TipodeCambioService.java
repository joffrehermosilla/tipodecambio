package backend.joffre.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;


import backend.joffre.model.TipodeCambio;

public interface TipodeCambioService {

	void inserta(TipodeCambio tipodeCambio);

	List<TipodeCambio> buscarTodas();
	
	Page<TipodeCambio> buscarTodas(Pageable pageable);
	
	Iterable<TipodeCambio> buscarTodas(Integer pageSize, Integer offset);
	
	
    Iterable<TipodeCambio> getAllTipodeCambio(Integer pageSize,Integer offset);
    
	void guardar(TipodeCambio tipodeCambio);

	TipodeCambio guardarTipodeCambio(TipodeCambio tipodeCambio);

	void actualiza(TipodeCambio tipodeCambio);

	void elimina(TipodeCambio tipodeCambio);

	void eliminar(int idtipodeCambio);

	TipodeCambio get(int tipodeCambioId);

	TipodeCambio actualizarTipodeCambio(TipodeCambio tipodeCambio);
}
