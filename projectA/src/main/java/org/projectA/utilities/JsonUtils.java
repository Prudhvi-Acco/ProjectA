package org.projectA.utilities;

import lombok.NoArgsConstructor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

@NoArgsConstructor
public class JsonUtils {
    public void updateJsonPayload(String payloadPath, Map<String, String> data) {
        try {
            Set<String> keys = data.keySet();

            File file = new File(payloadPath);

            String stringJson = "";
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) stringJson += sc.nextLine();

            String result = stringJson;
            for (String key : keys)
                result = result.replace("$" + key, data.get(key));

            //Update your values in the JSON object...
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(payloadPath));
            bufferedWriter.write(result);
            bufferedWriter.close();
        } catch (IOException ioException) {
            throw new RuntimeException(ioException);
        }
    }

    public static void main(String[] args) {
        new JsonUtils().updateJsonPayload("C:\\Users\\Prudhvi\\IdeaProjects\\projectA\\src\\main\\java\\org\\projectA\\testData\\payload\\LoginPayload_POST.json", Map.of("name", "prudhvi", "state", "Andhra Pradesh"));
    }
}
