package PrototypeRegistryDP;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationRegistry implements ConfigurationPrototypeRegistry{
    Map<Enum, Configuration> registerMap = new HashMap<>();

    @Override
    public void addPrototype(Configuration user) {
        registerMap.put(user.getType(), user);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        if(type == null) return null;
        return registerMap.get(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        if(type!=null && registerMap.containsKey(type)) return registerMap.get(type).cloneObject();
        return null;
    }
}
