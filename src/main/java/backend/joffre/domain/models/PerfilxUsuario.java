package backend.joffre.domain.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;



@Entity
@Table(name = "perfilxusuario")
@Data
public class PerfilxUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String name;
	Date creatAt;
	
	@JoinColumn(name = "fkidusuario", referencedColumnName = "id")
	@ManyToOne
	Usuario mUsuario;
	
	@JoinColumn(name = "fkperfil", referencedColumnName = "id")
	@ManyToOne
	Perfil mPerfil;
}
