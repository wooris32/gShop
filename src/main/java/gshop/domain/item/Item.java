package gshop.domain.item;

import gshop.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Item extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;
    private String unit;
    private String spec;
    private Double price;
    private String etc;

    @Builder
    public Item(String name, String unit, String spec, Double price, String etc){
        this.name = name;
        this.unit = unit;
        this.spec = spec;
        this.price = price;
        this.etc = etc;
    }

}
