
package auxiliares;

import java.io.File;


public class Tuite {

    private Integer userID;
    private Integer tweetID;
    private String tweet;
    private String date;
    private File arq;
    
    
    public Integer getUserID() {
        return userID;
    }

    
    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    /**
     * @return the tweetID
     */
    public Integer getTweetID() {
        return tweetID;
    }

    /**
     * @param tweetID the tweetID to set
     */
    public void setTweetID(Integer tweetID) {
        this.tweetID = tweetID;
    }

    /**
     * @return the tweet
     */
    public String getTweet() {
        return tweet;
    }

    /**
     * @param tweet the tweet to set
     */
    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the arq
     */
    public File getArq() {
        return arq;
    }

    /**
     * @param arq the arq to set
     */
    public void setArq(File arq) {
        this.arq = arq;
    }
    
    
            
            
}
