package ir.rabbit.group.model;



import javax.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A CustomerCheckedProducts.
 */
@Entity
@Table(name = "customer_checked_products")
public class CustomerCheckedProducts implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "customer")
    private Customer customer;

    @Column(name = "products")
    private List<Product> products;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public CustomerCheckedProducts customer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public CustomerCheckedProducts products(List<Product> products) {
        this.products = products;
        return this;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
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
        CustomerCheckedProducts customerCheckedProducts = (CustomerCheckedProducts) o;
        if (customerCheckedProducts.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), customerCheckedProducts.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "CustomerCheckedProducts{" +
            "id=" + getId() +
            ", customer='" + getCustomer() + "'" +
            ", products='" + getProducts() + "'" +
            "}";
    }
}
