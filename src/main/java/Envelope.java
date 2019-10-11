public class Envelope {
    public static void main(String[] args) {
//                for (int i = 0; i < 20; i++) {
//                    switch (i){
//                        case 1:
//                            int k=0;
//                            while (k<40) {
//                                System.out.print("*");
//                                k++;
//                            }
//                            break;
//                    }
//                }
        double height = 10;
        double width = 60;
        double k = height / width;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0
                    || i == height - 1
                    || j == 0
                    || j == width - 1
                    || i == j*k
                    || i == (width - j - 1/k)*k
                ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
