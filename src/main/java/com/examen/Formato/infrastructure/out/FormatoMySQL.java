package com.examen.Formato.infrastructure.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.examen.Formato.application.out.FormatoRepositoryPort;
import com.examen.Formato.domain.models.Formato;

/**
 * FormatoMySQL
 */
public class FormatoMySQL implements FormatoRepositoryPort{

    private final String url;
    private final String username;
    private final String password;


    public FormatoMySQL() {
        this.url = "jdbc:mysql://localhost:3306/cinecampus";
        this.username = "root";
        this.password = "123456";
    }


    @Override
    public Formato save(Formato formato) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "INSERT INTO formato VALUES(null , ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, formato.getDescripcion());
            preparedStatement.executeUpdate();
            return formato;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public void delete(Long id) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "DELETE FROM formato WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public Formato update(Long id, Formato formato) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "UPDATE formato set descripcion = ? WHERE id = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, formato.getDescripcion());
            preparedStatement.setLong( 2, id);
            preparedStatement.executeUpdate();
            return formato;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public ArrayList<Formato> list() {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT id, descripcion FROM formato";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            ArrayList<Formato> formatoes = new ArrayList<>();
            while (resultSet.next()) {
                Formato formato = new Formato();
                formato.setId(resultSet.getLong("id"));
                formato.setDescripcion(resultSet.getString("descripcion"));
                formatoes.add(formato);
            }
            return formatoes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public Formato FindById(Long id) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT id, descripcion FROM formato WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Formato formato = new Formato();
                formato.setId(resultSet.getLong("id"));
                formato.setDescripcion(resultSet.getString("descripcion"));
                return  formato;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}