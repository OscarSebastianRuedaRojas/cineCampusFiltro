package com.examen;

import com.examen.menuPrincipal.infrastructure.adapter.MenuAdapter;

public class Main {
    public static void main(String[] args) {
        MenuAdapter menuAdapter = new MenuAdapter();
        menuAdapter.mostrarMenuPrincipal();
    }
}