package noor.serry.quran.util.Adapter;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import noor.serry.quran.R;

public class Holder extends RecyclerView.ViewHolder {
    ImageView  imageView;
    TextView textView;
    RecyclerViewListener listener;
    public Holder(@NonNull View itemView) {
        super (itemView);
        imageView = itemView.findViewById (R.id.photoToSurah);
        textView = itemView.findViewById (R.id.nameOfSurah);
        imageView.setOnClickListener (this::onItemClickListiner);
    }
    public void onItemClickListiner(View view){
        listener.onItemClickListener ((int)imageView.getTag ());
    }
}
