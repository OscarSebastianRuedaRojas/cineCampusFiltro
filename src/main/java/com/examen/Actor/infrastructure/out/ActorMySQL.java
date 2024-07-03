package com.examen.Actor.infrastructure.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.examen.Actor.application.out.ActorRepositoryPort;
import com.examen.Actor.domain.models.Actor;

/**
 * ActorMySQL
 */
public class ActorMySQL implements ActorRepositoryPort{

    private final String url;
    private final String username;
    private final String password;


    public ActorMySQL() {
        this.url = "jdbc:mysql://localhost:3306/cinecampus";
        this.username = "root";
        this.password = "123456";
    }


    @Override
    public Actor save(Actor actor) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "INSERT INTO actor (nombre, idnacionalidad, edad, idgenero) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, actor.getNombre());
            preparedStatement.setLong(2, actor.getIdNacionalidad());
            preparedStatement.setInt(3, actor.getEdad());
            preparedStatement.setLong(4, actor.getIdGenero());
            preparedStatement.executeUpdate();
            return actor;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public void delete(Long id) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "DELETE FROM actor WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public Actor update(Long id, Actor actor) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "UPDATE actor set nombre = ?, idnacionalidad = ?, edad = ?, idgenero = ? WHERE id = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, actor.getNombre());
            preparedStatement.setLong(2, actor.getIdNacionalidad());
            preparedStatement.setInt(3, actor.getEdad());
            preparedStatement.setLong(4, actor.getIdGenero());
            preparedStatement.setLong( 5, id);
            preparedStatement.executeUpdate();
            return actor;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public ArrayList<Actor> list() {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT id, nombre, idnacionalidad, edad, idgenero FROM actor";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            ArrayList<Actor> actors = new ArrayList<>();
            while (resultSet.next()) {
                Actor actor = new Actor();
                actor.setId(resultSet.getLong("id"));
                actor.setNombre(resultSet.getString("nombre"));
                actor.setIdNacionalidad(resultSet.getLong("idnacionalidad"));
                actor.setEdad(resultSet.getInt("edad"));
                actor.setIdGenero(resultSet.getLong("idgenero"));
                actors.add(actor);
            }
            return actors;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public Actor FindById(Long id) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT id, nombre, idnacionalidad, edad, idgenero FROM actor WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Actor actor = new Actor();
                actor.setId(resultSet.getLong("id"));
                actor.setNombre(resultSet.getString("nombre"));
                actor.setIdNacionalidad(resultSet.getLong("idnacionalidad"));
                actor.setEdad(resultSet.getInt("edad"));
                actor.setIdGenero(resultSet.getLong("idgenero"));
                return  actor;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}