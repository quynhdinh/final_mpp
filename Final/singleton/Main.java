package Final.singleton;

public class Main {
    public static void main(String[] args) {
        NotificationService.INSTANCE.sendAlert("Emergency in Ward 7");
    }
}
