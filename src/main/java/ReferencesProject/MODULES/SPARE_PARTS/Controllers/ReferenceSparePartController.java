package ReferencesProject.MODULES.SPARE_PARTS.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ReferencesProject.MODULES.BASE_COMPONENTS.Controllers.BaseControllerImplementation;
import ReferencesProject.MODULES.SPARE_PARTS.Entities.ReferenceSparePartEntity;
import ReferencesProject.MODULES.SPARE_PARTS.ServicesImplementation.ReferenceSparePartServiceImplementation;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/ReferenceSparePart")

public class ReferenceSparePartController extends BaseControllerImplementation<ReferenceSparePartEntity, ReferenceSparePartServiceImplementation>{
    
}
