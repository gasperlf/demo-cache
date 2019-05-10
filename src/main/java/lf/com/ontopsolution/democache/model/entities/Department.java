package lf.com.ontopsolution.democache.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "departments")
@Entity
public class Department {

    @Id
    @Column(name = "dept_no")
    private String departmentCode;

    @Column(name = "dept_name")
    private String departmentName;

}
