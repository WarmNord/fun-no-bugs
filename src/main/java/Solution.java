import javax.management.BadStringOperationException;
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int secondNum = 1;
            if (nums[i] + nums[i + 1] == target) {
                return new int[]{i, i + 1};
            }
        }
        return nums;
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            String number = String.valueOf(x);
            String reverse = "";
            for (int i = number.length() - 1; i >= 0; i--) {
                reverse = reverse + number.charAt(i);
            }

            if (number.equals(reverse)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static long[] powersOfTwo(int n) {
        long[] result = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = (long) Math.pow(2, i);
        }
        return result;
    }

    public static int[] countBy(int x, int n) {
        // Your code here
        int number = 1;
        int[] result = new int[n];
        int index = 0;

        while (index < n) {
            if (number % x == 0) {
                result[index] = number;
                index++;
                number++;
            } else {
                number++;
            }
        }
        return result;
    }

    public static boolean isUpperCase(String s) {
        // your code here
        s.trim();
        for (int i = 0; i < s.length(); i++) {
            char[] ch = s.toCharArray();
            if (Character.isLowerCase(ch[i])) {
                return false;
            }
        }
        return true;
    }

    public static Object[] removeEveryOther(Object[] arr) {
        // happy coding
        List<Object> result = new ArrayList<>();
/*        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result.add(arr[i]);
            }
        }*/
        int i = 0;

        while (i < arr.length) {
            if (i % 2 == 0) {
                result.add(arr[i]);
            }
        }
        return result.toArray();
    }

    public int cockroachSpeed(double x) {
        // Good Luck!
        return (int) Math.floor(x * 100000 / 3600);
    }

    int[][] matrix(int n) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        Random random = new Random();
        int[][] result = new int[3][3];
        while (true) {
            numbers.add(random.nextInt(1, n - 1));
            if (numbers.size() >= 9) {
                break;
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = numbers.removeFirst();
            }
        }
        return result;

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static String countingSheep(int num) {
        //Add your code here
        //Given a non-negative integer, 3 for example,
        // return a string with a murmur: "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.
        if (num == 0) {
            return "";
        }
        String result = "";
        for (int i = 1; i <= num; i++) {
            result = result + i + " sheep...";
        }

        return result;
    }

    public static long sumTwoSmallestNumbers(long[] numbers) {
        //Your solution here
        List<Long> l = new ArrayList<>();
        for (long number : numbers) {
            l.add(number);
        }
        l.sort(Comparator.naturalOrder());
        //Arrays.stream(numbers).sorted().limit(2).sum();
        return l.stream().limit(2).reduce(Long::sum).get();
    }

    static String greet(String name, String owner) {
        // Add code here
        if (name.equals(owner)) {
            return "Hello boss";
        } else {
            return "Hello guest";
        }
    }

    public static int simpleMultiplication(int n) {
        //your code here
        return n % 2 == 0 ? n * 8 : n * 9;
    }

    public static boolean feast(String beast, String dish) {
        return beast.startsWith(dish.substring(0, 1)) && beast.endsWith(new StringBuilder(dish).substring(dish.length() - 1));

    }

    public static boolean happyTicket(int a) {
        int number1 = a / 100_000;
        System.out.println(number1);
        int number2 = a / 100_00 % 10;
        System.out.println(number2);
        int number3 = a / 100_0 % 10;
        System.out.println(number3);
        int number4 = a % 1000 / 100;
        System.out.println(number4);
        int number5 = a % 100 / 10;
        System.out.println(number5);
        int number6 = a % 10;
        System.out.println(number6);


        return (number1 + number2 + number3) == (number4 + number5 + number6);
    }

    public static int points(String[] games) {
        int result = 0;
        for (String g : games) {
            int x = g.charAt(0);
            int y = g.charAt(2);
            if (x > y) {
                result += 3;
            } else if (x == y) {
                result += 1;
            }
        }

        return result;
    }

    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if (phrase == null) {
            return null;
        }
        if (phrase.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            if (i == 0) {
                result.append(Character.toUpperCase(phrase.charAt(0)));
            } else if (phrase.charAt(i - 1) == ' ') {
                result.append(Character.toUpperCase(phrase.charAt(i)));
            } else {
                result.append(phrase.charAt(i));
            }
        }
        return result.toString();
    }

    public static boolean isLove(final int flower1, final int flower2) {

        if (flower1 % 2 == 0 && flower2 % 2 != 0) {
            return true;
        } else if (flower2 % 2 == 0 && flower1 % 2 != 0) {
            return true;
        } else {
            return false;
        }

    }

    public static int Past(int h, int m, int s) {
        //Happy Coding! ^_^
        return h * 60 * 60 * 1000 + m * 60 * 1000 + s * 1000;
    }

    public static int[] capitals(String s) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int sortDesc(final int num) {

        String numbers = Integer.toString(num);

        Character[] numCharacter = new Character[numbers.length()];

        for (int i = 0; i < numbers.length(); i++) {
            numCharacter[i] = numbers.charAt(i);
        }

        Arrays.sort(numCharacter, Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        for (Character n : numCharacter) {
            result.append(n);
        }

        /*
        *
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
        * */
        return Integer.parseInt(result.toString());
    }

    /*
     *задача поиска бин поиска
     * массив отсортированный 5 7 9 11
     * */
    public static int findElementByBinSearch(int target, int[] array) {

        int len = array.length / 2;
        int min = 0;
        int max = array.length - 1;

        while (true) {
            if (array[target] > target) {

            }


        }

    }


    public static void main(String[] args) {
        System.out.println(findElementByBinSearch(9,new int[]{5, 7, 9, 11}));

    }

}

