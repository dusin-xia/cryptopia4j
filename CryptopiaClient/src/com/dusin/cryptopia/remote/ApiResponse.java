
package com.dusin.cryptopia.remote;

/**
 *
 * Created by Dylan Janeke on 2017/06/23.
 */
public class ApiResponse<T> {
    private boolean success;
    private String message;
    private T data;
    private String json;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
}
