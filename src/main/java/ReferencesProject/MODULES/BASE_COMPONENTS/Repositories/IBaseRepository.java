package ReferencesProject.MODULES.BASE_COMPONENTS.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IBaseRepository<Entity, IdEntity> extends JpaRepository<Entity, IdEntity> {
    
}
