package software.ulpgc.kata5.io;

import software.ulpgc.kata5.io.pojos.PokemonDetailResponse;
import software.ulpgc.kata5.io.pojos.PokemonSpeciesResponse;

public interface PokemonDeserializer {
    PokemonSpeciesResponse deserializeSpecies(String json);
    PokemonDetailResponse deserializeDetail(String json);
}
