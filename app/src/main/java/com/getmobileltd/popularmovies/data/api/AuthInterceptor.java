package com.getmobileltd.popularmovies.data.api;

import com.getmobileltd.popularmovies.BuildConfig;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by themavencoder on 09,April,2019
 */
public class AuthInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        HttpUrl url = request.url().newBuilder()
                .addQueryParameter("api_key", BuildConfig.MOVIE_DB_API_KEY)
                .build();

        request = request.newBuilder().url(url).build();
        return  chain.proceed(request);
    }
}
