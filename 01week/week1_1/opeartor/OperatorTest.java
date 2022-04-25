package week1_1.opeartor;

public class OperatorTest {

    private final Operator target;

    public OperatorTest() {
        this.target = new Operator(0f,0f);
    }

    public void test() {
        System.out.println("--------OperatorTest---------\n");

        target.setA(100.2f);
        target.setB(22.1f);
        System.out.println("a = 100.2, b = 22.1");
        System.out.println("Operator plus = " + target.plus() + " |||" + "real plus = " + (double)(target.getA() + target.getB()));
        System.out.println("Operator minus = " + target.minus() + " |||" + "real minus = " + (double)(target.getA() - target.getB()));
        System.out.println("Operator multiply = " + target.multiply() + " |||" + "real multiply = " + (double)(target.getA() * target.getB()));
        System.out.println("Operator divide = " + target.divide() + " |||" + "real divide = " + (double)(target.getA() / target.getB()));

        target.setB(0.0f);
        System.out.println("a = 100.2, b = 0.0");

        System.out.println("Operator plus = " + target.plus() + " |||" + "real plus = " + (double)(target.getA() + target.getB()));
        System.out.println("Operator minus = " + target.minus() + " |||" + "real minus = " + (double)(target.getA() - target.getB()));
        System.out.println("Operator multiply = " + target.multiply() + " |||" + "real multiply = " + (double)(target.getA() * target.getB()));
        try {
            System.out.println("Operator divide = " + target.divide() + " |||" + "real divide = " + (double)(target.getA() / target.getB()));
        } catch (RuntimeException runtimeException) {
            String message = runtimeException.getMessage();
            System.out.println("Error Message = " + message);
        }

    }


}
