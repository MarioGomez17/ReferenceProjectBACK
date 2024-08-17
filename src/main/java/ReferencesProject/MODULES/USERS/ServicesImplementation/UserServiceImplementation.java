package ReferencesProject.MODULES.USERS.ServicesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ReferencesProject.MODULES.BASE_COMPONENTS.Repositories.IBaseRepository;
import ReferencesProject.MODULES.BASE_COMPONENTS.ServicesImplemetation.BaseServiceImplementation;
import ReferencesProject.MODULES.USERS.Entities.UserEntity;
import ReferencesProject.MODULES.USERS.Repositories.IUserRepository;
import ReferencesProject.MODULES.USERS.Services.IUserService;

@Service
public class UserServiceImplementation extends BaseServiceImplementation<UserEntity, Long> implements IUserService {

    @SuppressWarnings("unused")
    @Autowired
    private IUserRepository UserRepository;

    public UserServiceImplementation(IUserRepository UserRepository,
            IBaseRepository<UserEntity, Long> BaseRepository) {
        super(BaseRepository);
        this.UserRepository = UserRepository;
    }
}
