public class BankAccount{
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public void  deposit(double sum){
        amount = amount + sum;
        System.out.println("Сиздин счетко акча которулду " + getAmount());
    }
    public void withDraw (int sum) throws LimitException{
        if (sum > amount){
            throw new LimitException("Сиздин каражат жетишсиз ", + getAmount());
        }else {
            amount = amount - sum;
            System.out.println("Сиздин баланстан акча алынды " + sum);
        }
    }
}