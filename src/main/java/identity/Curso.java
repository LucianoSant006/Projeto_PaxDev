package identity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Id Long ;
	private String professor;
	private String nameCurso;
	private String certificadoCurso;
	private String descricao;
	private String nivel;
	private String duracao;
	private String listaTopicos;
	
}
