class  Zoom
{
    public static void startMeeting(long meetingId) {
   System.out.println("Starting Zoom meeting with ID: " + meetingId);
    }
    public static void startMeeting(String topic, long meetingId) {
        System.out.println("Topic: " + topic + "  Meeting ID: " + meetingId);
    }
    public static String startMeeting(String reason, String status) {
        System.out.println("Meeting paused due to: " + reason + "  Current status: " + status);
        return reason;
    }
    public static void main(String args[]) {
        startMeeting(1234567890l);
        startMeeting("Project Discussion", 9876543210l);
        startMeeting("Network Issue", "Waiting for reconnect");
    }
}