package ReferencesProject.MODULES.MOTORCYCLES.Repositories;

import org.springframework.stereotype.Repository;

import ReferencesProject.MODULES.BASE_COMPONENTS.Repositories.IBaseRepository;
import ReferencesProject.MODULES.MOTORCYCLES.Entities.LineEntity;

@Repository
public interface ILineRepository extends IBaseRepository<LineEntity, Long> {
    
}