import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        /*Crea un programa que gestione trabajos de un taller que
repara motos y carros. En este caso, utilizaremos un array
tridimensional para organizar la información.*/
        //Instancia de la clase TallerMotosCarros para poder utilizarla en mi main

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de mecanicos del taller: ");
        int maxEmployee = entrada.nextInt();
        entrada.nextLine();
        String[][][] worksShedule = new String[maxEmployee][2][6];

        System.out.println("Ingrese los nombres de los mecanicos: ");
        for (int i = 0; i < worksShedule.length; i++) {
            System.out.println((i + 1) + " .Nombre mecanico: ");
            worksShedule[i][0][0] = entrada.nextLine();
        }
        int optionMenu;
        do {
            System.out.println("---Bienvenido al Gestor de trabajos--- ");
            System.out.println("1. Asignar trabajo a empleado");
            System.out.println("2. Ver vehiculos ingresados");
            System.out.println("3. Ver vehiculos por estado");
            System.out.println("4. Buscar vehiculo");
            System.out.println("5. Actualizar estado de un vehiculo");
            System.out.println("6. Salir");
            System.out.println("---Seleccione una opcion---");
            optionMenu = entrada.nextInt();

            switch (optionMenu) {
                case 1:
                    for (int j = 0; j < worksShedule.length; j++) {
                        System.out.println((j + 1) + " " + worksShedule[j][0][0]);
                    }
                    System.out.println("Seleccione un mecanico");
                    int optionEmployee = entrada.nextInt();
                    String employee = worksShedule[optionEmployee - 1][0][0];
                    System.out.println("El empleado seleccionado es: " + employee);

                    // Asignar el nombre del empleado en el arreglo tridimensional
                    int employeeIndex = optionEmployee - 1;
//                    worksSchedule[employeeIndex][0][0] = employee;


                    int optionVehicle;
                    System.out.println("Seleccione un Vehiculo para " + employee);
                    System.out.println("1. Moto");
                    System.out.println("2. Carro");
                    optionVehicle = entrada.nextInt();
                    entrada.nextLine();

                    if (optionVehicle == 1) {
                        worksShedule[employeeIndex][0][1] = "Moto";
                    } else if (optionVehicle == 2) {
                        worksShedule[employeeIndex][1][1] = "Carro";
                    } else {
                        System.out.println("Ingrese una opcion valida");
                    }

                    int vehicleIndex = optionVehicle - 1; // Ajustar el índice para trabajar con el arreglo


                    if (optionVehicle == 1 || optionVehicle == 2) {
                        System.out.println("Ingrese el estado del vehículo(Pendiente, En reparación, Reparado): ");
                        worksShedule[employeeIndex][vehicleIndex][5] = entrada.nextLine();
                        System.out.println("Ingrese la marca del vehículo: ");
                        worksShedule[employeeIndex][vehicleIndex][2] = entrada.nextLine();
                        System.out.println("Ingrese el modelo del vehículo: ");
                        worksShedule[employeeIndex][vehicleIndex][3] = entrada.nextLine();
                        System.out.println("Ingrese el año del vehículo: ");
                        worksShedule[employeeIndex][vehicleIndex][4] = entrada.nextLine();
                    } else {
                        System.out.println("Seleccione una opción válida (1-2)");
                    }


                    System.out.println("Mecánico asignado: " + worksShedule[employeeIndex][vehicleIndex][0]);
                    System.out.println("Tipo de vehiculo: " + worksShedule[employeeIndex][vehicleIndex][1]);
                    System.out.println("Marca del vehículo: " + worksShedule[employeeIndex][vehicleIndex][2]);
                    System.out.println("Modelo del vehículo: " + worksShedule[employeeIndex][vehicleIndex][3]);
                    System.out.println("Año del vehículo: " + worksShedule[employeeIndex][vehicleIndex][4]);
                    System.out.println("Estado del vehículo: " + worksShedule[employeeIndex][vehicleIndex][5]);
                    break;
                case 2:
                    System.out.println("---Vehículos Ingresados---");
                    for (int i = 0; i < worksShedule.length; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (worksShedule[i][j][1] != null) {
                                System.out.println("Mecánico: " + worksShedule[i][j][0]);
                                System.out.println("Tipo de vehículo: " + worksShedule[i][j][1]);
                                System.out.println("Marca: " + worksShedule[i][j][2]);
                                System.out.println("Modelo: " + worksShedule[i][j][3]);
                                System.out.println("Año: " + worksShedule[i][j][4]);
                                System.out.println("Estado: " + worksShedule[i][j][5]);
                                System.out.println("--------------------------");
                            }
                        }
                    }
                    break;
                case 3:
                    int optionStatus;
                    System.out.println("Elija un estado de vehiculo para ver");
                    System.out.println("1.Pendiente");
                    System.out.println("2.En reparacion");
                    System.out.println("3.Reparado");
                    optionStatus = entrada.nextInt();
                    if (optionStatus == 1) {
                        for (int fila = 0; fila < worksShedule.length; fila++) {
                            for (int columna = 0; columna < 2; columna++) {
                                if (worksShedule[fila][columna][5] != null && worksShedule[fila][columna][5].equalsIgnoreCase("Pendiente")) {
                                    System.out.println("Tipo de vehiculo: " + worksShedule[fila][columna][1]);
                                    System.out.println("Estado: " + worksShedule[fila][columna][5]);
                                    return;
                                } else {
                                    System.out.println("No hay vehiculos con estado pendiente");
                                }
                            }
                        }
                    }
                    if (optionStatus == 2) {
                        for (int fila = 0; fila < worksShedule.length; fila++) {
                            for (int columna = 0; columna < 2; columna++) {
                                if (worksShedule[fila][columna][5] != null && worksShedule[fila][columna][5].equalsIgnoreCase("En reparacion")) {
                                    System.out.println("Tipo de vehiculo: " + worksShedule[fila][columna][1]);
                                    System.out.println("Estado: " + worksShedule[fila][columna][5]);
                                    return;
                                } else {
                                    System.out.println("No hay vehiculos con estado En reparacion");
                                }
                            }
                        }
                    }
                    if (optionStatus == 3) {
                        for (int fila = 0; fila < worksShedule.length; fila++) {
                            for (int columna = 0; columna < 2; columna++) {
                                if (worksShedule[fila][columna][5] != null && worksShedule[fila][columna][5].equalsIgnoreCase("Reparado")) {
                                    System.out.println("Tipo de vehiculo: " + worksShedule[fila][columna][1]);
                                    System.out.println("Estado: " + worksShedule[fila][columna][5]);
                                    return;
                                } else {
                                    System.out.println("No hay vehiculos con estado Reparado");
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    entrada.nextLine();
                    System.out.println("Ingrese la marca del vehiculo");
                    String vehicleBrand = entrada.nextLine();
                    boolean foundBrand = false;
                    for (int fila = 0; fila < worksShedule.length; fila++) {
                        for (int columna = 0; columna < 2; columna++) {
                            if (worksShedule[fila][columna][2] != null && worksShedule[fila][columna][2].equalsIgnoreCase(vehicleBrand)) {
                                System.out.println("Tipo de vehículo: " + worksShedule[fila][columna][1]);
                                System.out.println("Marca: " + worksShedule[fila][columna][2]);
                                System.out.println("Modelo: " + worksShedule[fila][columna][3]);
                                System.out.println("Año: " + worksShedule[fila][columna][4]);
                                System.out.println("Estado: " + worksShedule[fila][columna][5]);
                                System.out.println("--------------------------");
                                foundBrand = true;

                            }
                        }
                    }
                    if (!foundBrand) {
                        System.out.println("No hay vehículos con esa marca");
                    }
                    break;
            }

        } while (optionMenu != 6);
    }
}


