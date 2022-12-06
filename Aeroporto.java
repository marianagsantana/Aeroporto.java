import java.util.Scanner;

public class Aeroporto {
    public static void main(String[] args) {
        int menu = 0;
        while(menu != 22) {
            System.out.println("=== Aeroporto da MARIANA ===");
            System.out.println("+-----------------------------------+");
            System.out.println("| 1 - Cadastro de Avião             |");
            System.out.println("| 2 - Cadastro de Jato              |");
            System.out.println("| 3 - Cadastro de Helicóptero       |");
            System.out.println("| 4 - Cadastro de Pista             |");
            System.out.println("| 5 - Cadastro de Companhia         |");
            System.out.println("| 6 - Cadastro de Hangar            |");
            System.out.println("| 7 - Realizar Voo                  |");
            System.out.println("| 8 - Visualização de Avião         |");
            System.out.println("| 9 - Visualização de Jato          |");
            System.out.println("| 10 - Visualização de Helicóptero  |");
            System.out.println("| 11 - Visualização de Pista        |");
            System.out.println("| 12 - Visualização de Companhia    |");
            System.out.println("| 13 - Visualização de Hangar       |");
            System.out.println("| 14 - Visualização de Voo          |");
            System.out.println("| 15 - Exclusão de Avião            |");
            System.out.println("| 16 - Exclusão de Jato             |");
            System.out.println("| 17 - Exclusão de Helicóptero      |");
            System.out.println("| 18 - Exclusão de Pista            |");
            System.out.println("| 19 - Exclusão de Companhia        |");
            System.out.println("| 20 - Exclusão de Hangar           |");
            System.out.println("| 21 - Exclusão de Voo              |");
            System.out.println("| 22 - Sair                         |");
            Scanner scanner = new Scanner(System.in);

            try {
                menu = scanner.nextInt();
            } catch (Exception e) {
                System.err.println(e.getMessage());
                menu = 0;
            }

            switch (menu) {
                case 1: 
                    System.out.println("Cadastro de Avião");
                    break;
                case 2:
                    System.out.println("Cadastro de Jato");
                    break;
                case 3:
                    System.out.println("Cadastro de Helicóptero");
                    break;
                case 4:
                    System.out.println("Cadastro de Pista");
                    break;
                case 5:
                    System.out.println("Cadastro de Companhia");
                    break;
                case 6:
                    System.out.println("Cadastro de Hangar");
                    break;
                case 7:
                    System.out.println("Realizar Voo");
                    break;
                case 8:
                    System.out.println("Visualização de Avião");
                    break;
                case 9:
                    System.out.println("Visualização de Jato");
                    break;
                case 10:    
                    System.out.println("Visualização de Helicóptero");
                    break;
                case 11:
                    System.out.println("Visualização de Pista");
                    break;
                case 12:
                    System.out.println("Visualização de Companhia");
                    break;
                case 13:   
                    System.out.println("Visualização de Hangar");
                    break;
                case 14:
                    System.out.println("Visualização de Voo");
                    break;
                case 15:    
                    System.out.println("Exclusão de Avião");
                    break;
                case 16:
                    System.out.println("Exclusão de Jato");
                    break;
                case 17:
                    System.out.println("Exclusão de Helicóptero");
                    break;
                case 18:
                    System.out.println("Exclusão de Pista");
                    break;
                case 19:
                    System.out.println("Exclusão de Companhia");
                    break;
                case 20:
                    System.out.println("Exclusão de Hangar");
                    break;
                case 21:
                    System.out.println("Exclusão de Voo");
                    break;
                case 22:    
                    System.out.println("Sair.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
