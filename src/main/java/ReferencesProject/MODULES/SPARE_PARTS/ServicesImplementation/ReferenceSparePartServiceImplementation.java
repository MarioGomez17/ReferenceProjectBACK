package ReferencesProject.MODULES.SPARE_PARTS.ServicesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ReferencesProject.MODULES.BASE_COMPONENTS.Repositories.IBaseRepository;
import ReferencesProject.MODULES.BASE_COMPONENTS.ServicesImplemetation.BaseServiceImplementation;
import ReferencesProject.MODULES.SPARE_PARTS.Entities.ReferenceSparePartEntity;
import ReferencesProject.MODULES.SPARE_PARTS.Repositories.IReferenceSparePartRepository;
import ReferencesProject.MODULES.SPARE_PARTS.Services.IReferenceSparePartService;

@Service
public class ReferenceSparePartServiceImplementation extends BaseServiceImplementation<ReferenceSparePartEntity, Long>
        implements IReferenceSparePartService {

    @SuppressWarnings("unused")
    @Autowired
    private IReferenceSparePartRepository ReferenceSparePartRepository;

    public ReferenceSparePartServiceImplementation(IReferenceSparePartRepository ReferenceSparePartRepository,
            IBaseRepository<ReferenceSparePartEntity, Long> BaseRepository) {
        super(BaseRepository);
        this.ReferenceSparePartRepository = ReferenceSparePartRepository;
    }
}
