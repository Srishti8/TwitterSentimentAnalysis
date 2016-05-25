import java.util.ArrayList;

/**
 * Created by SJR1 on 25-May-16.
 */
public class MainActivity {

    public static void main(String[] args)
    {
        String topic="DigitalKranti";
        ArrayList<String> tweets = TweetManager.getTweets(topic);
        NLP.Init();
        for (String tweet : tweets)
        {
            System.out.println(tweet + " : " + NLP.findSentiment(tweet));
        }
    }
}
