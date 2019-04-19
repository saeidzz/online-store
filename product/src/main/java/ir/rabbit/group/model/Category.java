package ir.rabbit.group.model;



import javax.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A Category.
 */
@Entity
@Table(name = "category")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "sub_categories")
    private List<Category> subCategories;

    @Column(name = "category_has_products")
    private CategoryHasProduct categoryHasProducts;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Category name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Category> getSubCategories() {
        return subCategories;
    }

    public Category subCategories(List<Category> subCategories) {
        this.subCategories = subCategories;
        return this;
    }

    public void setSubCategories(List<Category> subCategories) {
        this.subCategories = subCategories;
    }

    public CategoryHasProduct getCategoryHasProducts() {
        return categoryHasProducts;
    }

    public Category categoryHasProducts(CategoryHasProduct categoryHasProducts) {
        this.categoryHasProducts = categoryHasProducts;
        return this;
    }

    public void setCategoryHasProducts(CategoryHasProduct categoryHasProducts) {
        this.categoryHasProducts = categoryHasProducts;
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
        Category category = (Category) o;
        if (category.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), category.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Category{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", subCategories='" + getSubCategories() + "'" +
            ", categoryHasProducts='" + getCategoryHasProducts() + "'" +
            "}";
    }
}
