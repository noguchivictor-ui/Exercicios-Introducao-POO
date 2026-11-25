package veiculo;

public class CarroPasseio extends Veiculo{
    private double taxaArCondicionada;

    public CarroPasseio(String placa, int diasAluguel, double valorDiariaBase, double taxaArCondicionada){
        super(placa,diasAluguel,valorDiariaBase);
        this.taxaArCondicionada = taxaArCondicionada;
    }
    public double getTaxaArCondicionada(){
        return taxaArCondicionada;
    }
    @Override
    public double calcularAluguel(){
        return (getValorDiariaBase() * getDiasAluguel())+taxaArCondicionada + getTaxaSseguro() +TAXA_HIGIENIZACAO;
    }

}
