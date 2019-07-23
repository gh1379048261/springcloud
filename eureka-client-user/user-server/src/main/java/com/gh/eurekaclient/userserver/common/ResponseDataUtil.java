package com.gh.eurekaclient.userserver.common;

public class ResponseDataUtil{

    public static ResponseData ok(Object obj){
        return new ResponseData("ok",200,obj);
    }

    public static ResponseData error(Object obj){
        return new ResponseData("error",500,obj);
    }

}
