package Facade.FacadeWishList;

import Facade.Entity.Product;
import Facade.Entity.User;
import Facade.Entity.WishList;
import Facade.Service.ProductService;
import Facade.Service.UserService;

import java.util.ArrayList;
import java.util.List;

public class FacadeWishListService {

    private final ProductService productService;
    private final UserService userService;

    public FacadeWishListService(ProductService productService, UserService userService) {
        this.productService = productService;
        this.userService = userService;
    }

    public WishList findByUserId(Long Id) {
        WishList wishList = new WishList();

        User user = userService.findById(Id);
        if (user != null) {
            wishList.setUser(user);
            return wishList;
        } else {
            return null;
        }
    }

    public WishList findByUserAndProduct(Long userId, Product product) {
        WishList wishList = new WishList();
        User user = userService.findById(userId);
        if (user != null) {
            List<Product> productList = new ArrayList<>();
            if (CheckWishListForProductList(product, productList)) {
                wishList.setProductList(productList);
                wishList.setUser(user);
            }
        }
        return wishList;
    }

    private boolean CheckWishListForProductList(Product product, List<Product> productList) {
        return productList.contains(product);
    }

    //Ödev
    public WishList findWishListByUser(Long Id) {
        WishList wishList = new WishList();
        return wishList;
    }

    public void CountTotalProductAmounts(WishList wishList) {
        /**
         * bir wishList'in product listesine bakılacak ve o anki product'ın amount'u 100'den fazla ise wishList'in wishList count'u bir arttırılacak.
         * */
    }
}
