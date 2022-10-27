package develhope;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author Drumstyle92
 * class that contains the whole program.
 */
public class Test {
    /**
     * @param args main parameter.
     * method that contains the creation of a file,
     * its writing and shows the user whether to rewrite the file or create a new one.
     */
    public static void main(String[] args) {
        // try catch block for control
        try{
            Scanner scanner = new Scanner(System.in);
            // the user creates the file
            System.out.println("File creation: ");
            String path = scanner.nextLine();
            File newFile = new File(path);
            boolean createFile = newFile.createNewFile();
            // the program warns you if the file is overwritten or new
            if(createFile){
                System.out.println("-The file is new.-");
            }else{
                System.out.println("-the file was overwritten-");
            }
            // creation of the date
            LocalDateTime data = LocalDateTime.now();
            DateTimeFormatter dataTrue = DateTimeFormatter.ofPattern("eeee-MM-yyyy HH:mm:ss");
            // inserting the date into the file
            FileWriter file;
            file = new FileWriter(path);
            file.write(data.format(dataTrue));
            file.close();

    }catch(IOException e){

            System.out.println(" Error in the process ");
        }

        System.out.println("------------------End-------------------");
    }
}
