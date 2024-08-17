package ReferencesProject.MODULES.MOTORCYCLES.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ReferencesProject.MODULES.BASE_COMPONENTS.Controllers.BaseControllerImplementation;
import ReferencesProject.MODULES.MOTORCYCLES.Entities.LineEntity;
import ReferencesProject.MODULES.MOTORCYCLES.ServicesImplementation.LineServiceImplementation;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/Line")

public class LineController extends BaseControllerImplementation<LineEntity, LineServiceImplementation> {
    
}
