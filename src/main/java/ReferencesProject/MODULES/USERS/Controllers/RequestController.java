package ReferencesProject.MODULES.USERS.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ReferencesProject.MODULES.BASE_COMPONENTS.Controllers.BaseControllerImplementation;
import ReferencesProject.MODULES.USERS.Entities.RequestEntity;
import ReferencesProject.MODULES.USERS.ServicesImplementation.RequestServiceImplementation;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/Request")

public class RequestController  extends BaseControllerImplementation<RequestEntity, RequestServiceImplementation>{
    
}
