class PedidoDelivery extends Restaurante{

    public PedidoDelivery(){
    }

    @Override
    public double calcularValorFinal(){
        return valor * 1.05;
    }
    public void mostrarinfo(){
        System.out.printf("Valor total: R$ %.2f\n", calcularValorFinal());
    }
}

