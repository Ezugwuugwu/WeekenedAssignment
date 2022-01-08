package ChapterFour;

public class CreditLimitCalculator {
    private int accounNumber;
    private int allowed_Cridit_Limit;
    private int initial_Balance_This_Month;
    private int all_Credit_Apllied_This_Monthly;
    private int items_Charged_This_Month;

    public CreditLimitCalculator(int accounNumber, int allowed_Cridit_Limit){
        this.accounNumber = accounNumber;
        this.allowed_Cridit_Limit = allowed_Cridit_Limit;
    }

    public int getAccounNumber() {
        return accounNumber;
    }

    public void setAccounNumber(int accounNumber) {
        this.accounNumber = accounNumber;
    }

    public int getAllowed_Cridit_Limit() {
        return allowed_Cridit_Limit;
    }

    public void setAllowed_Cridit_Limit(int allowed_Cridit_Limit) {
        this.allowed_Cridit_Limit = allowed_Cridit_Limit;
    }

    public int getInitial_Balance_This_Month() {
        return initial_Balance_This_Month;
    }

    public void setInitial_Balance_This_Month(int initial_Balance_This_Month) {
        this.initial_Balance_This_Month = initial_Balance_This_Month;
    }

    public int getAll_Credit_Apllied_This_Monthly() {
        return all_Credit_Apllied_This_Monthly;
    }

    public void setAll_Credit_Apllied_This_Monthly(int all_Credit_Apllied_This_Monthly) {
        this.all_Credit_Apllied_This_Monthly = all_Credit_Apllied_This_Monthly;
    }

    public int getItems_Charged_This_Month() {
        return items_Charged_This_Month;
    }

    public void setItems_Charged_This_Month(int items_Charged_This_Month) {
        this.items_Charged_This_Month = items_Charged_This_Month;
    }

    public int getNewBalance(){
        int newBalance = initial_Balance_This_Month + items_Charged_This_Month - all_Credit_Apllied_This_Monthly;

        return newBalance;
    }

    public void getCreditLimit_Status(){
        if (getNewBalance() > allowed_Cridit_Limit){
            System.out.println("Credit Limit exceeded");
        }else {
            System.out.println("Limit not exceeded");
        }
    }

    public static void main(String[] args) {
        CreditLimitCalculator UgoAcc = new CreditLimitCalculator(24567890, 10000);

        UgoAcc.setAll_Credit_Apllied_This_Monthly(5000);
        UgoAcc.setItems_Charged_This_Month(8000);
        UgoAcc.setInitial_Balance_This_Month(7100);

        System.out.println("Ugo's Account Number: "+ UgoAcc.getAccounNumber());
        System.out.println("Ugo's Allowed Credit Limit: "+ UgoAcc.getAllowed_Cridit_Limit());
        System.out.println("Ugo's New Balance: "+ UgoAcc.getNewBalance());
        UgoAcc.getCreditLimit_Status();

        CreditLimitCalculator mercyAccount = new CreditLimitCalculator(45678563,16000);
        System.out.println("\n\n");


        mercyAccount.setAll_Credit_Apllied_This_Monthly(9600);
        mercyAccount.setItems_Charged_This_Month(6900);
        mercyAccount.setInitial_Balance_This_Month(8450);


        System.out.println("Mercy's Account Number: "+mercyAccount.getAccounNumber());
        System.out.println("Mercy's Allowed Credit: "+mercyAccount.getAllowed_Cridit_Limit());
        System.out.println("Mercy's New Balance: "+mercyAccount.getNewBalance());
        mercyAccount.getCreditLimit_Status();




    }
}
