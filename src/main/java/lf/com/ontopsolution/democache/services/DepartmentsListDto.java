package lf.com.ontopsolution.democache.services;

import lf.com.ontopsolution.democache.model.entities.Department;
import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepartmentsListDto {

    private String id;
    private List<Department> departmentList;
}
