package practice02.practice02.creational.singleton.logger;

/*
* Описание
В приложении необходимо создать класс Logger, который будет вести журнал событий. Класс должен обеспечивать централизованный доступ к логированию для всего приложения. Например:
Запись информации о событиях (например, успешное подключение к базе данных).
Запись ошибок (например, исключения при выполнении операций).
Запись предупреждений (например, при попытке работы с устаревшими методами).
Класс Logger должен быть реализован по паттерну Singleton, чтобы в приложении был только один экземпляр этого класса, который будет использоваться для записи логов.
*
* */
public class Logger {
    private static Logger logger;

    private Logger() {};

    static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }

        return logger;
    }

    public void writeSituation(String message) {
        System.out.println("Success " + message);
    }

    public void writeErrors() {
        System.out.println("Error");
    }

    public void writeWarnings() {
        System.out.println("Warning");
    }
}
