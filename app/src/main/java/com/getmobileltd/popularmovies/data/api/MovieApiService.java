package com.getmobileltd.popularmovies.data.api;

import com.getmobileltd.popularmovies.data.model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by themavencoder on 09,April,2019
 */
public interface MovieApiService {

    @GET("movie/popular")
    Call<MoviesResponse> getPopularMovies(@Query("page") int page);

    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("page") int page);

    @GET("movie/{id}")
    Call<MoviesResponse> getMovieDetails(@Path("id") long id);
}
