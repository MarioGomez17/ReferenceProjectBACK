package ReferencesProject.MODULES.BASE_COMPONENTS.Services;

import java.util.List;

public interface IBaseService<Entity, IdEntity> {

    public List<Entity> FindAll() throws Exception;

    public Entity FindById(IdEntity Id) throws Exception;

    public Entity Save(Entity Entity) throws Exception;

    public Entity Update(IdEntity Id, Entity Entity) throws Exception;

    public boolean Delete(IdEntity Id) throws Exception;
}
