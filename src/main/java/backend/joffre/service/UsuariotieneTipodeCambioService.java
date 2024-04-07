package backend.joffre.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;

import backend.joffre.model.UsuariotieneTipodeCambio;



public interface UsuariotieneTipodeCambioService {

	void inserta(UsuariotieneTipodeCambio usuariotieneTipodeCambio);

	List<UsuariotieneTipodeCambio> buscarTodas();
	
	Page<UsuariotieneTipodeCambio> buscarTodas(Pageable pageable);
	
	Iterable<UsuariotieneTipodeCambio> buscarTodas(Integer pageSize, Integer offset);
	
	
    Iterable<UsuariotieneTipodeCambio> getAllUsuariotienTipodeCambio(Integer pageSize,Integer offset);
    
	void guardar(UsuariotieneTipodeCambio UsuariotieneTipodeCambio);

	UsuariotieneTipodeCambio guardarUsuarioTipodeCambio(UsuariotieneTipodeCambio UsuariotieneTipodeCambio);

	void actualiza(UsuariotieneTipodeCambio UsuariotieneTipodeCambio);

	void elimina(UsuariotieneTipodeCambio UsuariotieneTipodeCambio);

	void eliminar(int UsuariotieneTipodeCambioId);

	UsuariotieneTipodeCambio get(int UsuariotieneTipodeCambioId);

	UsuariotieneTipodeCambio actualizarUsariotienTipodeCambio(UsuariotieneTipodeCambio UsuariotieneTipodeCambioId);
}
