package ReferencesProject.MODULES.SPARE_PARTS.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ReferencesProject.MODULES.BASE_COMPONENTS.Controllers.BaseControllerImplementation;
import ReferencesProject.MODULES.SPARE_PARTS.Entities.MotorcyclePartEntity;
import ReferencesProject.MODULES.SPARE_PARTS.ServicesImplementation.MotorcyclePartServiceImplementation;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/MotorcyclePart")

public class MotorcyclePartController extends BaseControllerImplementation<MotorcyclePartEntity, MotorcyclePartServiceImplementation> {
    
}
