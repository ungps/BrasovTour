package com.theupsetmonster.brasovtour;

import android.content.res.Resources;
import android.support.annotation.Nullable;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import static com.theupsetmonster.brasovtour.R.id.accommodationList;

public class AccommodationFragment extends Fragment {
    private int listViewId = accommodationList;
    private int layoutId = R.layout.fragment_accommodation;

    ArrayList<Attraction> arrayList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(layoutId, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(getResources().getString(R.string.accommodation));

        Resources res = getResources();
        ListView listView = (ListView) view.findViewById(listViewId);
        arrayList.add(new Attraction(res.getString(R.string.Hotel1Name), res.getString(R.string.Hotel1Address), Float.parseFloat(res.getString(R.string.Hotel1Rating)), R.drawable.hotel1));
        arrayList.add(new Attraction(res.getString(R.string.Hotel2Name), res.getString(R.string.Hotel2Address), Float.parseFloat(res.getString(R.string.Hotel2Rating)), R.drawable.hotel2));
        arrayList.add(new Attraction(res.getString(R.string.Hotel3Name), res.getString(R.string.Hotel3Address), Float.parseFloat(res.getString(R.string.Hotel3Rating)), R.drawable.hotel3));

        ListCustomAdapter myAdapter=new ListCustomAdapter(getContext(), R.layout.list_attractions, arrayList);
        listView.setAdapter(myAdapter);
    }
}