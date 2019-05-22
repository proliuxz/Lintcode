package S401TO600;

import java.util.*;

public class S560 {
    Map<Integer, Set<Integer>> followers;
    Map<Integer, Set<Integer>> followings;
    public S560() {
        followers = new HashMap<>();
        followings = new HashMap<>();
    }

    public List<Integer> getFollowers(int user_id) {
        if (!followers.containsKey(user_id))
            return new ArrayList<>();
        return new ArrayList<>(followers.get(user_id));
    }

    public List<Integer> getFollowings(int user_id) {
        if (!followings.containsKey(user_id))
            return new ArrayList<>();
        return new ArrayList<>(followings.get(user_id));
    }

    public void follow(int to_user_id, int from_user_id) {
        if (!followers.containsKey(to_user_id))
            followers.put(to_user_id, new TreeSet<>());
        followers.get(to_user_id).add(from_user_id);
        if (!followings.containsKey(from_user_id))
            followings.put(from_user_id, new TreeSet<>());
        followings.get(from_user_id).add(to_user_id);
    }

    public void unfollow(int to_user_id, int from_user_id) {
        if (followers.containsKey(to_user_id))
            followers.get(to_user_id).remove(from_user_id);
        if (followings.containsKey(from_user_id))
            followings.get(from_user_id).remove(to_user_id);
    }

    public static void main(String[] args)
    {
        S560 s = new S560();

        s.follow(1, 3);
        s.getFollowers(1);
        s.getFollowings(3);
        s.follow(2, 3);
        s.getFollowings(3);
        s.unfollow(1, 3);
        s.getFollowings(3);
    }
}
