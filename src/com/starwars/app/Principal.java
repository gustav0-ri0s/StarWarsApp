package com.starwars.app;

import com.google.gson.Gson;
import com.starwars.app.modelos.Film;
import com.starwars.app.servicios.ConsumoAPI;
import com.starwars.app.utilidades.ArchivoJSON;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Star Wars App");
        Scanner scanner = new Scanner(System.in);
        ConsumoAPI consumo = new ConsumoAPI();
        ArchivoJSON archivo = new ArchivoJSON();

        while (true) {

            System.out.println("\nEstimado padawan, elige una película de Star Wars:");
            System.out.println("1. Star Wars Episode IV");
            System.out.println("2. Star Wars Episode V");
            System.out.println("3. Star Wars Episode VI");
            System.out.println("4. Star Wars Episode I");
            System.out.println("5. Star Wars Episode II");
            System.out.println("6. Star Wars Episode III");
            System.out.print("Ingrese una opción del 1 al 6: ");

            String entrada = scanner.nextLine().trim();

            try {
                int opcion = Integer.parseInt(entrada);
                if (opcion < 1 || opcion > 6) {
                    System.out.println("❌ Opción no válida, Debes ingresar un número entre 1 y 6.");
                    continue;
                }


                String url = "https://swapi.py4e.com/api/films/" + opcion + "/";
                String json = consumo.obtenerDatos(url);

                if (json != null) {
                    Gson gson = new Gson();
                    Film film = gson.fromJson(json, Film.class);
                    System.out.println("🎬 Película encontrada:");
                    System.out.println("✅ Título: " + film.title());
                    System.out.println("✅ Episodio: " + film.episode_id());
                    System.out.println("✅ Director: " + film.director());
                    System.out.println("✅ Producido por: " + film.producer());
                    LocalDate fecha = LocalDate.parse(film.release_date());
                    DateTimeFormatter formatoLatino = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    System.out.println("✅ Fecha de estreno: " + fecha.format(formatoLatino));

                    archivo.guardarComoJson(film, "pelicula" + opcion + ".json");

                    String continuar;
                    while (true) {
                        System.out.print("\n¿Deseas consultar otra película? (Sí/No): ");
                        continuar = scanner.nextLine().trim();

                        if (continuar.equalsIgnoreCase("sí") || continuar.equalsIgnoreCase("si")) {
                            break; // sale del while interno y repite el menú
                        } else if (continuar.equalsIgnoreCase("no")) {
                            System.out.println("👋 Hasta pronto, que la fuerza te acompañe.");
                            scanner.close();
                            return;
                        } else {
                            System.out.println("❌ Respuesta no válida. Por favor escribe 'Sí' o 'No'.");
                        }
                    }

                } else {
                    System.out.println("❌ Error no se puede obtener datos de la API");
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Opción no válida, Debes ingresar un número entre 1 y 6.");
            }
        }

    }
}
