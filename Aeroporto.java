//* Uma utilização de Generics além das propostas em sala de aula; 
//* Uma utilização de Interfaces além das propostas em sala de aula; 
//* Conexão com o banco de dados e suas boas práticas; 
//* Comentários de Código demonstrando a estrutura * Indentação de Código 
//* Nomenclatura de variáveis que determinem sua utilização 
//* Aplicação das práticas de controle de versionamento GIT 
//* Ao final de cada dia de atividade, deverão ser realizados os devidos Commits e Pull Requests

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.SwingPropertyChangeSupport;

public class Aeroporto {
    public static void main(String[] args) {    
}
do{
    System.out.println("Aeroporto");
    System.out.println("1 - Cadastrar Aviao");
    System.out.println("2 - Cadastrar Helicoptero");
    System.out.println("3 - Cadastrar Jato");
    System.out.println("4 - Cadastrar Hangar");
    System.out.println("5 - Cadastrar Companhia");
    System.out.println("6 - Cadastrar Pista");
    System.out.println("7 - Cadastrar Voo");
    System.out.println("8 - Listar Avioes");
    System.out.println("9 - Listar Helicopteros");
    System.out.println("10 - Listar Jatos");
    System.out.println("11 - Listar Hangares");
    System.out.println("12 - Listar Companhias");
    System.out.println("13 - Listar Pistas");
    System.out.println("14 - Listar Voos");
    System.out.println("15 - Alterar Aviao");
    System.out.println("16 - Alterar Helicoptero");
    System.out.println("17 - Alterar Jato");
    System.out.println("18 - Alterar Hangar");
    System.out.println("19 - Alterar Companhia");
    System.out.println("20 - Alterar Pista");
    System.out.println("21 - Alterar Voo");
    System.out.println("22 - Excluir Aviao");
    System.out.println("23 - Excluir Helicoptero");
    System.out.println("24 - Excluir Jato");
    System.out.println("25 - Excluir Hangar");
    System.out.println("26 - Excluir Companhia");
    System.out.println("27 - Excluir Pista");
    System.out.println("28 - Excluir Voo");
    System.out.println("29 - Sair");
    System.out.println("Digite a opção desejada: ");
    opcao = entrada.nextInt();
    
    switch(opcao){
        case 1:
            System.out.println("Digite o prefixo do aviao: ");
            String prefixo = entrada.next();
            System.out.println("Digite a cor do aviao: ");
            String cor = entrada.next();

            Aviao aviao = new Aviao(prefixo, cor);
            System.out.println("Aviao cadastrado com sucesso!");
            break;

        case 2:
            System.out.println("Digite o prefixo do helicoptero: ");
            String prefixoH = entrada.next();
            System.out.println("Digite a cor do helicoptero: ");
            String corH = entrada.next();

            Helicoptero helicoptero = new Helicoptero(prefixoH, corH);
            System.out.println("Helicoptero cadastrado com sucesso!");
            break;

        case 3:
            System.out.println("Digite o prefixo do jato: ");
            String prefixoJ = entrada.next();
            System.out.println("Digite a cor do jato: ");
            String corJ = entrada.next();

            Jato jato = new Jato(prefixoJ, corJ);
            System.out.println("Jato cadastrado com sucesso!");
            break;

        case 4:
            System.out.println("Digite a cidade do hangar: ");
            String cidade = entrada.next();
            System.out.println("Digite a capacidade do hangar: ");
            String capacidade = entrada.next();

            Hangar hangar = new Hangar(cidade, capacidade);
            System.out.println("Hangar cadastrado com sucesso!");
            break;

        case 5:
            System.out.println("Digite o nome da companhia: ");
            String nome = entrada.next();
            System.out.println("Digite o país da companhia: ");
            String pais = entrada.next();

            Companhia companhia = new Companhia(nome, pais);
            System.out.println("Companhia cadastrada com sucesso!");
            break;

        case 6:
            System.out.println("Digite o numero da pista: ");
            String numPista = entrada.next();
            System.out.println("Digite a cidade da pista: ");
            String cidadeP = entrada.next();
            System.out.println("Digite o país da pista: ");
            String paisP = entrada.next();
            System.out.println("Digite o estado da pista: ");
            String estadoP = entrada.next();
        
            
            Pista pista = new Pista(numPista, cidadeP, paisP, estadoP);
        
            System.out.println("Pista cadastrada com sucesso!");
        
            break;
        
        case 7:
            System.out.println("Digite o numero do voo: ");
            String numVoo = entrada.next();
            System.out.println("Digite a data do voo: ");
            String dataVoo = entrada.next();
            System.out.println("Digite a hora do voo: ");
            String horaVoo = entrada.next();
            System.out.println("Digite o destino do voo: ");
            String destinoVoo = entrada.next();
            System.out.println("Digite a origem do voo: ");
            String origemVoo = entrada.next();
            System.out.println("Digite o prefixo da aeronave: ");
            String prefixoVoo = entrada.next();
            System.out.println("Digite o nome da companhia: ");
            String nomeVoo = entrada.next();
            System.out.println("Digite o numero da pista: ");
            String numPistaVoo = entrada.next();
        
            Voo voo = new Voo(numVoo, dataVoo, horaVoo, destinoVoo, origemVoo, prefixoVoo, nomeVoo, numPistaVoo);
        
            System.out.println("Voo cadastrado com sucesso!");
        
            break;

        case 8:
            System.out.println("Lista de Avioes");
            System.out.println("Prefixo: " + aviao.getPrefixo());
            System.out.println("Cor: " + aviao.getCor());
            break;

        case 9:
            System.out.println("Lista de Helicopteros");
            System.out.println("Prefixo: " + helicoptero.getPrefixo());
            System.out.println("Cor: " + helicoptero.getCor());
            break;

        case 10:
            System.out.println("Lista de Jatos");
            System.out.println("Prefixo: " + jato.getPrefixo());
            System.out.println("Cor: " + jato.getCor());
            break;

        case 11:
            System.out.println("Lista de Hangares");
            System.out.println("Cidade: " + hangar.getCidade());
            System.out.println("Capacidade: " + hangar.getCapacidade());
            break;

        case 12:

            System.out.println("Lista de Companhias");
            System.out.println("Nome: " + companhia.getNome());
            System.out.println("País: " + companhia.getPais());
            break;

        case 13:

            System.out.println("Lista de Pistas");
            System.out.println("Numero: " + pista.getNumPista());
            System.out.println("Cidade: " + pista.getCidadeP());
            System.out.println("País: " + pista.getPaisP());
            System.out.println("Estado: " + pista.getEstadoP());
            break;

        case 14:

            System.out.println("Lista de Voos");
            System.out.println("Numero: " + voo.getNumVoo());
            System.out.println("Data: " + voo.getDataVoo());
            System.out.println("Hora: " + voo.getHoraVoo());
            System.out.println("Destino: " + voo.getDestinoVoo());
            System.out.println("Origem: " + voo.getOrigemVoo());
            System.out.println("Prefixo: " + voo.getPrefixoVoo());
            System.out.println("Companhia: " + voo.getNomeVoo());
            System.out.println("Pista: " + voo.getNumPistaVoo());
            break;
        
            case 15:
            System.out.println("Alterar dados de Aviao");
            System.out.println("Digite o prefixo do aviao: ");
            String prefixoA = entrada.next();
            System.out.println("Digite a cor do aviao: ");
            String corA = entrada.next();
            aviao.setPrefixo(prefixoA);
            aviao.setCor(corA);
            System.out.println("Dados alterados com sucesso!");
            break;

        case 16:
            System.out.println("Alterar dados de Helicoptero");
            System.out.println("Digite o prefixo do helicoptero: ");
            String prefixoH = entrada.next();
            System.out.println("Digite a cor do helicoptero: ");
            String corH = entrada.next();
            helicoptero.setPrefixo(prefixoH);
            helicoptero.setCor(corH);
            System.out.println("Dados alterados com sucesso!");
            break;

        case 17:
            System.out.println("Alterar dados de Jato");
            System.out.println("Digite o prefixo do jato: ");
            String prefixoJ = entrada.next();
            System.out.println("Digite a cor do jato: ");
            String corJ = entrada.next();
            jato.setPrefixo(prefixoJ);
            jato.setCor(corJ);
            System.out.println("Dados alterados com sucesso!");
            break;

        case 18:
            System.out.println("Alterar dados de Hangar");
            System.out.println("Digite a cidade do hangar: ");
            String cidadeH = entrada.next();
            System.out.println("Digite a capacidade do hangar: ");
            int capacidadeH = entrada.nextInt();
            hangar.setCidade(cidadeH);
            hangar.setCapacidade(capacidadeH);
            System.out.println("Dados alterados com sucesso!");
            break;

        case 19:

            System.out.println("Alterar dados de Companhia");
            System.out.println("Digite o nome da companhia: ");
            String nomeC = entrada.next();
            System.out.println("Digite o pais da companhia: ");
            String paisC = entrada.next();
            companhia.setNome(nomeC);
            companhia.setPais(paisC);
            System.out.println("Dados alterados com sucesso!");
            break;

        case 20:
                
                System.out.println("Alterar dados de Pista");
                System.out.println("Digite o numero da pista: ");
                String numP = entrada.next();
                System.out.println("Digite a cidade da pista: ");
                String cidadeP = entrada.next();
                System.out.println("Digite o pais da pista: ");
                String paisP = entrada.next();
                System.out.println("Digite o estado da pista: ");
                String estadoP = entrada.next();
                pista.setNumPista(numP);
                pista.setCidadeP(cidadeP);
                pista.setPaisP(paisP);
                pista.setEstadoP(estadoP);
                System.out.println("Dados alterados com sucesso!");
                break;

        case 21:
            System.out.println("Alterar dados de Voo");
            System.out.println("Digite o numero do voo: ");
            String numV = entrada.next();
            System.out.println("Digite a data do voo: ");
            String dataV = entrada.next();
            System.out.println("Digite a hora do voo: ");
            String horaV = entrada.next();
            System.out.println("Digite o destino do voo: ");
            String destinoV = entrada.next();
            System.out.println("Digite a origem do voo: ");
            String origemV = entrada.next();
            System.out.println("Digite o prefixo do voo: ");
            String prefixoV = entrada.next();
            System.out.println("Digite o nome do voo: ");
            String nomeV = entrada.next();
            System.out.println("Digite o numero da pista do voo: ");
            String numPistaV = entrada.next();
            voo.setNumVoo(numV);
            voo.setDataVoo(dataV);
            voo.setHoraVoo(horaV);
            voo.setDestinoVoo(destinoV);
            voo.setOrigemVoo(origemV);
            voo.setPrefixoVoo(prefixoV);
            voo.setNomeVoo(nomeV);
            voo.setNumPistaVoo(numPistaV);
            System.out.println("Dados alterados com sucesso!");
            break;
        
        case 22:
            System.out.println("Excluir Aviao");
            System.out.println("Digite o prefixo do aviao: ");
            String prefixoA = entrada.next();
            aviao.setPrefixo(prefixoA);
            System.out.println("Aviao excluido com sucesso!");
            break;

        case 23:
            System.out.println("Excluir Helicoptero");
            System.out.println("Digite o prefixo do helicoptero: ");
            String prefixoH = entrada.next();
            helicoptero.setPrefixo(prefixoH);
            System.out.println("Helicoptero excluido com sucesso!");
            break;

        case 24:
            System.out.println("Excluir Jato");
            System.out.println("Digite o prefixo do jato: ");
            String prefixoJ = entrada.next();
            jato.setPrefixo(prefixoJ);
            System.out.println("Jato excluido com sucesso!");
            break;
            
        case 25:
            System.out.println("Excluir Hangar");
            System.out.println("Digite a cidade do hangar: ");
            String cidadeH = entrada.next();
            hangar.setCidade(cidadeH);
            System.out.println("Hangar excluido com sucesso!");
            break;

        case 26:
            System.out.println("Excluir Companhia");
            System.out.println("Digite o nome da companhia: ");
            String nomeC = entrada.next();
            companhia.setNome(nomeC);
            System.out.println("Companhia excluida com sucesso!");
            break;

        case 27:
            System.out.println("Excluir Pista");
            System.out.println("Digite o numero da pista: ");
            String numP = entrada.next();
            pista.setNumPista(numP);
            System.out.println("Pista excluida com sucesso!");
            break;

        case 28:
            System.out.println("Excluir Voo");
            System.out.println("Digite o numero do voo: ");
            String numV = entrada.next();
            voo.setNumVoo(numV);
            System.out.println("Voo excluido com sucesso!");
            break;

        case 29:
            System.out.println("Sair");
            break;
    }while(opcao != 29);
     }
}
