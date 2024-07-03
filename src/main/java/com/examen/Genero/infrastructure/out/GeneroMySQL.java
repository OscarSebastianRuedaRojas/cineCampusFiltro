package com.examen.Genero.infrastructure.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.examen.Genero.application.out.GeneroRepositoryPort;
import com.examen.Genero.domain.models.Genero;

/**
 * GeneroMySQL
 */
public class GeneroMySQL implements GeneroRepositoryPort{

    private String url;
    private String username;
    private String password;


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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }


    @Override
    public Genero update(Long id, Genero genero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }


    @Override
    public ArrayList<Genero> list() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'list'");
    }


}