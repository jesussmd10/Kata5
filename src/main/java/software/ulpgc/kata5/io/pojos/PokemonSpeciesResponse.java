package software.ulpgc.kata5.io.pojos;

public record PokemonSpeciesResponse(Generation generation, boolean is_legendary
) {
    public record Generation(String name) {
    }
}
