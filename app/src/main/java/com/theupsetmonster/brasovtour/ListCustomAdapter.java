package com.theupsetmonster.brasovtour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.theupsetmonster.brasovtour.R.id.ItemAddress;
import static com.theupsetmonster.brasovtour.R.id.ItemName;
import static com.theupsetmonster.brasovtour.R.id.ItemPreview;

public class ListCustomAdapter extends ArrayAdapter<Attraction> {

    ArrayList<Attraction> list = new ArrayList<>();

    public ListCustomAdapter(Context context, int textViewResourceId, ArrayList<Attraction> objects) {
        super(context, textViewResourceId, objects);
        list = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.list_attractions, null);
        TextView name_TextView = (TextView) v.findViewById(ItemName);
        TextView address_TextView = (TextView) v.findViewById(ItemAddress);
        ImageView preview_ImageView = (ImageView) v.findViewById(ItemPreview);
        name_TextView.setText(list.get(position).getName() + " (" + list.get(position).getRating() + " stars)");
        address_TextView.setText(list.get(position).getLocation());
        preview_ImageView.setImageResource(list.get(position).getPreview());
        return v;
    }

}
