package S401TO600;

import java.util.*;

class Tweet {
    public int id;
    public int user_id;
    public String text;

    public static Tweet create(int user_id, String tweet_text) {
        return null;
    }
}

public class S501 {
    private class Friendship {
        public int id;
        public int from_user_id;
        public int to_user_id;
        public Friendship(int id, int from_user_id, int to_user_id) {
            this.id = id;
            this.from_user_id = from_user_id;
            this.to_user_id = to_user_id;
        }
    }

    private class User {
        public int id;
        public User(int id) {
            this.id = id;
        }
    }

    private ArrayList<User> userTable;
    private ArrayList<Friendship> friendshipTable;
    private ArrayList<Tweet> tweetTable;
    private static int friendshipId = 0;



    public S501() {
        userTable = new ArrayList<>();
        friendshipTable = new ArrayList<>();
        tweetTable = new ArrayList<>();
    }


    public Tweet postTweet(int user_id, String tweet_text) {
        // write your code here
        Tweet tweet = Tweet.create(user_id, tweet_text);
        tweetTable.add(0, tweet);
        return tweet;
    }

    public List<Tweet> getNewsFeed(int user_id) {
        // write your code here
        Set<Integer> followings = new HashSet<Integer>();
        for (Friendship f : friendshipTable) {
            if (f.from_user_id == user_id) {
                followings.add(f.to_user_id);
            }
        }

        List<Tweet> ret = new ArrayList<Tweet>();
        for (Tweet t: tweetTable) {
            if (t.user_id == user_id || followings.contains(t.user_id)) {
                ret.add(t);
                if (ret.size() == 10) {
                    break;
                }
            }
        }

        return ret;
    }

    public List<Tweet> getTimeline(int user_id) {
        // write your code here
        List<Tweet> ret = new ArrayList<Tweet>();
        for (Tweet t : tweetTable) {
            if (t.user_id == user_id) {
                ret.add(t);
                if (ret.size() == 10) {
                    break;
                }
            }
        }

        return ret;
    }

    public void follow(int from_user_id, int to_user_id) {
        // write your code here
        for (Friendship f : friendshipTable) {
            if (f.from_user_id == from_user_id && f.to_user_id == to_user_id) {
                return;
            }
        }

        friendshipTable.add(new Friendship(friendshipId++, from_user_id, to_user_id));
    }

    public void unfollow(int from_user_id, int to_user_id) {
        for (int i = 0; i < friendshipTable.size(); i++) {
            Friendship f = friendshipTable.get(i);
            if (f.from_user_id == from_user_id &&
                    f.to_user_id == to_user_id) {
                friendshipTable.remove(i);
                return;
            }
        }
    }
}
