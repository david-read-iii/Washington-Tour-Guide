package com.davidread.washingtontourguide.Activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.res.Resources;
import android.os.Bundle;

import com.davidread.washingtontourguide.Adapters.CategoryFragmentPagerAdapter;
import com.davidread.washingtontourguide.Fragments.CategoryFragment;
import com.davidread.washingtontourguide.Models.Category;
import com.davidread.washingtontourguide.Models.Place;
import com.davidread.washingtontourguide.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

/**
 * {@link MainActivity} is an activity with a {@link TabLayout} and a {@link ViewPager}. The
 * {@link ViewPager} holds a {@link CategoryFragment} for each category of places.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set action bar title and remove its elevation.
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.app_name);
        actionBar.setElevation(0);

        // Attach a CategoryFragmentPagerAdapter to the ViewPager.
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new CategoryFragmentPagerAdapter(getSupportFragmentManager(), getCategoriesArrayList()));

        // Attach ViewPager to the TabLayout.
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }

    /**
     * Returns an {@link ArrayList} of {@link Category} objects for several categories of places of
     * interest in Washington.
     *
     * @return An {@link ArrayList} of {@link Category} objects.
     */
    private ArrayList<Category> getCategoriesArrayList() {

        Resources resources = getResources();

        String[] placeNames = resources.getStringArray(R.array.place_names);
        String[] placeAddresses = resources.getStringArray(R.array.place_addresses);
        String[] placeDescriptions = resources.getStringArray(R.array.place_descriptions);
        String[] placeCategories = resources.getStringArray(R.array.place_categories);

        ArrayList<Place> restaurants = new ArrayList<>();
        restaurants.add(new Place(placeNames[0], placeAddresses[0], placeDescriptions[0], R.drawable.juanitos_mexican_restaurant));
        restaurants.add(new Place(placeNames[1], placeAddresses[1], placeDescriptions[1], R.drawable.allies_cupcakery_and_cafe));
        restaurants.add(new Place(placeNames[2], placeAddresses[2], placeDescriptions[2], R.drawable.williams_irish_tavern));
        restaurants.add(new Place(placeNames[3], placeAddresses[3], placeDescriptions[3], R.drawable.empanada_mamasita));
        restaurants.add(new Place(placeNames[4], placeAddresses[4], placeDescriptions[4], R.drawable.washington_diner));

        ArrayList<Place> businesses = new ArrayList<>();
        businesses.add(new Place(placeNames[5], placeAddresses[5], placeDescriptions[5], R.drawable.daves_friendly_service));
        businesses.add(new Place(placeNames[6], placeAddresses[6], placeDescriptions[6], R.drawable.warren_county_liquors_llc));
        businesses.add(new Place(placeNames[7], placeAddresses[7], placeDescriptions[7], R.drawable.castle_family_dentistry));
        businesses.add(new Place(placeNames[8], placeAddresses[8], placeDescriptions[8], R.drawable.my_accounting_and_tax_services));
        businesses.add(new Place(placeNames[9], placeAddresses[9], placeDescriptions[9], R.drawable.albea_americas_inc));

        ArrayList<Place> religiousPlaces = new ArrayList<>();
        religiousPlaces.add(new Place(placeNames[10], placeAddresses[10], placeDescriptions[10], R.drawable.faith_discovery_church));
        religiousPlaces.add(new Place(placeNames[11], placeAddresses[11], placeDescriptions[11], R.drawable.united_methodist_church));
        religiousPlaces.add(new Place(placeNames[12], placeAddresses[12], placeDescriptions[12], R.drawable.first_presbyterian_church));
        religiousPlaces.add(new Place(placeNames[13], placeAddresses[13], placeDescriptions[13], R.drawable.st_joseph_roman_catholic_church));
        religiousPlaces.add(new Place(placeNames[14], placeAddresses[14], placeDescriptions[14], R.drawable.worship_church_washington));

        ArrayList<Place> funPlaces = new ArrayList<>();
        funPlaces.add(new Place(placeNames[15], placeAddresses[15], placeDescriptions[15], R.drawable.roaring_rock_park));
        funPlaces.add(new Place(placeNames[16], placeAddresses[16], placeDescriptions[16], R.drawable.von_thun_farms));
        funPlaces.add(new Place(placeNames[17], placeAddresses[17], placeDescriptions[17], R.drawable.pohatcong_native_arboretum));
        funPlaces.add(new Place(placeNames[18], placeAddresses[18], placeDescriptions[18], R.drawable.washinton_borough_pocket_park));

        ArrayList<Place> schools = new ArrayList<>();
        schools.add(new Place(placeNames[19], placeAddresses[19], placeDescriptions[19], R.drawable.taylor_street_school));
        schools.add(new Place(placeNames[20], placeAddresses[20], placeDescriptions[20], R.drawable.warren_hills_middle_school));
        schools.add(new Place(placeNames[21], placeAddresses[21], placeDescriptions[21], R.drawable.brass_castle_school));
        schools.add(new Place(placeNames[22], placeAddresses[22], placeDescriptions[22], R.drawable.memorial_elementary_school));
        schools.add(new Place(placeNames[23], placeAddresses[23], placeDescriptions[23], R.drawable.warren_hills_high_school));

        ArrayList<Category> categories = new ArrayList<>();
        categories.add(new Category(placeCategories[0], restaurants));
        categories.add(new Category(placeCategories[1], businesses));
        categories.add(new Category(placeCategories[2], religiousPlaces));
        categories.add(new Category(placeCategories[3], funPlaces));
        categories.add(new Category(placeCategories[4], schools));

        return categories;
    }
}