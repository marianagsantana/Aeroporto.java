//* Uma utilização de Generics além das propostas em sala de aula; 
//* Uma utilização de Interfaces além das propostas em sala de aula; 
//* Conexão com o banco de dados e suas boas práticas; 
//* Comentários de Código demonstrando a estrutura * Indentação de Código 
//* Nomenclatura de variáveis que determinem sua utilização 
//* Aplicação das práticas de controle de versionamento GIT 
//* Ao final de cada dia de atividade, deverão ser realizados os devidos Commits e Pull Requests

package Aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
    System.out.println("Aeroporto");
    System.out.println("1: Incluir Helicoptero");
    System.out.println("2: Incluir Jato");
    System.out.println("3: Incluir Companhia");
    System.out.println("4: Incluir Hangar");
    System.out.println("5: Incluir Pista");
    System.out.println("6: Incluir Voo");
    System.out.println("7: Listar Avião");
    System.out.println("8: Listar Helicoptero");
    System.out.println("9: Listar Jato");
    System.out.println("10:Listar Companhia");
    System.out.println("11:Listar Hangar");
    System.out.println("12:Listar Pista");
    System.out.println("13:Listar Voo");
    System.out.println("14:Alterar Avião");
    System.out.println("15:Alterar Helicoptero");
    System.out.println("16:Alterar Jato");
    System.out.println("17:Alterar Companhia");
    System.out.println("18:Alterar Hangar");
    System.out.println("19:Alterar Pista");
    System.out.println("20:Alterar Voo");
    System.out.println("21:Excluir Avião");
    System.out.println("22:Excluir Helicoptero");
    System.out.println("23:Excluir Jato");
    System.out.println("24:Excluir Companhia");
    System.out.println("25:Excluir Hangar");
    System.out.println("26:Excluir Pista");
    System.out.println("27:Excluir Voo");
    System.out.println("28:Listar Avião por Companhia");
    System.out.println("Opção: ");
    int opcao = sc.nextInt();
    sc.nextLine();

    switch (opcao) {
        case 1:
            System.out.println("Modelo: ");
            String modelo = sc.nextLine();
            System.out.println("Marca: ");
            String marca = sc.nextLine();
            System.out.println("Cor: ");
            String cor = sc.nextLine();
            System.out.println("Ano: ");
            int ano = sc.nextInt();
            sc.nextLine();
            System.out.println("Capacidade: ");
            int capacidade = sc.nextInt();
            sc.nextLine();
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Hangar: ");
            String nomeHangar = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Hangar hangar = Hangar.getHangar(nomeHangar);
            Pista pista = Pista.getPista(nomePista);

            new Aviao(modelo, marca, cor, ano, capacidade, companhia, hangar, pista);
            break;
        case 2:
            System.out.println("Modelo: ");
            String modelo = sc.nextLine();
            System.out.println("Marca: ");
            String marca = sc.nextLine();
            System.out.println("Cor: ");
            String cor = sc.nextLine();
            System.out.println("Ano: ");
            int ano = sc.nextInt();
            sc.nextLine();
            System.out.println("Capacidade: ");
            int capacidade = sc.nextInt();
            sc.nextLine();
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Hangar: ");
            String nomeHangar = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Hangar hangar = Hangar.getHangar(nomeHangar);
            Pista pista = Pista.getPista(nomePista);

            new Helicoptero(modelo, marca, cor, ano, capacidade, companhia, hangar, pista);
            break;
        case 3:
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("CNPJ: ");
            String cnpj = sc.nextLine();
            System.out.println("Endereço: ");
            String endereco = sc.nextLine();
            System.out.println("Telefone: ");
            String telefone = sc.nextLine();

            new Companhia(nome, cnpj, endereco, telefone);
            break;
        case 4:
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Endereço: ");
            String endereco = sc.nextLine();
            System.out.println("Telefone: ");
            String telefone = sc.nextLine();

            new Hangar(nome, endereco, telefone);
            break;
        case 5:
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Endereço: ");
            String endereco = sc.nextLine();
            System.out.println("Telefone: ");
            String telefone = sc.nextLine();

            new Pista(nome, endereco, telefone);
            break;
        case 6:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Avião: ");
            String modeloAviao = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Aviao aviao = Aviao.getAviao(modeloAviao);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, aviao, pista);
            break;
        case 7:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Helicoptero: ");
            String modeloHelicoptero = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Helicoptero helicoptero = Helicoptero.getHelicoptero(modeloHelicoptero);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, helicoptero, pista);
            break;
        case 8:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Jato: ");
            String modeloJato = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Jato jato = Jato.getJato(modeloJato);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, jato, pista);
            break;
        case 9:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Avião: ");
            String modeloAviao = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Aviao aviao = Aviao.getAviao(modeloAviao);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, aviao, pista);
            break;
        case 10:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Helicoptero: ");
            String modeloHelicoptero = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Helicoptero helicoptero = Helicoptero.getHelicoptero(modeloHelicoptero);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, helicoptero, pista);
            break;
        case 11:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Jato: ");
            String modeloJato = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Jato jato = Jato.getJato(modeloJato);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, jato, pista);
            break;
        case 12:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Avião: ");
            String modeloAviao = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Aviao aviao = Aviao.getAviao(modeloAviao);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, aviao, pista);
            break;
        case 13:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Helicoptero: ");
            String modeloHelicoptero = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Helicoptero helicoptero = Helicoptero.getHelicoptero(modeloHelicoptero);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, helicoptero, pista);
            break;
        case 14:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Jato: ");
            String modeloJato = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Jato jato = Jato.getJato(modeloJato);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, jato, pista);
            break;
        case 15:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Avião: ");
            String modeloAviao = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Aviao aviao = Aviao.getAviao(modeloAviao);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, aviao, pista);
            break;
        case 16:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Helicoptero: ");
            String modeloHelicoptero = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Helicoptero helicoptero = Helicoptero.getHelicoptero(modeloHelicoptero);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, helicoptero, pista);
            break;
        case 17:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Jato: ");
            String modeloJato = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Jato jato = Jato.getJato(modeloJato);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, jato, pista);
            break;
        case 18:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Avião: ");
            String modeloAviao = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Aviao aviao = Aviao.getAviao(modeloAviao);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, aviao, pista);
            break;
        case 19:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Helicoptero: ");
            String modeloHelicoptero = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Helicoptero helicoptero = Helicoptero.getHelicoptero(modeloHelicoptero);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, helicoptero, pista);
            break;
        case 20:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Jato: ");
            String modeloJato = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Jato jato = Jato.getJato(modeloJato);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, jato, pista);
            break;
        case 21:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Avião: ");
            String modeloAviao = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Aviao aviao = Aviao.getAviao(modeloAviao);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, aviao, pista);
            break;
        case 22:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Helicoptero: ");
            String modeloHelicoptero = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Helicoptero helicoptero = Helicoptero.getHelicoptero(modeloHelicoptero);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, helicoptero, pista);
            break;
        case 23:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Jato: ");
            String modeloJato = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Jato jato = Jato.getJato(modeloJato);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, jato, pista);
            break;
        case 24:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Avião: ");
            String modeloAviao = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Aviao aviao = Aviao.getAviao(modeloAviao);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, aviao, pista);
            break;
        case 25:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Helicoptero: ");
            String modeloHelicoptero = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Helicoptero helicoptero = Helicoptero.getHelicoptero(modeloHelicoptero);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, helicoptero, pista);
            break;
        case 26:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Jato: ");
            String modeloJato = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Jato jato = Jato.getJato(modeloJato);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, jato, pista);
            break;
        case 27:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Avião: ");
            String modeloAviao = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Aviao aviao = Aviao.getAviao(modeloAviao);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, aviao, pista);
            break;
        case 28:
            System.out.println("Companhia: ");
            String nomeCompanhia = sc.nextLine();
            System.out.println("Helicoptero: ");
            String modeloHelicoptero = sc.nextLine();
            System.out.println("Pista: ");
            String nomePista = sc.nextLine();

            Companhia companhia = Companhia.getCompanhia(nomeCompanhia);
            Helicoptero helicoptero = Helicoptero.getHelicoptero(modeloHelicoptero);
            Pista pista = Pista.getPista(nomePista);

            new Voo(companhia, helicoptero, pista);
            break;
       
    }
}