package com.davidread.washingtontourguide.Activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

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

        ArrayList<Place> restaurants = new ArrayList<>();
        restaurants.add(new Place("Juanitos Mexican Restaurant", "3 Broad St", "The experienced chefs of Juanitos Mexican Restaurant in Washington create authentic Mexican Cuisine using fresh ingredients and traditional recipes.", R.drawable.juanitos_mexican_restaurant));
        restaurants.add(new Place("Allie's Cupcakery & Café", "7 Broad St", "Allie's Cupcakery & Café is an eatery years in the making. In fact, you might say that its origins date all the way back to 1949! That was the year Josephine Pistilli, my grandma, opened Pistilli's Family Restaurant in Bernardsville, NJ. She spent years cooking, expanding, and perfecting her business. Having lived a stone's throw away (literally) from her restaurant until my early twenties, I spent most of my time learning and working by my grandma's side.", R.drawable.allies_cupcakery_and_cafe));
        restaurants.add(new Place("William's Irish Tavern", "101 E Washington Ave", "William’s Irish Tavern welcomes you like an old friend. Everyday we greet and serve our friends and neighbors in Washington, NJ just like our namesake did years ago. Colonel William McCullough opened the very first tavern in Washington Borough, New Jersey in 1811. Colonel McCullough built his tavern to build his community; through the sharing of food and drink many great ideas and great friendships were born. With numerous popular and craft beer choices and a menu full of traditional pub favorites, so on continues the tradition of great food, great drink and great friends at William’s Irish Tavern today. Cheers!", R.drawable.williams_irish_tavern));
        restaurants.add(new Place("Empanada Mamasita", "65 E Washington Ave", "Latin comfort food.", R.drawable.empanada_mamasita));
        restaurants.add(new Place("Washington Diner", "6 NJ-31", "The key to our success is simple: providing quality consistent food that taste great every single time. We pride ourselves on serving our customers delicious genuine dishes like: American.", R.drawable.washington_diner));

        ArrayList<Place> businesses = new ArrayList<>();
        businesses.add(new Place("Dave's Friendly Services Inc", "288 W Washington Ave", "Welcome to Dave's Friendly Service! We are a full service, automotive repair and maintenance shop serving the Washington area since 1976. We understand that sometimes car repair can be stressful and we do everything possible to make our customers feel welcome, comfortable and satisfied with their service experience. We make your service experience hassle-free. We are happy to offer early bird and night-owl drop-box service and local shuttle service to your home or office.", R.drawable.daves_friendly_service));
        businesses.add(new Place("Warren County Liquors LLC", "260 W Washington Ave", "Fine liquor, wine, spirits, and beer.", R.drawable.warren_county_liquors_llc));
        businesses.add(new Place("Castle Family Dentistry, LLC. Brian C. Bialiy, DMD", "151 W Washington Ave 1st floor", "The true test of a quality dental office is the longevity of its staff. Castle Family Dentistry is proud that, on average, our staff has been with us for over 13 years. They provide a familiar, caring environment that you can trust.", R.drawable.castle_family_dentistry));
        businesses.add(new Place("M Y Accounting and Tax Services", "111 W Washington Ave", "They do taxes and stuff. Idk.", R.drawable.my_accounting_and_tax_services));
        businesses.add(new Place("Albea Americas, Inc", "191 NJ-31", "Big company with no website to get info from. Not sure what they do. Lol.", R.drawable.albea_americas_inc));

        ArrayList<Place> religiousPlaces = new ArrayList<>();
        religiousPlaces.add(new Place("Faith Discovery Church", "33 Brass Castle Rd", "Here at FDC we have three Core Values by which we strive to live. Authentic, be real! Accepting, be loving! Accelerating, be encouraging!", R.drawable.faith_discovery_church));
        religiousPlaces.add(new Place("United Methodist Church", "116 E Washington Ave", "Greenstone is a welcoming and affirming community of faith located in the heart of Downtown Washington, NJ. We are thrilled to provide you with a Christ centered experience and an environment to nurture your spirit or raise a family.", R.drawable.united_methodist_church));
        religiousPlaces.add(new Place("First Presbyterian Church", "40 E Church St", "Orange Presbyterian church.", R.drawable.first_presbyterian_church));
        religiousPlaces.add(new Place("St. Joseph Roman Catholic Church", "200 Carlton Ave", "Welcome! And thank you for visiting our Parish web site. The pages of this site speak of a humble and proud family. Humble in our beginning and reality of who we are before God, and proud to be a people doing his work for over 140 years. As you scroll through these pages please keep us in your prayers as we will remember you.", R.drawable.st_joseph_roman_catholic_church));
        religiousPlaces.add(new Place("Worship Church Washington", "38 Kinnaman Ave", "To know Jesus and experience Him is our greatest call. Our mission is to live and make disicples consecrated to Him. We do this through living in authenitc community and offering multiple ways to get involved, grow and stay connected.", R.drawable.worship_church_washington));

        ArrayList<Place> funPlaces = new ArrayList<>();
        funPlaces.add(new Place("Roaring Rock Park", "Harmony Brass Castle Rd", "Hiking trail up by Brass Castle Road.", R.drawable.roaring_rock_park));
        funPlaces.add(new Place("Von Thun Farms", "438 NJ-57", "Nestled in scenic Warren County, VonThun Farms is open spring, summer, and fall with events and activities for the whole family! Visit the New Jersey Sunflower Trail, New Jersey’s premier sunflower destination. Stop into our farm market for homegrown fruits, vegetables and angus beef and pick your own strawberries, raspberries, blackberries, peaches, apples and pumpkins.", R.drawable.von_thun_farms));
        funPlaces.add(new Place("Pohatcong Native Arboretum", "52 Mine Hill Rd", "Pohatcong Native Arboretum, Native Tree Museum of New Jersey, has an exhibition on display of over 155 species of native trees, shrubs, and vines. The plants are identified by plaques with common, family, genus, and species names. Between 2010 and 2015 our plant collection was tripled.", R.drawable.pohatcong_native_arboretum));
        funPlaces.add(new Place("Washington Borough Pocket Park", "44 E Washington Ave", "Small park nestled between some businesses in the boro.", R.drawable.washinton_borough_pocket_park));

        ArrayList<Place> schools = new ArrayList<>();
        schools.add(new Place("Taylor Street School", "16 Taylor St #24", "Taylor Street Elementary School is a public school located in Washington, NJ, which is in a fringe town setting.The student population of Taylor Street Elementary School is 188, and the school serves PK-2.", R.drawable.taylor_street_school));
        schools.add(new Place("Warren Hills Regional Middle School", "64-66 Carlton Ave", "Warren Hills Regional Middle School is comprised of 659 diverse 7th and 8th grade students. Our Middle School structure includes two departmentally clustered grade level teams. Presently, the range of academic opportunities for students includes courses in Language Arts Literacy, Mathematics, Science, Social Studies, World Languages, Visual & Performing Arts, Fine Arts, Computer Applications, Health & Physical Education, Music, Careers, Computer Assisted Instruction for Math and Language Arts and Interdisciplinary Enrichment. All areas of study benefit from the expansion of our technological resources through our district technology plan. Teachers have access to a variety of technological tools, which are used to enhance and supplement educational pedagogy.", R.drawable.warren_hills_middle_school));
        schools.add(new Place("Brass Castle Elementary School", "16 Castle St", "Our school district consists of two elementary schools, the Port Colden School and the Brass Castle School, educating students in grades kindergarten through sixth. Washington Township School District is a place that reflects, nurtures and promotes the sense of fellowship so valued by the community it serves.", R.drawable.brass_castle_school));
        schools.add(new Place("Memorial Elementary School", "300 W Stewart St", "Washington Memorial Elementary School is a public school located in WASHINGTON, NJ. It has 268 students in grades 3-6 with a student-teacher ratio of 11 to 1. According to state test scores, 40% of students are at least proficient in math and 52% in reading.", R.drawable.memorial_elementary_school));
        schools.add(new Place("Warren Hills Regional High School", "41 Jackson Valley Rd", "Warren Hills Regional High School is a four-year public high school located on Jackson Valley Road in Washington Township in Warren County, New Jersey, United States, operating as part of the Warren Hills Regional School District.", R.drawable.warren_hills_high_school));

        ArrayList<Category> categories = new ArrayList<>();
        categories.add(new Category("Restaurants", restaurants));
        categories.add(new Category("Businesses", businesses));
        categories.add(new Category("Religion", religiousPlaces));
        categories.add(new Category("Fun", funPlaces));
        categories.add(new Category("Schools", schools));

        return categories;
    }
}