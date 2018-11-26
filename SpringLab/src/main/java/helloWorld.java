import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class helloWorld {

	@RequestMapping("/")
	String home() {
		return "Hello World! My First Java Apps..";
	}

	//IAE-1
	@RequestMapping(value = "/IAE/rel/version", method = RequestMethod.GET)
	@ResponseBody
	String getRelVersion() {
		return "Rel: 15.0, Program Increment:16 Build#:2313";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(helloWorld.class, args);
	}

}