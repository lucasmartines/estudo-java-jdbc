package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
		
		final String stringConexao = "jdbc:mysql://database-2.ct2enrcu6uyu.us-east-2.rds.amazonaws.com?verifyServerCertificate=false&useSSL=true";
		final String usuario = "admin";
		final String senha = "zpsqkhdPCvqIqntyax1o";
		
		Connection conexao = DriverManager
				.getConnection(stringConexao,usuario,senha);
		
		
		System.out.println("conexão realizada com sucesso");
		conexao.close();
		
	}
}
