
// на вход дается 2 параметра начало и конец диапазона, затем перебирает числа в диапазоне и выводит по следующему принципу :
// если число кратно 3, то выводится слово fizze,
// если кратно 5 то слово баз,
// если кратгно 5 и 3 то выводится физбаз
// если ни кратно ни 3 ни 5 то выводится само число

// создавать клиентов имя возраст параметр актуален или нет
/*
* */
 class MockSecond {

    static public void fizzBuzz(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 15 == 0 || i == 0) {
                System.out.println("fizzebuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizze");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        //fizzBuzz(0, 15);
        fizzBuzz(1,1);
        //negative number
        // 20 10
        //-1 0
        // 0 1

        // 20 30 50 80
    }

}
