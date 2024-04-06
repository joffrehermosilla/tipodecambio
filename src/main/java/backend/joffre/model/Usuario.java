package backend.joffre.model;



import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;



@Entity
@Table(name = "usuario")
@Data
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String name;
	
	Double monto;
	
	@OneToMany(mappedBy = "mUsuario", fetch = FetchType.EAGER)
	private transient Collection<UsuariotieneTipodeCambio> usuarioxtipodeCambio = new ArrayList<>();
	
}
