class TikTok 
{
    public static void playVideo(String videoTitle) {
        System.out.println("Playing TikTok video: " + videoTitle);
    }
    public static void playVideo(String creator, int likes) {
        if(creator.equals("Charli D'Amelio") && likes > 1000000) {
            System.out.println("Trending video by " + creator + " with " + likes + " likes!");
        } else {
            System.out.println("Video by " + creator + " has " + likes + " likes.");
        }
    }
    public static boolean playVideo(int durationSec, boolean isAvailable) {
        System.out.println("Video duration: " + durationSec + " seconds Available: " + isAvailable);
        return isAvailable;
    }
    public static void main(String[] args) {
        playVideo("Dance Challenge");
        playVideo("Charli D'Amelio", 1500000);
        playVideo(45, true);
    }
}