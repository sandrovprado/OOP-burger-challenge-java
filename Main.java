package com.sandro;

class BaseBurger {
    private String rollType;
    private String meat;
    private double lettucePrice;
    private boolean lettuce;
    private double tomatoPrice;
    private boolean tomato;
    private double onionPrice;
    private boolean onion;
    private double picklePrice;
    private boolean pickle;
    private double finalPrice;
    private double basePrice;
    private double additionalFees;

    public BaseBurger(String rollType, String meat, boolean lettuce, boolean tomato, boolean onion, boolean pickle) {
        this.rollType = rollType;
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.onion = onion;
        this.pickle = pickle;
        this.lettucePrice = 1;
        this.tomatoPrice = 1;
        this.onionPrice = .5;
        this.picklePrice = .5;
        this.basePrice = 8;

    }

    public double calculatePrice() {

        if (lettuce == false) {
            lettucePrice = 0;
        }
        if (tomato == false) {
            tomatoPrice = 0;
        }
        if (onion == false) {
            onionPrice = 0;
        }
        if (pickle == false) {
            picklePrice = 0;
        }


        finalPrice = basePrice + lettucePrice + tomatoPrice + onionPrice + picklePrice;


        return finalPrice;
    }

    public double calculateAdditionalFees() {
        if (lettuce == false) {
            lettucePrice = 0;
        }
        if (tomato == false) {
            tomatoPrice = 0;
        }
        if (onion == false) {
            onionPrice = 0;
        }
        if (pickle == false) {
            picklePrice = 0;
        }
        additionalFees = lettucePrice + tomatoPrice + onionPrice + picklePrice;

        return additionalFees;
    }

    public String addLettuce() {
        if (lettuce == true) {
            return (" You have added lettuce.");
        } else {
            return (" You have no lettuce.");
        }

    }

    public String addTomato() {
        if (tomato == true) {
            return (" You have added tomato.");
        } else {
            return (" You have no tomato.");
        }

    }

    public String addOnion() {
        if (onion == true) {
            return (" You have added onion.");
        } else {
            return (" You have no onion.");
        }

    }

    public String addPickle() {
        if (pickle == true) {
            return (" You have added pickle.");
        } else {
            return (" You have no pickle.");
        }

    }


    public String orderSummary() {
        return ("You have ordered a burger with " + rollType +
                " bread and " + meat + " as your meat." + addLettuce() + addTomato() + addOnion() + addPickle() + "Your additional fees add up to $" + calculateAdditionalFees() +
                ". Your total price is $" + calculatePrice());
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

}

class Healthyburger extends BaseBurger {
    private String rollType;
    private String meat;
    private double lettucePrice;
    private boolean lettuce;
    private double tomatoPrice;
    private boolean tomato;
    private double onionPrice;
    private boolean onion;
    private double picklePrice;
    private boolean pickle;
    private double guacPrice;
    private boolean guac;
    private double arugulaPrice;
    private boolean arugula;
    private double healthyBurgerFinalPrice;
    private double healthyBurgerAdditionalFees;
    private double healthyBurgerBasePrice;

    public Healthyburger(String meat, boolean lettuce, boolean tomato, boolean onion, boolean pickle, boolean guac, boolean arugula) {
        super("brown rye", meat, lettuce, tomato, onion, pickle);
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.onion = onion;
        this.pickle = pickle;
        this.lettucePrice = 1;
        this.tomatoPrice = 1;
        this.onionPrice = .5;
        this.picklePrice = .5;
        this.guac = guac;
        this.arugula = arugula;
        this.arugulaPrice = 1.5;
        this.guacPrice = 1.5;
        this.lettucePrice = 1;
        this.tomatoPrice = 1;
        this.onionPrice = .5;
        this.picklePrice = .5;
        this.healthyBurgerBasePrice = 9;
        this.rollType = "brown rye";

    }

    public double calculateHealthyBurgerFinalPrice() {
        if (tomato == false) {
            tomatoPrice = 0;
        }
        if (lettuce == false) {
            lettucePrice = 0;
        }
        if (onion == false) {
            onionPrice = 0;
        }
        if (pickle == false) {
            picklePrice = 0;
        }
        if (guac == false) {
            guacPrice = 0;
        }
        if (arugula == false) {
            arugulaPrice = 0;
        }

        healthyBurgerFinalPrice = healthyBurgerBasePrice + tomatoPrice + lettucePrice + onionPrice + picklePrice + guacPrice + arugulaPrice;

        return healthyBurgerFinalPrice;
    }

    public double calculateAdditionalHealthyBurgerFees() {
        if (tomato == false) {
            tomatoPrice = 0;
        }
        if (lettuce == false) {
            lettucePrice = 0;
        }
        if (onion == false) {
            onionPrice = 0;
        }
        if (pickle == false) {
            picklePrice = 0;
        }
        if (guac == false) {
            guacPrice = 0;
        }
        if (arugula == false) {
            arugulaPrice = 0;
        }

        healthyBurgerAdditionalFees = tomatoPrice + lettucePrice + onionPrice + picklePrice + guacPrice + arugulaPrice;

        return healthyBurgerAdditionalFees;
    }

    public String addLettuce() {
        if (lettuce == true) {
            return (" You have added lettuce.");
        } else {
            return (" You have no lettuce.");
        }

    }

    public String addTomato() {
        if (tomato == true) {
            return (" You have added tomato.");
        } else {
            return (" You have no tomato.");
        }

    }

    public String addOnion() {
        if (onion == true) {
            return (" You have added onion.");
        } else {
            return (" You have no onion.");
        }

    }

    public String addPickle() {
        if (pickle == true) {
            return (" You have added pickle.");
        } else {
            return (" You have no pickle.");
        }

    }

    public String addGuac() {
        if (guac == true) {
            return " You have added guac.";
        } else {
            return " You have no guac";
        }
    }

    public String addArugula() {
        if (arugula == true) {
            return " You have added arugula.";
        } else {
            return " You have no arugula.";
        }
    }


    public void healthyBurgerSummary() {
        System.out.println("You have ordered a burger with " + rollType +
                " bread and " + meat + " as your meat." + addLettuce() + addTomato() + addOnion() + addPickle() + addGuac()+addArugula()+"Your additional fees add up to $" + calculateAdditionalHealthyBurgerFees() +
                ". Your total price is $" + calculateHealthyBurgerFinalPrice());
    }




}

class DeluxeBurger {
    private String rollType;
    private String meat;
    private double chipsPrice;
    private boolean chips;
    private double drinkPrice;
    private boolean drink;
    private double DeluxeBurgerFinalPrice;
    private double DeluxeBurgerAdditionalFees;
    private double DeluxeBurgerBasePrice;

    public DeluxeBurger(String rollType, String meat, boolean chips, boolean drink) {
        this.rollType = rollType;
        this.meat = meat;
        this.chips = chips;
        this.drink = drink;
        this.DeluxeBurgerBasePrice = 10;

    }

    public double calculateDeluxeBurgerPrice() {
        return DeluxeBurgerBasePrice;
    }

    public String DeluxeBurgerSummary() {
        return "You have ordred a Deluxe burger and your final total is $" + DeluxeBurgerBasePrice;
    }
}


public class Main {

    public static void main(String[] args) {
        BaseBurger burger = new BaseBurger("white", "kobe beef", false, true, false, true);
        System.out.println(burger.orderSummary());


        Healthyburger healthyburger = new Healthyburger("turkey", true, true, false, true, true, false);
        healthyburger.healthyBurgerSummary();

        DeluxeBurger deluxeBurger = new DeluxeBurger("white", "beef", true, true);
        System.out.println(deluxeBurger.DeluxeBurgerSummary());



        BaseBurger testBurger =  new Healthyburger("turkey",true,true,true,true,true,true);
        System.out.println(testBurger.orderSummary());







    }
}
