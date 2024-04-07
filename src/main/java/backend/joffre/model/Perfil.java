package backend.joffre.model;

import java.util.Date;
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
@Table(name = "perfil")
@Data
public class Perfil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String name;
	
	Date fecha_creacion;
	
	@OneToMany(mappedBy = "mPerfil", fetch = FetchType.EAGER)
	private transient Collection<PerfilxUsuario> perfilesxusuario = new ArrayList<>();
	
}
