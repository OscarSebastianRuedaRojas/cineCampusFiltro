package com.examen.Pelicula.infrastructure.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.examen.Pelicula.application.out.PeliculaRepositoryPort;
import com.examen.Pelicula.domain.models.Pelicula;

/**
 * PeliculaMySQL
 */
public class PeliculaMySQL implements PeliculaRepositoryPort{

    private final String url;
    private final String username;
    private final String password;


    public PeliculaMySQL() {
        this.url = "jdbc:mysql://localhost:3306/cinecampus";
        this.username = "root";
        this.password = "123456";
    }


    @Override
    public Pelicula save(Pelicula pelicula) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "INSERT INTO pelicula VALUES(null, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, pelicula.getCodinterno());
            preparedStatement.setString(2, pelicula.getNombre());
            preparedStatement.setString(3, pelicula.getDuracion());
            preparedStatement.setString(4, pelicula.getSinopsis());
            preparedStatement.executeUpdate();
            return pelicula;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public void delete(Long id) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "DELETE FROM pelicula WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public Pelicula update(Long id, Pelicula pelicula) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "UPDATE pelicula set condinterno = ?, nombre = ?, duracion = ?, sinopsis = ? WHERE id = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, pelicula.getCodinterno());
            preparedStatement.setString(2, pelicula.getNombre());
            preparedStatement.setString(3, pelicula.getDuracion());
            preparedStatement.setString(4, pelicula.getSinopsis());
            preparedStatement.setLong( 5, id);
            preparedStatement.executeUpdate();
            return pelicula;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public ArrayList<Pelicula> list() {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT id, coninterno, nombre, duracion, sinopsis FROM pelicula";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            ArrayList<Pelicula> peliculaes = new ArrayList<>();
            while (resultSet.next()) {
                Pelicula pelicula = new Pelicula();
                pelicula.setId(resultSet.getLong("id"));
                pelicula.setCodinterno(resultSet.getString("codinterno"));
                pelicula.setNombre(resultSet.getString("nombre"));
                pelicula.setDuracion(resultSet.getString("duracion"));
                pelicula.setSinopsis(resultSet.getString("sinopsis"));
                peliculaes.add(pelicula);
            }
            return peliculaes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public Pelicula FindById(Long id) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT id, coninterno, nombre, duracion, sinopsis FROM pelicula WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Pelicula pelicula = new Pelicula();
                pelicula.setId(resultSet.getLong("id"));
                pelicula.setCodinterno(resultSet.getString("codinterno"));
                pelicula.setNombre(resultSet.getString("nombre"));
                pelicula.setDuracion(resultSet.getString("duracion"));
                pelicula.setSinopsis(resultSet.getString("sinopsis"));
                return  pelicula;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}