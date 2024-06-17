package Builder.Assignment1;

@WithBuilder
public class DatabaseConfigurationBuilder {
    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;

    private String getDatabaseUrl() {
        return databaseUrl;
    }

    public DatabaseConfigurationBuilder setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
        return this;
    }

    private String getUsername() {
        return username;
    }

    public DatabaseConfigurationBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    private String getPassword() {
        return password;
    }

    public DatabaseConfigurationBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    private int getMaxConnections() {
        return maxConnections;
    }

    public DatabaseConfigurationBuilder setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }

    private boolean isEnableCache() {
        return enableCache;
    }

    public DatabaseConfigurationBuilder setEnableCache(boolean enableCache) {
        this.enableCache = enableCache;
        return this;
    }

    private boolean isReadOnly() {
        return isReadOnly;
    }

    public DatabaseConfigurationBuilder setReadOnly(boolean readOnly) {
        isReadOnly = readOnly;
        return this;
    }

    public DatabaseConfiguration build() {
        return new DatabaseConfiguration(this);
    }

}
