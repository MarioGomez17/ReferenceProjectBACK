package ReferencesProject.MODULES.USERS.ServicesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ReferencesProject.MODULES.BASE_COMPONENTS.Repositories.IBaseRepository;
import ReferencesProject.MODULES.BASE_COMPONENTS.ServicesImplemetation.BaseServiceImplementation;
import ReferencesProject.MODULES.USERS.Entities.UserStateEntity;
import ReferencesProject.MODULES.USERS.Repositories.IUserStateRepository;
import ReferencesProject.MODULES.USERS.Services.IUserStateService;

@Service
public class UserStateServiceImplementation extends BaseServiceImplementation<UserStateEntity, Long>
        implements IUserStateService {

    @SuppressWarnings("unused")
    @Autowired
    private IUserStateRepository UserStateRepository;

    public UserStateServiceImplementation(IUserStateRepository UserStateRepository,
            IBaseRepository<UserStateEntity, Long> BaseRepository) {
        super(BaseRepository);
        this.UserStateRepository = UserStateRepository;
    }
}
