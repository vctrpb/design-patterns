package factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
	
	public Main() throws SQLException {
		Connection connection = ConnectionFactory.getConnection();
		
		PreparedStatement statement = connection.prepareStatement("select * from tabela");
	}
	
	//Ter a pr�pria factory isola e facilita a cria��o de um objeto complicado.
	//Caso necessite de alguma altera��o, essa cria��o est� encapsulada.
	
	//O Builder tamb�m facilita a cria��o de um objeto complexo, mas ele foca em um objeto que recebe muitos
	//par�metros, e esses par�metros frequentemente mudam.
}
