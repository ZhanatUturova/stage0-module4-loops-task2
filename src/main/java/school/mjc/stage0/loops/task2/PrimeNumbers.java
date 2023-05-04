package school.mjc.stage0.loops.task2;


public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        while (i <= printToInclusive) {
            boolean flag = true;
            int j = 2;
            while (j < i) {
                if (i % j == 0) {
                    flag = false;
                }
                j++;
            }
            if (flag) {
                System.out.println(i);
            }
            i++;
        }
    }
}
