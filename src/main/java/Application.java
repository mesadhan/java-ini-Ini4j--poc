import org.ini4j.Wini;

import java.io.InputStream;

public class Application {

    private ClassLoader classLoader = getClass().getClassLoader();
    private InputStream url = classLoader.getResourceAsStream("config.ini");

    enum Section {
        OWNER,
        DATABASE,
    }

    public Application() {
        try {

            //File url = new File("F:\\Working Space\\DevelopmentWorkspace\\java_workspace\\java-ini-Ini4j -poc\\src\\main\\resources\\config.ini");
            Wini ini = new Wini(url);


            String name = ini.get(Section.OWNER.toString(), "name", String.class);
            int age = ini.get(Section.OWNER.toString(), "age", int.class);
            double height = ini.get(Section.OWNER.toString(), "height", double.class);
            String server = ini.get("DATABASE", "server");


            System.out.print("Name: " + name + "\n");
            System.out.print("Age: " + age + "\n");
            System.out.print("Geight: " + height + "\n");
            System.out.print("Server IP: " + server + "\n");

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Application();
    }
}
