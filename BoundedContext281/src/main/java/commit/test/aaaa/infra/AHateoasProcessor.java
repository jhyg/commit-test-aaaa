package commit.test.aaaa.infra;
import commit.test.aaaa.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class AHateoasProcessor implements RepresentationModelProcessor<EntityModel<A>>  {

    @Override
    public EntityModel<A> process(EntityModel<A> model) {

        
        return model;
    }
    
}
