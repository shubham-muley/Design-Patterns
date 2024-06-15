package Builder.Assignment1;

public class DatabaseConfiguration {

    private final String databaseUrl;
    private final String username;
    private final String password;
    private final int maxConnections;
    private final boolean enableCache;
    private final boolean isReadOnly;

    private DatabaseConfiguration(DatabaseConfigurationBuilder databaseConfigurationBuilder) {
        this.databaseUrl = databaseConfigurationBuilder.getDatabaseUrl();
        this.username = databaseConfigurationBuilder.getUsername();
        this.password = databaseConfigurationBuilder.getPassword();
        this.maxConnections = databaseConfigurationBuilder.getMaxConnections();
        this.enableCache = databaseConfigurationBuilder.isEnableCache();
        this.isReadOnly = databaseConfigurationBuilder.isReadOnly();
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public boolean isEnableCache() {
        return enableCache;
    }

    public boolean isReadOnly() {
        return isReadOnly;
    }

    public static DatabaseConfigurationBuilder builder(){
        return new DatabaseConfigurationBuilder();
    }

    @WithBuilder
    public static class DatabaseConfigurationBuilder {
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

}