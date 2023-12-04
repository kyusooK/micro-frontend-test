package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class CompanyHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Company>> {

    @Override
    public EntityModel<Company> process(EntityModel<Company> model) {
        return model;
    }
}
