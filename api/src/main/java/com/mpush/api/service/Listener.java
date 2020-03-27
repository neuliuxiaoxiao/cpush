package com.mpush.api.service;

/**
 * <p></p>
 *
 * @author liuxi58
 * @title Listener
 * @date 2020/3/27 12:23
 **/
public interface Listener {
    void onSuccess(Object... args);
    void onFailure(Throwable cause);
}
