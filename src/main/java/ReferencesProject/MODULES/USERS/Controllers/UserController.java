package ReferencesProject.MODULES.USERS.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ReferencesProject.MODULES.BASE_COMPONENTS.Controllers.BaseControllerImplementation;
import ReferencesProject.MODULES.USERS.Entities.UserEntity;
import ReferencesProject.MODULES.USERS.ServicesImplementation.UserServiceImplementation;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/User")

public class UserController  extends BaseControllerImplementation<UserEntity, UserServiceImplementation>{
    
}
