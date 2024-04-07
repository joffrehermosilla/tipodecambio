package backend.joffre.service.impl;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import backend.joffre.model.Usuario;
import backend.joffre.repository.UsuarioRepository;
import backend.joffre.service.UsuarioService;


@Service
public class UsuarioServiceImpl implements UsuarioService{

	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	
	@Override
	public void inserta(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void guardar(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario guardarusuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(usuario);
	}

	@Override
	public void actualiza(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void elimina(Usuario Usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int idUsuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario get(int usuarioId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario actualizarusuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Usuario> buscarTodas(Pageable pageable) {
		// TODO Auto-generated method stub
		return  null;
	}
	
	@Override
	 public Iterable<Usuario> buscarTodas(Integer pageSize,Integer offset) { 
	        return usuarioRepository.findAll(PageRequest.of(offset,pageSize)); 
	    } 


	@Override
	public List<Usuario> buscarTodas() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}



	@Override
	public List saveAllUsuarios(List<Usuario> usuarios) {
		// TODO Auto-generated method stub
		return usuarioRepository.saveAll(usuarios);
	}



	@Override
	public Iterable<Usuario> getAllUsuarios(Integer pageSize, Integer offset) {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll(PageRequest.of(offset,pageSize)); 
    } ;
	}

}
