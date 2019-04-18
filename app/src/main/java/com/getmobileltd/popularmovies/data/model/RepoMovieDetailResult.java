package com.getmobileltd.popularmovies.data.model;

import com.getmobileltd.popularmovies.data.api.NetworkState;

import androidx.lifecycle.LiveData;

/**
 * Created by themavencoder on 10,April,2019
 */
public class RepoMovieDetailResult {
    public LiveData<Movie> data;
    public LiveData<NetworkState> networkState;

    public RepoMovieDetailResult(LiveData<Movie> data, LiveData<NetworkState> networkState) {
        this.data = data;
        this.networkState = networkState;

    }
}
