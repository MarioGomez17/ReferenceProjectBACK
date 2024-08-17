package ReferencesProject.MODULES.MOTORCYCLES.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ReferencesProject.MODULES.MOTORCYCLES.Entities.LineEntity;

@Repository
public interface ILineRepository extends JpaRepository<LineEntity, Long> {
    
}