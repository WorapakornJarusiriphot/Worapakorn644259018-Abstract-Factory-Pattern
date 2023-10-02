// Concrete Factory
class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

	@Override
	public Menu createMenu() {
		return new MacMenu();
	}
}