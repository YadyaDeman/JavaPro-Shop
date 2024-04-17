package app.code;

import app.staff.administration.Accountant;
import app.staff.administration.Director;
import app.staff.specialist.Cashier;
import app.staff.specialist.Cleaning_woman;
import app.staff.specialist.Seller;

public class Application {
    public static void main(String[] args) {

        Cashier cashier = new Cashier();
        Cleaning_woman cleaningWoman =new Cleaning_woman();
        Seller seller = new Seller();

        Accountant accountant = new Accountant();
        accountant.setCashier(cashier);
        accountant.setSeller(seller);
        accountant.setCleaningWoman(cleaningWoman);

        Director director = new Director();
        director.setAccountant(accountant);

        director.manageShop();

    }
}
