package ReferencesProject.MODULES.USERS.Repositories;

import org.springframework.stereotype.Repository;

import ReferencesProject.MODULES.BASE_COMPONENTS.Repositories.IBaseRepository;
import ReferencesProject.MODULES.USERS.Entities.UserEntity;

@Repository
public interface IUserRepository extends IBaseRepository<UserEntity, Long> {
    
}
