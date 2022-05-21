package agrotisTeste.agrotisTeste.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import agrotisTeste.agrotisTeste.Model.infoPropriedade;

public interface PropRepo extends JpaRepository<infoPropriedade,Long> {

	infoPropriedade findByNome (String nome);

}
