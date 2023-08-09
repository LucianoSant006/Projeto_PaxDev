package identity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Planos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Id Long;
	private String tipoPlano;
	
	

}
