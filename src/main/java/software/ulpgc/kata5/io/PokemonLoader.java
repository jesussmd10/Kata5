package software.ulpgc.kata5.io;

import software.ulpgc.kata5.io.pojos.PokemonDetailResponse;
import software.ulpgc.kata5.io.pojos.PokemonSpeciesResponse;
import software.ulpgc.kata5.model.Pokemon;

public class PokemonLoader {
    private final PokemonReader reader;
    private final PokemonDeserializer deserializer;
    private final PokemonAdapter adapter;

    public PokemonLoader(PokemonReader reader, PokemonDeserializer deserializer, PokemonAdapter adapter) {
        this.reader = reader;
        this.deserializer = deserializer;
        this.adapter = adapter;
    }

    public Pokemon get(int pokemonName) {
        PokemonSpeciesResponse speciesResponse = deserializer.deserializeSpecies(reader.readSpecies(pokemonName));
        PokemonDetailResponse detailResponse = deserializer.deserializeDetail(reader.readDetail(pokemonName));
        return adapter.adapt(speciesResponse,detailResponse);
    }
}
