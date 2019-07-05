public class main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j < i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > 0; j--) {
                if (j < i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > 0; j--) {
                if (j > i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

                    System.out.println("  * ");
                    System.out.println(" *** ");
                    System.out.println("*****");
        }

    }

