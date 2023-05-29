package class26;

import Utils.ConfigReader;

import java.io.IOException;

public class E6ConfigReader {
    public static void main(String[] args) throws IOException {
        System.out.println(ConfigReader.getProperty("password"));

    }
}
