package com.getmobileltd.popularmovies.movielist;

import com.getmobileltd.popularmovies.data.DataSource;
import com.getmobileltd.popularmovies.data.api.MovieApiService;
import com.getmobileltd.popularmovies.data.model.RepoMovieDetailResult;
import com.getmobileltd.popularmovies.data.model.RepoMovieResult;

/**
 * Created by themavencoder on 10,April,2019
 */
public class MovieRepository implements DataSource {
    private static final int PAGE_SIZE = 20;
    private final MovieApiService mMovieApiService;

    public MovieRepository(MovieApiService movieApiService) {
        mMovieApiService = movieApiService;
    }

    @Override
    public RepoMovieDetailResult getMovie(long movieId) {
        return null;
    }

    @Override
    public RepoMovieResult getFilteredMoviesBy(MovieFilterType sortBy) {
        return null;
    }
}
