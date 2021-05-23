package trywithresources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class TryWithResourcesExample {

    private static final String FILE_PATH = "samplefile.txt";

    public void readFile(File file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        }
    }

    public void legacyReadFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        try {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } finally {
            br.close();
        }
    }

    private File getFileFromResource(String fileName) throws URISyntaxException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        return new File(resource.toURI());
    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        TryWithResourcesExample example = new TryWithResourcesExample();
        File file = example.getFileFromResource(FILE_PATH);

        example.readFile(file);
        example.legacyReadFile(file);
    }

}
