package com.getmobileltd.popularmovies.data.model;

import com.getmobileltd.popularmovies.data.api.NetworkState;
import com.getmobileltd.popularmovies.paging.MoviePageKeyedDataSource;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.PagedList;

/**
 * Created by themavencoder on 10,April,2019
 */
public class RepoMovieResult {
    public LiveData<PagedList<Movie>> data;
    public LiveData<NetworkState> networkState;
    public MutableLiveData<MoviePageKeyedDataSource> sourceLiveData;

    public RepoMovieResult(LiveData<PagedList<Movie>> data, LiveData<NetworkState> networkState, MutableLiveData<MoviePageKeyedDataSource> sourceLiveData) {
        this.data = data;
        this.networkState = networkState;
        this.sourceLiveData = sourceLiveData;

    }

}
