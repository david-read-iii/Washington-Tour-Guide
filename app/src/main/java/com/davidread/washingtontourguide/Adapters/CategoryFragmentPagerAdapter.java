package com.davidread.washingtontourguide.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.davidread.washingtontourguide.Fragments.CategoryFragment;
import com.davidread.washingtontourguide.Models.Category;

import java.util.ArrayList;

/**
 * {@link CategoryFragmentPagerAdapter} is an adapter class that extends the
 * {@link FragmentPagerAdapter} class. It adapts {@link Category} objects into {@link Fragment}
 * objects for a {@link ViewPager}.
 */
public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {

    // Member variables.
    private final ArrayList<Category> categories;

    /**
     * Constructs a new {@link CategoryFragmentPagerAdapter}.
     *
     * @param fm         {@link FragmentManager} for the superclass.
     * @param categories An {@link ArrayList} of {@link Category} objects. A fragment will be
     *                   inflated for each object.
     */
    public CategoryFragmentPagerAdapter(@NonNull FragmentManager fm, ArrayList<Category> categories) {
        super(fm);
        this.categories = categories;
    }

    /**
     * Returns a {@link Fragment} object for the page at the specified position.
     *
     * @param position The position in the {@link ViewPager} where the {@link Fragment} will be
     *                 displayed.
     * @return A {@link Fragment} object for the page at the specified position.
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return CategoryFragment.newInstance(categories.get(position).getPlaces());
    }

    /**
     * Returns a {@link String} object representing the name of the page at the specified position.
     *
     * @param position The position in the {@link ViewPager} for which the name represents.
     * @return A {@link String} object representing the name of the page at the specified position.
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return categories.get(position).getName();
    }

    /**
     * Return the number of fragments this adapter adapts.
     *
     * @return The number of fragments this adapter adapts.
     */
    @Override
    public int getCount() {
        return categories.size();
    }
}
