package ir.rabbit.group.model;



import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A ShoppingCartHasProduct.
 */
@Entity
@Table(name = "shopping_cart_has_product")
public class ShoppingCartHasProduct implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "shopping_cart")
    private String shoppingCart;

    @Column(name = "product")
    private String product;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShoppingCart() {
        return shoppingCart;
    }

    public ShoppingCartHasProduct shoppingCart(String shoppingCart) {
        this.shoppingCart = shoppingCart;
        return this;
    }

    public void setShoppingCart(String shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public String getProduct() {
        return product;
    }

    public ShoppingCartHasProduct product(String product) {
        this.product = product;
        return this;
    }

    public void setProduct(String product) {
        this.product = product;
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
        ShoppingCartHasProduct shoppingCartHasProduct = (ShoppingCartHasProduct) o;
        if (shoppingCartHasProduct.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), shoppingCartHasProduct.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ShoppingCartHasProduct{" +
            "id=" + getId() +
            ", shoppingCart='" + getShoppingCart() + "'" +
            ", product='" + getProduct() + "'" +
            "}";
    }
}
