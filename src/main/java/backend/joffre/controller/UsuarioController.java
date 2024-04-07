package backend.joffre.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import backend.joffre.model.Usuario;
import backend.joffre.service.UsuarioService;
import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	 @Autowired
	    private UsuarioService usuarioservice; 
	  
	    @PostConstruct
	    public void createProducts(){ 
	        List<Usuario>usuarios = new ArrayList<>(); 
	        for(int i=0;i<100;i++){ 
	        	Usuario usuario = new Usuario(); 
	        	usuario.setId(i); 
	        	usuario.setName("usuarioID: +"+ i); 
	        	usuarios.add(usuario); 
	        } 
	        usuarioservice.saveAllUsuarios(usuarios); 
	    } 
	    
	  
	  
	    @GetMapping("/getAll/{offset}") 
	    public Iterable<Usuario> getAllProducts(@RequestParam Integer pageSize, @PathVariable("offset") Integer offset){ 
	        return usuarioservice.buscarTodas(pageSize,offset); 
	    } 
	    
	    @PostMapping(value = "/save")
  		public ResponseEntity<?> guardarususarios(@RequestBody Usuario usuario) {
  			/*
  			 * Usuario usuario = new Usuario(); usuario.setName("test");
  			 * usuario.setMonto(56.9);
  			 */
  			System.out.println("Existen errores");
  			return ResponseEntity.status(HttpStatus.CREATED).body(usuarioservice.guardarusuario(usuario));
  		}    
	    
	
}
