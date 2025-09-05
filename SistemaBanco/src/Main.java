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
    }
}