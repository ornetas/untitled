import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String name = "Ornetas";
        String surname = "Barscevicius";
        int bornyear = 1996;
        int thisyear = 2022;
        int age = thisyear - bornyear;

        System.out.println("Aš esu" + " " + name + " " + surname + "." + "Man yra" + " " + age + " " + "metai");


        //============== 2 ud ========================
        int num1 = (int) Math.round(Math.random() * 4);
        int num2 = (int) Math.round(Math.random() * 4);

        System.out.println(num1 + " " + num2);

        if (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                System.out.println(num1 + " yra didesnis uz " + num2);
                double notRounded = (double) num1 / num2;
                System.out.println(Math.round(notRounded * 100) / 100.0);
            } else {
                System.out.println(num1 + " yra mazesnis uz" + num2);
                double notRounded = (double) num2 / num1;
                System.out.println((double) Math.round(notRounded * 100) / 100);
            }
        } else {
            System.out.println("Dalyba is nulio negalima");
        }

//============== 3 ud ========================


        int numb1 = (int) Math.round(Math.random() * 25);
        int numb2 = (int) Math.round(Math.random() * 25);
        int numb3 = (int) Math.round(Math.random() * 25);
        System.out.println(numb1 + " " + numb2 + " " + numb3);

        if ((numb1 > numb2 && numb1 < numb3) || (numb1 < numb2 && numb1 > numb3)) {
            System.out.println(numb1 + " " + "yra vidurinis skaicius");
        }

        if ((numb2 > numb1 && numb2 < numb3) || (numb2 < numb1 && numb2 > numb3)) {
            System.out.println(numb2 + " " + "yra vidurinis skaicius");
        }

        if ((numb3 > numb1 && numb3 < numb2) || (numb3 < numb1 && numb3 > numb2)) {
            System.out.println(numb3 + " " + "yra vidurinis skaicius");

        }
//============== 4 ud ========================


        int numA = (int) Math.round(Math.random() * 10 + 1);
        int numB = (int) Math.round(Math.random() * 10 + 1);
        int numC = (int) Math.round(Math.random() * 10 + 1);

        System.out.println(numA + " " + numB + " " + numC);


        if ((numA + numB > numC)) {
            if ((numA + numC > numB)) {
                if ((numB + numC > numA)) {
                    System.out.println("Taip, trikampis gali buti sudarytas");
                } else {
                    System.out.println("trikampis negali b8ti sudarytas");
                }
            } else {
                System.out.println("trikampis negali b8ti sudarytas");
            }
        } else {
            System.out.println("trikampis negali b8ti sudarytas");
        }
//apacioj esantis greitesnis ir paprastesnis sprendimas
        if ((numA + numB > numC) && (numC + numB > numA) && (numA + numC > numB)) {
            System.out.println("gausis");
        } else {
            System.out.println("nesigaus");
        }
//============== 5 ud ========================


        int rnd1 = (int) Math.round(Math.random() * 2);
        int rnd2 = (int) Math.round(Math.random() * 2);
        int rnd3 = (int) Math.round(Math.random() * 2);
        int rnd4 = (int) Math.round(Math.random() * 2);
        System.out.println(rnd1 + " " + rnd2 + " " + rnd3 + " " + rnd4);

//        int num3 = 0;
//        int num4 = 1;
//        int num5 = 2;
//        if ((rnd1 == num3) || (rnd2 == num3) || (rnd3 == num3) || (rnd4 == num3)) {
//            System.out.println(num3 + 1);
//        }

        int zeros = 0;
        int ones = 0;
        int twos = 0;

        if (rnd1 == 0) {
            zeros++;
        }

        if (rnd2 == 0) {
            zeros++;
        }

        if (rnd3 == 0) {
            zeros++;
        }

        if (rnd4 == 0) {
            zeros++;
        }

        if (rnd1 == 1) {
            ones++;
        }
        if (rnd2 == 1) {
            ones++;
        }
        if (rnd3 == 1) {
            ones++;
        }
        if (rnd4 == 1) {
            ones++;
        }

        if (rnd1 == 2) {
            twos++;
        }
        if (rnd2 == 2) {
            twos++;
        }
        if (rnd3 == 2) {
            twos++;
        }
        if (rnd4 == 2) {
            twos++;
        }


        System.out.println("nuliu yra -" + zeros + " vnenetu yra-" + ones + " dvejetu yra-" + twos);
//============== 6 ud ========================

        int nr1 = (int) Math.round(Math.random() * 20 - 10);//0.4 * 10 = 4, 4-10=-6
        int nr2 = (int) Math.round(Math.random() * 20 - 10); // 0.99=9.9 ;-0.1
        int nr3 = (int) Math.round(Math.random() * 20 - 10);
        System.out.println(nr1 + " " + nr2 + " " + nr3);

        //       int positive = (int) Math.round(Math.random() * 10 + 1);
        //     int nulis = 0;
        //   int negative = (int) Math.round(Math.random() * 10 - 10 - 1);

//        if ((nr1 == positive) || (nr2 == positive) || (nr3 == positive)) {
//            System.out.println();
//        }
        if (nr1 < 0) {
            System.out.println("[" + nr1 + "]");
        }
        if (nr1 == 0) {
            System.out.println("(" + nr1 + "]");
        }
        if (nr1 > 0) {
            System.out.println("{" + nr1 + "}");
        }
        if (nr2 < 0) {
            System.out.println("[" + nr2 + "]");
        }
        if (nr2 == 0) {
            System.out.println("(" + nr2 + ")");
        }
        if (nr2 > 0) {
            System.out.println("{" + nr2 + "}");
        }
        if (nr3 < 0) {
            System.out.println("[" + nr3 + "]");
        }
        if (nr3 == 0) {
            System.out.println("(" + nr3 + ")");
        }
        if (nr3 > 0) {
            System.out.println("{" + nr3 + "}");
        }
//============== 7 ud ========================

        int candles = (int) Math.round(Math.random() * (3000 - 5) - 5);
        System.out.println(candles + " " + "zvakes");
        int unitprice = 1;
        if (candles <= 1000) {
            System.out.println(candles * unitprice);
        }

        if (candles >= 2000) {
            System.out.println(candles * unitprice * 0.96);
        }

        if (candles > 1000 && candles < 2000) {
            System.out.println(candles * unitprice * 0.97);
        }
        //============== 8 ud ========================

        int num6 = (int)Math.round(Math.random() * 100);










    }
}