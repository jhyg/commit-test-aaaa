package commit.test.aaaa.common;


import commit.test.aaaa.BoundedContext281Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext281Application.class })
public class CucumberSpingConfiguration {
    
}
