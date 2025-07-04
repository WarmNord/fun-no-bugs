package practice02.practice02.creational.singleton.configurationmanager;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager.getInstanse().printInfo();
        ConfigurationManager.getInstanse().setDataBaseParameters("postgress", "admin", "admin");
        ConfigurationManager.getInstanse().setFolderPath("Files");
        ConfigurationManager.getInstanse().setLog("error", "errorLog.txt");
        System.out.println("______");
        ConfigurationManager.getInstanse().printInfo();


    }
}
