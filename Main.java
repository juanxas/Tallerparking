import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        parking parqueadero = new parking();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese datos de Carro 1:");
        System.out.print("Placa: ");
        String placa1 = scanner.next();
        System.out.print("Hora de entrada (entre 6 y 21): ");
        int horaEntrada1 = scanner.nextInt();

        System.out.println("Ingrese datos de Carro 2:");
        System.out.print("Placa: ");
        String placa2 = scanner.next();
        System.out.print("Hora de entrada (entre 6 y 21): ");
        int horaEntrada2 = scanner.nextInt();

        System.out.println("Ingrese datos de Carro 3:");
        System.out.print("Placa: ");
        String placa3 = scanner.next();
        System.out.print("Hora de entrada (entre 6 y 21): ");
        int horaEntrada3 = scanner.nextInt();

        System.out.println("Ingrese datos de Carro 4:");
        System.out.print("Placa: ");
        String placa4 = scanner.next();
        System.out.print("Hora de entrada (entre 6 y 21): ");
        int horaEntrada4 = scanner.nextInt();

        System.out.println("Ingrese datos de Carro 5:");
        System.out.print("Placa: ");
        String placa5 = scanner.next();
        System.out.print("Hora de entrada (entre 6 y 21): ");
        int horaEntrada5 = scanner.nextInt();

        System.out.println("Ingrese datos de Carro 6:");
        System.out.print("Placa: ");
        String placa6 = scanner.next();
        System.out.print("Hora de entrada (entre 6 y 21): ");
        int horaEntrada6 = scanner.nextInt();

        System.out.println("Ingrese datos de Carro 7:");
        System.out.print("Placa: ");
        String placa7 = scanner.next();
        System.out.print("Hora de entrada (entre 6 y 21): ");
        int horaEntrada7 = scanner.nextInt();

        System.out.println("Ingrese datos de Carro 8:");
        System.out.print("Placa: ");
        String placa8 = scanner.next();
        System.out.print("Hora de entrada (entre 6 y 21): ");
        int horaEntrada8 = scanner.nextInt();

        Car carro1 = new Car(placa1, horaEntrada1);
        Car carro2 = new Car(placa2, horaEntrada2);
        Car carro3 = new Car(placa3, horaEntrada3);
        Car carro4 = new Car(placa4, horaEntrada4);
        Car carro5 = new Car(placa5, horaEntrada5);
        Car carro6 = new Car(placa6, horaEntrada6);
        Car carro7 = new Car(placa7, horaEntrada7);
        Car carro8 = new Car(placa8, horaEntrada8);


        parqueadero.ingresarCarro(1, carro1);
        parqueadero.ingresarCarro(2, carro2);
        parqueadero.ingresarCarro(3, carro3);
        parqueadero.ingresarCarro(4, carro4);
        parqueadero.ingresarCarro(5, carro5);
        parqueadero.ingresarCarro(6, carro6);
        parqueadero.ingresarCarro(7, carro7);
        parqueadero.ingresarCarro(8, carro8);


        System.out.println("Ingresos del parqueadero: $" + parqueadero.calcularIngresos());
        System.out.println("Puestos disponibles: " + parqueadero.consultarPuestosDisponibles());


        parqueadero.avanzarReloj();
        System.out.print("Nueva tarifa: $");
        double nuevaTarifa = scanner.nextDouble();
        parqueadero.cambiarTarifa(nuevaTarifa);


        System.out.println(parqueadero.metodo1());
        System.out.println(parqueadero.metodo2());


        scanner.close();
    }

}