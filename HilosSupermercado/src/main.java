public class main {

    /*
        Se pide emular un supermercado trabajando con hilos.

        Se dispondrá de dos personas en caja que cobrarán a cinco clientes diferentes. Cada uno de esos clientes, tendrá un carrito de la compra donde tendrá máximo, cinco productos.

        Cuando los clientes vayan pasando por las cajas, debemos de conocer el nombre de ese cliente, el producto que está pasando y en qué caja se encuentra.

        En la salida, tiene que aparecer el tiempo que está procesando un cliente y un producto. Para ello, se utilizarán las funciones:

        System.currentTimeMillis() - this.initialTime
     */

    public static void main(String[] args) throws InterruptedException {

        Thread caja1 = new Thread(new Caja("Caja 1"));
        Thread caja2 = new Thread(new Caja("Caja 2"));

        caja1.start();
        caja2.start();

        caja1.join();
        caja2.join();

    }
}
