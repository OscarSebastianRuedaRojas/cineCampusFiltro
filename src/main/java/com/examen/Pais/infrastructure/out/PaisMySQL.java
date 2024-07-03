package com.examen.Pais.infrastructure.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.examen.Pais.application.out.PaisRepositoryPort;
import com.examen.Pais.domain.models.Pais;

/**
 * PaisMySQL
 */
public class PaisMySQL implements PaisRepositoryPort{

    private final String url;
    private final String username;
    private final String password;


    public PaisMySQL() {
        this.url = "jdbc:mysql://viaduct.proxy.rlwy.net:47771/cinecampus";
        this.username = "root";
        this.password = "uCbNeUCEUrEqhmfXPrWKkWtWDlaPAnrI";
    }


    @Override
    public Pais save(Pais pais) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "INSERT INTO pais VALUES(null , ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, pais.getDescripcion());
            preparedStatement.executeUpdate();
            return pais;
        } catch (Exception e) {
        }
        return null;
    }


    @Override
    public void delete(Long id) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "DELETE FROM pais WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
        }
    }


    @Override
    public Pais update(Long id, Pais pais) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "UPDATE pais set descripcion = ? WHERE id = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, pais.getDescripcion());
            preparedStatement.setLong( 2, id);
            preparedStatement.executeUpdate();
            return pais;
        } catch (Exception e) {
        }
        return null;
    }


    @Override
    public ArrayList<Pais> list() {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT id, descripcion FROM pais";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            ArrayList<Pais> paises = new ArrayList<>();
            while (resultSet.next()) {
                Pais pais = new Pais();
                pais.setId(resultSet.getLong("id"));
                pais.setDescripcion(resultSet.getString("descripcion"));
                paises.add(pais);
            }
            return paises;
        } catch (Exception e) {
        }
        return null;
    }


    @Override
    public Pais FindById(Long id) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT id, descripcion FROM pais WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Pais pais = new Pais();
                pais.setId(resultSet.getLong("id"));
                pais.setDescripcion(resultSet.getString("descripcion"));
                return  pais;
            }
        } catch (Exception e) {
        }
        return null;
    }
    
}