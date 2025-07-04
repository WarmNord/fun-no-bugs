package practice02.practice02.creational.singleton.configurationmanager;

/*
* Реализовать Singleton для управления конфигурацией приложения
Описание
В приложении необходимо создать класс ConfigurationManager, который будет управлять настройками приложения, такими как:
-Параметры подключения к базе данных (например, URL базы данных, имя пользователя, пароль).
-Путь к папке для хранения файлов.
-Настройки логирования (например, уровень логирования, путь к лог-файлу).
Класс ConfigurationManager должен быть реализован по паттерну Singleton, чтобы в приложении был только один экземпляр этого класса, который будет предоставлять доступ к конфигурационным данным.
* */
public class ConfigurationManager {
    private static ConfigurationManager configurationManager;

    //Параметры подключения к базе данных (например, URL базы данных, имя пользователя, пароль).
    private String urlDatabase = "some url";
    private String userName = "some user";
    private String password = "some password";

    //Путь к папке для хранения файлов
    private String folderPath = "some path";

    //Настройки логирования (например, уровень логирования, путь к лог-файлу)
    private String levelLog = "Some level";
    private String logPath = folderPath + "/fileName";

    private ConfigurationManager() {

    }

    public static ConfigurationManager getInstanse() {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }

    public void setDataBaseParameters(String urlDatabase, String userName, String password) {
        this.urlDatabase = urlDatabase;
        this.userName = userName;
        this.password = password;
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public void setLog(String levelLog, String logPath) {
        this.levelLog = levelLog;
        this.logPath = logPath;
    }

    public void printInfo() {
        System.out.println("urlDatabase " +  urlDatabase);
        System.out.println("userName " +  userName);
        System.out.println("password " +  password);
        System.out.println("folderPath " +  folderPath);
        System.out.println("levelLog " +  levelLog);
        System.out.println("logPath " +  logPath);
    }
}
