package agrotisTeste.agrotisTeste.Controller;

import java.util.Arrays;
import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import agrotisTeste.agrotisTeste.Model.Formulario;
import agrotisTeste.agrotisTeste.Model.Laboratorio;
import agrotisTeste.agrotisTeste.Model.User;
import agrotisTeste.agrotisTeste.Model.infoPropriedade;
import agrotisTeste.agrotisTeste.Repository.LabRepo;
import agrotisTeste.agrotisTeste.Repository.PropRepo;
import agrotisTeste.agrotisTeste.Repository.UserRepo;

@RestController
public class UserController {
	@Autowired
	private PropRepo propRepo;
	@Autowired
	private LabRepo labRepo;
	@Autowired
	private UserRepo userRepo;
	@RequestMapping("/info")
	@ResponseBody
	public List<infoPropriedade>listaInfo(){
		List<infoPropriedade> info = propRepo.findAll();
		return info;
	}
	
	@RequestMapping("/lab")
	@ResponseBody
	public List<Laboratorio>listaLab(){
		List<Laboratorio> lab = labRepo.findAll();
		return lab;
	}
	
	@RequestMapping("/user")
	@ResponseBody
	public List<User>listaUser(){
		List<User> user = userRepo.findAll();
		return user;
	}
	
	@PostMapping("/salvar")
	public Formulario cadastrar(@RequestBody Formulario form) {
		infoPropriedade info = form.converterInfo();
		propRepo.save(info);
		Laboratorio lab = form.covertLab();
		labRepo.save(lab);
		
		User usuario = form.convertUser(propRepo,labRepo);
		System.out.println(usuario);
		userRepo.save(usuario);
		return form.addNewUser(form);

		
		
	}
	
	@PutMapping("/atualizar/{id}")
	public void atualizar(@RequestBody Formulario form) {
		User usuario = form.convertUser(propRepo,labRepo);
		userRepo.save(usuario);
		infoPropriedade info = form.converterInfo();
		propRepo.save(info);
		Laboratorio lab = form.covertLab();
		labRepo.save(lab);
	}
	
	@DeleteMapping("/deletar/{id}")
	public void deletar(@PathVariable Long id) {
		userRepo.deleteById(id);
	}
	
	
}
