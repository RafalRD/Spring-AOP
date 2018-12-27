package com.impl;

import com.api.ICook;

public class Cook implements ICook
{
    @Override
    public void getPizzaComponents()
    {
        System.out.println("Geting pizza components ...");
    }
    
    @Override
    public void makePizza()
    {
        System.out.println("Making a pizza ...");
    }
    
    @Override
    public void salePizza()
    {
        System.out.println("Selling pizza...");
    }
}
