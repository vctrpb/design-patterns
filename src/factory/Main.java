package factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
	
	public Main() throws SQLException {
		Connection connection = ConnectionFactory.getConnection();
		
		PreparedStatement statement = connection.prepareStatement("select * from tabela");
	}
	
	//Ter a própria factory isola e facilita a criação de um objeto complicado.
	//Caso necessite de alguma alteração, essa criação está encapsulada.
	
	//O Builder também facilita a criação de um objeto complexo, mas ele foca em um objeto que recebe muitos
	//parâmetros, e esses parâmetros frequentemente mudam.
}
