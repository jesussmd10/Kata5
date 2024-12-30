package software.ulpgc.kata5.io.pojos;

import java.util.List;

public record PokemonDetailResponse(String name, List<TypeWrapper> types
) {
    public record TypeWrapper(Type type) {
    }

    public record Type(String name) {
    }
}
