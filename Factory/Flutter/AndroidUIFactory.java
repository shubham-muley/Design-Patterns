package Factory.Flutter;

import Factory.Flutter.Button.AndroidButton;
import Factory.Flutter.Button.Button;
import Factory.Flutter.Menu.Menu;
import Factory.Flutter.Title.Title;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        System.out.println("AndroidUIFactory createButton");
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        System.out.println("In Android Create menu");
        return null;
    }

    @Override
    public Title createTitle() {
        System.out.println("In Android Create title");
        return null;
    }
}
