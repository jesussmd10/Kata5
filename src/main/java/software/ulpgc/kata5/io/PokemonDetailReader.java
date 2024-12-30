package software.ulpgc.kata5.io;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

public class PokemonDetailReader implements PokemonReader {

    @Override
    public String readSpecies(int pokemonName) {
        return read("https://pokeapi.co/api/v2/pokemon-species/" + pokemonName + "/");

    }

    public String readDetail(int pokemonName) {
        return read("https://pokeapi.co/api/v2/pokemon/" + pokemonName + "/");
    }

    private static String read(String url) {
        try {
            Connection.Response response = Jsoup.connect(url)
                    .ignoreContentType(true)
                    .method(Connection.Method.GET)
                    .execute();
            if (response.statusCode() != 200) {
                throw new RuntimeException("Failed to fetch data from " + url);
            }
            return response.body();
        } catch (IOException e) {
            throw new RuntimeException("Error reading data from " + url, e);
        }
    }


}
