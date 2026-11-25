package veiculo;

public abstract class Veiculo {
    private final String placa;
    private int diasAluguel;
    private double valorDiariaBase;

    public static final double TAXA_HIGIENIZACAO = 30.0;
    private static double taxaSseguro = 50.0;

    public Veiculo(String placa, int diasAluguel, double valorDiariaBase){
        this.placa = placa;
        this.diasAluguel = diasAluguel;
        this.valorDiariaBase = valorDiariaBase;
    }
    public String getPlaca(){
        return placa;
    }
    public int getDiasAluguel(){
        return diasAluguel;
    }
    public double getValorDiariaBase(){
        return valorDiariaBase;
    }
    public static void setTaxaSseguro(double novaTaxa){
        taxaSseguro = novaTaxa;
    }
    public double getTaxaSseguro(){
        return taxaSseguro;
    }
    public abstract double calcularAluguel();

    public final void exibirResumo(){
        System.out.println("placa: "+placa+", dias:"+ diasAluguel+", valor da diaria:"+ valorDiariaBase+", taxa de seguro: "+ taxaSseguro+", taxa higiene: "+ TAXA_HIGIENIZACAO+", valor total: "+ calcularAluguel());
    }
}
