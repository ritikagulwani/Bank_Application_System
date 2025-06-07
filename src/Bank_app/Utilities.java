package Bank_app;

import java.io.*;
import java.util.*;

public class Utilities {
    public static class csv {
        public static List<String[]> read(String file) {
            List<String[]> data = new ArrayList<>();
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    data.add(values);
                }
                br.close();
            } catch (IOException e) {
                System.out.println("Error reading CSV file: " + e.getMessage());
            }
            return data;
        }
    }
}
