package ReferencesProject.MODULES.BASE_COMPONENTS.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import ReferencesProject.MODULES.BASE_COMPONENTS.ServicesImplemetation.BaseServiceImplementation;

public class BaseControllerImplementation<Entity, Service extends BaseServiceImplementation<Entity, Long>>
        implements IBaseController<Entity, Long> {

    @Autowired
    protected Service Servicio;

    @GetMapping("/GetAll")
    @Override

    public ResponseEntity<?> GetAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.Servicio.FindAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\" Error\":\"Error. Por favor intente más tarde\"}");
        }
    }

    @GetMapping("/GetOne/{Id}")
    @Override
    public ResponseEntity<?> GetOne(Long Id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.Servicio.FindById(Id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\" Error\":\"Error. Por favor intente más tarde\"}");
        }
    }

    @PostMapping("/Save")
    @Override
    public ResponseEntity<?> Save(Entity Entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.Servicio.Save(Entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\" Error\":\"Error. Por favor intente más tarde\"}");
        }
    }

    @PutMapping("/Update/{Id}")
    @Override
    public ResponseEntity<?> Update(Long Id, Entity Entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.Servicio.Update(Id, Entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\" Error\":\"Error. Por favor intente más tarde\"}");
        }
    }

    @DeleteMapping("/Delete/{Id}")
    @Override
    public ResponseEntity<?> Delete(Long Id) {
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(this.Servicio.Delete(Id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\" Error\":\"Error. Por favor intente más tarde\"}");
        }
    }
}
