import java.util.ArrayList;
import java.util.Random;

public class Cliente {

    String nombre;
    ArrayList<String> carrito = new ArrayList<>();

    // Constructor
    public Cliente(String nombre) {
        this.nombre = nombre;
        rellenarCarrito();
    }

    // Getter y Setter
    public String getNombre(){
        return this.nombre;
    }

    public ArrayList<String> getCarrito() {
        return carrito;
    }

    // Metodo para rellenar el carrito

    public void rellenarCarrito(){
        Random random = new Random();
        String[] posiblesProductos = {
                "Salchichón",
                "Pan",
                "Queso",
                "Chorizo",
                "Huevos",
                "Leche",
                "Cerveza",
                "Vino",
                "Aceitunas",
                "Tomates",
                "Pimientos",
                "Cebolla",
                "Ajo",
                "Pescado",
                "Carne",
                "Pollo",
                "Tortilla",
                "Patatas",
                "Arroz",
                "Lentejas"
        };
        int cantidadProductos = random.nextInt(5)+1;
        for(int i = 0; i < cantidadProductos; i++){
            this.carrito.add(posiblesProductos[random.nextInt(posiblesProductos.length)]);
        }
    }



}
