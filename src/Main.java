public class Main {
    public static void main(String[] args) {

        HDFC_Account ankitAcc = new HDFC_Account("Ankit", "ankit123", 2000);

        System.out.println(ankitAcc); // it will give output is Address

        // fetch balance
        System.out.println(ankitAcc.fetchBalance("random")); // wrong password
        System.out.println(ankitAcc.fetchBalance("ankit123"));  // correct password

        // addMoney
        System.out.println(ankitAcc.addMoney(10000));

        // withdraw
        System.out.println(ankitAcc.withdrawMoney(1000, "ankit123"));
        System.out.println(ankitAcc.withdrawMoney(500, "random"));   //
        System.out.println(ankitAcc.withdrawMoney(20000, "ankit123"));

        // change password
        System.out.println(ankitAcc.changePassword("ankit123", "Ankit@123"));
        System.out.println(ankitAcc.changePassword("random", "Ankit@123"));

        // calculate Interest
        System.out.println("Interest for 5 years on current balance will be"+ ankitAcc.calculateInterest(5));
    }
}