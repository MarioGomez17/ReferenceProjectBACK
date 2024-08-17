package ReferencesProject.MODULES.SPARE_PARTS.Repositories;

import org.springframework.stereotype.Repository;

import ReferencesProject.MODULES.BASE_COMPONENTS.Repositories.IBaseRepository;
import ReferencesProject.MODULES.SPARE_PARTS.Entities.MotorcyclePartEntity;

@Repository
public interface IMotorcyclePartRepository extends IBaseRepository<MotorcyclePartEntity, Long> {
    
}
