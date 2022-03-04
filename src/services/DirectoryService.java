package Virtualkeyscreens;
import java.io.File;
import Virtualkey.CreateDirectory;
public class DirectoryService {
    private static CreateDirectory fileDirectory = new CreateDirectory();
    
    public static void PrintFiles() {
    	
    	fileDirectory.getFiles();

        for (File file : DirectoryService.getFileDirectory().getFiles())
        {
            System.out.println(file.getName());
        }
    }
    public static CreateDirectory getFileDirectory() {
        return fileDirectory;
    }

    public static void setFileDirectory(CreateDirectory fileDirectory) {
        DirectoryService.fileDirectory = fileDirectory;
    }

}
