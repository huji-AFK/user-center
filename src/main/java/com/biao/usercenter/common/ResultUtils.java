package com.biao.usercenter.common;
/**
 * 封装返回结果
 * @author biao
 */
public class ResultUtils {

    public static  <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0,data,"ok");
    }

    /**
     * 失败
     * @param errorCode
     * @return
     */
    public static  BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }
    /**
     * 失败
     * @param errorCode
     * @return
     */
    public static  BaseResponse error(ErrorCode errorCode,String message ,String description) {
        return new BaseResponse(errorCode.getCode(),null,message,description);
    }
    /**
     * 失败
     * @param errorCode
     * @return
     */
    public static  BaseResponse error(int errorCode,String message ,String description) {
        return new BaseResponse(errorCode,null,message,description);
    }
    /**
     * 失败
     * @param errorCode
     * @param description
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode, String description) {
        return new BaseResponse<>(errorCode.getCode(), null, errorCode.getMessage(), description);
    }

}
