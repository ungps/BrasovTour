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
import static com.theupsetmonster.brasovtour.R.id.culturalList;

public class CulturalFragment extends Fragment {
    private int listViewId = culturalList;
    private int layoutId = R.layout.fragment_cultural;

    ArrayList<Attraction> arrayList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(layoutId, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(getResources().getString(R.string.culture));

        Resources res = getResources();
        ListView listView = (ListView) view.findViewById(listViewId);
        arrayList.add(new Attraction(res.getString(R.string.Cultural1Name), res.getString(R.string.Cultural1Address), Float.parseFloat(res.getString(R.string.Cultural1Rating)), R.drawable.museum1));
        arrayList.add(new Attraction(res.getString(R.string.Cultural2Name), res.getString(R.string.Cultural2Address), Float.parseFloat(res.getString(R.string.Cultural2Rating)), R.drawable.museum2));
        arrayList.add(new Attraction(res.getString(R.string.Cultural3Name), res.getString(R.string.Cultural3Address), Float.parseFloat(res.getString(R.string.Cultural3Rating)), R.drawable.museum3));

        ListCustomAdapter myAdapter=new ListCustomAdapter(getContext(), R.layout.list_attractions, arrayList);
        listView.setAdapter(myAdapter);
    }
}