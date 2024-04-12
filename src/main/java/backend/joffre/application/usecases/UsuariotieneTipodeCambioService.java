package backend.joffre.application.usecases;

import java.util.List;
import java.util.Optional;

import backend.joffre.domain.models.UsuariotieneTipodeCambio;

public interface UsuariotieneTipodeCambioService {

	void inserta(UsuariotieneTipodeCambio usuariotieneTipodeCambio);

	List<UsuariotieneTipodeCambio> buscarTodas();

	Iterable<UsuariotieneTipodeCambio> buscarTodas(Integer pageSize, Integer offset);

	Iterable<UsuariotieneTipodeCambio> getAllUsuariotienTipodeCambio(Integer pageSize, Integer offset);

	void guardar(UsuariotieneTipodeCambio UsuariotieneTipodeCambio);

	UsuariotieneTipodeCambio guardarUsuarioTipodeCambio(UsuariotieneTipodeCambio UsuariotieneTipodeCambio);

	void actualiza(UsuariotieneTipodeCambio UsuariotieneTipodeCambio);

	void elimina(UsuariotieneTipodeCambio UsuariotieneTipodeCambio);

	void eliminar(int UsuariotieneTipodeCambioId);

	Optional<UsuariotieneTipodeCambio> get(int UsuariotieneTipodeCambioId);

	UsuariotieneTipodeCambio actualizarUsariotienTipodeCambio(UsuariotieneTipodeCambio UsuariotieneTipodeCambioId);
}
