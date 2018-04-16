package dashboard.opensrp.org.controllers;

import android.database.Cursor;


import java.util.Date;
import java.util.HashMap;

import dashboard.opensrp.org.jandjdashboard.controller.deliveryStatusController;

/**
 * Created by raihan on 1/22/18.
 */

public class deliveryStatusControllerForDashBoardModule extends deliveryStatusController {


    @Override
    public String numberofLiveBirth(Date from, Date to) {
        return "10";
    }

    @Override
    public String numberofNewBornswithLowBirthWeight(Date from, Date to) {
        return "20";
    }

    @Override
    public String numberofImmatureBirth(Date from, Date to) {
        return "20";
    }

    @Override
    public String numberofStillBirth(Date from, Date to) {
        return "10";
    }

    @Override
    public String numberofDeathUnder7Days(Date from, Date to) {
        return "10";
    }

    @Override
    public String numberofDeathBetween8to28Days(Date from, Date to) {
        return "30";
    }

    @Override
    public String numberofDeathBetween29daysto1year(Date from, Date to) {
        return "30";
    }

    @Override
    public String numberofTotalDeath(Date from, Date to) {
        return "40";
    }

    @Override
    public String numberofChildDeathBetween1to5year(Date from, Date to) {
        return "40";
    }

    @Override
    public String numberofMotherDeath(Date from, Date to) {
        return "40";
    }

    @Override
    public String numberofOtherDeath(Date from, Date to) {
        return "40";
    }

    @Override
    public String totalnumberofLiveBirth(Date fromdate, Date todate) {
        return "40";
    }

    @Override
    public String overallnumberofTotalDeath(Date fromdate, Date todate) {
        return "40";
    }
}
