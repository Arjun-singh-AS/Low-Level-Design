interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}

class TV implements Device {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Turning on the TV.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the TV.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Setting TV volume to " + volume);
    }
}

class Light implements Device {
    private int brightness;

    @Override
    public void turnOn() {
        System.out.println("Turning on the Light.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the Light.");
    }

    @Override
    public void setVolume(int volume) {
        this.brightness = volume;
        System.out.println("Setting Light brightness to " + volume);
    }
}

abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    abstract void powerOn();
    abstract void powerOff();
    abstract void adjustVolume(int volume);
}

class BasicRemoteControl extends RemoteControl {

    public BasicRemoteControl(Device device) {
        super(device);
    }

    @Override
    void powerOn() {
        device.turnOn();
    }

    @Override
    void powerOff() {
        device.turnOff();
    }

    @Override
    void adjustVolume(int volume) {
        device.setVolume(volume);
    }
}

class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    @Override
    void powerOn() {
        device.turnOn();
        System.out.println("Advanced features enabled.");
    }

    @Override
    void powerOff() {
        device.turnOff();
        System.out.println("Advanced features disabled.");
    }

    @Override
    void adjustVolume(int volume) {
        device.setVolume(volume);
        System.out.println("Advanced volume control applied.");
    }
}


public class DeviceRemote {
    
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl basicRemote = new BasicRemoteControl(tv);
        basicRemote.powerOn();
        basicRemote.adjustVolume(10);
        basicRemote.powerOff();

        System.out.println();

        Device light = new Light();
        RemoteControl advancedRemote = new AdvancedRemoteControl(light);
        advancedRemote.powerOn();
        advancedRemote.adjustVolume(5);
        advancedRemote.powerOff();
    }
}
