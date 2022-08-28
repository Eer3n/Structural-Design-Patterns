package Facade.Entity;

import java.util.List;

public class WishList {

    private Long Id;
    private Long userId;
    private User user;
    private List<Product> productList;
    private int wishListCount;


    public WishList() {

    }

    public WishList(User user, List<Product> productList) {
        this.user = user;
        this.productList = productList;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public int getWishListCount() {
        return wishListCount;
    }

    public void setWishListCount(int wishListCount) {
        this.wishListCount = wishListCount;
    }
}
