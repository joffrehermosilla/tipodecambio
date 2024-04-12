package backend.joffre.domain.models;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;




@Entity
@Table(name = "usuariotienetipodecambio")
@Data
public class UsuariotieneTipodeCambio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String name;
	
		
	@JoinColumn(name = "fkidusuario", referencedColumnName = "id")
	@ManyToOne
	Usuario mUsuario;
	
	
	@JoinColumn(name = "fkidtipodecambio", referencedColumnName = "id")
	@ManyToOne
	TipodeCambio mTipodeCambio;
	
	@JoinColumn(name = "fkidmonedaorigen", referencedColumnName = "id")
	@ManyToOne
	MonedaOrigen mMonedaOrigen;
	
	Date creatAt;
}
