
/*создавать клиентов имя возраст параметр актуален или нет
счетчик клиентов
*
* */
public class Client {

    private String name;
    private int age;

    private boolean isActual;

    static int clientCounter;


    Client(String name, int age, boolean isActual) {
        this.age = age;
        this.name = name;
        this.isActual = isActual;
        clientCounter++;
    }

    public static void main(String[] args) {
        Client c1 = new Client("q",2,true);
        Client c2 = new Client("w", 23, false);

        System.out.println(Client.clientCounter);
    }

}
