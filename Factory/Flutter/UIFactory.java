package Factory.Flutter;

import Factory.Flutter.Button.Button;
import Factory.Flutter.Menu.Menu;
import Factory.Flutter.Title.Title;

import java.awt.*;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
    public Title createTitle();
}
