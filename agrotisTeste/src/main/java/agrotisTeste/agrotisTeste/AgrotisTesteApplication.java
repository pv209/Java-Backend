package agrotisTeste.agrotisTeste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;




@SpringBootApplication(scanBasePackages={
"agrotisTeste.agrotisTeste", "agrotisTeste.agrotisTeste.Controller","agrotisTeste.agrotisTeste.Model","agrotisTeste.agrotisTeste.Repository"})
public class AgrotisTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgrotisTesteApplication.class, args);
	}

}
