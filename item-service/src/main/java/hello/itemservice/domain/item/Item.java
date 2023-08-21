package hello.itemservice.domain.item;

import lombok.Getter;
import lombok.Setter;

//@Data 핵심 도메인에 쓸때는 생각해야 합니당
@Getter
@Setter
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
