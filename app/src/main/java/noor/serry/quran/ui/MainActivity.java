package noor.serry.quran.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import noor.serry.quran.R;
import noor.serry.quran.databinding.ActivityMainBinding;
import noor.serry.quran.util.Adapter.CustomAdapter;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        binding = DataBindingUtil.setContentView (this,R.layout.activity_main );
        initializeRecyclerView ();
    }

    private void initializeRecyclerView(){
      binding.RecyclerOfSurah.setAdapter (new CustomAdapter (this ,this::onItemClickListener));
      binding.RecyclerOfSurah.setLayoutManager (new GridLayoutManager (this,2));
    }

    public void onItemClickListener(int position){
        Intent intent =new Intent ( this,StartSoundActivity.class );
        intent.putExtra ("position",position+1);
        startActivity (intent);
    }
}