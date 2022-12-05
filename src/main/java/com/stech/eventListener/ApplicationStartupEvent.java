package com.stech.eventListener;

import com.stech.model.Employee;
import com.stech.model.Role;
import com.stech.repository.EmployeeRepository;
import com.stech.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationStartupEvent implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RoleRepository roleRepository;

    public void run(String... args) throws Exception {
        this.initEmployees();
        this.initRoles();
    }

    private void initEmployees() {
//        for(int i=1000;i<=2000;i++){
//            Employee emp= new Employee();
//            emp.setId(i+"");
//            emp.setFirstname("vksss");
//            emp.setLastname("ksskss");
//            emp.setAge(43);
//
//            employeeRepository.save(emp);
//        }
    }

    public void initRoles(){
//        for(int i=1;i<=500;i++){
//            Role role= new Role();
//            role.setId(i+"");
//            role.setRole("user");
//            roleRepository.save(role);
//        }
    }
}

