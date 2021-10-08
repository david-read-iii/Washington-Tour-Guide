package com.davidread.washingtontourguide.Adapters;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.davidread.washingtontourguide.Fragments.PlacesListFragment;
import com.davidread.washingtontourguide.R;

import java.util.ArrayList;

/**
 * {@link CategoriesFragmentPagerAdapter} is an adapter class that extends the
 * {@link FragmentPagerAdapter} class. It adapts {@link PlacesListFragment} objects into
 * {@link android.view.View} objects for a {@link androidx.viewpager.widget.ViewPager}.
 */
public class CategoriesFragmentPagerAdapter extends FragmentPagerAdapter {

    // Member variable.
    private Context context;

    /**
     * Constructs a new {@link CategoriesFragmentPagerAdapter}.
     *
     * @param fm      {@link FragmentManager} for the superclass.
     * @param context {@link Context} for getting resources.
     */
    public CategoriesFragmentPagerAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    /**
     * Returns a {@link Fragment} object for the page at the specified position.
     *
     * @param position The position in the {@link androidx.viewpager.widget.ViewPager} where the
     *                 {@link Fragment} will be displayed.
     * @return A {@link Fragment} object for the page at the specified position.
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return PlacesListFragment.newInstance(new ArrayList<>());
            case 1:
                return PlacesListFragment.newInstance(new ArrayList<>());
            case 2:
                return PlacesListFragment.newInstance(new ArrayList<>());
            case 3:
                return PlacesListFragment.newInstance(new ArrayList<>());
            case 4:
                return PlacesListFragment.newInstance(new ArrayList<>());
            default:
                return PlacesListFragment.newInstance(new ArrayList<>());
        }
    }

    /**
     * Returns a {@link String} object representing the name of the page at the specified position.
     *
     * @param position The position in the {@link androidx.viewpager.widget.ViewPager} for which the
     *                 name represents.
     * @return A {@link String} object representing the name of the page at the specified position.
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return context.getResources().getStringArray(R.array.categories)[position];
    }

    /**
     * Return the number of fragments this adapter adapts.
     *
     * @return The number of fragments this adapter adapts.
     */
    @Override
    public int getCount() {
        return context.getResources().getStringArray(R.array.categories).length;
    }
}
