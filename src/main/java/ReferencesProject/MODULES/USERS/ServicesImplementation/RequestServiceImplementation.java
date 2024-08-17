package ReferencesProject.MODULES.USERS.ServicesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ReferencesProject.MODULES.BASE_COMPONENTS.Repositories.IBaseRepository;
import ReferencesProject.MODULES.BASE_COMPONENTS.ServicesImplemetation.BaseServiceImplementation;
import ReferencesProject.MODULES.USERS.Entities.RequestEntity;
import ReferencesProject.MODULES.USERS.Repositories.IRequestRepository;
import ReferencesProject.MODULES.USERS.Services.IRequestService;

@Service
public class RequestServiceImplementation extends BaseServiceImplementation<RequestEntity, Long>
        implements IRequestService {

    @SuppressWarnings("unused")
    @Autowired
    private IRequestRepository RequestRepository;

    public RequestServiceImplementation(IRequestRepository RequestRepository,
            IBaseRepository<RequestEntity, Long> BaseRepository) {
        super(BaseRepository);
        this.RequestRepository = RequestRepository;
    }
}
