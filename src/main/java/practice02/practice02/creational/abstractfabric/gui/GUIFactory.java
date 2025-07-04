package practice02.practice02.creational.abstractfabric.gui;


public interface GUIFactory {

    Button createButton();
    Window createWindow();
    Menu createMenu();
}
