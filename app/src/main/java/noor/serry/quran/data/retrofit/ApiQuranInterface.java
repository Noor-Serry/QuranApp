package noor.serry.quran.data.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;

public interface ApiQuranInterface {

//    @GET("api/get-surah/1")
//    public Call<JsonData> getData();
     @GET("api/get-surah/{surah_id}")
    public Call<JsonData> getData(@Path ("surah_id") int surah_id);
}
