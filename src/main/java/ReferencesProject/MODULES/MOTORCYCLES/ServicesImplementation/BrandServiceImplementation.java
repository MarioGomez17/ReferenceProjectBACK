package ReferencesProject.MODULES.MOTORCYCLES.ServicesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ReferencesProject.MODULES.BASE_COMPONENTS.Repositories.IBaseRepository;
import ReferencesProject.MODULES.BASE_COMPONENTS.ServicesImplemetation.BaseServiceImplementation;
import ReferencesProject.MODULES.MOTORCYCLES.Entities.BrandEntity;
import ReferencesProject.MODULES.MOTORCYCLES.Repositories.IBrandRepository;
import ReferencesProject.MODULES.MOTORCYCLES.Services.IBrandService;

@Service
public class BrandServiceImplementation extends BaseServiceImplementation<BrandEntity, Long> implements IBrandService {

    @SuppressWarnings("unused")
    @Autowired
    private IBrandRepository BrandRepository;

    public BrandServiceImplementation(IBrandRepository BrandRepository,
            IBaseRepository<BrandEntity, Long> BaseRepository) {
        super(BaseRepository);
        this.BrandRepository = BrandRepository;
    }

}
