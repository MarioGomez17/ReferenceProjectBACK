package ReferencesProject.MODULES.MOTORCYCLES.Repositories;

import org.springframework.stereotype.Repository;

import ReferencesProject.MODULES.BASE_COMPONENTS.Repositories.IBaseRepository;
import ReferencesProject.MODULES.MOTORCYCLES.Entities.BrandEntity;

@Repository
public interface IBrandRepository extends IBaseRepository<BrandEntity, Long> {
    
}