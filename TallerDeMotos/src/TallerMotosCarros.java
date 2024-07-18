import java.util.Scanner;

//public class TallerMotosCarros {
//    //Atributos
//    int maxEmployee;
//    String nameEmployee;
//    String[][][] worksSchedule;
//    String workTodo;
//    String[] works = {"Reparacion", "Mantenimiento"};
//    int numberRegisters;
//
//    public TallerMotosCarros(int maxEmployees) {
//        // Inicializar el arreglo tridimensional
//        // La primera dimensión es el número de empleados
//        // La segunda dimensión tiene 2 (moto y carro)
//        // La tercera dimensión tiene 4 (estado, marca, modelo, año)
//        worksSchedule = new String[5][2][4];
//    }
//
//        public void assignEmployee (String[]namesEmployee){
//                Scanner entrada = new Scanner(System.in);
//
//                for (int j = 0; j < namesEmployee.length; j++) {
//                    System.out.println((j + 1) + " " + namesEmployee[j]);
//                }
//                System.out.println("Seleccione un mecanico");
//                int optionEmployee = entrada.nextInt();
//                String employee = namesEmployee[optionEmployee - 1];
//                System.out.println("El empleado seleccionado es: " + employee);
//
//                // Asignar el nombre del empleado en el arreglo tridimensional
//                int employeeIndex = optionEmployee - 1;
//                worksSchedule[employeeIndex][0][0] = employee;
//
//
//                int optionWork;
//                System.out.println("Seleccione un Vehiculo para " + employee);
//                System.out.println("1. Moto");
//                System.out.println("2. Carro");
//                optionWork = entrada.nextInt();
//                entrada.nextLine();
//
//                int vehicleIndex = optionWork - 1; // Ajustar el índice para trabajar con el arreglo
//
//                if (optionWork == 1 || optionWork == 2) {
//                    System.out.println("Ingrese el estado del vehículo: ");
//                    worksSchedule[employeeIndex][vehicleIndex][0] = entrada.nextLine();
//                    System.out.println("Ingrese la marca del vehículo: ");
//                    worksSchedule[employeeIndex][vehicleIndex][1] = entrada.nextLine();
//                    System.out.println("Ingrese el modelo del vehículo: ");
//                    worksSchedule[employeeIndex][vehicleIndex][2] = entrada.nextLine();
//                    System.out.println("Ingrese el año del vehículo: ");
//                    worksSchedule[employeeIndex][vehicleIndex][3] = entrada.nextLine();
//                } else {
//                    System.out.println("Seleccione una opción válida (1-2)");
//                    return;
//                }
//
//                // Mostrar el estado actualizado del arreglo
//                System.out.println("Mecánico asignado: " + worksSchedule[employeeIndex][vehicleIndex][0]);
//                System.out.println("Marca del vehículo: " + worksSchedule[employeeIndex][vehicleIndex][1]);
//                System.out.println("Modelo del vehículo: " + worksSchedule[employeeIndex][vehicleIndex][2]);
//                System.out.println("Año del vehículo: " + worksSchedule[employeeIndex][vehicleIndex][3]);
//
//            }
//
//        }
//



