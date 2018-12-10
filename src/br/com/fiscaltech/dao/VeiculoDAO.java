package br.com.fiscaltech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiscaltech.ConnectionFactory;
import br.com.fiscaltech.model.Veiculo;

public class VeiculoDAO {

	private Connection connection;

	public VeiculoDAO() {
		try {
			connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public boolean existeVeiculo(Veiculo veiculo) {
		
		if(veiculo == null) {
			throw new IllegalArgumentException("Veiculo nao pode ser nulo");
		}
		
		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from cad_veiculos where placa = ?");
			stmt.setString(1, veiculo.getPlaca());
			ResultSet rs = stmt.executeQuery();

			boolean encontrado = rs.next();
			rs.close();
			stmt.close();
			
			return encontrado;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void insere(Veiculo veiculo) {
		if(veiculo == null) {
			throw new IllegalArgumentException("Veiculo nao pode ser nulo");
		}
		
		try {
			PreparedStatement stmt = this.connection.prepareStatement("insert into cad_veiculos (placa, "
					+ "ano_modelo, atualizado_em, id_cor, ano_fabricacao, ativo ) values (?,?,?,?,?,?)");
			stmt.setString(1, veiculo.getPlaca());
			stmt.execute();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}		
	}
}
