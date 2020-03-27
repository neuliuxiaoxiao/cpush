package com.mpush.api.service;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * <p></p>
 *
 * @author liuxi58
 * @title BaseService
 * @date 2020/3/27 12:24
 **/
public abstract class BaseService implements Service {

    protected final AtomicBoolean started = new AtomicBoolean();

    public BaseService() {
    }

    public void init(){
    }
    public boolean isRunning(){
        return this.started.get();
    }

    protected void tryStart(Listener l,BaseService.FunctionEx function){

    }

    public void start(Listener listener) {

    }

    protected interface FunctionEx {
        void apply(Listener l) throws Throwable;
    }
}
