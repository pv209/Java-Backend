package agrotisTeste.agrotisTeste.Model;

import agrotisTeste.agrotisTeste.Repository.LabRepo;
import agrotisTeste.agrotisTeste.Repository.PropRepo;

public class Formulario {
	private String nomeUsuario;
	private String nomeProp;
	private String cnpj;
	private String nomeLab;
	private String observacao;
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeLab() {
		return nomeLab;
	}
	public void setNomeLab(String nomeLab) {
		this.nomeLab = nomeLab;
	}
	public String getNomeProp() {
		return nomeProp;
	}
	public void setNomeProp(String nomeProp) {
		this.nomeProp = nomeProp;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public infoPropriedade converterInfo() {
		return new infoPropriedade(nomeProp);
		
	}
	public User convertUser(PropRepo infoRepo, LabRepo labRepo){
		infoPropriedade prop = infoRepo.findByNome(nomeProp);
		Laboratorio lab =  labRepo.findBynome(nomeLab);
		return new User(nomeUsuario,cnpj,prop,lab,observacao);
	}
	public Laboratorio covertLab() {
		return new Laboratorio(nomeLab);
	}
	public Formulario addNewUser(Formulario form) {
		return form;
		
	}

}
