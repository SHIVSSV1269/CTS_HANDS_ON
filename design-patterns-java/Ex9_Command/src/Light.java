// Light.java - Receiver class
public class Light {
    private String location;
    private boolean isOn = false;

    public Light(String location) {
        this.location = location;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(location + " Light: ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(location + " Light: OFF");
    }

    public boolean isOn() { return isOn; }
}
