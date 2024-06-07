package example;

import org.springframework.stereotype.Component;

//@Component
public class PaymentImplementClass implements Payment{
    //joinpoint
    @Override
    public void makePayment(int amount) {
        System.out.println(amount+" credited");
        System.out.println(amount+" debited");
    }
}
