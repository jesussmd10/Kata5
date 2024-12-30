package software.ulpgc.kata5.io;

import com.google.gson.Gson;
import software.ulpgc.kata5.io.pojos.PokemonDetailResponse;
import software.ulpgc.kata5.io.pojos.PokemonSpeciesResponse;

public class PokemonDetailDeserializer implements PokemonDeserializer{
    private final Gson gson = new Gson();

    public PokemonSpeciesResponse deserializeSpecies(String json) {
        return gson.fromJson(json, PokemonSpeciesResponse.class);
    }

    public PokemonDetailResponse deserializeDetail(String json) {
        return gson.fromJson(json, PokemonDetailResponse.class);
    }
}
