package ReferencesProject.MODULES.SPARE_PARTS.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ReferencesProject.MODULES.BASE_COMPONENTS.Controllers.BaseControllerImplementation;
import ReferencesProject.MODULES.SPARE_PARTS.Entities.SparePartEntity;
import ReferencesProject.MODULES.SPARE_PARTS.ServicesImplementation.SparePartServiceImplementation;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/SparePart")

public class SparePartController  extends BaseControllerImplementation<SparePartEntity, SparePartServiceImplementation>{
    
}
