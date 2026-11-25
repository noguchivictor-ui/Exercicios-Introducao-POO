package br.edu.ibmec.ExAC2;
import java.util.Scanner;
import veiculo.CarroPasseio;
import veiculo.Locadora;
import veiculo.Utilitario;
import veiculo.Veiculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locadora locadora = new Locadora();
        Veiculo veiculo = null;
        int opcao = -1;
        do{
            System.out.print("===== GERENCIADOR DE LOCAÇÕES =====\n" +
                    "1 - Cadastrar carro de passeio\n" +
                    "2 - Cadastrar utilitário\n" +
                    "3 - Listar veículos\n" +
                    "4 - Exibir faturamento total\n" +
                    "5 - Alterar Taxa de Seguro Global (static)\n" +
                    "6 - Encerrar\n" +
                    "Escolha uma opção:");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("===CADASTAR CARRO DE PASSEIO===");
                    System.out.print("digite a placa:");
                    String placaCP = sc.nextLine();
                    System.out.print("digite o diaAluguel:");
                    int diasAluguelCP = sc.nextInt();
                    sc.nextLine();
                    System.out.print("digite o valorDiariaBase:");
                    double valorDiariaBaseCP = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("digite o valor da taxaArCondicionado:");
                    double taxaArCondicionado = sc.nextDouble();
                    sc.nextLine();

                    veiculo = new CarroPasseio(placaCP,diasAluguelCP,valorDiariaBaseCP,taxaArCondicionado);
                    locadora.adicionarVeiculo(veiculo);
                    break;
                case 2:
                    System.out.println("===CADASTAR UTILITARIO===");
                    System.out.print("digite a placa:");
                    String placaU = sc.nextLine();
                    System.out.print("digite o diaAluguel:");
                    int diasAluguelU = sc.nextInt();
                    sc.nextLine();
                    System.out.print("digite o valorDiariaBase:");
                    double valorDiariaBaseU = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("digite o valor da taxaCarga:");
                    double taxaCarga = sc.nextDouble();
                    sc.nextLine();

                    veiculo = new Utilitario(placaU,diasAluguelU,valorDiariaBaseU,taxaCarga);
                    locadora.adicionarVeiculo(veiculo);
                    break;
                case 3:
                    System.out.println("==LISTA==");
                    locadora.listarVeiculos();
                    break;
                case 4:
                    System.out.println("Faturamento total:"+ locadora.calcularFaturamentoTotal());
                    break;
                case 5:
                    System.out.print("alterar taxa de segro global: ");
                    double alteracao = sc.nextDouble();
                    sc.nextLine();
                    Veiculo.setTaxaSseguro(alteracao);
                    break;
                case 6:
                    break;

                default:
                    System.out.println("erro");
            }

        }while(opcao !=6);
        sc.close();
    }
}
