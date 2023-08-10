package identity;

import com.example.PAXDEVEnuns.TipoPlano;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


 
public class Planos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Id Long;
	private String tipoPlano;
	private String precoMensal;
	private String descricao;
	public Id getLong() {
		return Long;
	}
	public void setLong(Id l) {
		Long = l;
	}
	public String getTipoPlano() {
		return tipoPlano;
	}
	public void setTipoPlano(String tipoPlano) {
		this.tipoPlano = tipoPlano;
	}
	public String getPrecoMensal() {
		return precoMensal;
	}
	public void setPrecoMensal(String precoMensal) {
		this.precoMensal = precoMensal;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
	

}
