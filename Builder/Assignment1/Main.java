package Builder.Assignment1;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        DatabaseConfiguration databaseConfiguration = DatabaseConfiguration.builder().setDatabaseUrl("url").setUsername("usernameAbc").setPassword("12345678").setReadOnly(true).build();
        System.out.println(databaseConfiguration.getUsername());
    }
}
