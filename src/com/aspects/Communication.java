package com.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Communication
{
    @After("execution(* com.api.ICook.makePizza(..) )")
    public void pizzaAlreadyDone(){
        System.out.println("Pizza is done");
    }
    
    @After("execution(* com.api.ICook.salePizza(..) )")
    public void pizzaReadyForSale(){
        System.out.println("Pizza sold");
    }
    
    @After("execution(* com.api.ICook.getPizzaComponents(..) )")
    public void preparingForMakingPizza(){
        System.out.println("Preparing to making pizza");
    }
}

