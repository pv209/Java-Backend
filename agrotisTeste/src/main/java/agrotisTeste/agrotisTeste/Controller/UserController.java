package agrotisTeste.agrotisTeste.Controller;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

import agrotisTeste.agrotisTeste.Model.Formulario;
import agrotisTeste.agrotisTeste.Model.Laboratorio;
import agrotisTeste.agrotisTeste.Model.User;
import agrotisTeste.agrotisTeste.Model.infoPropriedade;
import agrotisTeste.agrotisTeste.Repository.LabRepo;
import agrotisTeste.agrotisTeste.Repository.PropRepo;
import agrotisTeste.agrotisTeste.Repository.UserRepo;

@Controller
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
		infoPropriedade info = new infoPropriedade("rural");
		return Arrays.asList(info,info,info);
	}
	
	@RequestMapping("/lab")
	@ResponseBody
	public List<Laboratorio>lista(){
		Laboratorio lab = new Laboratorio("rural");
		return Arrays.asList(lab,lab,lab);
	}
	
	@PostMapping("/salvar")
	public void cadastrar(@RequestBody Formulario form) {
		User usuario = form.converterUser();
		userRepo.save(usuario);
		infoPropriedade info = form.converterInfo();
		propRepo.save(info);
		Laboratorio lab = form.covertLab();
		labRepo.save(lab);
		
		
	}
	
	@PutMapping("/atualizar/{id}")
	public void atualizar(@RequestBody Formulario form) {
		User usuario = form.converterUser();
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
