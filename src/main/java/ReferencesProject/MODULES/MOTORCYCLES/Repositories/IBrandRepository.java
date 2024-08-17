package ReferencesProject.MODULES.MOTORCYCLES.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ReferencesProject.MODULES.MOTORCYCLES.Entities.BrandEntity;

@Repository
public interface IBrandRepository extends JpaRepository<BrandEntity, Long> {
    
}