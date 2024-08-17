package ReferencesProject.MODULES.USERS.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ReferencesProject.MODULES.BASE_COMPONENTS.Controllers.BaseControllerImplementation;
import ReferencesProject.MODULES.USERS.Entities.UserStateEntity;
import ReferencesProject.MODULES.USERS.ServicesImplementation.UserStateServiceImplementation;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/UserState")

public class UserStateController extends BaseControllerImplementation<UserStateEntity, UserStateServiceImplementation> {

}
