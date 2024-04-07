package backend.joffre.service.impl;


import org.springframework.stereotype.Service;

import backend.joffre.model.TipodeCambio;
import backend.joffre.repository.TipodeCambioRepository;
import backend.joffre.service.TipodeCambioService;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;




@Service
public class TipodeCambioServiceImpl implements TipodeCambioService {

	@Autowired
	TipodeCambioRepository tipodeCambioRepository;
	
	
	@Override
	public void inserta(TipodeCambio tipodeCambio) {
		// TODO Auto-generated method stub
		tipodeCambioRepository.save(tipodeCambio);
	}

	@Override
	public List<TipodeCambio> buscarTodas() {
		// TODO Auto-generated method stub
		return tipodeCambioRepository.findAll();
	}

	@Override
	public Page<TipodeCambio> buscarTodas(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<TipodeCambio> buscarTodas(Integer pageSize, Integer offset) {
		// TODO Auto-generated method stub
		return tipodeCambioRepository.findAll(PageRequest.of(offset, pageSize));
	}

	@Override
	public Iterable<TipodeCambio> getAllTipodeCambio(Integer pageSize, Integer offset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(TipodeCambio tipodeCambio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TipodeCambio guardarTipodeCambio(TipodeCambio tipodeCambio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualiza(TipodeCambio tipodeCambio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void elimina(TipodeCambio tipodeCambio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int idtipodeCambio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TipodeCambio get(int tipodeCambioId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipodeCambio actualizarTipodeCambio(TipodeCambio tipodeCambio) {
		// TODO Auto-generated method stub
		return null;
	}

}
