package noor.serry.quran.ui;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.ArrayList;

public class MyService extends Service {

    ArrayList<String> audio;
    MediaPlayer mediaPlayer;
    public MyService() {

    }

    @Override
    public void onCreate() {
        super.onCreate ( );
        createChannal ();
        startForeground (10,getNotification ());
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        audio = intent.getStringArrayListExtra ("audio");
        try {
            playSound (audio.get (0));
        } catch (IOException e) {
            e.printStackTrace ( );
        }
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy ( );
        numberInSurah=audio.size ();
    }
    int numberInSurah = -1;
    private void playSound(String url) throws IOException {
        numberInSurah++;
         mediaPlayer  = new MediaPlayer ();
        mediaPlayer.setDataSource (url);
        mediaPlayer.prepare ();
        mediaPlayer.start ();
        mediaPlayer.setOnCompletionListener (this::onCompletion);
    }

    public void onCompletion(MediaPlayer mp )  {
         mediaPlayer.stop ();
        if(numberInSurah<audio.size ()) {
            try {
                playSound (audio.get (numberInSurah));
            } catch (IOException e) {
                e.printStackTrace ( );
            }
        }
   }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException ("Not yet implemented");
    }

    private final String channelId = "channelId";
    private void createChannal(){
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            NotificationChannel channel ;
            channel = new NotificationChannel (channelId,"channel", NotificationManager.IMPORTANCE_HIGH);
            NotificationManager manager = getSystemService (NotificationManager.class);
            manager.createNotificationChannel (channel);
        }}

    private Notification getNotification(){
        Intent intent = new Intent ( this,StartSoundActivity.class );
        PendingIntent pendingIntent = PendingIntent.getActivity (this,0,intent,0);
        NotificationCompat.Builder  builder = new NotificationCompat.Builder (this,channelId);
        builder = builder.setPriority (NotificationCompat.PRIORITY_HIGH);
        builder =builder.setContentIntent (pendingIntent);
        return builder.build ();
    }

}