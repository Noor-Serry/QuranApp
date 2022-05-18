package noor.serry.quran.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.adapters.ViewBindingAdapter;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import noor.serry.quran.R;
import noor.serry.quran.data.retrofit.ApiQuranInterface;
import noor.serry.quran.data.retrofit.InnerDataInJson;
import noor.serry.quran.data.retrofit.JsonData;
import noor.serry.quran.data.retrofit.RetrofitInstance;
import noor.serry.quran.databinding.ActivityStartSoundBinding;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class StartSoundActivity extends AppCompatActivity {
    Retrofit retrofit ;
    ActivityStartSoundBinding binding;
    Intent serviceIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        binding = DataBindingUtil.setContentView (this,R.layout.activity_start_sound);
        initializeRetrofi ();
        preperCall ();
    }

    public void initializeRetrofi(){
        final String url = "https://ahr9n-quran-api.herokuapp.com/";
        retrofit = new RetrofitInstance (url).getRetrofit ();
    }

    public int getPosition() {
        Intent intent = getIntent ();
        return intent.getIntExtra ("position",1);
    }

    public void preperCall(){
        Call<JsonData> call = retrofit.create (ApiQuranInterface.class).getData (getPosition ());
       call.enqueue (new Callback<JsonData> ( ) {
           @Override
           public void onResponse(Call<JsonData> call, Response<JsonData> response) {
               binding.progressBar.setVisibility (View.GONE);
               getDataFromJson (response.body ().getData ());
               sendDataToService ();
           }

           @Override
           public void onFailure(Call<JsonData> call, Throwable t) {
               Toast.makeText (StartSoundActivity.this, ""+t, Toast.LENGTH_SHORT).show ( );
           }
       });
    }

   String verses="";
    ArrayList<String> audio ;
    private void getDataFromJson(List<InnerDataInJson> list){
                audio = new ArrayList<> (  );
        for(int i=0;i<list.size ();i++){
            verses += list.get (i).getVerse ()+" "+(i+1)+" ";
            audio.add (list.get (i).getAudio ());
        }
        binding.textViewVerses.setText (verses);

    }

    private void sendDataToService(){
        serviceIntent = new Intent ( StartSoundActivity.this,MyService.class );
        serviceIntent.putStringArrayListExtra ("audio",audio);

        startService (serviceIntent);
    }
    public void StopSound(View view){
        stopService (serviceIntent);
    }


}