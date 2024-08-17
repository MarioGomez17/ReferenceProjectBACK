package ReferencesProject.MODULES.USERS.ServicesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ReferencesProject.MODULES.BASE_COMPONENTS.Repositories.IBaseRepository;
import ReferencesProject.MODULES.BASE_COMPONENTS.ServicesImplemetation.BaseServiceImplementation;
import ReferencesProject.MODULES.USERS.Entities.PermissionEntity;
import ReferencesProject.MODULES.USERS.Repositories.IPermissionRepository;
import ReferencesProject.MODULES.USERS.Services.IPermissionService;

@Service
public class PermissionServiceImplementation extends BaseServiceImplementation<PermissionEntity, Long>
        implements IPermissionService {

    @SuppressWarnings("unused")
    @Autowired
    private IPermissionRepository PermissionRepository;

    public PermissionServiceImplementation(IPermissionRepository PermissionRepository,
            IBaseRepository<PermissionEntity, Long> BaseRepository) {
        super(BaseRepository);
        this.PermissionRepository = PermissionRepository;
    }
}
