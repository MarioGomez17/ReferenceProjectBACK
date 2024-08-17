package ReferencesProject.MODULES.MOTORCYCLES.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ReferencesProject.MODULES.MOTORCYCLES.Entities.CylinderCapacityEntity;

@Repository
public interface ICylinderCapacityRepository extends JpaRepository<CylinderCapacityEntity, Long> {
    
}
