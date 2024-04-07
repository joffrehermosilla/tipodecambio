package backend.joffre.service.impl;


import org.springframework.stereotype.Service;

import backend.joffre.model.UsuariotieneTipodeCambio;
import backend.joffre.repository.UsuariotieneTipodeCambioRepository;
import backend.joffre.service.UsuariotieneTipodeCambioService;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


@Service
public class UsuariotieneTipodeCambioServiceImpl implements UsuariotieneTipodeCambioService {

	@Autowired
	UsuariotieneTipodeCambioRepository usuariotieneTipodeCambioRepository;
	
	
	@Override
	public void inserta(UsuariotieneTipodeCambio usuariotieneTipodeCambio) {
		// TODO Auto-generated method stub
		usuariotieneTipodeCambioRepository.save(usuariotieneTipodeCambio);
	}

	@Override
	public List<UsuariotieneTipodeCambio> buscarTodas() {
		// TODO Auto-generated method stub
		return usuariotieneTipodeCambioRepository.findAll();
	}

	@Override
	public Page<UsuariotieneTipodeCambio> buscarTodas(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<UsuariotieneTipodeCambio> buscarTodas(Integer pageSize, Integer offset) {
		// TODO Auto-generated method stub
		return usuariotieneTipodeCambioRepository.findAll(PageRequest.of(offset, pageSize));
	}

	@Override
	public Iterable<UsuariotieneTipodeCambio> getAllUsuariotienTipodeCambio(Integer pageSize, Integer offset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(UsuariotieneTipodeCambio UsuariotieneTipodeCambio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UsuariotieneTipodeCambio guardarUsuarioTipodeCambio(UsuariotieneTipodeCambio UsuariotieneTipodeCambio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualiza(UsuariotieneTipodeCambio UsuariotieneTipodeCambio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void elimina(UsuariotieneTipodeCambio UsuariotieneTipodeCambio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int UsuariotieneTipodeCambioId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UsuariotieneTipodeCambio get(int UsuariotieneTipodeCambioId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuariotieneTipodeCambio actualizarUsariotienTipodeCambio(
			UsuariotieneTipodeCambio UsuariotieneTipodeCambioId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
