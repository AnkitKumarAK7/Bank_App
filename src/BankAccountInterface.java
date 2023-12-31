public interface BankAccountInterface {
    String fetchBalance (String password);

    String addMoney(double amount);

    String withdrawMoney(double amount, String password);

    String changePassword(String oldPassword, String password);

    double calculateInterest(int year);
}
