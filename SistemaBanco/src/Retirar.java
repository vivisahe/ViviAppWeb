public class Retirar {
    public void retirar(Banco banco,double monto_retirar) {
        if (monto_retirar > 0 && monto_retirar <= banco.getSaldo()) {
            banco.setSaldo(banco.getSaldo() - monto_retirar);
            System.out.println("Retiro realizado con exito!\nMonto actual:"+banco.getSaldo());

        }
        else{
            System.out.println("Cantidad invalida!");
        }
    }
}