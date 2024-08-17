package ReferencesProject.MODULES.BASE_COMPONENTS.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface IBaseController<Entity, IdEntity> {

    public ResponseEntity<?> GetAll();

    public ResponseEntity<?> GetOne(@PathVariable IdEntity Id);

    public ResponseEntity<?> Save(@RequestBody Entity Entity);

    public ResponseEntity<?> Update(@PathVariable IdEntity Id, @RequestBody Entity Entity);

    public ResponseEntity<?> Delete(@PathVariable IdEntity Id);
}
