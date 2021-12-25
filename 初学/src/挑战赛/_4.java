package 挑战赛;

import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int L = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int max = 0;
        for (int i = 1; i <= N - L + 1; i++) {
            int num_3_4 = L;
            int num_2 = 0;
            for (int j = 0; j < L; j++) {
                if ((i+j) % x == 0 && (i+j) % y == 0){
                    num_2 += 9;
                } else if((i+j) % y == 0 && (i+j) % z == 0){
                    num_3_4 += 3;
                } else if ((i+j) % x == 0 && (i+j) % z == 0){
                    num_3_4 += 1;
                }
            }

            int num = num_2 > num_3_4 ? (num_2 - num_3_4) : (num_3_4 - num_2);
            if (num > max){
                max = num;
            }
        }

        System.out.println(max);
    }

}
