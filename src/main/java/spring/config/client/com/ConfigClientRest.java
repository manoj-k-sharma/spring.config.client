package spring.config.client.com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientRest {
	
	@Value("${name}")
	String name;
	
	@RequestMapping("/getName")
	public String get() {
		return "** name is ** "+name;
	}

}
