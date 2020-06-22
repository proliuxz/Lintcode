package S401TO600;

import java.util.*;

class Restaurant {
      public int id;
      public String name;
      public Location location;
      public static Restaurant create(String name, Location location) {
          return new Restaurant();
      }
  };

  class Helper {
      public static double get_distance(Location location1, Location location2) {
          return 0;
      }
  };
  class GeoHash {
      public static String encode(Location location) {
          return new String();
      }
      public static Location decode(String hashcode) {
          return new Location(0,0);
      }
  }

class RstNode {
    public double distance;
    public Restaurant restaurant;
    public RstNode(double d, Restaurant r) {
        distance = d;
        restaurant = r;
    }
}

public class S509 {
    public NavigableMap<String, Restaurant> restaurants;
    public Map<Integer, String> ids;
    public S509() {
        ids = new HashMap<>();
        restaurants = new TreeMap<>();
    }

    public int addRestaurant(String name, Location location) {
        // Write your code here
        Restaurant restaurant = Restaurant.create(name, location);
        String hashcode = GeoHash.encode(location) + "." + restaurant.id;
        ids.put(restaurant.id, hashcode);
        restaurants.put(hashcode, restaurant);
        return restaurant.id;
    }

    public void removeRestaurant(int restaurant_id) {
        // Write your code here
        if (ids.containsKey(restaurant_id)) {
            String hashcode = ids.get(restaurant_id);
            ids.remove(restaurant_id);
            if (restaurants.containsKey(hashcode)) {
                restaurants.remove(hashcode);
            }
        }
    }

    public List<String> neighbors(Location location, double k) {
        // Write your code here
        int len = get_length(k);
        String hashcode = GeoHash.encode(location);
        hashcode = hashcode.substring(0, len);

        List<RstNode> results = new ArrayList<>();
        for (Map.Entry<String, Restaurant> entry :
                restaurants.subMap(hashcode, true, hashcode + "{", true).entrySet()) {
            String key = entry.getKey();
            Restaurant value = entry.getValue();
            double distance = Helper.get_distance(location, value.location);
            if (distance <= k)
                results.add(new RstNode(distance, value));
        }
        Collections.sort(results, new Comparator<RstNode>(){
            public int compare(RstNode arg0, RstNode arg1) {
                if (arg0.distance < arg1.distance)
                    return -1;
                else if (arg0.distance > arg1.distance)
                    return 1;
                else
                    return 0;
            }
        });
        List<String> rt = new ArrayList<String>();
        int n = results.size();
        for (int i = 0; i < n; ++i)
            rt.add(results.get(i).restaurant.name);
        return rt;
    }


    int get_length(double k) {
        double[] ERROR = {2500, 630, 78, 20, 2.4, 0.61, 0.076, 0.01911, 0.00478, 0.0005971, 0.0001492, 0.0000186};
        for (int i = 0; i < 12; ++i)
            if (k  > ERROR[i])
                return i;
        return 12;
    }
};
