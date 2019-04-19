package com.getmobileltd.popularmovies;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by themavencoder on 18,April,2019
 */
public class PopularMovieApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
