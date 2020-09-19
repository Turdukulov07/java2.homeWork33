public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount(0 );
        bankAccount.deposit(10000);
        while (true){
            try {
                System.out.println("Сиздин счетто " +bankAccount.getAmount());
                bankAccount.withDraw( 6000);
            }catch (LimitException e){
                System.out.println(e.getMessage());
                try {
                    bankAccount.withDraw((int)bankAccount.getAmount());
                }catch (LimitException ex){
                    ex.printStackTrace();
                }break;
            }
        }
        System.out.println("Сиздин счетто " + bankAccount.getAmount());
    }
}
