package csvserv.Entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "priceitems", schema = "public", catalog = "CSVBase")
public class PriceitemsEntity {
    private String vendor;
    private String number;
    private String searchvendor;
    private String searchnumber;
    private String description;
    private BigDecimal price;
    private Integer count;
    private int id;


    public PriceitemsEntity(String vendor,
                            String number,
                            String searchvendor,
                            String searchnumber,
                            String description,
                            BigDecimal price,
                            Integer count) {
        this.vendor = vendor;
        this.number = number;
        this.searchvendor = searchvendor;
        this.searchnumber = searchnumber;
        if (description.length() > 511) {
            this.description = description.substring(0,511);}
        else {
            this.description = description;
        }
        this.price = price;
        this.count = count;
    }

    public PriceitemsEntity() {
    }

    @Basic
    @Column(name = "vendor", nullable = true, length = 64)
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Basic
    @Column(name = "number", nullable = true, length = 64)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Basic
    @Column(name = "searchvendor", nullable = true, length = 64)
    public String getSearchvendor() {
        return searchvendor;
    }

    public void setSearchvendor(String searchvendor) {
        this.searchvendor = searchvendor;
    }

    @Basic
    @Column(name = "searchnumber", nullable = true, length = 64)
    public String getSearchnumber() {
        return searchnumber;
    }

    public void setSearchnumber(String searchnumber) {
        this.searchnumber = searchnumber;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 512)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length() > 511) {
            this.description = description.substring(0,511);}
        else {
            this.description = description;
        }
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "count", nullable = true)
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PriceitemsEntity that = (PriceitemsEntity) o;

        if (id != that.id) return false;
        if (vendor != null ? !vendor.equals(that.vendor) : that.vendor != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (searchvendor != null ? !searchvendor.equals(that.searchvendor) : that.searchvendor != null) return false;
        if (searchnumber != null ? !searchnumber.equals(that.searchnumber) : that.searchnumber != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vendor != null ? vendor.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (searchvendor != null ? searchvendor.hashCode() : 0);
        result = 31 * result + (searchnumber != null ? searchnumber.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
