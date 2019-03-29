import java.io.File;

public interface ICrudHelper {
    boolean readFromINI(File ini_file);

    boolean writeIntoINI(File ini_file);

    boolean removeFromINI(File ini_file);
}
