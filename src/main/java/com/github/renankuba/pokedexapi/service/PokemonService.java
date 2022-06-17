package com.github.renankuba.pokedexapi.service;

import com.github.renankuba.pokedexapi.model.Pokemon;

public interface PokemonService {
    Pokemon findById(Integer id);
}
