import java.io.File;


public class Application {

    String filePath = "F:\\Working Space\\DevelopmentWorkspace\\java_workspace\\java-ini-Ini4j -poc\\config.ini";

    public Application() {

        //ClassLoader classLoader = getClass().getClassLoader();
        //InputStream INI_FILE = classLoader.getResourceAsStream("config.ini");   // ini filename
        File ini_file = new File(filePath);


        CrudHelper crudHelper = new CrudHelper();
        crudHelper.readFromINI(ini_file);           // read

        System.out.println("-----------------------------");
        crudHelper.writeIntoINI(ini_file);          // write
        crudHelper.readFromINI(ini_file);           // read

        crudHelper.removeFromINI(ini_file);         // remove
    }


    public static void main(String[] args) {
        new Application();
    }
}
