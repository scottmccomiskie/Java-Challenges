import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DroneMissionStatus {


    /*
     Scenario:
     A drone operations dashboard receives mission statuses.
     Count each valid status so the team can see the current
     state of its drone fleet.
    */

    public static Map<String, Integer> countMissionStatuses(List<String> statuses) {

        HashMap <String, Integer> count = new HashMap<>();

        //1 check for null list
        if(statuses == null || statuses.isEmpty()){
            return count;
        }

        for(String status : statuses) {

            if(status == null) {
                continue;
            }

            String cleanData = status.trim().toUpperCase();

            if(!cleanData.equals("READY") && !cleanData.equals("MAINTENANCE") && !cleanData.equals("LANDED") && !cleanData.equals("IN_FLIGHT")){
                continue;
            }

            int current = count.getOrDefault(cleanData, 0) + 1;
            count.put(cleanData, current);
        }




        return count;
    }

    public static void main(String[] args) {

        List<String> statuses = Arrays.asList(
                "ready",
                " IN_FLIGHT ",
                "ready",
                null,
                "unknown",
                "landed",
                "MAINTENANCE",
                "ready"
        );

        System.out.println(countMissionStatuses(statuses));

        // Expected:
        // {READY=3, MAINTENANCE=1 LANDED=1, IN_FLIGHT=1}
    }
}