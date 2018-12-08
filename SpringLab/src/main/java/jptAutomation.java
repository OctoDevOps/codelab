import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class jptAutomation {

	@RequestMapping("/")
	String home() {
		return "Welcome to JPT Release version generator..";
	}

	//IAE-0
	@RequestMapping(value = "/rel", method = RequestMethod.GET)
	@ResponseBody
	String getRel() {
		//updated a new release version
		return getRelVersion()+"."+getBuildVersion();
	}

	//IAE-1
	@RequestMapping(value = "/rel/version", method = RequestMethod.GET)
	@ResponseBody
	String getRelVersion() {
		//updated a new release version
		return "16";
	}


	//IAE-2
	@RequestMapping(value = "/rel/build", method = RequestMethod.GET)
	@ResponseBody
	String getBuildVersion() {
		//updated a new release version
		return "01";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(jptAutomation.class, args);
	}

}