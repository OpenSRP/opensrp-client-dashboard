package dashboard.opensrp.org.controllers;

import android.database.Cursor;

import java.util.Calendar;
import java.util.Date;

import dashboard.opensrp.org.jandjdashboard.controller.familyPlanningStatusController;
import dashboard.opensrp.org.jandjdashboard.controller.nutritionDetailController;

/**
 * Created by raihan on 1/22/18.
 */

public class familyPlanningStatusControllerForDashBoardModule extends familyPlanningStatusController {

    @Override
    public String total_elco_Query(Date from, Date to) {
        return "20";
    }

    @Override
    public String total_new_elco_Query(Date fromdate, Date todate) {
        return "20";
    }

    @Override
    public String total_elco_visited_Query(Date from, Date to) {
        return "20";
    }

    @Override
    public String contraceptive_acceptance_rate_Query(Date from, Date to) {
        return "30";
    }

    @Override
    public String referred_for_contraceptive_side_effects_Query(Date from, Date to) {
        return "30";
    }

    @Override
    public String pill_old_Query(Date from, Date to) {
        return "30";
    }

    @Override
    public String pill_new_Query(Date from, Date to) {
        return "30";
    }

    @Override
    public String pill_unit_totalQuery(Date from, Date to) {
        return "60";
    }

    @Override
    public String pill_not_using_any_methodQuery(Date from, Date to) {
        return "60";
    }

    @Override
    public String pill_using_other_methodQuery(Date from, Date to) {
        return "60";
    }

    @Override
    public String pill_referred_for_methodQuery(Date from, Date to) {
        return "60";
    }

    @Override
    public String pill_referred_for_side_effectsQuery(Date from, Date to) {
        return "90";
    }

    @Override
    public String condom_old_Query(Date from, Date to) {
        return "90";
    }

    @Override
    public String condom_new_Query(Date from, Date to) {
        return "90";
    }

    @Override
    public String condom_unit_totalQuery(Date from, Date to) {
        return "90";
    }

    @Override
    public String condom_not_using_any_methodQuery(Date from, Date to) {
        return "45";
    }

    @Override
    public String condom_using_other_methodQuery(Date from, Date to) {
        return "45";
    }

    @Override
    public String condom_referred_for_methodQuery(Date from, Date to) {
        return "45";
    }

    @Override
    public String condom_referred_for_side_effectsQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String injectable_old_Query(Date from, Date to) {
        return "10";
    }

    @Override
    public String injectable_new_Query(Date from, Date to) {
        return "10";
    }

    @Override
    public String injectable_unit_totalQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String injectable_not_using_any_methodQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String injectable_using_other_methodQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String injectable_referred_for_methodQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String injectable_referred_for_side_effectsQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String iud_old_Query(Date from, Date to) {
        return "10";
    }

    @Override
    public String iud_new_Query(Date from, Date to) {
        return "10";
    }

    @Override
    public String iud_unit_totalQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String iud_not_using_any_methodQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String iud_using_other_methodQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String iud_referred_for_methodQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String iud_referred_for_side_effectsQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String implant_old_Query(Date from, Date to) {
        return "10";
    }

    @Override
    public String implant_new_Query(Date from, Date to) {
        return "10";
    }

    @Override
    public String implant_unit_totalQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String implant_not_using_any_methodQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String implant_using_other_methodQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String implant_referred_for_methodQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String implant_referred_for_side_effectsQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String pm_male_old_Query(Date from, Date to) {
        return "10";
    }

    @Override
    public String pm_male_new_Query(Date from, Date to) {
        return "10";
    }

    @Override
    public String pm_male_unit_totalQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String pm_male_not_using_any_methodQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String pm_male_using_other_methodQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String pm_male_referred_for_methodQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String pm_male_referred_for_side_effectsQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String pm_female_old_Query(Date from, Date to) {
        return "10";
    }

    @Override
    public String pm_female_new_Query(Date from, Date to) {
        return "10";
    }

    @Override
    public String pm_female_unit_totalQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String pm_female_not_using_any_methodQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String pm_female_using_other_methodQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String pm_female_referred_for_methodQuery(Date from, Date to) {
        return "10";
    }

    @Override
    public String pm_female_referred_for_side_effectsQuery(Date from, Date to) {
        return "10";
    }
}