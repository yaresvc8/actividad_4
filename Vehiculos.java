interface Conducible {
    void conducir();
}

interface Transportador {
    void cargarMercancia(double peso);
}

class Coche implements Conducible {
    @Override
    public void conducir() {
        System.out.println("Conduciendo el coche de paseo.");
    }
}

class Camion implements Conducible, Transportador {
    @Override
    public void conducir() {
        System.out.println("Conduciendo el camión de carga.");
    }

    @Override
    public void cargarMercancia(double peso) {
        System.out.println("Cargando " + peso + " kg de mercancía en el camión.");
    }
}

class Moto implements Conducible {
    @Override
    public void conducir() {
        System.out.println("Conduciendo la moto deportiva.");
    }
}

public class Vehiculos {
    public static void main(String[] args) {
        Conducible coche = new Coche();
        coche.conducir();

        Conducible moto = new Moto();
        moto.conducir();

        Camion camion = new Camion();
        camion.conducir();
        camion.cargarMercancia(1500);
    }
}
