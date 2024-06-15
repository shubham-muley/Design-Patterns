package Singleton.Assignment1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    static FileBasedConfigurationManagerImpl fileBasedConfigurationManagerImpl;
    private FileBasedConfigurationManagerImpl(){}
    private static Lock lock = new ReentrantLock();

    @Override
    public String getConfiguration(String key) {
        return properties.getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        return convert(key,type);
    }

    @Override
    public void setConfiguration(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        properties.setProperty(key,value.toString());
    }

    @Override
    public void removeConfiguration(String key) {
        properties.remove(key);
    }

    @Override
    public void clear() {
        properties.clear();
    }

    public static FileBasedConfigurationManager getInstance() {
        if(fileBasedConfigurationManagerImpl==null){
            lock.lock();
            if(fileBasedConfigurationManagerImpl==null){
                fileBasedConfigurationManagerImpl = new FileBasedConfigurationManagerImpl();
            }
            lock.unlock();
        }
        return fileBasedConfigurationManagerImpl;
    }

    public static void resetInstance() {
        if(fileBasedConfigurationManagerImpl!=null){
            lock.lock();
            if(fileBasedConfigurationManagerImpl!=null){
                fileBasedConfigurationManagerImpl = null;
            }
            lock.unlock();
        }
    }

}