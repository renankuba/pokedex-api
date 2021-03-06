package com.github.renankuba.pokedexapi.rest;

import org.springframework.web.bind.annotation.RestController;

import com.github.renankuba.pokedexapi.model.Pokemon;
import com.github.renankuba.pokedexapi.service.PokemonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/pokedex/pokemons")
public class PokemonRestService {
    
    @Autowired
	private PokemonService service;

    @GetMapping("/{id}")
    public Pokemon getOne(@PathVariable Integer id){
        return service.findById(id);
    }
}
