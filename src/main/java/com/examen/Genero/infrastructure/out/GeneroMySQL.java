package com.examen.Genero.infrastructure.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.examen.Genero.application.out.GeneroRepositoryPort;
import com.examen.Genero.domain.models.Genero;

/**
 * GeneroMySQL
 */
public class GeneroMySQL implements GeneroRepositoryPort{

    private final String url;
    private final String username;
    private final String password;


    public GeneroMySQL() {
        this.url = "jdbc:mysql://viaduct.proxy.rlwy.net:47771/airport";
        this.username = "root";
        this.password = "uCbNeUCEUrEqhmfXPrWKkWtWDlaPAnrI";
    }


    @Override
    public Genero save(Genero genero) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "INSERT INTO genero VALUES(?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, genero.getId());
            preparedStatement.setString(2, genero.getDescripcion());
            preparedStatement.executeUpdate();
            return genero;
        } catch (Exception e) {
        }
        return null;
    }


    @Override
    public void delete(Long id) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "DELETE FROM genero WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
        }
    }


    @Override
    public Genero update(Long id, Genero genero) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "UPDATE genero set descripcion = ? WHERE id = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, genero.getDescripcion());
            preparedStatement.setLong( 2, id);
            preparedStatement.executeUpdate();
            return genero;
        } catch (Exception e) {
        }
        return null;
    }


    @Override
    public ArrayList<Genero> list() {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT id, descripcion FROM genero";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            ArrayList<Genero> generos = new ArrayList<>();
            while (resultSet.next()) {
                Genero genero = new Genero();
                genero.setId(resultSet.getLong("id"));
                genero.setDescripcion(resultSet.getString("descripcion"));
                generos.add(genero);
            }
            return generos;
        } catch (Exception e) {
        }
        return null;
    }


    @Override
    public Genero FindById(Long id) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT id, descripcion FROM genero WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Genero genero = new Genero();
                genero.setId(resultSet.getLong("id"));
                genero.setDescripcion(resultSet.getString("descripcion"));
                return  genero;
            }
        } catch (Exception e) {
        }
        return null;
    }


}