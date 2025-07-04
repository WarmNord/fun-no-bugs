package practice02.practice02.creational.abstractfabric.gui;

public class WindowsFactory implements  GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new windowsWindow();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
