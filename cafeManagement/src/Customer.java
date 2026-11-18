import java.awt.color.ICC_ColorSpace;
import java.io.ByteArrayInputStream;

public class Customer {
    private String Name;
    int money;
    private boolean hasCoffee;

    public Customer() {
        money = 10000;
        hasCoffee = false;
    }

    public void print() {
        System.out.println(money);
        System.out.println(hasCoffee);
    }

    public  Customer(String name, int money){
        this.Name = name;
        this.money = money;
        this.hasCoffee = false;
    }

    public int pay()
    {
        Barista barista = new Barista();
        if(money < barista.getCoffeePrice())
            return 0;
        money -= barista.getCoffeePrice();
        return barista.getCoffeePrice();
    }

    public void order(String name, String menuName)
    {
        Barista barista = new Barista();
        System.out.println(name + " " + menuName + "한잔 주세요.");
        int price = barista.getCoffeePrice();
        System.out.println(price);
    }

    public void takeCoffee(String name)
    {
        System.out.println(name + "감사합니다~");
        hasCoffee = true;
    }
    public Customer(int money, boolean hasCoffee){
        this.money = money;
        this.hasCoffee = false;
    }
}
