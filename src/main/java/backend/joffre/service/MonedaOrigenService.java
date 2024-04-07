package backend.joffre.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;

import backend.joffre.model.MonedaOrigen;



public interface MonedaOrigenService {
	void inserta(MonedaOrigen monedaOrigen);


	
	Page<MonedaOrigen> buscarTodas(Pageable pageable);
	
	Iterable<MonedaOrigen> buscarTodas(Integer pageSize, Integer offset);
	
	
    Iterable<MonedaOrigen> getAllMonedaOrigen(Integer pageSize,Integer offset) ;
	
	
	List<MonedaOrigen> buscarTodas();

	void guardar(MonedaOrigen monedaOrigen);

	MonedaOrigen guardarmonedaOrigen(MonedaOrigen monedaOrigen);

	void actualiza(MonedaOrigen monedaOrigen);

	void elimina(MonedaOrigen monedaOrigen);

	void eliminar(int idmonedaOrigen);

	MonedaOrigen get(int monedaOrigenId);

	MonedaOrigen actualizarMonedaOrigen(MonedaOrigen monedaOrigen);
}
