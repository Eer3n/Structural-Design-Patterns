package Facade.Entity;

public class Product {

    private Long Id;
    private String name;
    private String subTitle;
    private String longTitle;
    private int amount;
    private User buyer;

    public Product() {

    }

    public Product(Long id, String name, String subTitle, String longTitle, int amount, User buyer) {
        Id = id;
        this.name = name;
        this.subTitle = subTitle;
        this.longTitle = longTitle;
        this.amount = amount;
        this.buyer = buyer;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getLongTitle() {
        return longTitle;
    }

    public void setLongTitle(String longTitle) {
        this.longTitle = longTitle;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }
}
