package cn.porkchop.ebuy.pojo;

import cn.porkchop.ebuy.pojo.TbOrderItem;
import cn.porkchop.ebuy.pojo.TbOrderShipping;

import java.util.List;

public class OrderInfo extends TbOrder{
    private List<TbOrderItem> orderItems;
    private TbOrderShipping orderShipping;

    public List<TbOrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<TbOrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public TbOrderShipping getOrderShipping() {
        return orderShipping;
    }

    public void setOrderShipping(TbOrderShipping orderShipping) {
        this.orderShipping = orderShipping;
    }
}
