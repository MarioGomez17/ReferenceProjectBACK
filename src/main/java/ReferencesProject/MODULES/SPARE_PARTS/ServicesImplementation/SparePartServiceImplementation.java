package ReferencesProject.MODULES.SPARE_PARTS.ServicesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ReferencesProject.MODULES.BASE_COMPONENTS.Repositories.IBaseRepository;
import ReferencesProject.MODULES.BASE_COMPONENTS.ServicesImplemetation.BaseServiceImplementation;
import ReferencesProject.MODULES.SPARE_PARTS.Entities.SparePartEntity;
import ReferencesProject.MODULES.SPARE_PARTS.Repositories.ISparePartRepository;
import ReferencesProject.MODULES.SPARE_PARTS.Services.ISparePartService;

@Service
public class SparePartServiceImplementation extends BaseServiceImplementation<SparePartEntity, Long>
        implements ISparePartService {

    @SuppressWarnings("unused")
    @Autowired
    private ISparePartRepository SparePartRepository;

    public SparePartServiceImplementation(ISparePartRepository SparePartRepository,
            IBaseRepository<SparePartEntity, Long> BaseRepository) {
        super(BaseRepository);
        this.SparePartRepository = SparePartRepository;
    }
}
