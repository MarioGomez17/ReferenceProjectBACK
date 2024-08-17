package ReferencesProject.MODULES.MOTORCYCLES.ServicesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ReferencesProject.MODULES.BASE_COMPONENTS.Repositories.IBaseRepository;
import ReferencesProject.MODULES.BASE_COMPONENTS.ServicesImplemetation.BaseServiceImplementation;
import ReferencesProject.MODULES.MOTORCYCLES.Entities.CylinderCapacityEntity;
import ReferencesProject.MODULES.MOTORCYCLES.Repositories.ICylinderCapacityRepository;
import ReferencesProject.MODULES.MOTORCYCLES.Services.ICylinderCapacityService;

@Service
public class CylinderCapacityServiceImplementation extends BaseServiceImplementation<CylinderCapacityEntity, Long>
        implements ICylinderCapacityService {

    @SuppressWarnings("unused")
    @Autowired
    private ICylinderCapacityRepository CylinderCapacityRepository;

    public CylinderCapacityServiceImplementation(ICylinderCapacityRepository CylinderCapacityRepository,
            IBaseRepository<CylinderCapacityEntity, Long> BaseRepository) {
        super(BaseRepository);
        this.CylinderCapacityRepository = CylinderCapacityRepository;
    }

}
