package lf.com.ontopsolution.democache.services.impl;

import lf.com.ontopsolution.democache.model.entities.Department;
import lf.com.ontopsolution.democache.model.repositories.DepartmentRepository;
import lf.com.ontopsolution.democache.services.DepartmentService;
import lf.com.ontopsolution.democache.services.DepartmentsListDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository){
        this.departmentRepository=departmentRepository;
    }

    @Cacheable(cacheNames = "departments")
    public List<Department> getAllDepartments(){
        return findAllDepartments("all").getDepartmentList();
    }

    public DepartmentsListDto findAllDepartments(String all){
        log.info("Call Departments");
        DepartmentsListDto departmentsListDto  = DepartmentsListDto.builder().id("AllDepartments").departmentList(this.departmentRepository.findAll()).build();
        log.info("Call Departments");
        return departmentsListDto;
    }
}
