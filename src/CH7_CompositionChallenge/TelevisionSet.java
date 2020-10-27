package CH7_CompositionChallenge;

public class TelevisionSet {

    private int resolutionWidth;
    private int resolutionHeight;
    private boolean isOn;

    public TelevisionSet(int resolutionWidth, int resolutionHeight) {
        this.resolutionWidth = resolutionWidth;
        this.resolutionHeight = resolutionHeight;
        this.isOn = false;
    }

    public int getResolutionWidth() {
        return resolutionWidth;
    }

    public int getResolutionHeight() {
        return resolutionHeight;
    }

    public boolean isOn() {
        return isOn;
    }

    public void pressOnOffButton(){
        isOn = !isOn;
        String state = isOn ? "on" : "off";
        System.out.println("The TV has been turned " + state);
    }
}
