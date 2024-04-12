package org.projectA.utilities;

import lombok.NoArgsConstructor;
import org.apache.commons.io.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

@NoArgsConstructor
public final class JsonUtils {
    public static void updateJsonPayload(String payloadPath, Map<String, String> data) {
        try {
            Set<String> keys = data.keySet();

            File file = new File(payloadPath);

            String stringJson = FileUtils.readFileToString(file, StandardCharsets.UTF_8);

            for (String key : keys)
                stringJson = stringJson.replace("@" + key, data.get(key));

            //Update your values in the JSON object...+
            FileUtils.write(file, stringJson, StandardCharsets.UTF_8, false);
        } catch (IOException ioException) {
            throw new RuntimeException(ioException);
        }
    }
}
