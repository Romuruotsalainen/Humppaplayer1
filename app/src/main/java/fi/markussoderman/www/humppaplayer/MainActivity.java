package fi.markussoderman.www.humppaplayer;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import android.app.AlertDialog;

import fi.markussoderman.www.humppaplayer.Band;
import fi.markussoderman.www.humppaplayer.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Band> band = new ArrayList<Band>();

        band.add(new Band("Eläkeläiset","Faster, harder, humppa"));
        band.add(new Band("Happoradio","Che Guevara"));
        band.add(new Band("Yö","Rakkaus on lumivalkoinen"));
        band.add(new Band("Hevisaurus","Räyh!"));

        ArtistAdapter adapter = new ArtistAdapter(this, band);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent a;
                a = new Intent(MainActivity.this, Player.class);


                startActivity(a);
            }
        });

    }


}
