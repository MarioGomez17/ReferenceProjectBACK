package ReferencesProject.MODULES.USERS.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ReferencesProject.MODULES.USERS.Entities.PermissionEntity;

@Repository
public interface IPermissionRepository extends JpaRepository<PermissionEntity, Long> {
    
}
