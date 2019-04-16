package test.sun.com.gogo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * @description: Created by sunxiaofei on 2019/2/20.
 */
public class BootBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG="BootBroadcastReceiver";
        private static final String ACTION_BOOT="android.intent.action.BOOT_COMPLETED";
        @Override
        public void onReceive(Context context, Intent intent){
        if(intent.getAction().equals(ACTION_BOOT)){ //开机启动完成后，要做的事情
            Log.e("SUN","BootBroadcastReceiveronReceive(),Dothing!");
            for (int i = 0; i<=20;i++){
                Toast.makeText(context,"SUN is doing ",Toast.LENGTH_LONG).show();
            }
            Intent startintent= new Intent(context, MainActivity.class);  //启动指定页面
            startintent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(startintent);
        }
        }
        }
        