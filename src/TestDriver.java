public class TestDriver {
    public static void main(String[] args) {
        Application appWindows = new Application(new WindowsFactory());
        Application appMac = new Application(new MacFactory());

        appWindows.render();
        appMac.render();
    }
}
