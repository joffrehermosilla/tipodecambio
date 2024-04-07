package backend.joffre.service.impl;



import org.springframework.stereotype.Service;

import backend.joffre.model.MonedaOrigen;
import backend.joffre.repository.MonedaOrigenRepository;
import backend.joffre.service.MonedaOrigenService;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;




@Service
public class MonedaOrigenServiceImpl implements MonedaOrigenService {
	
	
	@Autowired
	MonedaOrigenRepository monedaorigenRepository;

	@Override
	public void inserta(MonedaOrigen monedaOrigen) {
		// TODO Auto-generated method stub
		monedaorigenRepository.save(monedaOrigen);
	}

	@Override
	public Page<MonedaOrigen> buscarTodas(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<MonedaOrigen> buscarTodas(Integer pageSize, Integer offset) {
		// TODO Auto-generated method stub
		return monedaorigenRepository.findAll(PageRequest.of(offset, pageSize));
	}

	@Override
	public Iterable<MonedaOrigen> getAllMonedaOrigen(Integer pageSize, Integer offset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MonedaOrigen> buscarTodas() {
		// TODO Auto-generated method stub
		return monedaorigenRepository.findAll();
	}

	@Override
	public void guardar(MonedaOrigen monedaOrigen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MonedaOrigen guardarmonedaOrigen(MonedaOrigen monedaOrigen) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualiza(MonedaOrigen monedaOrigen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void elimina(MonedaOrigen monedaOrigen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int idmonedaOrigen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MonedaOrigen get(int monedaOrigenId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MonedaOrigen actualizarMonedaOrigen(MonedaOrigen monedaOrigen) {
		// TODO Auto-generated method stub
		return null;
	}

}
