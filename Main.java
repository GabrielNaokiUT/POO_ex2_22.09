
public class Main{

    public static void main(String[] args) {
        
        Restaurante[] restaurante = new Restaurante[2];

        PedidoMesa mesa = new PedidoMesa();
        mesa.valor = 137.19;

        PedidoDelivery delivery = new PedidoDelivery();
        delivery.valor = 99.99;

        restaurante[0] = mesa;
        restaurante[1] = delivery;

        for(int i = 0; i < restaurante.length; i++){
            restaurante[i].mostrarinfo();
            System.out.println();
        }
    }
}
