

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestList {

	public static void main(String[] args) throws SQLException {
		
		
		Connection conn = CreateConnectionFactory.buildConnection();

		Statement stm = conn.createStatement();
		boolean result = stm.execute("SELECT * FROM PRODUTO");
		ResultSet rst = stm.getResultSet();
		
		Integer id;
		String nome;
		String descricao;
		
		while(rst.next()) {
			id = rst.getInt("Id");
			nome = rst.getString("nome_produto");
			descricao = rst.getString("descricao_produto");
			System.out.println("Identify: " + id + "\nName: " + nome + " " + "\nDescription: " + descricao);
				
		}
		
		conn.close();

	}

}
