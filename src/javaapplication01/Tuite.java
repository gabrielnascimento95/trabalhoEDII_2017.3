
package javaapplication01;

import java.io.File;


public class Tuite {

    private String userID;
    private String tweetID;
    private String tweet;
    private String date;
    private File arq;
    
    
    public String getUserID() {
        return userID;
    }

    
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the tweetID
     */
    public String getTweetID() {
        return tweetID;
    }

    /**
     * @param tweetID the tweetID to set
     */
    public void setTweetID(String tweetID) {
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
