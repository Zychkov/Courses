package Lesson5;

public class ContinueClasswork {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i == 5 || i % 3 ==0 || (i >= 60 && i <= 80)) {
                i++;
                continue;
            }
            System.out.println(i);
        }
    }
}

/*        int i = 0;

        while (i < 100) {
            if (i == 5 || i % 3 == 0 || (i >= 60 && i <= 80)) {
                ++i;
                continue;
            }

            ++i;
            System.out.println(i);
        }
    }
}*/

