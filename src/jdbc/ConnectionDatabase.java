package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {

    public static void main(String[] args) throws SQLException {
        //simulando uma connection com o database

        /*
        * Conexão
        String que representa a string suportada pelo drive do jdbc(java-database-connection)
        mysql(driver que eu quero acessar)
        localhost(nome do servidor)
        3306(porta)

        porta tem relação com processo

        Quando eu for fazer comunicação em rede e eu preciso acessar um serviço que roda em outra máquina.Eu uso um endereço ip para poder acessar a outra máquina. Quando vc manda requisição para outra máquina, a porta está inbutida.

        Se vc faz requisição de uma máquina x para uma máquina y, a porta está inbutida, pois sem a porta não tem como a máquina saber o que fazer, pois isso em cada porta está configurada o que vai receber....*/

        //final(constante)
        final String stringDeConexao = "jdbc:mysql//localhost:8080/";
        final String user = "root";
        final String senha = "123";


        //DriverManager(responsavel por criar uma conexao)

        //Ele da uma exeçao checada, que esta falando para eu usar o try/catch ou eu deixo alguem tratar essa exception para min
        //Para resolver essa exeçao eu posso dar um try/catch ou simplesmente colocar uma throws SQLException do lado da classe main
        Connection conexao = DriverManager.getConnection(stringDeConexao,user,senha);

        conexao.close();
    }
}
