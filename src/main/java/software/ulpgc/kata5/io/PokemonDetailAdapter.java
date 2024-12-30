package software.ulpgc.kata5.io;

import software.ulpgc.kata5.io.pojos.PokemonDetailResponse;
import software.ulpgc.kata5.io.pojos.PokemonSpeciesResponse;
import software.ulpgc.kata5.model.Pokemon;

import java.util.List;
import java.util.stream.Collectors;

public class PokemonDetailAdapter implements PokemonAdapter{


    @Override
    public Pokemon adapt(PokemonSpeciesResponse species, PokemonDetailResponse detail) {
        return new Pokemon(
                detail.name(),
                extractTypes(detail),
                extractGeneration(species),
                species.is_legendary()
        );
    }


    private List<String> extractTypes(PokemonDetailResponse detail) {
        return detail.types().stream()
                .map(typeWrapper -> typeWrapper.type().name())
                .collect(Collectors.toList());
    }

    private int extractGeneration(PokemonSpeciesResponse species) {
        String generationName = species.generation().name(); // Ejemplo: "generation-i"
        String generationSuffix = generationName.replace("generation-", ""); // Extrae "i"

        // Mapeo de nombres de generaciones a números
        switch (generationSuffix) {
            case "i": return 1;
            case "ii": return 2;
            case "iii": return 3;
            case "iv": return 4;
            case "v": return 5;
            case "vi": return 6;
            case "vii": return 7;
            case "viii": return 8;
            case "ix" : return 9;
            default:
                throw new IllegalArgumentException("Generación desconocida: " + generationSuffix);
        }
    }


}
