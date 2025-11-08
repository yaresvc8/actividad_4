
interface Reparable {
    void reparar();
}

interface Limpieza {
    void limpiar();
}

class TecnicoReparador implements Reparable {
    @Override
    public void reparar() {
        System.out.println("Reparando el sistema eléctrico");
    }
}

class PersonalLimpieza implements Limpieza {
    @Override
    public void limpiar() {
        System.out.println("Limpiando el área de trabajo");
    }
}

class TecnicoGeneral implements Reparable, Limpieza {
    @Override
    public void reparar() {
        System.out.println("Reparando equipos y sistemas");
    }

    @Override
    public void limpiar() {
        System.out.println("Limpiando el área tras la reparación");
    }
}

public class Logistica {
    public static void main(String[] args) {
        Reparable tecnico = new TecnicoReparador();
        tecnico.reparar();

        Limpieza limpieza = new PersonalLimpieza();
        limpieza.limpiar();

        TecnicoGeneral tecnicoGeneral = new TecnicoGeneral();
        tecnicoGeneral.reparar();
        tecnicoGeneral.limpiar();
    }
}

