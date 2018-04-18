package dashboard.opensrp.org.jandjdashboard.fragments;

import android.app.Activity;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

import dashboard.opensrp.org.jandjdashboard.R;
import dashboard.opensrp.org.jandjdashboard.controller.controllerHolders;
import dashboard.opensrp.org.jandjdashboard.controller.nutritionDetailController;
import dashboard.opensrp.org.jandjdashboard.dashboardCategoryDetailActivity;
import dashboard.opensrp.org.jandjdashboard.dashboardCategoryListActivity;
import dashboard.opensrp.org.jandjdashboard.dummy.DummyContent;

/**
 * A fragment representing a single dashboardCategory detail screen.
 * This fragment is either contained in a {@link dashboardCategoryListActivity}
 * in two-pane mode (on tablets) or a {@link dashboardCategoryDetailActivity}
 * on handsets.
 */
public class nutritionDetailFragment extends dashboardFragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";
    private String controller_holder_key = "controller_holder";
    private String nutritionDetailControllerKey = "nutritionDetailController";
    public static Date fromdate_forFragment = new Date(), todate_forFragment = new Date();

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;
    TextView unittotalnumberoflivebirth,unitstotalnumberofdeath,totalnumberoflivebirth,totalnumberofdeath;
    TextView iron_and_folic_acid_pregnant_woman_info,
            iron_and_folic_acid_mother_info,
            distributed_iron_and_folic_acid_pregnant_woman_info,
            distributed_iron_and_folic_acid_mother_info,
            counselling_on_breastfeeding_and_complimentary_food_pregnant_woman_info,
            counselling_on_breastfeeding_and_complimentary_food_mother_info,
            counselling_on_feeding_mnp_to_children_pregnant_woman_info,
            counselling_on_feeding_mnp_to_children_mother_info,
            feed_colostrum_milk_zero_to_six_month_info,
            feed_colostrum_milk_six_to_24_month_info,
            feed_colostrum_milk_twentyfour_to_fifty_month_info,
            breastfeeding_up_to_6_months_zero_to_six_months_info,
            breastfeeding_up_to_6_months_six_to_twentyfour_months_info,
            breastfeeding_up_to_6_months_twentyfour_to_fifty_months_info,
            providing_extra_complimentary_food_zero_to_6_months_info,
            providing_extra_complimentary_food_6_to_24_months_info,
            providing_extra_complimentary_food_24_to_50_months_info,
            received_multiple_mnr_0_to_6months_info,
            received_multiple_mnr_6_to_24months_info,
            received_multiple_mnr_24_to_50months_info;

    static String var_unittotalnumberoflivebirth,
            var_unitstotalnumberofdeath,
            var_totalnumberoflivebirth,
            var_totalnumberofdeath;
    static String var_iron_and_folic_acid_pregnant_woman_info,
            var_iron_and_folic_acid_mother_info,
            var_distributed_iron_and_folic_acid_pregnant_woman_info,
            var_distributed_iron_and_folic_acid_mother_info,
            var_counselling_on_breastfeeding_and_complimentary_food_pregnant_woman_info,
            var_counselling_on_breastfeeding_and_complimentary_food_mother_info,
            var_counselling_on_feeding_mnp_to_children_pregnant_woman_info,
            var_counselling_on_feeding_mnp_to_children_mother_info,
            var_feed_colostrum_milk_zero_to_six_month_info,
            var_feed_colostrum_milk_six_to_24_month_info,
            var_feed_colostrum_milk_twentyfour_to_fifty_month_info,
            var_breastfeeding_up_to_6_months_zero_to_six_months_info,
            var_breastfeeding_up_to_6_months_six_to_twentyfour_months_info,
            var_breastfeeding_up_to_6_months_twentyfour_to_fifty_months_info,
            var_providing_extra_complimentary_food_zero_to_6_months_info,
            var_providing_extra_complimentary_food_6_to_24_months_info,
            var_providing_extra_complimentary_food_24_to_50_months_info,
            var_received_multiple_mnr_0_to_6months_info,
            var_received_multiple_mnr_6_to_24months_info,
            var_received_multiple_mnr_24_to_50months_info;

    nutritionDetailController ndController;
    private TextView filtertitle;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public nutritionDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }
        }
        if (getArguments().containsKey(controller_holder_key)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            ndController = (nutritionDetailController) ((controllerHolders)getArguments().getSerializable(controller_holder_key)).getControllersHashMap().get(nutritionDetailControllerKey);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.nutrition_detail, container, false);
        setupviews(rootView);
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        cal.add(Calendar.DATE, -(365*10));
        Date yesterday = cal.getTime();
        refresh(ndController.format.format(yesterday.getTime()),ndController.format.format(today.getTime()));
        return rootView;
    }

    boolean datechanged = true;
    @Override
    public void refresh(String from, String to) {
        try {
            final Date fromdate = ndController.format.parse(from);
            final Date todate = ndController.format.parse(to);

            datechanged = true;
            if(samedate(todate_forFragment,todate)  && samedate(fromdate,fromdate_forFragment)){
                datechanged = false;
            }else{
                fromdate_forFragment = fromdate;
                todate_forFragment = todate;
            }

            filtertitle.setText(from+" to "+to);



            (new AsyncTask(){
                Snackbar snackbar;
                @Override
                protected void onPreExecute() {
                    super.onPreExecute();
                    snackbar = Snackbar.make(getActivity().findViewById(android.R.id.content), "Processing Data Please Wait", Snackbar.LENGTH_INDEFINITE)
                            .setAction("Submit", null)
                            .setActionTextColor(Color.RED);
                    snackbar.show();
                }

                @Override
                protected Object doInBackground(Object[] objects) {
                    if(datechanged) {
                        var_unittotalnumberoflivebirth = ndController.numberofLiveBirth(fromdate, todate);
                        var_unitstotalnumberofdeath = ndController.numberofTotalDeath(fromdate, todate);
                        var_totalnumberoflivebirth = ndController.totalnumberofLiveBirth(fromdate, todate);
                        var_totalnumberofdeath = ndController.overallnumberofTotalDeath(fromdate, todate);


                        var_iron_and_folic_acid_pregnant_woman_info = ndController.iron_and_folic_acid_pregnant_woman_info(fromdate, todate);
                        var_iron_and_folic_acid_mother_info = ndController.iron_and_folic_acid_mother_info(fromdate, todate);
                        var_distributed_iron_and_folic_acid_pregnant_woman_info = ndController.distributed_iron_and_folic_acid_pregnant_woman_info(fromdate, todate);
                        var_distributed_iron_and_folic_acid_mother_info = ndController.distributed_iron_and_folic_acid_mother_info(fromdate, todate);
                        var_counselling_on_breastfeeding_and_complimentary_food_pregnant_woman_info = ndController.counselling_on_breastfeeding_and_complimentary_food_pregnant_woman_info(fromdate, todate);
                        var_counselling_on_breastfeeding_and_complimentary_food_mother_info = ndController.counselling_on_breastfeeding_and_complimentary_food_mother_info(fromdate, todate);
                        var_counselling_on_feeding_mnp_to_children_pregnant_woman_info = ndController.counselling_on_feeding_mnp_to_children_pregnant_woman_info(fromdate, todate);
                        var_counselling_on_feeding_mnp_to_children_mother_info = ndController.counselling_on_feeding_mnp_to_children_mother_info(fromdate, todate);
                        var_feed_colostrum_milk_zero_to_six_month_info = ndController.feed_colostrum_milk_zero_to_six_month_info(fromdate, todate);
                        var_feed_colostrum_milk_six_to_24_month_info = ndController.feed_colostrum_milk_six_to_24_month_info(fromdate, todate);
                        var_feed_colostrum_milk_twentyfour_to_fifty_month_info = ndController.feed_colostrum_milk_twentyfour_to_fifty_month_info(fromdate, todate);
                        var_breastfeeding_up_to_6_months_zero_to_six_months_info = ndController.breastfeeding_up_to_6_months_zero_to_six_months_info(fromdate, todate);
                        var_breastfeeding_up_to_6_months_six_to_twentyfour_months_info = ndController.breastfeeding_up_to_6_months_six_to_twentyfour_months_info(fromdate, todate);
                        var_breastfeeding_up_to_6_months_twentyfour_to_fifty_months_info = ndController.breastfeeding_up_to_6_months_twentyfour_to_fifty_months_info(fromdate, todate);
                        var_providing_extra_complimentary_food_zero_to_6_months_info = ndController.providing_extra_complimentary_food_zero_to_6_months_info(fromdate, todate);
                        var_providing_extra_complimentary_food_6_to_24_months_info = ndController.providing_extra_complimentary_food_6_to_24_months_info(fromdate, todate);
                        var_providing_extra_complimentary_food_24_to_50_months_info = ndController.providing_extra_complimentary_food_24_to_50_months_info(fromdate, todate);
                        var_received_multiple_mnr_0_to_6months_info = ndController.received_multiple_mnr_0_to_6months_info(fromdate, todate);
                        var_received_multiple_mnr_6_to_24months_info = ndController.received_multiple_mnr_6_to_24months_info(fromdate, todate);
                        var_received_multiple_mnr_24_to_50months_info = ndController.received_multiple_mnr_24_to_50months_info(fromdate, todate);

                    }
                    return null;
                }

                @Override
                protected void onPostExecute(Object o) {
                    super.onPostExecute(o);
                    unittotalnumberoflivebirth.setText(var_unittotalnumberoflivebirth);
                    unitstotalnumberofdeath.setText(var_unitstotalnumberofdeath);
                    totalnumberoflivebirth.setText(var_totalnumberoflivebirth);
                    totalnumberofdeath.setText(var_totalnumberofdeath);



                    iron_and_folic_acid_pregnant_woman_info.setText(var_iron_and_folic_acid_pregnant_woman_info);
                    iron_and_folic_acid_mother_info.setText(var_iron_and_folic_acid_mother_info);
                    distributed_iron_and_folic_acid_pregnant_woman_info.setText(var_distributed_iron_and_folic_acid_pregnant_woman_info);
                    distributed_iron_and_folic_acid_mother_info.setText(var_distributed_iron_and_folic_acid_mother_info);
                    counselling_on_breastfeeding_and_complimentary_food_pregnant_woman_info.setText(var_counselling_on_breastfeeding_and_complimentary_food_pregnant_woman_info);
                    counselling_on_breastfeeding_and_complimentary_food_mother_info.setText(var_counselling_on_breastfeeding_and_complimentary_food_mother_info);
                    counselling_on_feeding_mnp_to_children_pregnant_woman_info.setText(var_counselling_on_feeding_mnp_to_children_pregnant_woman_info);
                    counselling_on_feeding_mnp_to_children_mother_info.setText(var_counselling_on_feeding_mnp_to_children_mother_info);
                    feed_colostrum_milk_zero_to_six_month_info.setText(var_feed_colostrum_milk_zero_to_six_month_info);
                    feed_colostrum_milk_six_to_24_month_info.setText(var_feed_colostrum_milk_six_to_24_month_info);
                    feed_colostrum_milk_twentyfour_to_fifty_month_info.setText(var_feed_colostrum_milk_twentyfour_to_fifty_month_info);
                    breastfeeding_up_to_6_months_zero_to_six_months_info.setText(var_breastfeeding_up_to_6_months_zero_to_six_months_info);
                    breastfeeding_up_to_6_months_six_to_twentyfour_months_info.setText(var_breastfeeding_up_to_6_months_six_to_twentyfour_months_info);
                    breastfeeding_up_to_6_months_twentyfour_to_fifty_months_info.setText(var_breastfeeding_up_to_6_months_twentyfour_to_fifty_months_info);
                    providing_extra_complimentary_food_zero_to_6_months_info.setText(var_providing_extra_complimentary_food_zero_to_6_months_info);
                    providing_extra_complimentary_food_6_to_24_months_info.setText(var_providing_extra_complimentary_food_6_to_24_months_info);
                    providing_extra_complimentary_food_24_to_50_months_info.setText(var_providing_extra_complimentary_food_24_to_50_months_info);
                    received_multiple_mnr_0_to_6months_info.setText(var_received_multiple_mnr_0_to_6months_info);
                    received_multiple_mnr_6_to_24months_info.setText(var_received_multiple_mnr_6_to_24months_info);
                    received_multiple_mnr_24_to_50months_info.setText(var_received_multiple_mnr_24_to_50months_info);
                    snackbar.dismiss();
                }
            }).execute();






        }catch (Exception e){}
    }

    private void setupviews(View rootView) {
        unittotalnumberoflivebirth = (TextView)rootView.findViewById(R.id.unit_total_livebirth);
        unitstotalnumberofdeath= (TextView)rootView.findViewById(R.id.unit_total_death);
        totalnumberoflivebirth = (TextView)rootView.findViewById(R.id.total_livebirth);
        totalnumberofdeath= (TextView)rootView.findViewById(R.id.total_death);
        filtertitle = (TextView)rootView.findViewById(R.id.filtertitle);




        iron_and_folic_acid_pregnant_woman_info = (TextView)rootView.findViewById(R.id.iron_and_folic_acid_pregnant_woman_info);
        iron_and_folic_acid_mother_info = (TextView)rootView.findViewById(R.id.iron_and_folic_acid_mother_info);
        distributed_iron_and_folic_acid_pregnant_woman_info = (TextView)rootView.findViewById(R.id.distributed_iron_and_folic_acid_pregnant_woman_info);
        distributed_iron_and_folic_acid_mother_info = (TextView)rootView.findViewById(R.id.distributed_iron_and_folic_acid_mother_info);
        counselling_on_breastfeeding_and_complimentary_food_pregnant_woman_info = (TextView)rootView.findViewById(R.id.counselling_on_breastfeeding_and_complimentary_food_pregnant_woman_info);
        counselling_on_breastfeeding_and_complimentary_food_mother_info = (TextView)rootView.findViewById(R.id.counselling_on_breastfeeding_and_complimentary_food_mother_info);
        counselling_on_feeding_mnp_to_children_pregnant_woman_info = (TextView)rootView.findViewById(R.id.counselling_on_feeding_mnp_to_children_pregnant_woman_info);
        counselling_on_feeding_mnp_to_children_mother_info = (TextView)rootView.findViewById(R.id.counselling_on_feeding_mnp_to_children_mother_info);
        feed_colostrum_milk_zero_to_six_month_info = (TextView)rootView.findViewById(R.id.feed_colostrum_milk_zero_to_six_month_info);
        feed_colostrum_milk_six_to_24_month_info = (TextView)rootView.findViewById(R.id.feed_colostrum_milk_six_to_24_month_info);
        feed_colostrum_milk_twentyfour_to_fifty_month_info = (TextView)rootView.findViewById(R.id.feed_colostrum_milk_twentyfour_to_fifty_month_info);
        breastfeeding_up_to_6_months_zero_to_six_months_info = (TextView)rootView.findViewById(R.id.breastfeeding_up_to_6_months_zero_to_six_months_info);
        breastfeeding_up_to_6_months_six_to_twentyfour_months_info = (TextView)rootView.findViewById(R.id.breastfeeding_up_to_6_months_six_to_twentyfour_months_info);
        breastfeeding_up_to_6_months_twentyfour_to_fifty_months_info = (TextView)rootView.findViewById(R.id.breastfeeding_up_to_6_months_twentyfour_to_fifty_months_info);
        providing_extra_complimentary_food_zero_to_6_months_info = (TextView)rootView.findViewById(R.id.providing_extra_complimentary_food_zero_to_6_months_info);
        providing_extra_complimentary_food_6_to_24_months_info = (TextView)rootView.findViewById(R.id.providing_extra_complimentary_food_6_to_24_months_info);
        providing_extra_complimentary_food_24_to_50_months_info = (TextView)rootView.findViewById(R.id.providing_extra_complimentary_food_24_to_50_months_info);
        received_multiple_mnr_0_to_6months_info = (TextView)rootView.findViewById(R.id.received_multiple_mnr_0_to_6months_info);
        received_multiple_mnr_6_to_24months_info = (TextView)rootView.findViewById(R.id.received_multiple_mnr_6_to_24months_info);
        received_multiple_mnr_24_to_50months_info = (TextView)rootView.findViewById(R.id.received_multiple_mnr_24_to_50months_info);
    }

}
