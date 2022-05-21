package agrotisTeste.agrotisTeste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;




@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class AgrotisTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgrotisTesteApplication.class, args);
	}

}
