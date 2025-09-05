public class Depositar {
    public void deposito( Banco banco ,double monto_deposito) {
        if (monto_deposito > 0) {
            banco.setSaldo(banco.getSaldo() + monto_deposito);
            System.out.println("Depositado realizado con exito!\nMonto actual:"+banco.getSaldo());

        } else {
            System.out.println("Cantidad de monto invalido");
        }
    }
}
