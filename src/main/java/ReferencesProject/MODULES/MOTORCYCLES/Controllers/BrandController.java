package ReferencesProject.MODULES.MOTORCYCLES.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ReferencesProject.MODULES.BASE_COMPONENTS.Controllers.BaseControllerImplementation;
import ReferencesProject.MODULES.MOTORCYCLES.Entities.BrandEntity;
import ReferencesProject.MODULES.MOTORCYCLES.ServicesImplementation.BrandServiceImplementation;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/Brand")

public class BrandController extends BaseControllerImplementation<BrandEntity, BrandServiceImplementation> {
    
}
