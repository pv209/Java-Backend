package agrotisTeste.agrotisTeste.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User {
	@Id@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@ManyToOne @JoinColumn(name = "infoProp_id")
	private infoPropriedade infoPropriedade;
	private String cnpj;
	@ManyToOne @JoinColumn(name = "laboratorio_id")
	private Laboratorio laboratorio;
	private String observacoes;
	
	public User(String nomeUsuario, String cnpj,infoPropriedade info,Laboratorio lab, String observacao) {
		this.laboratorio=lab;
		this.infoPropriedade = info;
		this.nome=nomeUsuario;
		this.cnpj=cnpj;
		this.observacoes=observacao;
	}
	public void User1(String nome, String cnpj, agrotisTeste.agrotisTeste.Model.infoPropriedade info, Laboratorio lab, String observacao) {
		this.laboratorio=lab;
		this.infoPropriedade = info;
		this.nome=nome;
		this.cnpj=cnpj;
		this.observacoes=observacao;
		
	}
	public User() {
		
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
	
	public void setInfoPropriedade(infoPropriedade infoPropriedade) {
		this.infoPropriedade = infoPropriedade;
	}
	
	public agrotisTeste.agrotisTeste.Model.infoPropriedade getInfoPropriedade() {

		return infoPropriedade;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj=cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
		
	}
	
	public void setLaboratorio (Laboratorio laboratorio) {
		this.laboratorio=laboratorio;
	}
	
	public Laboratorio getLaboratorio() {
		return laboratorio;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes=observacoes;
	}
	public String getObservacoes() {
		return observacoes;
	}
}
