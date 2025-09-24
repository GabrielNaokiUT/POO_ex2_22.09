public class Restaurante{
    double valor;

    public double calcularValorFinal(){
        return valor;
    }
    public void mostrarinfo(){
        System.out.printf("Valor total: R$ %.2f\n", calcularValorFinal());
    }
}
