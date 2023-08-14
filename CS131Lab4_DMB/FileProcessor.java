import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileProcessor {

    private String fileName;
    private int stringLength;
    private ArrayList<String> stringList;
    private Scanner input;

    public FileProcessor(String fileName, int stringLength) {
        this.fileName = fileName;
        if (stringLength < 5) {
            this.stringLength = 5;
        } else {
            this.stringLength = stringLength;
        }
        stringList = new ArrayList<>();
    }

    public int getArrayListSize() {
        return stringList.size();
    }

    public void processFile() {
        try {
            input = new Scanner(new File(fileName));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                if (line.length() > stringLength) {
                    throw new StringTooLongException();
                }
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (StringTooLongException e) {
            System.out.println(e.getMessage());
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
    
