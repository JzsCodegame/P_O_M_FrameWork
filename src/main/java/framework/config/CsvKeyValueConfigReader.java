package framework.config;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class CsvKeyValueConfigReader {

    private CsvKeyValueConfigReader() {
    }

    public static Map<String, String> read(Path csvPath) throws IOException {
        List<String> lines = Files.readAllLines(csvPath, StandardCharsets.UTF_8);
        Map<String, String> data = new LinkedHashMap<>();
        for (int index = 1; index < lines.size(); index++) {
            String line = lines.get(index).trim();
            if (line.isEmpty()) {
                continue;
            }

            String[] parts = line.split(",", 2);
            if (parts.length < 2) {
                continue;
            }

            String key = parts[0].trim();
            String value = parts[1].trim();
            if (!key.isEmpty()) {
                data.put(key, value);
            }
        }
        return Collections.unmodifiableMap(data);
    }
}
