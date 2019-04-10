package com.getmobileltd.popularmovies.data.api;



import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by themavencoder on 09,April,2019
 */
public class ApiClient {
    public static final String BASE_URL = "https://api.themoviedb.org/3/";

    private static final OkHttpClient client;

    private static MovieApiService sInstance;

    private static final Object sLock = new Object();


    static {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);

        client = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor).addInterceptor(new AuthInterceptor()).build();

    }

    public static MovieApiService getsInstance() {
        synchronized (sLock) {
            if (sInstance == null) {
                sInstance = getRetrofitInstance().create(MovieApiService.class);
            }
            return sInstance;
        }
    }

    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }


}
