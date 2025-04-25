package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name,"Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
       this.healthyExtra1Name = healthyExtra1Name;
       this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public void itemizeHamburger() {
        System.out.println("Name: "+getName());
        System.out.println("Meat: "+getMeat());
        System.out.println("BreadRollType: "+getBreadRollType());

        if(getAddition1Name() != null){
            setPrice(getPrice() + getAddition1Price());
            System.out.println("Addition1: "+getAddition1Name());
        }
        if(getAddition2Name() != null){
            setPrice(getPrice() + getAddition2Price());
            System.out.println("Addition2: "+getAddition2Name());
        }
        if(getAddition3Name() != null){
            setPrice(getPrice() + getAddition3Price());
            System.out.println("Addition3: "+getAddition3Name());
        }
        if(getAddition4Name() != null){
            setPrice(getPrice() + getAddition4Price());
            System.out.println("Addition4: "+getAddition4Name());
        }
        if(healthyExtra1Name != null){
            System.out.println("HealthyAddition1: "+healthyExtra1Name);
            setPrice(getPrice() + healthyExtra1Price);
        }
        if(healthyExtra2Name != null){
            System.out.println("HealthyAddition2: "+healthyExtra2Name);
            setPrice(getPrice() + healthyExtra2Price);
        }
        System.out.println("Price: "+getPrice());
        System.out.println();
    }
}
