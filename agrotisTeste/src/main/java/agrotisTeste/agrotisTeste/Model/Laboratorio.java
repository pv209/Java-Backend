package agrotisTeste.agrotisTeste.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Laboratorio")
public class Laboratorio {
 @Id@GeneratedValue(strategy= GenerationType.IDENTITY)
 public Long id;
 public String nome;
 public Laboratorio() {
	 
 }
 public Laboratorio (String nome) {
	 	this.nome=nome;
	}
 
	public void setId(Long id) {
		this.id=id;
	}
	public Long getId() {
		return id;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
 
}
