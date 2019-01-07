
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.actuate.autoconfigure.cloudfoundry.HealthEndpointCloudFoundryExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes={jptAutomation.class})
//@ContextConfiguration(classes={jptAutomation.class})
public class jptAutomationTests {
	
	@Autowired
	private jptAutomation  m_objAutomation;

	@Test
	public void test_getPatchVersion(){
		assertEquals("Validated getPatch() API","08",m_objAutomation.getPatchVersion());
	}

	@Test
	public void test_getBuildVersion(){
		assertEquals("Validated getBuildVersion() API","05",m_objAutomation.getBuildVersion());
	}

	@Test
	public void test_home(){
		assertNotNull(m_objAutomation.home());
	}

}


/// Step #2. 
/// Step #3. 
// mvn test sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.login=1805353f12ac75d907948da15a5e3139c17d2dd9
/*
mvn sonar:sonar \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=1805353f12ac75d907948da15a5e3139c17d2dd9
  */