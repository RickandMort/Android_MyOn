package test.sun.com.gogo.retrofit2rejava2;

/**
 * @description: Created by sunxiaofei on 2019/2/28.
 */
public class Response<T> {
    private String msg;
    private T data;
    private int ret;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }
}
