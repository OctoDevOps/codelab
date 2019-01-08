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
		//updated a new build version
		return "05";
	}

	//IAE-3
	@RequestMapping(value = "/rel/patch", method = RequestMethod.GET)
	@ResponseBody
	String getPatchVersion() {
		//updated a new patch version
		return "08";
	}

	//IAE-3
	@RequestMapping(value = "/rel/team", method = RequestMethod.GET)
	@ResponseBody
	String getTeamName(int nTeamId) {
		//updated a new patch version
		if(nTeamId == 1)
			return "IT";
		if(nTeamId == 2)
			return "MGMT";
		return "SUPPORT";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(jptAutomation.class, args);
	}

}