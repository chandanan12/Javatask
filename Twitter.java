class Twitter 
{
    public static void postTweet(long tweetId) {
    System.out.println("Posting tweet with ID: " + tweetId);
    }
    public static void postTweet(String message, long tweetId) {
   System.out.println("Tweet Message: " + message + "  Tweet ID: " + tweetId);
    }
    public static String postTweet(String reason, String status) {
   System.out.println("Tweet not posted due to: " + reason + "  Status: " + status);
   return reason;
    }
    public static void main(String args[]) {
   postTweet(5566778899l);
   postTweet("Hello Twitter!", 1122334455l);
  postTweet("Network Issue", "Retrying in 5 minutes");
    }
}