package com.spring.springboot.common;

public class Page<T> {

    private T params;

    public T getParams() {
        return params;
    }

    public void setParams(T params) {
        this.params = params;
    }

    public T getData(T t){
        return t;
    }
}
