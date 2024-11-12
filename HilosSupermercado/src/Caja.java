import java.util.Random;

public class Caja {

    String nombreCaja;

    Cliente[] clientes;

    // Constructor

    public Caja(String nombreCaja) {
        this.nombreCaja = nombreCaja;
        this.crearClientes();
    }

    // Getter y Setter

    public String getNombreCaja() {
        return nombreCaja;
    }

    public Cliente[] getClientes() {
        return clientes;
    }


    // Metodo que crea los clientes y les da un nombre aleatorio

    public void crearClientes() {
        Random random = new Random();
        String[] nombresClientes = {
                "Juan",
                "Ana",
                "Luis",
                "María",
                "Pedro",
                "Sofía",
                "Carlos",
                "Eva",
                "Tomás",
                "Isabel",
                "Alejandro",
                "Laura",
                "Miguel",
                "Cristina",
                "Daniel",
                "Valeria",
                "Gabriel",
                "Natalia",
                "Javier",
                "Beatriz"
        };
        this.clientes = new Cliente[5];

        for (int i = 0; i < clientes.length; i++) {
            this.clientes[i] = new Cliente(nombresClientes[random.nextInt(nombresClientes.length)]);
        }

    }

}
