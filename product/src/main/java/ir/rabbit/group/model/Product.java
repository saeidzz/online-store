package ir.rabbit.group.model;



import javax.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A Product.
 */
@Entity
@Table(name = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "wish_list_has_products")
    private List<WishList> wishListHasProducts;

    @Column(name = "shopping_cart_has_products")
    private List<ShoppingCartHasProduct> shoppingCartHasProducts;

    @Column(name = "category_has_product")
    private List<CategoryHasProduct> categoryHasProduct;

    @Column(name = "orders")
    private List<Order> orders;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<WishList> getWishListHasProducts() {
        return wishListHasProducts;
    }

    public Product wishListHasProducts(List<WishList> wishListHasProducts) {
        this.wishListHasProducts = wishListHasProducts;
        return this;
    }

    public void setWishListHasProducts(List<WishList> wishListHasProducts) {
        this.wishListHasProducts = wishListHasProducts;
    }

    public List<ShoppingCartHasProduct> getShoppingCartHasProducts() {
        return shoppingCartHasProducts;
    }

    public Product shoppingCartHasProducts(List<ShoppingCartHasProduct> shoppingCartHasProducts) {
        this.shoppingCartHasProducts = shoppingCartHasProducts;
        return this;
    }

    public void setShoppingCartHasProducts(List<ShoppingCartHasProduct> shoppingCartHasProducts) {
        this.shoppingCartHasProducts = shoppingCartHasProducts;
    }

    public List<CategoryHasProduct> getCategoryHasProduct() {
        return categoryHasProduct;
    }

    public Product categoryHasProduct(List<CategoryHasProduct> categoryHasProduct) {
        this.categoryHasProduct = categoryHasProduct;
        return this;
    }

    public void setCategoryHasProduct(List<CategoryHasProduct> categoryHasProduct) {
        this.categoryHasProduct = categoryHasProduct;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public Product orders(List<Order> orders) {
        this.orders = orders;
        return this;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        if (product.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), product.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Product{" +
            "id=" + getId() +
            ", wishListHasProducts='" + getWishListHasProducts() + "'" +
            ", shoppingCartHasProducts='" + getShoppingCartHasProducts() + "'" +
            ", categoryHasProduct='" + getCategoryHasProduct() + "'" +
            ", orders='" + getOrders() + "'" +
            "}";
    }
}
