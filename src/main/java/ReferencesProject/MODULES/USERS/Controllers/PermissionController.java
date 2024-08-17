package ReferencesProject.MODULES.USERS.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ReferencesProject.MODULES.BASE_COMPONENTS.Controllers.BaseControllerImplementation;
import ReferencesProject.MODULES.USERS.Entities.PermissionEntity;
import ReferencesProject.MODULES.USERS.ServicesImplementation.PermissionServiceImplementation;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/Permission")

public class PermissionController  extends BaseControllerImplementation<PermissionEntity, PermissionServiceImplementation>{
    
}
