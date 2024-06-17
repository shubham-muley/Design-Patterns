package Factory.Flutter;

public class UiFactoryFactory{
    UIFactory uiFactory;
    public static UIFactory getUiFactory(Enum<SupportedPlatforms> platform){
        if(platform == SupportedPlatforms.IOS){
            return new IosUIFactory();
        }else if(platform == SupportedPlatforms.ANDROID){
            return new AndroidUIFactory();
        }
        return null;
    }
}
