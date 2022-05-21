package agrotisTeste.agrotisTeste.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import agrotisTeste.agrotisTeste.Model.User;

public interface UserRepo extends JpaRepository<User,Long> {

}
