package com.examen.menuPrincipal.infrastructure.adapter;

import java.util.Scanner;

import com.examen.menuPrincipal.domain.Menu;

public class MenuAdapter {

    Menu menu;

    public MenuAdapter() {
        this.menu = new Menu();
    }

    public void mostrarMenuPrincipal() {
        Scanner input = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\nMenú Principal");
            System.out.println("1. Gestionar Actores");
            System.out.println("2. Gestionar Películas");
            System.out.println("3. Gestionar Formatos");
            System.out.println("4. Asignar Actores a Películas");
            System.out.println("5. Gestionar Géneros");
            System.out.println("6. Gestionar Países");
            System.out.println("7. Gestionar Tipos de Actores");
            System.out.println("8. Consultar Información Detallada de una Película");
            System.out.println("9. Listar Actores por Película");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = input.nextInt();
            input.nextLine(); // limpiar el buffer

            switch (opcion) {
                case 1:
                    // Caso de Uso 1: Gestión de Actores
                    menu.getActorAdapter().menu();
                    break;
                case 2:
                    // Caso de Uso 2: Gestión de Películas
                    menu.getPeliculaAdapter().menu();
                    break;
                case 3:
                    // Caso de Uso 3: Gestión de Formatos
                    menu.getFormatoAdapter().menu();
                    break;
                case 4:
                    // Caso de Uso 4: Asignación de Actores a Películas

                    break;
                case 5:
                    // Caso de Uso 5: Gestión de Géneros
                    menu.getGeneroAdapter().menu();
                    break;
                case 6:
                    // Caso de Uso 6: Gestión de Países
                    menu.getPaisAdapter().menu();
                    break;
                case 7:
                    // Caso de Uso 7: Gestión de Tipos de Actores
                    menu.getTipoActorAdapter().menu();
                    break;
                case 8:
                    // Caso de Uso 8: Consulta de Información Detallada de una Película
                    
                    break;
                case 9:
                    // Caso de Uso 9: Listar Actores por Película
                    
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }

        input.close();
    }
}
