package practice02.practice02.creational.abstractfabric.gui;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Window createWindow() {
        return new MacOsWindow();
    }

    @Override
    public Menu createMenu() {
        return new MacOsMenu();
    }
}
