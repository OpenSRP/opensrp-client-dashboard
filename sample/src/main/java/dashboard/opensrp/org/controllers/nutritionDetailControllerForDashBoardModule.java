package dashboard.opensrp.org.controllers;

import android.database.Cursor;

import java.util.Date;
import java.util.HashMap;

import dashboard.opensrp.org.jandjdashboard.controller.nutritionDetailController;
import dashboard.opensrp.org.jandjdashboard.controller.reproductiveHealthServiceController;

/**
 * Created by raihan on 1/22/18.
 */

public class nutritionDetailControllerForDashBoardModule extends nutritionDetailController {


    @Override
    public String numberofLiveBirth(Date from, Date to) {
        return "10";
    }

    @Override
    public String totalnumberofLiveBirth(Date fromdate, Date todate) {
        return "20";
    }

    @Override
    public String overallnumberofTotalDeath(Date fromdate, Date todate) {
        return "30";
    }

    @Override
    public String numberofTotalDeath(Date from, Date to) {
        return "40";
    }

    @Override
    public String iron_and_folic_acid_pregnant_woman_info(Date fromdate, Date todate) {
        return "10";
    }

    @Override
    public String iron_and_folic_acid_mother_info(Date fromdate, Date todate) {
        return "5";
    }

    @Override
    public String distributed_iron_and_folic_acid_pregnant_woman_info(Date fromdate, Date todate) {
        return "15";
    }

    @Override
    public String distributed_iron_and_folic_acid_mother_info(Date fromdate, Date todate) {
        return "15";
    }

    @Override
    public String counselling_on_breastfeeding_and_complimentary_food_pregnant_woman_info(Date fromdate, Date todate) {
        return "25";
    }

    @Override
    public String counselling_on_breastfeeding_and_complimentary_food_mother_info(Date fromdate, Date todate) {
        return "15";
    }

    @Override
    public String counselling_on_feeding_mnp_to_children_pregnant_woman_info(Date fromdate, Date todate) {
        return "25";
    }

    @Override
    public String counselling_on_feeding_mnp_to_children_mother_info(Date fromdate, Date todate) {
        return "18";
    }

    @Override
    public String feed_colostrum_milk_zero_to_six_month_info(Date fromdate, Date todate) {
        return "20";
    }

    @Override
    public String feed_colostrum_milk_six_to_24_month_info(Date fromdate, Date todate) {
        return "25";
    }

    @Override
    public String feed_colostrum_milk_twentyfour_to_fifty_month_info(Date fromdate, Date todate) {
        return "30";
    }

    @Override
    public String breastfeeding_up_to_6_months_zero_to_six_months_info(Date fromdate, Date todate) {
        return "40";
    }

    @Override
    public String breastfeeding_up_to_6_months_six_to_twentyfour_months_info(Date fromdate, Date todate) {
        return "40";
    }

    @Override
    public String breastfeeding_up_to_6_months_twentyfour_to_fifty_months_info(Date fromdate, Date todate) {
        return "40";
    }

    @Override
    public String providing_extra_complimentary_food_zero_to_6_months_info(Date fromdate, Date todate) {
        return "20";
    }

    @Override
    public String providing_extra_complimentary_food_6_to_24_months_info(Date fromdate, Date todate) {
        return "20";
    }

    @Override
    public String providing_extra_complimentary_food_24_to_50_months_info(Date fromdate, Date todate) {
        return "20";
    }

    @Override
    public String received_multiple_mnr_0_to_6months_info(Date fromdate, Date todate) {
        return "20";
    }

    @Override
    public String received_multiple_mnr_6_to_24months_info(Date fromdate, Date todate) {
        return "10";
    }

    @Override
    public String received_multiple_mnr_24_to_50months_info(Date fromdate, Date todate) {
        return "10";
    }
}
