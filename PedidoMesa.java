class PedidoMesa extends Restaurante{

    public PedidoMesa(){
    }

    @Override
    public double calcularValorFinal(){
        return valor * 1.1;
    }
    public void mostrarinfo(){
        System.out.printf("Valor total: R$ %.2f\n", calcularValorFinal());
    }
}
