package com.guillermo.pokedex.pokeapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import com.guillermo.pokedex.models.HabilidadRespuesta;
import com.guillermo.pokedex.models.PokemonRespuesta;

public interface PokeapiService {

    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon(@Query("limit") int limit, @Query("offset") int offset);
    @GET("ability")
    Call<HabilidadRespuesta> obtenerListaHabilidades(@Query("limit") int limit, @Query("offset") int offset);

}
