package maven_endes;

/**
 * Clase que representa un empleado del sistema.
 */
public class Employee {

    private String name;
    private int years;

    /**
     * Constructor del empleado
     * @param name Nombre del empleado
     * @param years Años en la empresa
     */
    public Employee(String name, int years) {
        this.name = name;
        this.years = years;
    }

    /**
     * Obtiene el nombre del empleado
     * @return nombre del empleado
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene los años en la empresa
     * @return años trabajados
     */
    public int getYears() {
        return years;
    }

    /**
     * Modifica el nombre del empleado
     * @param name nuevo nombre
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Modifica los años del empleado
     * @param years nuevos años
     */
    public void setYears(int years) {
        this.years = years;
    }

    /**
     * Representación en texto del empleado
     */
    @Override
    public String toString() {
        return name + ", Years in company: " + years;
    }
}
