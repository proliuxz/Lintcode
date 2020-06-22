package S401TO600;

import Util.Helper;
import Util.Trip;

import java.util.HashMap;
import java.util.Map;

class Location {
    public double lat, lng;
    public Location(double _lat, double _lng) {
        lat = _lat;
        lng = _lng;
    }
}

public class S525 {
    Map<Integer, Trip> trips;
    Map<Integer, Location> locations;
    public S525() {
        // initialize your data structure here.
        trips = new HashMap<>();
        locations = new HashMap<>();
    }

    // @param driver_id an integer
    // @param lat, lng driver's location
    // return matched trip information if there have matched rider or null
    public Trip report(int driver_id, double lat, double lng) {
        // Write your code here
        if (trips.containsKey(driver_id))
            return trips.get(driver_id);

        if (locations.containsKey(driver_id)) {
            Location location = locations.get(driver_id);
            location.lat = lat;
            location.lng = lng;
        } else
            locations.put(driver_id, new Location(lat, lng));

        return null;
    }

    // @param rider_id an integer
    // @param lat, lng rider's location
    // return a trip
    public Trip request(int rider_id, double lat, double lng) {
        // Write your code here
        Trip trip = new Trip(rider_id, lat, lng);
        double distance = -1;
        int driver_id = -1;
        for (Map.Entry<Integer, Location> entry : locations.entrySet()) {
            Location location = entry.getValue();
            double dis = Helper.get_distance(location.lat, location.lng, lat, lng);
            if (distance < 0 || distance > dis) {
                driver_id = entry.getKey();
                distance = dis;
            }
        }

        if (driver_id != -1)
            locations.remove(driver_id);
        trip.driver_id = driver_id;
        trips.put(driver_id, trip);
        return trip;
    }
}
