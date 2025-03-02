import java.util.ArrayList;
import java.util.List;

public class GestorEmpleados {
    private List<Empleado> empleados = new ArrayList<>();
    public void agregarEmpleado(String nombre, int edad, double salario) {
        Empleado nuevoEmpleado = new Empleado(nombre, edad, salario);
        empleados.add(nuevoEmpleado);
    }
    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados en el sistema.");
            return;
        }
        for (Empleado emp : empleados) {
            emp.imprimirInformacion();
        }
    }
}
