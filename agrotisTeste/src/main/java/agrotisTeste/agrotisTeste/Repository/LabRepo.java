package agrotisTeste.agrotisTeste.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import agrotisTeste.agrotisTeste.Model.Laboratorio;

public interface LabRepo extends JpaRepository<Laboratorio,Long> {

	Laboratorio findBynome(String nomeLab);

}
