package ir.rabbit.group.model;



import javax.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A Customer.
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "jhi_user")
    private String user;

    @Column(name = "wish_list")
    private String wishList;

    @Column(name = "shopping_cart")
    private ShoppingCart shoppingCart;

    @Column(name = "orders")
    private List<Order> orders;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public Customer user(String user) {
        this.user = user;
        return this;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getWishList() {
        return wishList;
    }

    public Customer wishList(String wishList) {
        this.wishList = wishList;
        return this;
    }

    public void setWishList(String wishList) {
        this.wishList = wishList;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public Customer shoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
        return this;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public Customer orders(List<Order> orders) {
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
        Customer customer = (Customer) o;
        if (customer.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), customer.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Customer{" +
            "id=" + getId() +
            ", user='" + getUser() + "'" +
            ", wishList='" + getWishList() + "'" +
            ", shoppingCart='" + getShoppingCart() + "'" +
            ", orders='" + getOrders() + "'" +
            "}";
    }
}
