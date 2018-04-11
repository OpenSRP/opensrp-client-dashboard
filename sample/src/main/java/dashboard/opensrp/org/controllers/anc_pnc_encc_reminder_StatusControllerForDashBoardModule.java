package dashboard.opensrp.org.controllers;

import android.database.Cursor;


import java.util.Date;
import java.util.HashMap;

import dashboard.opensrp.org.jandjdashboard.controller.reminderVisitStatusController;


/**
 * Created by raihan on 1/22/18.
 */

public class anc_pnc_encc_reminder_StatusControllerForDashBoardModule extends reminderVisitStatusController {


    @Override
    public HashMap<String, HashMap<String, String>> ancVisitQuery(Date from, Date to, String riskflag) {
        HashMap<String,HashMap<String,String>> anchashMapHashMap = new HashMap<String, HashMap<String, String>>();

        HashMap<String,String> anc1HashMap = new HashMap<String,String>();
        anc1HashMap.put("Completed","20");
        anc1HashMap.put("Due","25");
        anc1HashMap.put("Post Due","30");
        anc1HashMap.put("Expired","20");
        anchashMapHashMap.put("ANC1",anc1HashMap);

        HashMap<String,String> anc2HashMap = new HashMap<String,String>();
        anc2HashMap.put("Completed","15");
        anc2HashMap.put("Due","20");
        anc2HashMap.put("Post Due","20");
        anc2HashMap.put("Expired","30");
        anchashMapHashMap.put("ANC2",anc2HashMap);

        HashMap<String,String> anc3HashMap = new HashMap<String,String>();
        anc3HashMap.put("Completed","10");
        anc3HashMap.put("Due","15");
        anc3HashMap.put("Post Due","20");
        anc3HashMap.put("Expired","15");
        anchashMapHashMap.put("ANC3",anc3HashMap);

        HashMap<String,String> anc4HashMap = new HashMap<String,String>();
        anc4HashMap.put("Completed","15");
        anc4HashMap.put("Due","20");
        anc4HashMap.put("Post Due","15");
        anc4HashMap.put("Expired","10");
        anchashMapHashMap.put("ANC4",anc4HashMap);

        return anchashMapHashMap;
    }

    @Override
    public HashMap<String, HashMap<String, String>> pncVisitQuery(Date from, Date to, String riskflag) {
        HashMap<String,HashMap<String,String>> pnchashMapHashMap = new HashMap<String, HashMap<String, String>>();

        HashMap<String,String> pnc1HashMap = new HashMap<String,String>();
        pnc1HashMap.put("Completed","10");
        pnc1HashMap.put("Due","20");
        pnc1HashMap.put("Post Due","15");
        pnc1HashMap.put("Expired","10");
        pnchashMapHashMap.put("PNC1",pnc1HashMap);

        HashMap<String,String> pnc2HashMap = new HashMap<String,String>();
        pnc2HashMap.put("Completed","10");
        pnc2HashMap.put("Due","15");
        pnc2HashMap.put("Post Due","25");
        pnc2HashMap.put("Expired","10");
        pnchashMapHashMap.put("PNC2",pnc2HashMap);

        HashMap<String,String> pnc3HashMap = new HashMap<String,String>();
        pnc3HashMap.put("Completed","10");
        pnc3HashMap.put("Due","10");
        pnc3HashMap.put("Post Due","15");
        pnc3HashMap.put("Expired","20");
        pnchashMapHashMap.put("PNC3",pnc3HashMap);



        return pnchashMapHashMap;
    }

    @Override
    public HashMap<String, HashMap<String, String>> neonatalVisitQuery(Date from, Date to, String riskflag) {
        HashMap<String,HashMap<String,String>> encchashMapHashMap = new HashMap<String, HashMap<String, String>>();

        HashMap<String,String> encc1HashMap = new HashMap<String,String>();
        encc1HashMap.put("Completed","10");
        encc1HashMap.put("Due","15");
        encc1HashMap.put("Post Due","20");
        encc1HashMap.put("Expired","10");
        encchashMapHashMap.put("ENCC1",encc1HashMap);

        HashMap<String,String> encc2HashMap = new HashMap<String,String>();
        encc2HashMap.put("Completed","5");
        encc2HashMap.put("Due","10");
        encc2HashMap.put("Post Due","15");
        encc2HashMap.put("Expired","18");
        encchashMapHashMap.put("ENCC2",encc2HashMap);

        HashMap<String,String> encc3HashMap = new HashMap<String,String>();
        encc3HashMap.put("Completed","10");
        encc3HashMap.put("Due","20");
        encc3HashMap.put("Post Due","10");
        encc3HashMap.put("Expired","15");
        encchashMapHashMap.put("ENCC3",encc3HashMap);

        return encchashMapHashMap;
    }
}
