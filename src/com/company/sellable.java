package com.company;

public interface sellable {
    public abstract void sell(Human seller, Human buyer, Double price) throws Exception;
}
