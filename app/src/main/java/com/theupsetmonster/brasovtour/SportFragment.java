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

public class SportFragment extends Fragment {
    private int listViewId = R.id.sportList;
    private int layoutId = R.layout.fragment_sport;

    ArrayList<Attraction> arrayList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(layoutId, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(getResources().getString(R.string.sport_and_rec));

        Resources res = getResources();
        ListView listView = (ListView) view.findViewById(listViewId);
        arrayList.add(new Attraction(res.getString(R.string.Sport1Name), res.getString(R.string.Sport1Address), Float.parseFloat(res.getString(R.string.Sport1Rating)), R.drawable.sport1));
        arrayList.add(new Attraction(res.getString(R.string.Sport2Name), res.getString(R.string.Sport2Address), Float.parseFloat(res.getString(R.string.Sport2Rating)), R.drawable.sport2));
        arrayList.add(new Attraction(res.getString(R.string.Sport3Name), res.getString(R.string.Sport3Address), Float.parseFloat(res.getString(R.string.Sport3Rating)), R.drawable.sport3));

        ListCustomAdapter myAdapter=new ListCustomAdapter(getContext(), R.layout.list_attractions, arrayList);
        listView.setAdapter(myAdapter);
    }
}