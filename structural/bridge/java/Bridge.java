interface RemoteControl {
    void turnOn();

    void turnOff();

    boolean isOn();
}

class TvRemote implements RemoteControl {
    private boolean isOn;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("TV is turned on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("TV is turned off.");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}

class MusicPlayerRemote implements RemoteControl {
    private boolean isOn;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Music Player is turned on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Music Player is turned off.");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}

abstract class Remote {
    protected RemoteControl rc;

    public Remote(RemoteControl rc) {
        this.rc = rc;
    }

    public abstract void switchPower();
}

class BasicRemote extends Remote {

    public BasicRemote(RemoteControl rc) {
        super(rc);
    }

    @Override
    public void switchPower() {
        if (rc.isOn()) {
            rc.turnOff();
        } else {
            rc.turnOn();
        }
    }
}

public class Bridge {

    public static void main(String[] args) {

        RemoteControl tv = new TvRemote();
        Remote tvRemote = new BasicRemote(tv);

        tvRemote.switchPower();
        tvRemote.switchPower();

        RemoteControl musicPlayer = new MusicPlayerRemote();
        Remote musicPlayerRemote = new BasicRemote(musicPlayer);
        
        musicPlayerRemote.switchPower();
        musicPlayerRemote.switchPower();

    }

}
