package ReferencesProject.MODULES.MOTORCYCLES.ServicesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ReferencesProject.MODULES.BASE_COMPONENTS.Repositories.IBaseRepository;
import ReferencesProject.MODULES.BASE_COMPONENTS.ServicesImplemetation.BaseServiceImplementation;
import ReferencesProject.MODULES.MOTORCYCLES.Entities.LineEntity;
import ReferencesProject.MODULES.MOTORCYCLES.Repositories.ILineRepository;
import ReferencesProject.MODULES.MOTORCYCLES.Services.ILineService;

@Service
public class LineServiceImplementation extends BaseServiceImplementation<LineEntity, Long> implements ILineService {

    @SuppressWarnings("unused")
    @Autowired
    private ILineRepository LineRepository;

    public LineServiceImplementation(ILineRepository LineRepository,
            IBaseRepository<LineEntity, Long> BaseRepository) {
        super(BaseRepository);
        this.LineRepository = LineRepository;
    }
}
