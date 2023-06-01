abstract class shape
{
    public abstract void area();
}
class circle extends shape
{
    int rad;
    circle(int rad) {
        this.rad=rad;
    }

    @Override
    public void area() {
        System.out.println(3.14*rad*rad);
    }
}
class triangle extends shape
{
    @Override
    public void area() {

    }
}
public class Q3_b_2017 {

}
