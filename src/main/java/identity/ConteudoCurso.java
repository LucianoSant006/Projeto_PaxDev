package identity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class ConteudoCurso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Id Long;
	private String tipoConteudo;
	private String titulo;
	private String descricao;
	private String url;
	private int ordemSequencial;
	
	
	

}
