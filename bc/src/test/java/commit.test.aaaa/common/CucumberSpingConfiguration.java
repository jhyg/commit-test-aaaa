package commit.test.aaaa.common;


import commit.test.aaaa.BcApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BcApplication.class })
public class CucumberSpingConfiguration {
    
}
