package backend.joffre.service;

import java.util.List;

import backend.joffre.model.MonedaOrigen;

public interface MonedaOrigenService {
	void inserta(MonedaOrigen monedaOrigen);

	List<MonedaOrigen> buscarTodas();

	void guardar(MonedaOrigen monedaOrigen);

	MonedaOrigen guardarusuario(MonedaOrigen monedaOrigen);

	void actualiza(MonedaOrigen monedaOrigen);

	void elimina(MonedaOrigen monedaOrigen);

	void eliminar(int idmonedaOrigen);

	MonedaOrigen get(int monedaOrigenId);

	MonedaOrigen actualizarusuario(MonedaOrigen monedaOrigen);
}
