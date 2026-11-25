package model;

public abstract class Midia {
    private final String codigo;
    private final String titulo;
    private double valorBase;

    public static final double TAXA_LOCACAO = 5.00;
    public static double descontoFidelidadeGlobal = 10.00;

    public Midia(String codigo, String titulo,double valorBase){
        this.codigo = codigo;
        this.titulo = titulo;
        this.valorBase = valorBase;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getTitulo(){
        return titulo;
    }
    public double getValorBase(){
        return valorBase;
    }
    public void setValorBase(){
        this.valorBase = valorBase;
    }
    public static double getDescontoFidelidadeGlobal(){
        return descontoFidelidadeGlobal;
    }

    public static void setDescontoFidelidadeGlobal(double descontoFidelidadeGlobal) {
        Midia.descontoFidelidadeGlobal = descontoFidelidadeGlobal;
    }
    public abstract double calcularValorFinal();

    public String exibirFicha(){
        return "Ficha: codigo= "+ codigo+", titulo= "+ titulo+", valorBase= "+valorBase;
    }
}
