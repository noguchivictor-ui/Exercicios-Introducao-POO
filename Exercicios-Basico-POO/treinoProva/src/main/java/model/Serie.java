package model;

public final class Serie extends Midia{
    private int totalEpisodios;

    public Serie(String codigo,String titulo,double valorBase,int totalEpisodios){
        super(codigo,titulo,valorBase);
        this.totalEpisodios = totalEpisodios;
    }
    public int getTotalEpisodios(){
        return totalEpisodios;
    }

    @Override
    public double calcularValorFinal(){
        return (getValorBase() + TAXA_LOCACAO) + (totalEpisodios * 0.50) - descontoFidelidadeGlobal;
    }
    @Override
    public String exibirFicha(){
       return "Ficha: codigo= "+ getCodigo()+", titulo= "+ getTitulo()+", valorBase= "+getValorBase()+", total de episodios= "+ totalEpisodios;
    }
}
