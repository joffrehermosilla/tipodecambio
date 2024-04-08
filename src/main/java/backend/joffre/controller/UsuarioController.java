package backend.joffre.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	private final Logger LOGGER = LoggerFactory.getLogger(getClass());

	@Autowired
	private UsuarioService usuarioservice;

	@PostConstruct
	public void createUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());

		for (int i = 3; i < 15; i++) {
			Usuario usuario = new Usuario();
			usuario.setId(i);
			usuario.setName("usuarioID: +" + i);
			usuario.setPais("Pais a disponer");
			usuario.setCreatAt(timestamp);
			usuarios.add(usuario);
		}
		usuarioservice.saveAllUsuarios(usuarios);
	}

	@GetMapping("/getAll/{offset}")
	public Iterable<Usuario> getAllUsuarios(@RequestParam Integer pageSize, @PathVariable("offset") Integer offset) {
		return usuarioservice.buscarTodas(pageSize, offset);
	}

	@PostMapping(value = "/save")
	public ResponseEntity<?> guardarususarios(@RequestBody Usuario usuario) {
	

		LOGGER.info("Existen errores");
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioservice.guardarusuario(usuario));
	}

	@GetMapping("/mostrarelcambio/{idUsuario}")
	public ResponseEntity<?> mostrarUsuarios(@PathVariable int idUsuario) {
		Usuario usuario = usuarioservice.get(idUsuario);

		return ResponseEntity.status(HttpStatus.CREATED)
				.body(usuario.getName() + " El Usuario hará su cambio en el Pais " + usuario.getId());
	}

	@GetMapping("/all")
	public ResponseEntity<?> todoslosusuarios() {
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioservice.buscarTodas());
	}

	@DeleteMapping("/borrar-usuario/{idUsuario}")
	public ResponseEntity<?> borrarUsuario(@PathVariable int idUsuario) {

		usuarioservice.elimina(usuarioservice.get(idUsuario));

		return ResponseEntity.accepted().build();

	}

	@PutMapping("/update/{idusuario}")

	public ResponseEntity<Usuario> updateusuarios(@PathVariable int idusuario, @RequestBody Usuario usuario) {

		usuario.setId(idusuario);
		Usuario usuarios = new Usuario();
		usuarios = usuarioservice.get(idusuario);
		usuarios.setName(usuario.getName());

		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioservice.actualizarusuario(usuario));

	}

}
