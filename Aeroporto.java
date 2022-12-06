import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.Scanner;

public class Aeroporto {
    public static void main(String[] args) throws Exception {
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
            System.out.println("| 22 - Alteração de Avião           |");
            System.out.println("| 23 - Alteração de Jato            |");
            System.out.println("| 24 - Alteração de Helicóptero     |");
            System.out.println("| 25 - Alteração de Pista           |");
            System.out.println("| 26 - Alteração de Companhia       |");
            System.out.println("| 27 - Alteração de Hangar          |");
            System.out.println("| 28 - Alteração de Voo             |");
            System.out.println("| 29 - Sair                         |");
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
                    System.out.println("Informe o Id do Avião: ");
                    int id = scanner.nextInt();
                    System.out.println("Informe a Marca do Avião: ");
                    String marca = scanner.next();
                    System.out.println("Informe o Modelo do Avião: ");
                    String modelo = scanner.next();
                    System.out.println("Informe a Capacidade do Avião: ");
                    int capacidade = scanner.nextInt();
                    System.out.println("Informe as letras do prefixo do Avião: ");
                    String letras = scanner.next();
                    System.out.println("Informe os números do prefixo do Avião: ");
                    int numeros = scanner.nextInt();
                    System.out.println("Informe o Id da Companhia: ");
                    int idCompanhia = scanner.nextInt();
                    new Aviao(id, marca, modelo, letras, numeros, capacidade, idCompanhia);
                    break;
                case 2:
                    System.out.println("Cadastro de Jato");
                    System.out.println("Informe o Id do Jato: ");
                    id = scanner.nextInt();
                    System.out.println("Informe a Marca do Jato: ");
                    marca = scanner.next();
                    System.out.println("Informe o Modelo do Jato: ");
                    modelo = scanner.next();
                    System.out.println("Informe a cor do Jato: ");
                    String cor = scanner.next();
                    System.out.println("Informe a velocidade do Jato: ");
                    int velocidade = scanner.nextInt();
                    new Jato(id, marca, modelo, velocidade, cor);
                    break;
                case 3:
                    System.out.println("Cadastro de Helicóptero");
                    System.out.println("Informe o Id do Helicóptero: ");
                    id = scanner.nextInt();
                    System.out.println("Informe a Marca do Helicóptero: ");
                    marca = scanner.next();
                    System.out.println("Informe o Modelo do Helicóptero: ");
                    modelo = scanner.next();
                    System.out.println("Informe a capacidade do Helicóptero: ");
                    capacidade = scanner.nextInt();
                    System.out.println("Informe a Cor do Helicóptero: ");
                    cor = scanner.next();
                    new Helicoptero(id, marca, modelo, capacidade, cor);
                    break;
                case 4:
                    System.out.println("Cadastro de Pista");
                    System.out.println("Informe o Id da Pista: ");
                    id = scanner.nextInt();
                    System.out.println("Informe as letras da numeração da Pista: ");
                    String letra = scanner.next();
                    System.out.println("Informe os números da numeração da Pista: ");
                    int num = scanner.nextInt();
                    new Pista(letra, num);
                    break;
                case 5:
                    System.out.println("Cadastro de Companhia");
                    System.out.println("Informe o Id da Companhia: ");
                    id = scanner.nextInt();
                    System.out.println("Informe o nome da Companhia: ");
                    String nome = scanner.next();
                    System.out.println("Informe o CNPJ da Companhia: ");
                    String cnpj = scanner.next();
                    new Companhia(id, nome, cnpj);
                    break;
                case 6:
                    System.out.println("Cadastro de Hangar");
                    System.out.println("Informe o Id do Hangar: ");
                    id = scanner.nextInt();
                    System.out.println("Informe o Local do Hangar: ");
                    String local = scanner.next();
                    System.out.println("Informe o Id do Avião: ");
                    int idAviao = scanner.nextInt();
                    new Hangar(id, local, idAviao, Aviao.getById(idAviao));
                    break;
                case 7:
                    System.out.println("Realizar Voo");
                    System.out.println("Informe o Id do Voo: ");
                    id = scanner.nextInt();
                    System.out.println("Informe a Data do Voo: ");
                    String data = scanner.next();
                    System.out.println("Informe a Hora: ");
                    String hora = scanner.next();
                    System.out.println("Informe a Origem: ");
                    String origem = scanner.next();
                    System.out.println("Informe o Destino: ");
                    String destino = scanner.next();
                    System.out.println("Informe o Nome do Piloto: ");
                    String piloto = scanner.next();
                    System.out.println("Informe o Nome do Copiloto: ");
                    String copiloto = scanner.next();
                    System.out.println("Informe alguma Observação: ");
                    String observacao = scanner.next();
                    System.out.println("Informe as letras da numeração do Voo: ");
                    letras = scanner.next();
                    System.out.println("Informe os números da numeração do Voo: ");
                    num = scanner.nextInt();
                    System.out.println("Informe o Id da Pista: ");
                    int idPista = scanner.nextInt();
                    System.out.println("Informe o Id da Aeronave: ");
                    int idAeronave = scanner.nextInt();
                    System.out.println("1: Helicóptero");
                    System.out.println("2: Jato");
                    System.out.println("3: Avião");
                    System.out.println("Informe o Tipo de Aeronave: ");
                    int tipo = scanner.nextInt();
                    new Voo(letras, num, data, hora, origem, destino, piloto, copiloto, observacao, idPista, Pista.getById(idPista), tipo, Aeronave.getById(idAeronave), idAeronave);
                    
                    break;
                case 8:
                    System.out.println("Visualização de Avião");
                    Connection conexao = DAO.createConnection();
                    ResultSet rs = conexao.createStatement().executeQuery("SELECT * FROM aviao;"); 
                    while (rs.next()) {
                        System.out.println("Id: " + rs.getInt("id") + " | Marca: " + rs.getString("marca") + " | Modelo: " + rs.getString("modelo") + " | Prefixo: " + rs.getString("prefixo") + " | Capacidade: " + rs.getInt("capacidade") + " | Id Companhia: " + rs.getInt("companhia_id"));
                    }
                    break;
                case 9:
                    System.out.println("Visualização de Jato");
                    conexao = DAO.createConnection();
                    rs = conexao.createStatement().executeQuery("SELECT * FROM jato;");
                    while (rs.next()) {
                        System.out.println("Id: " + rs.getInt("id") + " | Marca: " + rs.getString("marca") + " | Modelo: " + rs.getString("modelo") + " | Cor: " + rs.getString("cor") + " | Velocidade: " + rs.getInt("velocidade"));
                    }
                    break;
                case 10:    
                    System.out.println("Visualização de Helicóptero");
                    conexao = DAO.createConnection();
                    rs = conexao.createStatement().executeQuery("SELECT * FROM helicoptero;");
                    while (rs.next()) {
                        System.out.println("Id: " + rs.getInt("id") + " | Marca: " + rs.getString("marca") + " | Modelo: " + rs.getString("modelo") + " | Capacidade: " + rs.getInt("capacidade") + " | Cor: " + rs.getString("cor"));
                    }
                    break;
                case 11:
                    System.out.println("Visualização de Pista");
                    conexao = DAO.createConnection();
                    rs = conexao.createStatement().executeQuery("SELECT * FROM pista;");    
                    while (rs.next()) {
                        System.out.println("Id: " + rs.getInt("id") + " | Numero: " + rs.getString("numero"));
                    }
                    break;
                case 12:
                    System.out.println("Visualização de Companhia");
                    conexao = DAO.createConnection();
                    rs = conexao.createStatement().executeQuery("SELECT * FROM companhia;");
                    while (rs.next()) {
                        System.out.println("Id: " + rs.getInt("id") + " | Nome: " + rs.getString("nome") + " | CNPJ: " + rs.getString("cnpj"));
                    }
                    break;
                case 13:   
                    System.out.println("Visualização de Hangar");
                    conexao = DAO.createConnection();
                    rs = conexao.createStatement().executeQuery("SELECT * FROM hangar;");
                    while (rs.next()) {
                        System.out.println("Id: " + rs.getInt("id") + " | Local: " + rs.getString("local") + " | Id Avião: " + rs.getInt("aviao_id"));
                    }
                    break;
                case 14:
                    System.out.println("Visualização de Voo");
                    conexao = DAO.createConnection();
                    rs = conexao.createStatement().executeQuery("SELECT * FROM voo;");
                    while (rs.next()) {
                        System.out.println("Id: " + rs.getInt("id") + " | Número: " + rs.getString("numero") + rs.getString("data") + " | Hora: " + rs.getString("hora") + " | Origem: " + rs.getString("origem") + " | Destino: " + rs.getString("destino") + " | Id Avião: " + rs.getInt("aviao_id") + " | Id Jato: " + rs.getInt("jato_id") + " | Id Helicóptero: " + rs.getInt("helicoptero_id") + " | Piloto: " + rs.getString("piloto") + " | Copiloto: " + rs.getString("copiloto") + " | Observação: " + rs.getString("observacao") + " | Id Pista: " + rs.getInt("pista_id"));
                    }
                    break;
                case 15:    
                    System.out.println("Exclusão de Avião");
                    System.out.println("Informe o Id do Avião: ");
                    id = scanner.nextInt();
                    conexao = DAO.createConnection();
                    PreparedStatement stmt = conexao.prepareStatement("DELETE FROM aviao WHERE id = ?;");
                    stmt.setInt(1, id);
                    stmt.execute();
                    break;
                case 16:
                    System.out.println("Exclusão de Jato");
                    System.out.println("Informe o Id do Jato: ");
                    id = scanner.nextInt();
                    conexao = DAO.createConnection();
                    stmt = conexao.prepareStatement("DELETE FROM jato WHERE id = ?;");
                    stmt.setInt(1, id);
                    stmt.execute();
                    break;
                case 17:
                    System.out.println("Exclusão de Helicóptero");
                    System.out.println("Informe o Id do Helicóptero: ");
                    id = scanner.nextInt();
                    conexao = DAO.createConnection();
                    stmt = conexao.prepareStatement("DELETE FROM helicoptero WHERE id = ?;");
                    stmt.setInt(1, id);
                    stmt.execute();
                    break;
                case 18:
                    System.out.println("Exclusão de Pista");
                    System.out.println("Informe o Id da Pista: ");
                    id = scanner.nextInt();
                    conexao = DAO.createConnection();
                    stmt = conexao.prepareStatement("DELETE FROM pista WHERE id = ?;");
                    stmt.setInt(1, id);
                    stmt.execute();
                    break;
                case 19:
                    System.out.println("Exclusão de Companhia");
                    System.out.println("Informe o Id da Companhia: ");
                    id = scanner.nextInt();
                    conexao = DAO.createConnection();
                    stmt = conexao.prepareStatement("DELETE FROM companhia WHERE id = ?;");
                    stmt.setInt(1, id);
                    stmt.execute();
                    break;
                case 20:
                    System.out.println("Exclusão de Hangar");
                    System.out.println("Informe o Id do Hangar: ");
                    id = scanner.nextInt();
                    conexao = DAO.createConnection();
                    stmt = conexao.prepareStatement("DELETE FROM hangar WHERE id = ?;");
                    stmt.setInt(1, id);
                    stmt.execute();
                    break;
                case 21:
                    System.out.println("Exclusão de Voo");
                    System.out.println("Informe o Id do Voo: ");
                    id = scanner.nextInt();
                    conexao = DAO.createConnection();
                    stmt = conexao.prepareStatement("DELETE FROM voo WHERE id = ?;");
                    stmt.setInt(1, id);
                    stmt.execute();
                    break;
                case 22: 
                    System.out.println("Alteração de Avião: ");
                    System.out.println("Informe o Id do Avião que deseja alterar: ");
                    id = scanner.nextInt();
                    System.out.println("Informe a Marca do Avião: ");
                    marca = scanner.next();
                    System.out.println("Informe o Modelo do Avião: ");
                    modelo = scanner.next();
                    System.out.println("Informe a Capacidade do Avião: ");
                    capacidade = scanner.nextInt();
                    System.out.println("Informe as letras do prefixo do Avião: ");
                    letras = scanner.next();
                    System.out.println("Informe os números do prefixo do Avião: ");
                    numeros = scanner.nextInt();
                    System.out.println("Informe o Id da Companhia: ");
                    idCompanhia = scanner.nextInt();
                    conexao = DAO.createConnection();
                    stmt = conexao.prepareStatement("UPDATE aviao SET marca = ?, modelo = ?, capacidade = ?, letras = ?, numeros = ?, companhia_id = ? WHERE id = ?;");
                    stmt.setString(1, marca);
                    stmt.setString(2, modelo);
                    stmt.setInt(3, capacidade);
                    stmt.setString(4, letras);
                    stmt.setInt(5, numeros);
                    stmt.setInt(6, idCompanhia);
                    stmt.setInt(7, id);
                    stmt.execute();
                    break;
                case 23:
                    System.out.println("Alteração de Jato: ");
                    System.out.println("Informe o Id do Jato que deseja alterar: ");
                    id = scanner.nextInt();
                    System.out.println("Informe a Marca do Jato: ");
                    marca = scanner.next();
                    System.out.println("Informe o Modelo do Jato: ");
                    modelo = scanner.next();
                    System.out.println("Informe a Cor do Jato: ");
                    cor = scanner.next();
                    System.out.println("Informe a Velocidade do Jato: ");
                    velocidade = scanner.nextInt();
                    conexao = DAO.createConnection();
                    stmt = conexao.prepareStatement("UPDATE jato SET marca = ?, modelo = ?, cor = ?, velocidade = ? WHERE id = ?;");
                    stmt.setString(1, marca);
                    stmt.setString(2, modelo);
                    stmt.setString(3, cor);
                    stmt.setInt(4, velocidade);
                    stmt.setInt(5, id);
                    stmt.execute();
                    break;
                case 24:
                    System.out.println("Alteração de Helicóptero: ");
                    System.out.println("Informe o Id do Helicóptero que deseja alterar: ");
                    id = scanner.nextInt();
                    System.out.println("Informe a Marca do Helicóptero: ");
                    marca = scanner.next();
                    System.out.println("Informe o Modelo do Helicóptero: ");
                    modelo = scanner.next();
                    System.out.println("Informe a Cor do Helicóptero: ");
                    cor = scanner.next();
                    System.out.println("Informe a Capacidade do Helicóptero: ");
                    capacidade = scanner.nextInt();
                    conexao = DAO.createConnection();
                    stmt = conexao.prepareStatement("UPDATE helicoptero SET marca = ?, modelo = ?, cor = ?, capacidade = ? WHERE id = ?;");
                    stmt.setString(1, marca);
                    stmt.setString(2, modelo);
                    stmt.setString(3, cor);
                    stmt.setInt(4, capacidade);
                    stmt.setInt(5, id);
                    stmt.execute();
                    break;
                case 25:
                    System.out.println("Alteração de Pista: ");
                    System.out.println("Informe o Id da Pista que deseja alterar: ");
                    id = scanner.nextInt();
                    System.out.println("Informe as letras da numeração da Pista: ");
                    letra = scanner.next();
                    System.out.println("Informe os números da numeração da Pista: ");
                    num = scanner.nextInt();
                    conexao = DAO.createConnection();
                    stmt = conexao.prepareStatement("UPDATE pista SET letra = ?, num = ? WHERE id = ?;");
                    stmt.setString(1, letra);
                    stmt.setInt(2, num);
                    stmt.setInt(3, id);
                    stmt.execute();
                    break;
                case 26:
                    System.out.println("Alteração de Companhia: ");
                    System.out.println("Informe o Id da Companhia que deseja alterar: ");
                    id = scanner.nextInt();
                    System.out.println("Informe o Nome da Companhia: ");
                    nome = scanner.next();
                    System.out.println("Informe o CNPJ da Companhia: ");
                    cnpj = scanner.next();
                    conexao = DAO.createConnection();
                    stmt = conexao.prepareStatement("UPDATE companhia SET nome = ?, cnpj = ? WHERE id = ?;");
                    stmt.setString(1, nome);
                    stmt.setString(2, cnpj);
                    stmt.setInt(3, id);
                    stmt.execute();
                    break;
                case 27:
                    System.out.println("Alteração de Hangar: ");
                    System.out.println("Informe o Id do Hangar que deseja alterar: ");
                    id = scanner.nextInt();
                    System.out.println("Informe o Local do Hangar: ");
                    local = scanner.next();
                    System.out.println("Informe o Id do Avião: ");
                    idAviao = scanner.nextInt();
                    conexao = DAO.createConnection();
                    stmt = conexao.prepareStatement("UPDATE hangar SET local = ?, aviao_id = ? WHERE id = ?;");
                    stmt.setString(1, local);
                    stmt.setInt(2, idAviao);
                    stmt.setInt(3, id);
                    stmt.execute();
                    break;
                case 28:
                    System.out.println("Alteração de Voo: ");
                    System.out.println("Informe o Id do Voo que deseja alterar: ");
                    System.out.println("Informe a Data do Voo: ");
                    data = scanner.next();
                    System.out.println("Informe a Hora: ");
                    hora = scanner.next();
                    System.out.println("Informe a Origem: ");
                    origem = scanner.next();
                    System.out.println("Informe o Destino: ");
                    destino = scanner.next();
                    System.out.println("Informe o Nome do Piloto: ");
                    piloto = scanner.next();
                    System.out.println("Informe o Nome do Copiloto: ");
                    copiloto = scanner.next();
                    System.out.println("Informe alguma Observação: ");
                    observacao = scanner.next();
                    System.out.println("Informe as letras da numeração do Voo: ");
                    letras = scanner.next();
                    System.out.println("Informe os números da numeração do Voo: ");
                    num = scanner.nextInt();
                    System.out.println("Informe o Id da Pista: ");
                    idPista = scanner.nextInt();
                    id = scanner.nextInt();
                    System.out.println("Informe o Id da Aeronave: ");
                    idAeronave = scanner.nextInt();
                    System.out.println("1: Helicóptero");
                    System.out.println("2: Jato");
                    System.out.println("3: Avião");
                    System.out.println("Informe o Tipo de Aeronave: ");
                    tipo = scanner.nextInt();
                    conexao = DAO.createConnection();
                    if(tipo == 1){
                        stmt = conexao.prepareStatement("UPDATE voo SET data = ?, hora = ?, origem = ?, destino = ?, piloto = ?, copiloto = ?, observacao = ?, letras = ?, num = ?, pista_id = ?, helicoptero_id = ?, jato_id = ?, aviao_id = ? WHERE id = ?;");
                        stmt.setString(1, data);
                        stmt.setString(2, hora);
                        stmt.setString(3, origem);
                        stmt.setString(4, destino);
                        stmt.setString(5, piloto);
                        stmt.setString(6, copiloto);
                        stmt.setString(7, observacao);
                        stmt.setString(8, letras);
                        stmt.setInt(9, num);
                        stmt.setInt(10, idPista);
                        stmt.setInt(11, idAeronave);
                        stmt.setNull(12, Types.NULL);
                        stmt.setNull(13, Types.NULL);
                        stmt.execute();
                    }else if(tipo == 2){
                        stmt = conexao.prepareStatement("UPDATE voo SET data = ?, hora = ?, origem = ?, destino = ?, piloto = ?, copiloto = ?, observacao = ?, letras = ?, num = ?, pista_id = ?, helicoptero_id = ?, jato_id = ?, aviao_id = ? WHERE id = ?;");
                        stmt.setString(1, data);
                        stmt.setString(2, hora);
                        stmt.setString(3, origem);
                        stmt.setString(4, destino);
                        stmt.setString(5, piloto);
                        stmt.setString(6, copiloto);
                        stmt.setString(7, observacao);
                        stmt.setString(8, letras);
                        stmt.setInt(9, num);
                        stmt.setInt(10, idPista);
                        stmt.setNull(11, Types.NULL);
                        stmt.setInt(12, idAeronave);
                        stmt.setNull(13, Types.NULL);
                        stmt.execute();
                    }else if(tipo == 3){
                        stmt = conexao.prepareStatement("UPDATE voo SET data = ?, hora = ?, origem = ?, destino = ?, piloto = ?, copiloto = ?, observacao = ?, letras = ?, num = ?, pista_id = ?, helicoptero_id = ?, jato_id = ?, aviao_id = ? WHERE id = ?;");
                        stmt.setString(1, data);
                        stmt.setString(2, hora);
                        stmt.setString(3, origem);
                        stmt.setString(4, destino);
                        stmt.setString(5, piloto);
                        stmt.setString(6, copiloto);
                        stmt.setString(7, observacao);
                        stmt.setString(8, letras);
                        stmt.setInt(9, num);
                        stmt.setInt(10, idPista);
                        stmt.setNull(11, Types.NULL);
                        stmt.setNull(12, Types.NULL);
                        stmt.setInt(13, idAeronave);
                        stmt.execute();
                    }
                    break;
                case 29:    
                    System.out.println("Sair.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
