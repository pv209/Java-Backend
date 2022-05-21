package agrotisTeste.agrotisTeste.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class infoPropriedade {
	@Id@GeneratedValue(strategy= GenerationType.IDENTITY)
	public long id;
	public String nome;
	
	public infoPropriedade() {
	}
	public infoPropriedade(String nome) {
		this.nome=nome;
	}
	public void setId(long id) {
		this.id=id;
	}
	public long getId() {
		return id;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
}
