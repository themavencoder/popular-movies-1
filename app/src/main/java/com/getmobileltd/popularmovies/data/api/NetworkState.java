package com.getmobileltd.popularmovies.data.api;

import android.net.Network;

/**
 * Created by themavencoder on 09,April,2019
 */
public class NetworkState {

    private Status status;
    private String msg;

    public static final NetworkState LOADED = new NetworkState(Status.SUCCESS,null);
    public static final NetworkState LOADING  = new NetworkState(Status.RUNNING, null);

    private NetworkState(Status status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public static NetworkState error(String msg) {
        return new NetworkState(Status.FAILED,msg);
    }

    public Status getStatus() {
        return status;
    }
    public String getMsg() {
        return msg;
    }
}
