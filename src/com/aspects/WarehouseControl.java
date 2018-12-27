package com.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class WarehouseControl
{
    @Pointcut("execution(* com.api.ICook.getPizzaComponents(..) )")
    public void pointCut(){
    
    }
    @Before("pointCut()")
    public void checkPizzaComponents(){
        System.out.println("Pizza Components Checked");
    }
    
    @AfterThrowing("pointCut()")
    public void warehouseAlert(){
        System.out.println("Warehouse Alert!");
    }
}
