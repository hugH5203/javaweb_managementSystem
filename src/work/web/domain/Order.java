package work.web.domain;

/**
 * @author HuangHai
 * @date 2020/12/21 17:19
 */
public class Order {
    private  int goods;

    @Override
    public String toString() {
        return "Order{" +
                "goods=" + goods +
                '}';
    }

    public Order() {
    }

    public Order(int goods) {
        this.goods = goods;
    }

    public int getGoods() {
        return goods;
    }

    public void setGoods(int goods) {
        this.goods = goods;
    }
}
