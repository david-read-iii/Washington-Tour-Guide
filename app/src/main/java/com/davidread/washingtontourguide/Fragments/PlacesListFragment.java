package com.davidread.washingtontourguide.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.davidread.washingtontourguide.Adapters.PlaceAdapter;
import com.davidread.washingtontourguide.Models.Place;
import com.davidread.washingtontourguide.R;

import java.util.ArrayList;

/**
 * {@link PlacesListFragment} represents a {@link View} object with a {@link ListView}. The
 * {@link ListView} displays the {@link ArrayList} of {@link Place} objects passed into the
 * fragment as an argument.
 */
public class PlacesListFragment extends Fragment {

    // Member variable.
    private ArrayList<Place> places;

    /**
     * Returns a {@link PlacesListFragment} object with the specified {@link ArrayList} object
     * passed as an argument.
     *
     * @param places An {@link ArrayList} of {@link Place} objects to be displayed in the fragment's
     *               {@link android.widget.ListView}.
     * @return A {@link PlacesListFragment} with arguments on it.
     */
    public static PlacesListFragment newInstance(ArrayList<Place> places) {
        PlacesListFragment fragment = new PlacesListFragment();
        Bundle args = new Bundle();
        args.putParcelableArrayList("places", places);
        fragment.setArguments(args);
        return fragment;
    }

    /**
     * During onCreate() phase, store member variables passed to this fragment as arguments.
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        places = getArguments().getParcelableArrayList("places");
    }

    /**
     * Returns a {@link View} object for this fragment.
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // Inflate the fragment's view.
        View view = inflater.inflate(R.layout.fragment_places_list, container, false);

        // Create adapter to adapt objects in the ArrayList into views for the ListView.
        PlaceAdapter adapter = new PlaceAdapter(getContext(), places);

        // Attach adapter to the ListView in the fragment's view.
        ListView listView = view.findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        // Return the fragment's view.
        return view;
    }
}
