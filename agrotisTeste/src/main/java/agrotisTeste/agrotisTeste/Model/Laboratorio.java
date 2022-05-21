package agrotisTeste.agrotisTeste.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laboratorio {
 @Id
 public long id;
 public String nome;
 public Laboratorio (String nome) {
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
