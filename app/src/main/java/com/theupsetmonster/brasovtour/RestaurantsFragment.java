package com.theupsetmonster.brasovtour;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import static com.theupsetmonster.brasovtour.R.id.accommodationList;
import static com.theupsetmonster.brasovtour.R.id.restaurantsList;

public class RestaurantsFragment extends Fragment {
    private int listViewId = restaurantsList;
    private int layoutId = R.layout.fragment_restaurants;

    ArrayList<Attraction> arrayList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(layoutId, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(getResources().getString(R.string.res_and_clubs));

        Resources res = getResources();
        ListView listView = (ListView) view.findViewById(listViewId);
        arrayList.add(new Attraction(res.getString(R.string.Restaurant1Name), res.getString(R.string.Restaurant1Address), Float.parseFloat(res.getString(R.string.Restaurant1Rating)), R.drawable.restaurant1));
        arrayList.add(new Attraction(res.getString(R.string.Restaurant2Name), res.getString(R.string.Restaurant2Address), Float.parseFloat(res.getString(R.string.Restaurant2Rating)), R.drawable.restaurant2));
        arrayList.add(new Attraction(res.getString(R.string.Restaurant3Name), res.getString(R.string.Restaurant3Address), Float.parseFloat(res.getString(R.string.Restaurant3Rating)), R.drawable.restaurant3));

        ListCustomAdapter myAdapter=new ListCustomAdapter(getContext(), R.layout.list_attractions, arrayList);
        listView.setAdapter(myAdapter);
    }
}