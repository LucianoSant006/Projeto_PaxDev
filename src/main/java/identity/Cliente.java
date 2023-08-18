package identity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity

public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Id Long;
	private String nome;
	private String email;
	private String senha;
	private int telefone;
	private LocalDate dateRegistro;
	public Id getLong() {
		return Long;
	}
	public void setLong(Id l) {
		Long = l;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public LocalDate getDateRegistro() {
		return dateRegistro;
	}
	public void setDateRegistro(LocalDate dateRegistro) {
		this.dateRegistro = dateRegistro;
	}
	
	
	
	
	
	

}
