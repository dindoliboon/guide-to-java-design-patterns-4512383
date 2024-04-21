package com.example;

import java.util.Map;
import java.util.function.Supplier;
import java.util.HashMap;

public class VendingMachine {

    public static final Map<String, Supplier<Snack>> snackMap = new HashMap();

    static {
        snackMap.put("Chips", Chips::new);
        snackMap.put("ChocolateBar", ChocolateBar::new);
        snackMap.put("Drink", Drink::new);
    }

    Snack getSnack(String snackType) {
        Supplier<Snack> snackSupplier = snackMap.get(snackType);
        if (snackSupplier != null)
            return snackSupplier.get();

        throw new IllegalArgumentException("Invalid snack type");
    }

}
