package br.edu.ibmec.treinoProva;
import model.Filme;
import model.Locadora;
import model.Midia;
import model.Serie;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locadora locadora = new Locadora();
    Midia midia = null;
    int opcao;
    do{
        System.out.print("===== SISTEMA DE LOCADORA DE MIDIAS =====\n" +
                "1 - Alugar Filme\n" +
                "2 - Alugar Serie\n" +
                "3 - Listar Acervo\n" +
                "4 - Exibir Valor Total do Acervo\n" +
                "5 - Gerar Relatorio via DAO\n" +
                "6 - Alterar Desconto Fidelidade Global (static)\n" +
                "7 - Verificar Status da Conexao (Singleton)\n" +
                "8 - Encerrar\n" +
                "Escolha uma opção:");
        opcao = sc.nextInt();
        sc.nextLine();
        switch (opcao){
            case 1:
                System.out.print("digite o codigo:");
                String codigoF = sc.nextLine();
                System.out.print("digite o titulo:");
                String tituloF = sc.nextLine();
                System.out.print("digite o valorBase:");
                double valorBaseF = sc.nextDouble();
                sc.nextLine();
                System.out.print("digite a duracao do filme:");
                int duracaoMinutosF = sc.nextInt();
                sc.nextLine();

                midia = new Filme(codigoF,tituloF,valorBaseF,duracaoMinutosF);
                locadora.adicionarMidia(midia);
                break;
            case 2:
                System.out.print("digite o codigo:");
                String codigoS = sc.nextLine();
                System.out.print("digite o titulo:");
                String tituloS = sc.nextLine();
                System.out.print("digite o valorBase:");
                double valorBaseS = sc.nextDouble();
                sc.nextLine();
                System.out.print("total de epsidios:");
                int totalEpisodiosS = sc.nextInt();
                sc.nextLine();

                midia = new Serie(codigoS,tituloS,valorBaseS,totalEpisodiosS);
                locadora.adicionarMidia(midia);
                break;
            case 3:
                locadora.listarAcervo();
                break;
            case 4:
                System.out.println("total: "+ locadora.calcularValorTotalAcervo());
                break;
            case 8:
                break;
            default:
                System.out.println("Erro, tente novamente");
                break;
        }


    }while(opcao != 8);
    sc.close();
    }

}
