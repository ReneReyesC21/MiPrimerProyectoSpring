package com.reyeda.screenmatch.principal;

import com.reyeda.screenmatch.models.DatosSerie;
import com.reyeda.screenmatch.models.DatosTemporada;
import com.reyeda.screenmatch.services.ConsumoAPI;
import com.reyeda.screenmatch.services.ConvierteDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE = "http://www.omdbapi.com/?t";
    private final String API_KEY = "&apikey=6191b46";
    private ConvierteDatos conversor = new ConvierteDatos();

    public void muestraMenu(){
        System.out.println("Escribe el nombre de la serie que quieres buscar: ");
        //busca datos generales de las series
        var nombreSerie = teclado.nextLine();
        var json = consumoApi.obtenerDatos(URL_BASE + nombreSerie.replace(" ", "+") + API_KEY);
        var datos = conversor.obtenerDatos(json, DatosSerie.class);
        System.out.println(datos);
        //Busca los datos de las tempordas de la serie
        List<DatosTemporada> temporadas = new ArrayList<>();
        for (int i = 0; i < datos.totalTemp(); i++) {
            json = consumoApi.obtenerDatos(URL_BASE+nombreSerie.replace(" ", "+")+"&Season="+i+API_KEY);
            var datosTemporada = conversor.obtenerDatos(json, DatosTemporada.class);
            temporadas.add(datosTemporada);
        }
        temporadas.forEach(System.out::println);
    }

}
