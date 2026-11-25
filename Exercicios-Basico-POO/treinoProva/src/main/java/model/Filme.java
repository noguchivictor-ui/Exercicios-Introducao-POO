package model;

public class Filme extends Midia{
    private int duracaoMinutos;

    public Filme(String codigo,String titulo,double valorBase,int duracaoMinutos){
        super(codigo,titulo,valorBase);
        this.duracaoMinutos = duracaoMinutos;
    }
    public int getDuracaoMinutos(){
        return duracaoMinutos;
    }
    @Override
    public double calcularValorFinal() {
        return (getValorBase() + TAXA_LOCACAO) + (duracaoMinutos > 120 ? 3.00 : 0.00) - descontoFidelidadeGlobal;
    }
    @Override
    public String exibirFicha(){
        return "Ficha: codigo= "+ getCodigo()+", titulo= "+ getTitulo()+", valorBase= "+ getValorBase()+", duracao= "+ duracaoMinutos;
    }


}
