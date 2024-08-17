package ReferencesProject.MODULES.SPARE_PARTS.Repositories;

import org.springframework.stereotype.Repository;

import ReferencesProject.MODULES.BASE_COMPONENTS.Repositories.IBaseRepository;
import ReferencesProject.MODULES.SPARE_PARTS.Entities.ReferenceSparePartEntity;

@Repository
public interface IReferenceSparePartRepository extends IBaseRepository<ReferenceSparePartEntity, Long> {
    
}
