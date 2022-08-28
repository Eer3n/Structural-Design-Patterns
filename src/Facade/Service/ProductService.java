package Facade.Service;

import Facade.Entity.Product;
import Facade.Entity.User;

public class ProductService {

    private final UserService userService;

    public ProductService(UserService userService) {
        this.userService = userService;
    }

    public Product findByBuyerId(Long Id) {
        User user = userService.findById(Id);
        Product product = new Product();
        product.setBuyer(user);
        return product;
    }
}
