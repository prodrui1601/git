package maven_endes;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona empleados del sistema.
 */
public class EmployeeManager {

    private List<Employee> employees = new ArrayList<>();

    /**
     * Añade un nuevo empleado al sistema
     * @param name nombre del empleado
     * @param years años en la empresa
     */
    public void addEmployee(String name, int years) {
        Employee employee = new Employee(name, years);
        employees.add(employee);
        System.out.println(name + " added to the system.");
    }

    /**
     * Imprime la lista de empleados
     */
    public void printEmployees() {
        System.out.println("List of employees:");

        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    /**
     * Método principal de prueba
     */
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee("John Doe", 5);
        manager.addEmployee("Jane Smith", 2);

        manager.printEmployees();
    }
}
