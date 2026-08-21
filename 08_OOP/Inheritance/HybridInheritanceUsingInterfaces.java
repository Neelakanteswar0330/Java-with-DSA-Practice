class Device {
    public void powerOn() {
        System.out.println("Device powered on");
    }
}

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone extends Device implements Camera, MusicPlayer {
    public void takePhoto() {
        System.out.println("Photo taken");
    }

    public void playMusic() {
        System.out.println("Music playing");
    }
}

public class HybridInheritanceUsingInterfaces {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.powerOn();
        phone.takePhoto();
        phone.playMusic();
    }
}