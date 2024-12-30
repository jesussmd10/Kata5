package software.ulpgc.kata5.io;

import software.ulpgc.kata5.io.pojos.PokemonDetailResponse;
import software.ulpgc.kata5.io.pojos.PokemonSpeciesResponse;
import software.ulpgc.kata5.model.Pokemon;

public interface PokemonAdapter {
    Pokemon adapt(PokemonSpeciesResponse species, PokemonDetailResponse detail);
}
