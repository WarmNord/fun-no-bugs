package practice_06.task01;

import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;

public class Employee {

    /*
    * Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.
     * */

    private TreeMap<String, Integer> employes;

    Employee() {
        this.employes = new TreeMap<>();
    }

    void findNearMaxId(Integer id) {
        AtomicReference<Integer> result = new AtomicReference<>(0);
        employes.values().forEach(
                integer -> {
                    if (integer >= id) {
                        result.set(integer);
                    }
                }
        );
        System.out.println("Ближайшее большее " + id + " : " + result);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.employes.put("q", 5);
        employee.employes.put("d", 11);
        employee.employes.put("g", 32);
        employee.employes.put("b", 41);
        employee.employes.put("k", 21);

        employee.findNearMaxId(4);
        employee.findNearMaxId(10);
        employee.findNearMaxId(30);
        employee.findNearMaxId(40);
        employee.findNearMaxId(15);


    }
}
