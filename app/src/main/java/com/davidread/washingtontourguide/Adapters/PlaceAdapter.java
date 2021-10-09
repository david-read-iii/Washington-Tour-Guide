package com.davidread.washingtontourguide.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.davidread.washingtontourguide.Fragments.CategoryFragment;
import com.davidread.washingtontourguide.Models.Place;
import com.davidread.washingtontourguide.R;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link PlaceAdapter} is an adapter class the extends the {@link ArrayAdapter} class of
 * {@link Place} objects. It adapts an {@link ArrayList} of {@link Place} objects to be
 * displayed in a {@link ListView} object of the {@link CategoryFragment}.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * Construct a new {@link PlaceAdapter}.
     *
     * @param context {@link Context} for the {@link ArrayAdapter}.
     * @param places  An {@link java.util.ArrayList} of {@link Place} objects to be displayed in the
     *                {@link android.widget.ListView}.
     */
    public PlaceAdapter(@NonNull Context context, @NonNull List<Place> places) {
        super(context, 0, places);
    }

    /**
     * Returns a {@link View} object for the specified position in the {@link ListView}.
     *
     * @param position    The position in the {@link ListView} where the {@link View} will be
     *                    displayed.
     * @param convertView A {@link View} object to populate. May already have a layout file
     *                    inflated due to view recycling.
     * @param parent      The parent {@link ViewGroup}.
     * @return A {@link View} object for the specified position in the {@link ListView}.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Inflate convertView from the layout file if it isn't being recycled.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_place, parent, false);
        }

        // Get the Place object for this position in the list.
        Place place = getItem(position);

        // Populate convertView with properties of this Place object.
        ImageView imageView = convertView.findViewById(R.id.list_item_image_view);
        TextView nameTextView = convertView.findViewById(R.id.list_item_name_text_view);
        TextView addressTextView = convertView.findViewById(R.id.list_item_address_text_view);
        imageView.setImageResource(place.getImageResourceId());
        nameTextView.setText(place.getName());
        addressTextView.setText(place.getAddress());

        // Return convertView.
        return convertView;
    }
}
