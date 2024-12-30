package software.ulpgc;

import software.ulpgc.kata5.io.*;
import software.ulpgc.kata5.model.Pokemon;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PokemonLoader loader = new PokemonLoader(
                new PokemonDetailReader(),
                new PokemonDetailDeserializer(),
                new PokemonDetailAdapter()
        );

        // Generar nombres de Pokémon aleatorios basados en IDs
        Random random = new Random();
        for (int i = 0; i < 10; i++) { // Obtener 10 Pokémon aleatorios
            int randomId = random.nextInt(1010) + 1;
            int pokemonName =  randomId;
            Pokemon pokemon = loader.get(pokemonName);
            System.out.println(pokemon);
        }
    }
}