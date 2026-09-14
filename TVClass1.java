class TV {
    public boolean isOn;
    public int channel;
    public int volume;
    
    public TV() {
        isOn = false; 
        channel = 1; 
        volume = 1; 
    }
    
    public void turnOn() {
        isOn = true;
    }
    
    public void turnOff() {
        isOn = false;
    }
    
    public void setChannel(int newChannel) {
        if (isOn && newChannel >= 1 && newChannel <= 100) {
            channel = newChannel;
        }
    }
    
    public void setVolume(int newVolume) {
        if (isOn && newVolume >= 1 && newVolume <= 10) {
            volume = newVolume;
        }
    }
    
    public void showDetails(String tvName) {
        if (isOn) {
            System.out.println(tvName + " - Channel: " + channel + ", Volume: " + volume);
        } else {
            System.out.println(tvName + " is turned off.");
        }
    }
}

public class TVClass1 {
    public static void main(String[] args) {
        TV TV1 = new TV();
        TV TV2 = new TV();
        
        TV1.turnOn();
        TV1.setChannel(40);
        TV1.setVolume(5);
        
        System.out.println("TV Details:");
        TV1.showDetails("TV1");
        TV2.showDetails("TV2");
    }
}