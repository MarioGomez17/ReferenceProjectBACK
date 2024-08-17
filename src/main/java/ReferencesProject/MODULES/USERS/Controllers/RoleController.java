package ReferencesProject.MODULES.USERS.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ReferencesProject.MODULES.BASE_COMPONENTS.Controllers.BaseControllerImplementation;
import ReferencesProject.MODULES.USERS.Entities.RoleEntity;
import ReferencesProject.MODULES.USERS.ServicesImplementation.RoleServiceImplementation;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/Role")

public class RoleController  extends BaseControllerImplementation<RoleEntity, RoleServiceImplementation>{
    
}
