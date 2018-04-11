package dashboard.opensrp.org.controllers;


import java.util.Date;

import dashboard.opensrp.org.jandjdashboard.controller.contraceptiveSupplyStatusController;

/**
 * Created by raihan on 1/22/18.
 */

public class contraceptiveSupplyStatusControllerForDashBoardModule extends contraceptiveSupplyStatusController {


    @Override
    public String total_elco_Query(Date from, Date to) {
        return "40";
    }

    @Override
    public String total_new_elco_Query(Date fromdate, Date todate) {
        return "40";
    }

    @Override
    public String total_elco_visited_Query(Date from, Date to) {
        return "40";
    }

    @Override
    public String contraceptive_acceptance_rate_Query(Date from, Date to) {
        return "40";
    }

    @Override
    public String referred_for_contraceptive_side_effects_Query(Date from, Date to) {
        return "40";
    }

    @Override
    public String oralpillshukhiCurrentMonthQuery(Date from, Date to) {
        return "40";
    }

    @Override
    public String oralpillAponCurrentMonthQuery(Date from, Date to) {
        return "40";
    }

    @Override
    public String condomNirapodCurrentMonthQuery(Date from, Date to) {
        return "40";
    }
}
