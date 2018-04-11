package dashboard.opensrp.org.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashMap;

import dashboard.opensrp.org.controllers.anc_pnc_encc_reminder_StatusControllerForDashBoardModule;
import dashboard.opensrp.org.controllers.contraceptiveSupplyStatusControllerForDashBoardModule;
import dashboard.opensrp.org.controllers.deliveryStatusControllerForDashBoardModule;
import dashboard.opensrp.org.controllers.familyPlanningStatusControllerForDashBoardModule;
import dashboard.opensrp.org.controllers.nutritionDetailControllerForDashBoardModule;
import dashboard.opensrp.org.controllers.reproductiveHealthServiceControllerForDashBoardModule;
import dashboard.opensrp.org.controllers.upcomingScheduleStatusControllerForDashBoardModule;
import dashboard.opensrp.org.jandjdashboard.controller.controllerHolders;
import dashboard.opensrp.org.jandjdashboard.controller.dashboardControllers;
import dashboard.opensrp.org.jandjdashboard.dashboardCategoryListActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, dashboardCategoryListActivity.class);
        i.putExtra("controller_holder", initializeControllersForDashboard());
        startActivity(i);
    }
    private controllerHolders initializeControllersForDashboard() {
        controllerHolders controllerHolder = new controllerHolders();
        upcomingScheduleStatusControllerForDashBoardModule usscontrollerForDashBoardModule = new upcomingScheduleStatusControllerForDashBoardModule();
        familyPlanningStatusControllerForDashBoardModule fpsControllerForDashBoardModule = new familyPlanningStatusControllerForDashBoardModule();
        anc_pnc_encc_reminder_StatusControllerForDashBoardModule ancpnc_encc_rsForDashBoardModule = new anc_pnc_encc_reminder_StatusControllerForDashBoardModule();
        reproductiveHealthServiceControllerForDashBoardModule ReproductiveHealthServiceControllerForDashBoardModule = new reproductiveHealthServiceControllerForDashBoardModule();
        deliveryStatusControllerForDashBoardModule deliveryStatusControllerForDashBoardModule = new deliveryStatusControllerForDashBoardModule();
        nutritionDetailControllerForDashBoardModule nutritionDetailControllerForDashBoardModule = new nutritionDetailControllerForDashBoardModule();
        contraceptiveSupplyStatusControllerForDashBoardModule contraceptiveSupplyStatusControllerForDashBoardModule = new contraceptiveSupplyStatusControllerForDashBoardModule();


        HashMap<String,dashboardControllers> stringdashboardControllersHashMap = new HashMap<String,dashboardControllers>();
        stringdashboardControllersHashMap.put("upcomingScheduleStatusController",usscontrollerForDashBoardModule);
        stringdashboardControllersHashMap.put("reminderVisitStatusController",ancpnc_encc_rsForDashBoardModule);
        stringdashboardControllersHashMap.put("reproductiveHealthServiceController",ReproductiveHealthServiceControllerForDashBoardModule);
        stringdashboardControllersHashMap.put("deliveryStatusController",deliveryStatusControllerForDashBoardModule);
        stringdashboardControllersHashMap.put("nutritionDetailController",nutritionDetailControllerForDashBoardModule);
        stringdashboardControllersHashMap.put("contraceptiveSupplyStatusController",contraceptiveSupplyStatusControllerForDashBoardModule);
        stringdashboardControllersHashMap.put("familyPlanningStatusController",fpsControllerForDashBoardModule);

        controllerHolder.setControllersHashMap(stringdashboardControllersHashMap);
        return controllerHolder;
    }
}
