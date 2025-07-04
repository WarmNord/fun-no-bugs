public class Task {

    // https://dummy-json.mock.beeceptor.com/continents

    // проверить что есть страна океаны и тд

    // проверить что получаем данные

    // Найти максимальную сумму подмассива длиной k.
    //  [1,2,3,4] k=2 -> 7
    //  [1,2,3,4,5,6,7] k=4 -> 22
    // [10,5,100,56,78,3] k = 3 -> 234
    // [10,5,100,56,78,3,10,5,100,56,78,3] k = 6

    /*
     * сравнивать 2 подмассива присваивать макс значение переменной
     * */
    static int findMaxSum(int[] array, int k) {
        int max = 0;
        int previousSumArray = 0;
        int first = 0;
        int second = k - 1;

        for (int i = 0; i < k; i++) {
            previousSumArray += array[i];
        }
        max = previousSumArray;
        first++;
        second++;

        for (int i = second; i < array.length; i++) {
            previousSumArray = previousSumArray - array[first - 1] + array[second];
            if (max < previousSumArray) {
                max = previousSumArray;
            }
            first++;
            second++;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(Task.findMaxSum(new int[]{10, 5, 100, 56, 78, 3, 10, 5, 100, 56, 78, 3}, 6));
    }

}
