package basicOFPrograming.mathematicalProblem;

public class SaraPhone {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        int m = 10;

        int totalMemory = n * k;
        int appsToDelete = m / k;
        if (m > totalMemory) {
            System.out.println(-1);
        } else {
            if (m % k != 0){
                appsToDelete += 1;
                System.out.println(appsToDelete);
            }
        }
    }
}
