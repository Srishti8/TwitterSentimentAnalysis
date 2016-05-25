import twitter4j.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SJR1 on 24-May-16.
 */
public class TweetManager {

    public static ArrayList<String> getTweets(String topic)
    {
        Twitter twitter = new TwitterFactory().getInstance();
        ArrayList<String> tweetList = new ArrayList<String>();
        try
        {
            Query query = new Query(topic);
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for(Status tweet : tweets)
                    tweetList.add(tweet.getText());
            }
            while((query = result.nextQuery())!=null);
        }
        catch(TwitterException te)
        {
            te.printStackTrace();
        }
        return tweetList;
    }
}
