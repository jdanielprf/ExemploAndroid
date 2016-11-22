package br.com.faculdadepitagoras.cc.cm.meuapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notificar();
            }
        });
    }

    public void notificar(){
        Intent intent = new Intent ( MainActivity.this , NotificationActivity.class );
         PendingIntent pendingIntent = PendingIntent.getActivity ( MainActivity .this , 0,
                intent , 0);

         Notification notification = new NotificationCompat.Builder(MainActivity.this)
         . setContentTitle(getString(R.string.new_notification ))
         . setContentText(getString(R.string.notification_content ))
         . setSmallIcon (R.mipmap.ic_launcher )
         . setAutoCancel ( true )
         . setContentIntent ( pendingIntent )
         . build ();

         NotificationManager notificationManager = ( NotificationManager )
                getSystemService ( NOTIFICATION_SERVICE );
         notificationManager.notify (0, notification );


    }
}
