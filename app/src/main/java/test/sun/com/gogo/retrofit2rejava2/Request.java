package test.sun.com.gogo.retrofit2rejava2;

import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * @description: Created by sunxiaofei on 2019/2/28.
 */
public interface Request {
    // 填上需要访问的服务器地址
    public static String HOST = "https://www.xxx.com/app_v5/";
//    @POST("?service=sser.getList")
//    Observable<Response<List<javaBean>>> getList(@Query("id") String id);
}
