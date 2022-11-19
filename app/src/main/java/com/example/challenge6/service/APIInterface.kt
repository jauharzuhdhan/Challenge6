package com.example.challenge6.service

import com.example.challenge6.models.Data
import com.example.challenge6.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface APIInterface {
    @GET("3/movie/popular?api_key=071d6a1f6606545a364626349fe51e07")
    fun getPopularMovies(): Call<MovieResponse>

    @GET("3/movie/{movie_id}?api_key=071d6a1f6606545a364626349fe51e07")
    fun getDetailsMovies(@Path("movie_id") id: Int?): Call<Data>
}