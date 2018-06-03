package fi.markussoderman.www.humppaplayer;

import android.app.Activity;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import fi.markussoderman.www.humppaplayer.Band;
import fi.markussoderman.www.humppaplayer.R;

public class ArtistAdapter extends ArrayAdapter<Band> {

    public ArtistAdapter(Activity context, ArrayList<Band> Band) {
        super(context, 0, Band);
    }

    @Override
    public View getView(int position, final View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

         Band currentBand = getItem(position);
        //
//        //TODO: Make the onClickListener open artis focus with the artis
//        convertView.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the numbers category is clicked on.
//            @Override
//            public void onClick(View view) {
//                TextView editText = view.findViewById(R.id.toPlay);
//                Intent intent = Intent(this, MainActivity::class.java).apply {
//                    putExtra(EXTRA_MESSAGE, message)
//                }
//                startActivity(intent)
//            }
//        });

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.artist);
        nameTextView.setText(currentBand.getName());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.song);
        numberTextView.setText(currentBand.getSong());



        return listItemView;



    }

}