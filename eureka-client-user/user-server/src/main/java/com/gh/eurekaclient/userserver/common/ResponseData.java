package com.gh.eurekaclient.userserver.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseData<T> {
    private String msg;
    private Integer code;
    private T data;


}
