package ReferencesProject.MODULES.USERS.ServicesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ReferencesProject.MODULES.BASE_COMPONENTS.Repositories.IBaseRepository;
import ReferencesProject.MODULES.BASE_COMPONENTS.ServicesImplemetation.BaseServiceImplementation;
import ReferencesProject.MODULES.USERS.Entities.RoleEntity;
import ReferencesProject.MODULES.USERS.Repositories.IRoleRepository;
import ReferencesProject.MODULES.USERS.Services.IRoleService;

@Service
public class RoleServiceImplementation extends BaseServiceImplementation<RoleEntity, Long> implements IRoleService {

    @SuppressWarnings("unused")
    @Autowired
    private IRoleRepository RoleRepository;

    public RoleServiceImplementation(IRoleRepository RoleRepository,
            IBaseRepository<RoleEntity, Long> BaseRepository) {
        super(BaseRepository);
        this.RoleRepository = RoleRepository;
    }
}
