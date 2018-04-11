package dashboard.opensrp.org.controllers;

import android.database.Cursor;

import java.util.Date;
import java.util.HashMap;

import dashboard.opensrp.org.jandjdashboard.controller.reproductiveHealthServiceController;
import dashboard.opensrp.org.jandjdashboard.controller.upcomingScheduleStatusController;

/**
 * Created by raihan on 1/22/18.
 */

public class reproductiveHealthServiceControllerForDashBoardModule extends reproductiveHealthServiceController {

    @Override
    public String ecpReceptors(Date from, Date to) {
        return "10";
    }

    @Override
    public HashMap<String, String> ttquery(Date from, Date to) {
        HashMap<String,String> ttdoses = new HashMap<String, String>();
        ttdoses.put("tt1given", "10");
        ttdoses.put("tt2given", "20");
        ttdoses.put("tt3given", "10");
        ttdoses.put("tt4given", "15");
        ttdoses.put("tt5given", "25");
        return ttdoses;
    }

    @Override
    public HashMap<String, String> ancVisitQuery(Date from, Date to) {
        HashMap<String,String> ancVisits = new HashMap<String, String>();
        ancVisits.put("anc1visit", "10");
        ancVisits.put("anc2visit", "20");
        ancVisits.put("anc3visit", "30");
        ancVisits.put("anc4visit", "5");

        return ancVisits;
    }

    @Override
    public HashMap<String, String> pncVisitQuery(Date from, Date to) {
        HashMap<String,String> pncVisits = new HashMap<String, String>();
        pncVisits.put("pnc1visit", "10");
        pncVisits.put("pnc2visit", "4");
        pncVisits.put("pnc3visit", "3");
        return pncVisits;
    }

    @Override
    public HashMap<String, String> neonatalVisitQuery(Date from, Date to) {
        HashMap<String,String> enncVisits = new HashMap<String, String>();
        enncVisits.put("encc1visit", "10");
        enncVisits.put("encc2visit", "4");
        enncVisits.put("encc3visit", "3");
        return enncVisits;
    }
}
