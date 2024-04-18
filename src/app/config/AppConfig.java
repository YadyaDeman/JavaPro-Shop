package app.config;


import app.staff.administration.Accountant;
import app.staff.specialist.Cashier;
import app.staff.specialist.Cleaning_woman;
import app.staff.specialist.Seller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Cashier cashier(){
        return new Cashier();
    }

    @Bean
    public Cleaning_woman cleaningWoman(){
        return new Cleaning_woman();
    }

    @Bean
    public Seller seller(){
        return new Seller();
    }

    @Bean
    public Accountant accountant(){
        return new Accountant();
    }

     @Bean
    public Director director(){
        return new Director();
    }
}

