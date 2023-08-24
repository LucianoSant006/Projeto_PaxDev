package identity;

import java.time.LocalDate;

import org.springframework.cglib.core.Local;

import jakarta.persistence.ManyToOne;

public class Transacao {
	
	@ManyToOne
	private Cliente cliente;
	@ManyToOne
	private Curso curso;
	
	private Planos planos;
	
	
	private LocalDate date;
	private  String status_transacao;
	
	
	 

}
