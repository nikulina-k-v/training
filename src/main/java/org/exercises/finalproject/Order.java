package org.exercises.finalproject;

import org.exercises.finalproject.enums.Status;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

public class Order {
    private LocalDateTime orderDate;
    private final User user;
    private Address address;
    private BigDecimal totalPrice;
    private Status status;
    private CartItem[] cartItemArray;

    public Order(LocalDateTime orderDate, User user, Address address, Status status, CartItem[] cartItemArray) {
        this.orderDate = orderDate;
        this.user = user;
        this.address = address;
        this.totalPrice = calculateTotalOrderPrice(cartItemArray);
        this.status = status;
        this.cartItemArray = cartItemArray;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public CartItem[] getCartItemArray() {
        return cartItemArray;
    }

    private BigDecimal calculateTotalOrderPrice(CartItem[] items) {
        BigDecimal sum = BigDecimal.valueOf(0);
        for (int i = 0; i < items.length; i++) {
            sum = sum.add(items[i].calculateTotalItemPrice());
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderDate=" + orderDate +
                ", user=" + user +
                ", address=" + address +
                ", totalPrice=" + totalPrice +
                ", status=" + status +
                ", cartItemArray=" + Arrays.toString(cartItemArray) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderDate, order.orderDate)
                && Objects.equals(user, order.user)
                && Objects.equals(address, order.address)
                && Objects.equals(totalPrice, order.totalPrice)
                && status == order.status
                && Objects.deepEquals(cartItemArray, order.cartItemArray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderDate, user, address, totalPrice, status, Arrays.hashCode(cartItemArray));
    }
}