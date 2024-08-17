package ReferencesProject.MODULES.MOTORCYCLES.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ReferencesProject.MODULES.BASE_COMPONENTS.Controllers.BaseControllerImplementation;
import ReferencesProject.MODULES.MOTORCYCLES.Entities.CylinderCapacityEntity;
import ReferencesProject.MODULES.MOTORCYCLES.ServicesImplementation.CylinderCapacityServiceImplementation;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/CylinderCapacity")

public class CylinderCapacityController extends BaseControllerImplementation<CylinderCapacityEntity, CylinderCapacityServiceImplementation> {
    
}
