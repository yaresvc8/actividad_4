interface GeneradorReporte {
    void generar(String datos);
}

class ReportePDF implements GeneradorReporte {
    @Override
    public void generar(String datos) {
        System.out.println("Generando reporte en formato PDF con los datos: " + datos);
    }
}

class ReporteExcel implements GeneradorReporte {
    @Override
    public void generar(String datos) {
        System.out.println("Generando reporte en formato Excel con los datos: " + datos);
    }
}

class GestorReportes {
    private GeneradorReporte generador; 

    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void generarReporte(String datos) {
        generador.generar(datos);
    }
}

public class Reportes {
    public static void main(String[] args) {
        
        GeneradorReporte pdf = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(pdf);
        gestorPDF.generarReporte("Ventas del mes de octubre");

        System.out.println();

        GeneradorReporte excel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(excel);
        gestorExcel.generarReporte("Inventario actualizado");
    }
}

