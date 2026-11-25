package model;

public class Locadora {
    public static final int CAPACIDADE_MAXIMA = 50;
    private Midia[] midias = new Midia[CAPACIDADE_MAXIMA];
    private int quantidadeAtual = 0;

    public boolean adicionarMidia(Midia midia){
        midias[quantidadeAtual++] = midia;
        return true;
    }
    public void listarAcervo(){
        for(int i = 0;i < quantidadeAtual;i++){
            System.out.println(midias[i].exibirFicha());
        }
    }
    public double calcularValorTotalAcervo(){
        double total = 0;
        for(int i = 0;i < quantidadeAtual;i++){
            total += midias[i].calcularValorFinal();
        }
        return total;
    }
}
