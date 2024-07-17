import java.util.Scanner;

public class Principal {
private static int maxEmployee;
public static void main(String[] args) {
        /*Crea un programa que gestione trabajos de un taller que
repara motos y carros. En este caso, utilizaremos un array
tridimensional para organizar la información.*/
    //Instancia de la clase TallerMotosCarros para poder utilizarla en mi main

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de mecanicos del taller: ");
        int maxEmployee = entrada.nextInt();
        String [] namesEmployees = new String[maxEmployee];

        System.out.println("Ingrese los nombres de los mecanicos: ");
        for(int i=0;i<5;i++){
            System.out.println((i+1)+" .Nombre mecanico: ");
            namesEmployees[i] = entrada.nextLine();
        }
        int optionMenu;
        do{
            System.out.println("---Bienvenido al Gestor de trabajos--- ");
            System.out.println("1. Asignar trabajo a empleado");
            System.out.println("2. Ver vehiculos ingresados");
            System.out.println("3. Ver vehiculos por estado");
            System.out.println("4. Buscar vehiculo");
            System.out.println("5. Actualizar estado de un vehiculo");
            System.out.println("5. Salir");
            System.out.println("---Seleccione una opcion---");
            optionMenu = entrada.nextInt();

            switch (optionMenu){
                case 1:
                taller.assignEmployee(namesEmployees);
                break;
            }
        }while (optionMenu != 5);

    }




}

