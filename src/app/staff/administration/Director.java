package app.staff.administration;

public class Director {
    private Accountant accountant;

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }

    public void manageShop(){
        accountant.giveOrders();
    }
}
