public class Q2_way2 {
    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue", "yellow"};
        try {
            System.out.println(colors[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index is out of bounds.");
        }
        try {
            int num = Integer.parseInt(colors[1]); //important
        } catch (NumberFormatException e) {
            System.out.println("The element is not a number.");
        }
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
