import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco(500);
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("BANCO");
            System.out.println("Opciones a realizar \n1.Depositar \n2.Retirar \n3.Consultar \nOpcion:");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Cantidad a depositar:");
                    double monto_deposito = scanner.nextDouble();
                    new Depositar().deposito(banco, monto_deposito);
                    break;
                case 2:
                    System.out.println("Cantidad a retirar:");
                    double monto_retirado = scanner.nextDouble();
                    new  Retirar().retirar(banco, monto_retirado);
                    break;
                case 3:
                    System.out.println("Consultar saldo");
                    new Consultar().consultarsaldo(banco);
                    break;
                case 4:
                    System.out.println("Saliendo....");
                default:
                    System.out.println("Opcion no disponible");
            }
        }while (opcion!=4);
    }
}