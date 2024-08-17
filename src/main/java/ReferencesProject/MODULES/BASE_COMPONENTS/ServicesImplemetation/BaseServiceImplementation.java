package ReferencesProject.MODULES.BASE_COMPONENTS.ServicesImplemetation;

import java.util.List;

import java.util.Optional;

import ReferencesProject.MODULES.BASE_COMPONENTS.Repositories.IBaseRepository;
import ReferencesProject.MODULES.BASE_COMPONENTS.Services.IBaseService;

public abstract class BaseServiceImplementation<Entity, IdEntity> implements IBaseService<Entity, IdEntity> {

    protected IBaseRepository<Entity, IdEntity> BaseRepository;

    public BaseServiceImplementation(IBaseRepository<Entity, IdEntity> BaseRepository) {
        this.BaseRepository = BaseRepository;
    }

    @Override
    public List<Entity> FindAll() throws Exception {
        try {
            List<Entity> Entities = this.BaseRepository.findAll();
            return Entities;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Entity FindById(IdEntity Id) throws Exception {
        try {
            Optional<Entity> Entity = this.BaseRepository.findById(Id);
            return Entity.get();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Entity Save(Entity Entity) throws Exception {
        try {
            Entity = this.BaseRepository.save(Entity);
            return Entity;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Entity Update(IdEntity Id, Entity Entity) throws Exception {
        try {
            Optional<Entity> EntityOptional = this.BaseRepository.findById(Id);
            Entity UpdateEntity = EntityOptional.get();
            UpdateEntity = this.BaseRepository.save(Entity);
            return UpdateEntity;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean Delete(IdEntity Id) throws Exception {
        try {
            if (this.BaseRepository.existsById(Id)) {
                this.BaseRepository.deleteById(Id);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

}
