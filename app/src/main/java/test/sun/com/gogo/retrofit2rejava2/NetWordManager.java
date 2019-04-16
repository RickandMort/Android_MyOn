package test.sun.com.gogo.retrofit2rejava2;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @description: Created by sunxiaofei on 2019/2/28.
 */
public class NetWordManager {
    private static NetWordManager instance = null;
    private static Retrofit retrofit;
    private static volatile Request request = null;

    public static NetWordManager getInstance(){
        if(instance == null){
            synchronized (NetWordManager.class){
                if(instance == null){
                    instance = new NetWordManager();
                }
            }
        }
        return instance;
    }

    /**
     *
     * @return
     */
    public static Request getRequest(){
        if(request == null){
            synchronized (Request.class){
                if(request == null){
                    request = retrofit.create(Request.class);
                }
            }
        }
        return request;
    }

    /**
     * 初始化必要对象和参数
     */
    public void init(){
        HttpLoggingInterceptor logging= new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BASIC);

        //初始化okhttp
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();


        // 初始化Retrofit
        retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(test.sun.com.gogo.retrofit2rejava2.Request.HOST)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


}
