package backend.joffre.application.usecases;


import java.util.List;
import java.util.Optional;

import backend.joffre.domain.models.MonedaOrigen;



public interface MonedaOrigenService {
	void inserta(MonedaOrigen monedaOrigen);


	Iterable<MonedaOrigen> buscarTodas(Integer pageSize, Integer offset);
	
	
    Iterable<MonedaOrigen> getAllMonedaOrigen(Integer pageSize,Integer offset) ;
	
	
	List<MonedaOrigen> buscarTodas();

	void guardar(MonedaOrigen monedaOrigen);

	MonedaOrigen guardarmonedaOrigen(MonedaOrigen monedaOrigen);

	void actualiza(MonedaOrigen monedaOrigen);

	void elimina(MonedaOrigen monedaOrigen);

	void eliminar(int idmonedaOrigen);

	Optional<MonedaOrigen>  get(int monedaOrigenId);

	MonedaOrigen actualizarMonedaOrigen(MonedaOrigen monedaOrigen);
}
