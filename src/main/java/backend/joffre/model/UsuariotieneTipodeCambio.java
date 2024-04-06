package backend.joffre.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import backend.joffre.model.MonedaOrigen;


@Entity
@Table(name = "usuariotienetipodecambio")
@Data
public class UsuariotieneTipodeCambio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String name;
	
	Double monto;
	
	@JoinColumn(name = "fkidusuario", referencedColumnName = "id")
	@ManyToOne
	Usuario mUsuario;
	
	
	@JoinColumn(name = "fkidtipodecambio", referencedColumnName = "id")
	@ManyToOne
	TipodeCambio mTipodeCambio;
	
	@JoinColumn(name = "fkidmonedaorigen", referencedColumnName = "id")
	@ManyToOne
	MonedaOrigen mMonedaOrigen;
	
}
