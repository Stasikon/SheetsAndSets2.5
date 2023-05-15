package service;
import com.example.sheetssets2_5.Employee;
import java.util.Collection;
import java.util.Set;

public interface EmployeeService {
   Employee add(String fillName, String lastName);
    Employee remove(String fullName, String lastName);
    Employee find(String fullName, String lastName);

    Collection<Employee> findAll();
}
