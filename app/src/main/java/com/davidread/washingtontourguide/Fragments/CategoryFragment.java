package com.davidread.washingtontourguide.Fragments;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.davidread.washingtontourguide.Adapters.PlaceAdapter;
import com.davidread.washingtontourguide.Models.Place;
import com.davidread.washingtontourguide.R;

import java.util.ArrayList;

/**
 * {@link CategoryFragment} represents a {@link View} object with a {@link ListView}. The
 * {@link ListView} displays the {@link ArrayList} of {@link Place} objects passed into the
 * fragment as an argument.
 */
public class CategoryFragment extends Fragment {

    // Member variable.
    private ArrayList<Place> places;

    // OnItemClickListener for the ListView.
    private AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            // Get clicked Place object.
            Place place = places.get(position);

            // Construct an AlertDialog with properties of the object.
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            builder.setTitle(place.getName());
            builder.setMessage(place.getDescription());
            builder.setNeutralButton(R.string.neutral_dialog_button, null);

            // Show the AlertDialog.
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }
    };

    /**
     * Returns a {@link CategoryFragment} object with the specified {@link ArrayList} object
     * passed as an argument.
     *
     * @param places An {@link ArrayList} of {@link Place} objects to be displayed in the fragment's
     *               {@link ListView}.
     * @return A {@link CategoryFragment} with arguments on it.
     */
    public static CategoryFragment newInstance(ArrayList<Place> places) {
        CategoryFragment fragment = new CategoryFragment();
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

        // Attach adapter and define item click listener for the ListView in the fragment's view.
        ListView listView = view.findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onItemClickListener);

        // Return the fragment's view.
        return view;
    }
}
