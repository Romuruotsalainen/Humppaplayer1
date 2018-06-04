package fi.markussoderman.www.humppaplayer;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Player extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);
        TextView txt = findViewById(R.id.band);
        String name = GetExtra(savedInstanceState, "name").toString();
        String song = GetExtra(savedInstanceState, "song").toString();
        int img = Integer.parseInt("" +GetExtra(savedInstanceState, "img"));

        txt.setText(name + "\r\n" + song + "\r\n");


        ((ImageView)findViewById(R.id.img)).setImageResource(img);
    }
    private Object GetExtra(Bundle b, String key){
        String ret =  null;
        if (b == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                ret= null;
            } else {
                ret= extras.getString(key);
            }
        } else {
            ret= (String) b.getSerializable(key);
        }
        return ret;
    }
}
