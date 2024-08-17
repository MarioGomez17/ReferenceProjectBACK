package ReferencesProject.MODULES.USERS.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ReferencesProject.MODULES.USERS.Entities.UserStateEntity;

@Repository
public interface IUserStateRepository extends JpaRepository<UserStateEntity, Long> {
    
}
