package noor.serry.quran.data.retrofit;

import java.net.URL;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitInstance {
    Retrofit retrofit;
    public RetrofitInstance(String url){
        retrofit = new Retrofit.Builder ().baseUrl (url)
                .addConverterFactory (GsonConverterFactory.create ())
                .build ();
    }
    public Retrofit getRetrofit(){
        return retrofit;
    }
}
