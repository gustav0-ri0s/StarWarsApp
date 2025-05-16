package com.starwars.app.utilidades;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class ArchivoJSON {
    public void guardarComoJson(Object objeto, String nombreArchivo) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try(FileWriter writer = new FileWriter(nombreArchivo)) {
            gson.toJson(objeto, writer);
            System.out.println("Archivo guardado correctamente como: "+ nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: "+ e.getMessage());
        }
    }
}
