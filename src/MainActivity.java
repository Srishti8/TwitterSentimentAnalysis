import java.util.ArrayList;

/**
 * Created by SJR1 on 25-May-16.
 */
public class MainActivity {

    public static void main(String[] args)
    {
        String topic="NaMo";
        ArrayList<String> tweets = TweetManager.getTweets(topic);
        NLP.Init();
        int sentimentCount1 = 0,sentimentCount2=0,sentimentCount3=0;
        for (String tweet : tweets)
        {
            System.out.println(tweet + " : " + NLP.findSentiment(tweet));
            if(NLP.findSentiment(tweet) == 1)
                sentimentCount1++;
            else if(NLP.findSentiment(tweet) == 2 )
                sentimentCount2++;
            else if(NLP.findSentiment(tweet) == 3)
                sentimentCount3++;
        }

        System.out.println("Tweets with score 1 : " + sentimentCount1);
        System.out.println("Tweets with score 2 : " + sentimentCount2);
        System.out.println("Tweets with score 3 : " + sentimentCount3);
    }
}
