import org.ini4j.Wini;

import java.io.File;

public class CrudHelper implements ICrudHelper {


    public boolean readFromINI(File ini_file) {
        try {
            //File url = new File("F:\\Working Space\\DevelopmentWorkspace\\java_workspace\\java-ini-Ini4j -poc\\src\\main\\resources\\config.ini");
            Wini ini = new Wini(ini_file);
            String name = ini.get(Utils.Section.OWNER.toString(), "name", String.class);
            int age = ini.get(Utils.Section.OWNER.toString(), "age", int.class);
            double height = ini.get(Utils.Section.OWNER.toString(), "height", double.class);
            String server = ini.get("DATABASE", "server");


            System.out.print("Name: " + name + "\n");
            System.out.print("Age: " + age + "\n");
            System.out.print("Geight: " + height + "\n");
            System.out.print("Server IP: " + server + "\n");

            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    public boolean writeIntoINI(File ini_file) {
        try {

            Wini ini = new Wini(ini_file);
            ini.put(Utils.Section.OWNER.toString(), "property_name", "value");
            ini.put("block_name", "property_name_2", 45.6);
            ini.store();

            return true;

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    public boolean removeFromINI(File ini_file) {
        try {

            Wini ini = new Wini(ini_file);
            ini.remove("block_name");
            ini.store();

            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
}
