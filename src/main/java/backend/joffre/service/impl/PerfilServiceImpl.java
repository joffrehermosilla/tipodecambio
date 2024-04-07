package backend.joffre.service.impl;

import org.springframework.stereotype.Service;

import backend.joffre.model.Perfil;
import backend.joffre.repository.PerfilRepository;
import backend.joffre.service.PerfilService;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;




@Service
public class PerfilServiceImpl implements PerfilService {
	
	@Autowired
	PerfilRepository perfilRepository;

	@Override
	public void inserta(Perfil perfil) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Perfil> buscarTodas() {
		// TODO Auto-generated method stub
		return perfilRepository.findAll();
	}

	@Override
	public Page<Perfil> buscarTodas(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Perfil> buscarTodas(Integer pageSize, Integer offset) {
		// TODO Auto-generated method stub
		return perfilRepository.findAll(PageRequest.of(offset, pageSize));
	}


	@Override
	public void guardar(Perfil perfil) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void actualiza(Perfil perfil) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void elimina(Perfil perfil) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int idperfil) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Perfil get(int perfilid) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Iterable<Perfil> getAllPerfiles(Integer pageSize, Integer offset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Perfil> saveAllPerfiles(List<Perfil> usuarios) {
		// TODO Auto-generated method stub
		return perfilRepository.saveAll(usuarios);
	}

	@Override
	public Perfil guardarPerfil(Perfil perfil) {
		// TODO Auto-generated method stub
		return perfilRepository.save(perfil);
	}

	@Override
	public Perfil actualizarperfil(Perfil perfil) {
		// TODO Auto-generated method stub
		return null;
	}

}
