package dashboard.opensrp.org.controllers;

import android.database.Cursor;
import java.text.SimpleDateFormat;
import java.util.Date;

import dashboard.opensrp.org.jandjdashboard.controller.upcomingScheduleStatusController;

/**
 * Created by raihan on 1/22/18.
 */

public class upcomingScheduleStatusControllerForDashBoardModule extends upcomingScheduleStatusController {

    @Override
    public String houseHoldVisitQuery(Date from, Date to) {
        return "300";
    }

    @Override
    public String elcoVisitQuery(Date from, Date to) {
        return "200";
    }

    @Override
    public String eddQuery(Date from, Date to) {
        return "100";
    }

    @Override
    public String ancVisitQuery(Date from, Date to) {
        return "40";
    }

    @Override
    public String pncVisitQuery(Date from, Date to) {
        return "50";
    }

    @Override
    public String neonatalVisitQuery(Date from, Date to) {
        return "50";
    }
}
