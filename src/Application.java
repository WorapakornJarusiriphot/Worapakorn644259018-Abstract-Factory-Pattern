// Client
public class Application {
    private GUIFactory factory;
    private Button button;
    private Menu Menu;

    public Application(GUIFactory factory) {
        this.factory = factory;
        this.button = factory.createButton();
        this.Menu = factory.createMenu();
    }

    public void render() {
        button.render();
        Menu.render();
    }
}