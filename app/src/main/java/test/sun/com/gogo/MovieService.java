package test.sun.com.gogo;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * @description: Created by sunxiaofei on 2019/2/22.
 */
public interface MovieService {
    @GET("top250")//https://api.douban.com/v2/movie/
    Call getTop250(@Query("start") int start, @Query("count") int count);

//    @FormUrlEncoded
//    @POST("top250")
//    Call getTop250(@Field("start")int start,@Field("start") int count);

}
