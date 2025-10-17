class SmartAssistant extends ChatBot {
    public void controlDevices() {
        System.out.println("Smart Assistant is controlling devices...");
    }

    public static void main(String[] args) {
        AI a = new AI();
        a.learn();

        ChatBot c = new ChatBot();
        c.learn();
        c.reply();

        SmartAssistant s = new SmartAssistant();
        s.learn();
        s.reply();
        s.controlDevices();

        ChatBot ref = s;
        ref.reply();
        ref.learn();
    }
}