package com.reyeda.screenmatch;

import com.reyeda.screenmatch.models.DatosEpisodio;
import com.reyeda.screenmatch.models.DatosSerie;
import com.reyeda.screenmatch.models.DatosTemporada;
import com.reyeda.screenmatch.principal.Principal;
import com.reyeda.screenmatch.services.ConsumoAPI;
import com.reyeda.screenmatch.services.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraMenu();
//		var consumoApi = new ConsumoAPI();
//		var json = consumoApi.obtenerDatos("http://www.omdbapi.com/?t=Suits&apikey=6191b46");
//		System.out.println(json);
//		ConvierteDatos conversor = new ConvierteDatos();
//		var datos = conversor.obtenerDatos(json, DatosSerie.class);
//		System.out.println(datos);
//		json = consumoApi.obtenerDatos("http://www.omdbapi.com/?t=Suits&Season=1&episode=1&apikey=6191b46");
//		DatosEpisodio episodio = conversor.obtenerDatos(json, DatosEpisodio.class);
//		System.out.println(episodio);
//
//		List<DatosTemporada> temporadas = new ArrayList<>();
//		for (int i = 1; i < datos.totalTemp(); i++) {
//			json = consumoApi.obtenerDatos("http://www.omdbapi.com/?t=Suits&Season=" +i+ "&apikey=6191b46");
//			var datosTemporada = conversor.obtenerDatos(json, DatosTemporada.class);
//			temporadas.add(datosTemporada);
//		}
//		temporadas.forEach(System.out::println);
	}
}
