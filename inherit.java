import java.util.ArrayList;
import java.util.List;

class Product {
    private int id;
    private String name;
    private double price;

    // Constructor, getters, setters, etc.

    // Additional methods as needed
}

class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public List<Product> getItems() {
        return items;
    }

    // Additional methods as needed
}

public class ECommerceWebsite {
    private List<Product> products;
    private ShoppingCart shoppingCart;

    public ECommerceWebsite() {
        this.products = new ArrayList<>();
        this.shoppingCart = new ShoppingCart();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void displayProducts() {
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }

    public void addToCart(Product product) {
        shoppingCart.addItem(product);
        System.out.println(product.getName() + " added to the shopping cart.");
    }

    public void displayShoppingCart() {
        List<Product> cartItems = shoppingCart.getItems();
        if (cartItems.isEmpty()) {
            System.out.println("Shopping cart is empty.");
        } else {
            System.out.println("Shopping Cart:");
            for (Product item : cartItems) {
                System.out.println(item.getName() + " - $" + item.getPrice());
            }
        }
    }

    public static void main(String[] args) {
        // Create an instance of the e-commerce website
        ECommerceWebsite ecommerceWebsite = new ECommerceWebsite();

        // Create some sample products
        Product product1 = new Product(1, "Product 1", 19.99);
        Product product2 = new Product(2, "Product 2", 24.99);

        // Add products to the website
        ecommerceWebsite.addProduct(product1);
        ecommerceWebsite.addProduct(product2);

        // Display available products
        ecommerceWebsite.displayProducts();

        // Add a product to the shopping cart
        ecommerceWebsite.addToCart(product1);

        // Display the shopping cart
        ecommerceWebsite.displayShoppingCart();
    }
}
