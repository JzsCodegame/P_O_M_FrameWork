package framework.config;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public final class SignupDataConfig {

    private static final String DEFAULT_CONFIG_PATH = "src/test/resources/config/framework-data.csv";
    private static final String SHEET_NAME = "signup_data";

    private static final Map<String, String> DATA = load();

    private SignupDataConfig() {
    }

    private static Map<String, String> load() {
        String configuredPath = System.getProperty("framework.config.path", DEFAULT_CONFIG_PATH);
        Path configPath = Paths.get(configuredPath);
        try {
            if (configuredPath.toLowerCase().endsWith(".xlsx")) {
                return ExcelKeyValueConfigReader.read(configPath, SHEET_NAME);
            }
            return CsvKeyValueConfigReader.read(configPath);
        } catch (IOException e) {
            throw new IllegalStateException("Unable to load framework config from: " + configPath, e);
        }
    }

    public static String get(String key) {
        String value = DATA.get(key);
        if (value == null) {
            throw new IllegalArgumentException("Missing key in Excel config: " + key);
        }
        return value;
    }
}
