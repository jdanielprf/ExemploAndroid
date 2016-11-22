package br.com.faculdadepitagoras.cc.cm.meuapp;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

/**
 * Created by daniel on 19/11/2016.
 */

public class NotificationActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.notificacao);
    }
}
