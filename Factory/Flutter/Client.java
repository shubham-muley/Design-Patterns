package Factory.Flutter;

import Factory.Flutter.Button.*;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.ANDROID);

        UIFactory uiFactory = flutter.createUIFactory();
        Button button = uiFactory.createButton();
        button.reSizeButton();
    }
}
