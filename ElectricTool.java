class ElectricTool extends Tool {
    public void plugIn() {
        System.out.println("Electric tool is plugged into power supply.");
    }

    public void operate() {
        System.out.println("Electric tool is operating automatically.");
    }

    public static void main(String[] args) {
        Tool tool = new ElectricTool(); 
        tool.useTool();
        tool.keepTool();

        ElectricTool et = (ElectricTool)tool; 
        et.plugIn();
        et.operate();

        System.out.println(et instanceof ElectricTool);
    }
}