package lf.com.ontopsolution.democache.resources;

import lf.com.ontopsolution.democache.model.entities.Department;
import lf.com.ontopsolution.democache.services.DepartmentService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentsResource {

  private final DepartmentService departmentService;

  public DepartmentsResource(DepartmentService departmentService){
      this.departmentService= departmentService;
  }

  @GetMapping(path = "/departments/all", produces = MediaType.APPLICATION_PROBLEM_JSON_UTF8_VALUE)
    public ResponseEntity<List<Department>> getAllDepartments(){
      return ResponseEntity.ok(departmentService.getAllDepartments());
  }
}
