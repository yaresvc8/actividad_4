interface Transferible {
    void transferir(double monto);
}

interface Retirable {
    void retirar(double monto);
}

interface Pagable {
    void pagarFactura(String factura, double monto);
}

class TransferenciaBancaria implements Transferible {
    @Override
    public void transferir(double monto) {
        System.out.println("Transfiriendo $" + monto + " a otra cuenta.");
    }
}

class CajeroAutomatico implements Retirable {
    @Override
    public void retirar(double monto) {
        System.out.println("Retirando $" + monto + " del cajero automático.");
    }
}

class PagadorDeFacturas implements Pagable {
    @Override
    public void pagarFactura(String factura, double monto) {
        System.out.println("Pagando la factura '" + factura + "' por un valor de $" + monto);
    }
}

class AplicacionBancaria implements Transferible, Retirable, Pagable {
    @Override
    public void transferir(double monto) {
        System.out.println("Transfiriendo $" + monto + " desde la app.");
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Programando retiro de $" + monto + " en cajero aliado.");
    }

    @Override
    public void pagarFactura(String factura, double monto) {
        System.out.println("Pagando factura '" + factura + "' por $" + monto + ".");
    }
}

public class Bancos {
    public static void main(String[] args) {
        Transferible transferencia = new TransferenciaBancaria();
        transferencia.transferir(250000);

        Retirable cajero = new CajeroAutomatico();
        cajero.retirar(100000);

        Pagable pagador = new PagadorDeFacturas();
        pagador.pagarFactura("Energía", 75000);

        AplicacionBancaria app = new AplicacionBancaria();
        app.transferir(300000);
        app.retirar(50000);
        app.pagarFactura("Internet", 60000);
    }
}
