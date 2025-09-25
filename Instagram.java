class Instagram 
{
    public static void postReel(String reelName, int numberOfShares) {
        System.out.println("Reel Name: " + reelName + "  Total Shares: " + numberOfShares);

        if(reelName.equals("Dance")) {
            System.out.println("Trending Category: " + reelName);
        }
        if(reelName.equals("Comedy") || numberOfShares >= 100) {
            System.out.println("This Reel '" + reelName + "' has gone viral with " + numberOfShares + " shares!");
        } else if(reelName.equals("Travel")) {
            System.out.println("Exploring reels under: " + reelName);
        }
    }
    public static void postReel(int likes, String filterUsed) {
        System.out.println("Filter Used: " + filterUsed + " | Likes: " + likes);
    }
    public static int postReel(boolean isSaved, String platform) {
        System.out.println("Reel Saved? " + isSaved + "  Platforms available to share: " + platform);
        return 1; 
    }
    public static void main(String[] args) {
        postReel("Comedy", 120);
        postReel(4500, "Vintage");
        int result = postReel(true, "WhatsApp, Facebook");
        System.out.println("Return Value: " + result);
    }
}