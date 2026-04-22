interface LightAction {
    void execute();
}

public class SmartHome {
    public static void main(String[] args) {

        LightAction motionDetected = () -> System.out.println("Lights ON (Motion detected)");
        LightAction nightMode = () -> System.out.println("Dim Lights (Night mode)");
        LightAction voiceCommand = () -> System.out.println("Lights toggled via voice");

        motionDetected.execute();
        nightMode.execute();
        voiceCommand.execute();
    }
}