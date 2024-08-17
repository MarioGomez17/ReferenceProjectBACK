package ReferencesProject.MODULES.USERS.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ReferencesProject.MODULES.USERS.Entities.UserEntity;

@Repository
public interface IUserRepository extends JpaRepository<UserEntity, Long> {
    
}
