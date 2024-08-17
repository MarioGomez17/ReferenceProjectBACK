package ReferencesProject.MODULES.SPARE_PARTS.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ReferencesProject.MODULES.SPARE_PARTS.Entities.SparePartEntity;

@Repository
public interface ISparePartRepository extends JpaRepository<SparePartEntity, Long> {
    
}
