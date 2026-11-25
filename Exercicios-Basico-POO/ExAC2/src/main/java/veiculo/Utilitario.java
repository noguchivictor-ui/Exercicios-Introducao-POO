package veiculo;

public final class Utilitario extends Veiculo{
    private double taxaGarga;

    public Utilitario(String placa, int diasAluguel, double valorDiariaBase, double taxaGarga){
        super(placa, diasAluguel, valorDiariaBase);
        this.taxaGarga = taxaGarga;
    }
    @Override
    public double calcularAluguel(){
        return (getValorDiariaBase() * getDiasAluguel())+(1.50 * taxaGarga)+ getTaxaSseguro() + TAXA_HIGIENIZACAO;
    }
}
