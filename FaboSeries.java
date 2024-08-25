public class FaboSeries {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int third;
        System.out.println("febonise series");
        System.out.print(first);
        System.out.print("," + second);
        for (int i = 0; i < 12; i++) {
            third = first + second;
            System.out.print("," + third);
            first = second;
            second = third;
        }
    }
}
