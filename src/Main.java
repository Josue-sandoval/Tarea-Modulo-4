import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorEmpleados gestor = new GestorEmpleados();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
              System.out.println("      ********************  ");
            System.out.println("  **** SANDOVAL Y ASOCIADOS **** ");
              System.out.println("     ********************  ");
              System.out.println("       ****************  ");
              System.out.println("           ********  ");
            System.out.println("   Sistema de Gestión de Empleados ");
            System.out.println("-----------------------------------");
            System.out.println("    1. Ingreso de empleado");
            System.out.println("    2. Mostrar todos los empleados");
            System.out.println("    3. Salir de sistema");
            System.out.println("----------------------------------");
            System.out.print("      Seleccione una opción por favor:");
            opcion = scanner.nextInt();
            System.out.println("\n ");
            switch (opcion) {
                case 1:
                    scanner.nextLine(); 
                    System.out.println("-----------------------------");
                    System.out.print("Nombre Completo: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("Salario Total: ");
                    double salario = scanner.nextDouble();
                    gestor.agregarEmpleado(nombre, edad, salario);
                    System.out.println("Empleado agregado correctamente al sistema.");
                    System.out.println("-------------------------------------------");
                    break;
                case 2:
                    gestor.mostrarEmpleados();
                    break;
                case 3:
                    System.out.println("Saliendo... Hasta Luego");
                    break;
                default:
                    System.out.println("Opción inválida por favor seleccione 1, 2, 3.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}
