package veiculo;

public class Locadora {
    public static final int CAPACIDADE_MAXIMA = 20;
    private Veiculo[] veiculos = new Veiculo[20];
    private int quantidadeAtual = 0;

    public boolean adicionarVeiculo(Veiculo veiculo){
        if(quantidadeAtual >= 20){
            return false;
        }
        veiculos[quantidadeAtual++] = veiculo;
        return true;

    }
    public void listarVeiculos(){
        if(quantidadeAtual == 0){
            System.out.println("nada");
            return;
        }
        for(int i =0; i< quantidadeAtual;i++){
            veiculos[i].exibirResumo();
        }
    }
    public double calcularFaturamentoTotal(){
        double total = 0;
        for (int i = 0;i < quantidadeAtual;i++){
            total += veiculos[i].calcularAluguel();
        }
        return total;
    }

}
