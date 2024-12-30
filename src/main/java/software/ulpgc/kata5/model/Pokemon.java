package software.ulpgc.kata5.model;

import java.util.List;

public record Pokemon (String name, List<String> types, int generation, boolean isLegendary){
}
