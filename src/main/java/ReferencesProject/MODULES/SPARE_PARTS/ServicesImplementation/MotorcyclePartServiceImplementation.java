package ReferencesProject.MODULES.SPARE_PARTS.ServicesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ReferencesProject.MODULES.BASE_COMPONENTS.Repositories.IBaseRepository;
import ReferencesProject.MODULES.BASE_COMPONENTS.ServicesImplemetation.BaseServiceImplementation;
import ReferencesProject.MODULES.SPARE_PARTS.Entities.MotorcyclePartEntity;
import ReferencesProject.MODULES.SPARE_PARTS.Repositories.IMotorcyclePartRepository;
import ReferencesProject.MODULES.SPARE_PARTS.Services.IMotorcyclePartService;

@Service
public class MotorcyclePartServiceImplementation extends BaseServiceImplementation<MotorcyclePartEntity, Long>
        implements IMotorcyclePartService {

    @SuppressWarnings("unused")
    @Autowired
    private IMotorcyclePartRepository MotorcyclePartRepository;

    public MotorcyclePartServiceImplementation(IMotorcyclePartRepository MotorcyclePartRepository,
            IBaseRepository<MotorcyclePartEntity, Long> BaseRepository) {
        super(BaseRepository);
        this.MotorcyclePartRepository = MotorcyclePartRepository;
    }
}
