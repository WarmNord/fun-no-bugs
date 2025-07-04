package practice02.practice02.creational.singleton.logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.writeErrors();
        logger.writeSituation("database connection");
        logger.writeWarnings();
    }
}
