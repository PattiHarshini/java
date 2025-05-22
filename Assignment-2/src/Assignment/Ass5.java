package Assignment;

public class Ass5 {
    public static void main(String[] args) {
        String Code = args[0];

        try {
            if (!Code.equals("COUPON123")) {
                throw new Exception("Invalid Coupon Code");
            }

            System.out.println("Coupon code applied successfully");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Thank you for shopping with us!!");
        }
    }
}
