package lf.com.ontopsolution.democache.model.repositories;

import lf.com.ontopsolution.democache.model.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {
}
