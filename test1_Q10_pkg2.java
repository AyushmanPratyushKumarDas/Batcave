package Q10_part2;
import Q10.Test_Q10_pkg1;

public class test1_Q10_pkg2 implements Sports_10_pkg2 {

    public static void main(String[] args) {
        Test_Q10_pkg1 t1 = new Test_Q10_pkg1();
        t1.input_marks();t1.output_marks();
        System.out.println("the total Score is "+(test1_Q10_pkg2.score1+ test1_Q10_pkg2.score2));
    }


}
