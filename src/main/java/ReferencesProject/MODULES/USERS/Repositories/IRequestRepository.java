package ReferencesProject.MODULES.USERS.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ReferencesProject.MODULES.USERS.Entities.RequestEntity;

@Repository
public interface IRequestRepository extends JpaRepository<RequestEntity, Long> {
    
}
