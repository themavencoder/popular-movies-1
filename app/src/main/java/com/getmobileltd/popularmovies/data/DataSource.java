package com.getmobileltd.popularmovies.data;

import com.getmobileltd.popularmovies.data.model.RepoMovieDetailResult;
import com.getmobileltd.popularmovies.data.model.RepoMovieResult;
import com.getmobileltd.popularmovies.movielist.MovieFilterType;

/**
 * Created by themavencoder on 10,April,2019
 */
public interface DataSource {

    RepoMovieDetailResult getMovie(long movieId);

    RepoMovieResult getFilteredMoviesBy(MovieFilterType sortBy);
}
