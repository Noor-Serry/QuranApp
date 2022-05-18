package noor.serry.quran.util.Adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import noor.serry.quran.R;

public class CustomAdapter extends RecyclerView.Adapter< Holder> {
        int [] photoId ;
        List<String> namesOfSurah;
        Context context;
        RecyclerViewListener listener;
   public CustomAdapter ( Context context,RecyclerViewListener listener){
       setNamesOfSurah ();
       setPhotoId ();
       this.context = context;
       this.listener = listener;
}

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from (context).inflate (R.layout.recyclerview_item,null,false);
        Holder holder = new Holder (v);
        holder.listener = listener;
        return holder;

    }

    int lastIndex=1;
    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
       if(position%2==0){
           lastIndex =new Random (  ).nextInt ( 3 );}
       holder.imageView.setImageResource (photoId[lastIndex]);
       holder.textView.setText (namesOfSurah.get (position));
       holder.imageView.setTag (position);
    }

    @Override
    public int getItemCount() {
        return namesOfSurah.size ();
    }

    private void setPhotoId(){
        photoId = new int[4];
        photoId[0] = R.drawable.photo1;photoId[1] = R.drawable.photo2;
        photoId[2] = R.drawable.photo3;photoId[3] = R.drawable.photo4;
    }

    private void setNamesOfSurah(){
        namesOfSurah = new ArrayList<> (  );
        namesOfSurah.add ("الفاتحة");namesOfSurah.add ("البقرة");
        namesOfSurah.add ("آل عمران");namesOfSurah.add ("النساء");
        namesOfSurah.add ("المائدة");namesOfSurah.add ("الأنعام");
        namesOfSurah.add ("الأعراف");namesOfSurah.add ("الأنفال");
        namesOfSurah.add ("التوبة");namesOfSurah.add ("يونس");
        namesOfSurah.add ("هود");namesOfSurah.add ("يوسف");
        namesOfSurah.add ("الرعد");namesOfSurah.add ("ابراهيم");
        namesOfSurah.add ("الحجر");namesOfSurah.add ("النحل");
        namesOfSurah.add ("الإسراء");namesOfSurah.add ("الكهف");
        namesOfSurah.add ("مريم");namesOfSurah.add ("طه");
        namesOfSurah.add ("الأنبياء");namesOfSurah.add ("الحج");
        namesOfSurah.add ("المؤمنون");namesOfSurah.add ("النور");
        namesOfSurah.add ("الفرقان");namesOfSurah.add ("الشعراء");
        namesOfSurah.add ("النمل");namesOfSurah.add ("القصص");
        namesOfSurah.add ("العنكبوت");namesOfSurah.add ("الروم");
        namesOfSurah.add ("لقمان");namesOfSurah.add ("السجدة");
        namesOfSurah.add ("الأحزاب");namesOfSurah.add ("سبأ");
        namesOfSurah.add ("فاطر");namesOfSurah.add ("يس");
        namesOfSurah.add ("الصافات");namesOfSurah.add ("سورة ص");
        namesOfSurah.add ("الزمر");namesOfSurah.add ("غافر");
        namesOfSurah.add ("فصلت");namesOfSurah.add ("الشورى");
        namesOfSurah.add ("الزخرف");namesOfSurah.add ("الدخان");
        namesOfSurah.add ("الجاثية");namesOfSurah.add ("الأحقاف");
        namesOfSurah.add ("محمد");namesOfSurah.add ("الفتح");
        namesOfSurah.add ("الحجرات");namesOfSurah.add ("سورة ق");
        namesOfSurah.add ("الذاريات");namesOfSurah.add ("الطور");
        namesOfSurah.add ("النجم");namesOfSurah.add ("القمر");
        namesOfSurah.add ("الرحمن");namesOfSurah.add ("الواقعة");
        namesOfSurah.add ("الحديد");namesOfSurah.add ("المجادلة");
        namesOfSurah.add ("الحشر");namesOfSurah.add ("الممتحنة");
        namesOfSurah.add ("الصف");namesOfSurah.add ("الجمعة");
        namesOfSurah.add ("المنافقون");namesOfSurah.add ("التغابن");
        namesOfSurah.add ("الطلاق");namesOfSurah.add ("التحريم");
        namesOfSurah.add ("الملك");namesOfSurah.add ("القلم");
        namesOfSurah.add ("الحاقة");namesOfSurah.add ("المعارج");
        namesOfSurah.add ("نوح");namesOfSurah.add ("الجن");
        namesOfSurah.add ("المزمل");namesOfSurah.add ("المدثر");
        namesOfSurah.add ("القيامة");namesOfSurah.add ("الإنسان");
        namesOfSurah.add ("المرسلات");namesOfSurah.add ("النبأ");
        namesOfSurah.add ("النازعات");namesOfSurah.add ("عبس");
        namesOfSurah.add ("التكوير");namesOfSurah.add ("الإنفطار");
        namesOfSurah.add ("المطففين");namesOfSurah.add ("الانشقاق");
        namesOfSurah.add ("البروج");namesOfSurah.add ("الطارق");
        namesOfSurah.add ("الأعلى");namesOfSurah.add ("الغاشية");
        namesOfSurah.add ("الفجر");namesOfSurah.add ("البلد");
        namesOfSurah.add ("الشمس");namesOfSurah.add ("الليل");
        namesOfSurah.add ("الضحى");namesOfSurah.add ("الشرح");
        namesOfSurah.add ("التين");namesOfSurah.add ("العلق");
        namesOfSurah.add ("القدر");namesOfSurah.add ("البينة");
        namesOfSurah.add ("الزلزلة");namesOfSurah.add ("العاديات");
        namesOfSurah.add ("القارعة");namesOfSurah.add ("التكاثر");
        namesOfSurah.add ("العصر");namesOfSurah.add ("الهمزة");
        namesOfSurah.add ("الفيل");namesOfSurah.add ("قريش");
        namesOfSurah.add ("الماعون");namesOfSurah.add ("الكوثر");
        namesOfSurah.add ("الكافرون");namesOfSurah.add ("النصر");
        namesOfSurah.add ("المسد");namesOfSurah.add ("الإخلاص");
        namesOfSurah.add ("الفلق");namesOfSurah.add ("الناس");

    }
}
