package ReferencesProject.MODULES.MOTORCYCLES.Repositories;

import org.springframework.stereotype.Repository;

import ReferencesProject.MODULES.BASE_COMPONENTS.Repositories.IBaseRepository;
import ReferencesProject.MODULES.MOTORCYCLES.Entities.CylinderCapacityEntity;

@Repository
public interface ICylinderCapacityRepository extends IBaseRepository<CylinderCapacityEntity, Long> {
    
}
