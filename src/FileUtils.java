import java.io.*;

public class FileUtils {

    public static void writeTextfile(String textContent, String fileName){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(textContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String readTextFile(String fileName){
        StringBuilder fileContent = new StringBuilder();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = reader.readLine())!= null){
                fileContent.append(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileContent.toString();
    }
}

