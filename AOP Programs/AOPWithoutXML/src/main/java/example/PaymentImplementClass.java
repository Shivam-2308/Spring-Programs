package example;

import org.springframework.stereotype.Component;

//@Component
public class PaymentImplementClass implements Payment{
    public PaymentImplementClass() {
    }

    @Override
    public void makePayment(int amount) {
        //jointpoint
        System.out.println(amount+" credited");
        System.out.println(amount+" debited");
    }
}
