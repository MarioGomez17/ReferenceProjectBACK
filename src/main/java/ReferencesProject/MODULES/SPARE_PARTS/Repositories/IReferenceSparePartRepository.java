package ReferencesProject.MODULES.SPARE_PARTS.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ReferencesProject.MODULES.SPARE_PARTS.Entities.ReferenceSparePartEntity;

@Repository
public interface IReferenceSparePartRepository extends JpaRepository<ReferenceSparePartEntity, Long> {
    
}
