package sg.edu.rp.c346.id20013676.myndpsongs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Song> songList;

    public CustomAdapter(Context context, int resource, ArrayList<Song> objects) {
        super(context, resource, objects);

        this.parent_context = context;
        this.layout_id = resource;
        this.songList = objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvYear = rowView.findViewById(R.id.textViewYear);
//        TextView tvStars = rowView.findViewById(R.id.textViewStars);
        TextView tvSinger = rowView.findViewById(R.id.textViewSinger);
        ImageView ivNew = rowView.findViewById(R.id.imageViewNew);
        RatingBar ratingBar = (RatingBar) rowView.findViewById(R.id.ratingBar);

        Song song = songList.get(position);

        tvTitle.setText(song.getTitle());
        tvYear.setText(song.getYear() + "");
//        tvStars.setText(song.toStars());
        tvSinger.setText(song.getSingers());
        ratingBar.setRating(song.getStars());

        if (song.getYear() >= 2019) {
            ivNew.setVisibility(View.VISIBLE);
        } else {
            ivNew.setVisibility(View.INVISIBLE);
        }

        return rowView;
    }



}

