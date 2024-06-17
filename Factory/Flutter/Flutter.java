package Factory.Flutter;

public class Flutter {
    Enum platform;

    public Flutter(Enum<SupportedPlatforms> supportedPlatforms){
        this.platform = supportedPlatforms;
    }

    public UIFactory createUIFactory(){
        return UiFactoryFactory.getUiFactory(this.platform);
    }


}
