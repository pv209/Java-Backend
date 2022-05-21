package agrotisTeste.agrotisTeste.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StatusCheck {
	@RequestMapping(path= "/")
	@ResponseBody
  public String check() {
	  return "online";
  }
}
