package app.staff.administration;

import org.springframework.beans.factory.annotation.Autowired;

public class Director {
    @Autowired
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
