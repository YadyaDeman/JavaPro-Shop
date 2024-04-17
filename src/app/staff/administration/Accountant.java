package app.staff.administration;

import app.staff.specialist.Cashier;
import app.staff.specialist.Cleaning_woman;
import app.staff.specialist.Seller;

public class Accountant {
    private Seller seller;
    private Cleaning_woman cleaningWoman;
    private Cashier cashier;

    public Seller getSeller() {
        return seller;
    }

    public Cleaning_woman getCleaningWoman() {
        return cleaningWoman;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public void setCleaningWoman(Cleaning_woman cleaningWoman) {
        this.cleaningWoman = cleaningWoman;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public void giveOrders(){
        seller.work();
        cleaningWoman.work();
        cashier.work();
    }

}
