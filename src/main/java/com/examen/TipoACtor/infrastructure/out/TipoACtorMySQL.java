package com.examen.TipoACtor.infrastructure.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.examen.TipoACtor.application.out.TipoActorRepositoryPort;
import com.examen.TipoACtor.domain.models.TipoActor;

/**
 * TipoACtorMySQL
 */
public class TipoActorMySQL implements TipoActorRepositoryPort {

    private final String url;
    private final String username;
    private final String password;


    public TipoActorMySQL() {
        this.url = "jdbc:mysql://localhost:3306/cinecampus";
        this.username = "root";
        this.password = "123456";
    }


    @Override
    public TipoActor save(TipoActor tipoActor) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "INSERT INTO tipoactor VALUES(null, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, tipoActor.getDescripcion());
            preparedStatement.executeUpdate();
            return tipoActor;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public void delete(Long id) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "DELETE FROM tipoactor WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public TipoActor update(Long id, TipoActor tipoActor) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "UPDATE tipoactor set descripcion = ? WHERE id = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, tipoActor.getDescripcion());
            preparedStatement.setLong( 2, id);
            preparedStatement.executeUpdate();
            return tipoActor;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public ArrayList<TipoActor> list() {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT id, descripcion FROM tipoactor";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            ArrayList<TipoActor> tipoActors = new ArrayList<>();
            while (resultSet.next()) {
                TipoActor tipoActor = new TipoActor();
                tipoActor.setId(resultSet.getLong("id"));
                tipoActor.setDescripcion(resultSet.getString("descripcion"));
                tipoActors.add(tipoActor);
            }
            return tipoActors;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public TipoActor FindById(Long id) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT id, descripcion FROM tipoactor WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                TipoActor tipoActor = new TipoActor();
                tipoActor.setId(resultSet.getLong("id"));
                tipoActor.setDescripcion(resultSet.getString("descripcion"));
                return  tipoActor;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}