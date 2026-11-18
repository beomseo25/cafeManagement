public class Barista {
    private int coffeePrice;
    private int beanCount;
    private int cashBox;

    public void Barista()
    {
        this.coffeePrice = 3000;
        this.beanCount = 0;
        this.cashBox = 0;
    }

    public void makeCoffee(int coffeePrice, int beanCount)
    {
        this.coffeePrice = coffeePrice;
        this.beanCount = beanCount;
        this.cashBox = 0;
    }

    public int getCoffeePrice()
    {
        int price = coffeePrice;
        return price;
    }

    public  void takeOrder()
    {
        Customer customer = new Customer();
        if(customer.pay() == 0)
            System.out.println("[바리스타] 돈이 부족하신대유;;?");
        else
            cashBox += customer.pay();
    }

    public void makeCoffee()
    {
        Customer customer = new Customer();
        checkBeanCount();
        if (checkBeanCount() == 0)
            return;
        if(checkBeanCount() == 1) {
            beanCount -= 1;
            System.out.print("[바리스타] 커피 나왔습니다~");
        }
    }
    public int checkBeanCount()
    {
        if (beanCount == 0)
        {
            System.out.println("[바리스타] 저희 원두가 다 떨어져서ㅠㅠ 죄송합니다.");
            return 0;
        }
        System.out.println("[바리스타] 원두 충분하니까 커피 만들어볼게요~");
        return 1;
    }

}
