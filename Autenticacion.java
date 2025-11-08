interface ServicioAutenticacion {
    boolean autenticar(String usuario, String contrasena);
}

class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        System.out.println("Autenticando usuario localmente...");
        return "admin".equals(usuario) && "1234".equals(contrasena);
    }
}

class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        System.out.println("Autenticando usuario mediante OAuth...");
        return "usuario@correo.com".equals(usuario);
    }
}

class GestorAutenticacion {
    private ServicioAutenticacion servicio; 
    
    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }

    public void login(String usuario, String contrasena) {
        if (servicio.autenticar(usuario, contrasena)) {
            System.out.println("Autenticación exitosa.");
        } else {
            System.out.println("Credenciales incorrectas.");
        }
    }
}

public class Autenticacion{
    public static void main(String[] args) {
        
        ServicioAutenticacion local = new AutenticacionLocal();
        GestorAutenticacion gestor1 = new GestorAutenticacion(local);
        gestor1.login("admin", "1234");

        System.out.println();

        ServicioAutenticacion oauth = new AutenticacionOAuth();
        GestorAutenticacion gestor2 = new GestorAutenticacion(oauth);
        gestor2.login("usuario@correo.com", "cualquiera");
    }
}
