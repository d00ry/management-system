package dto;

import entity.PaymentStatus;

import java.util.ArrayList;
import java.util.List;

public class OrderRequest {
    private Long clientId;
    private PaymentStatus paymentStatus;

    List<OrderItemRequest> orderItemRequestList = new ArrayList<>();

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public List<OrderItemRequest> getOrderItemRequestList() {
        return orderItemRequestList;
    }

    public void setOrderItemRequestList(List<OrderItemRequest> orderItemRequestList) {
        this.orderItemRequestList = orderItemRequestList;
    }
}
