package questiın1;

public class ArithmeticMean {

    public void CalculateArithmeticMean() {

        int sum = 0;
        int count = 0;

        for (int i = 0; i <= 2000; i++) {


            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0 && i%53==0) {
                System.out.println((count+1)+ ".sayı=" + i);
                sum = sum + i;
                count++;

            }
        }
        float AritmetikOrtalama = sum / count;
        System.out.println("Aritmetik ortalama = " + AritmetikOrtalama);
    }
}
