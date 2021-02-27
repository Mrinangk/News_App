package neb.com.asuspc.newsapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("everything")
    Call<News> getNews(
            @Query("q") String que ,
            @Query("apiKey") String apiKey
    );
}
