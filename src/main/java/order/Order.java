package order;

import delivery.Delivery;
import flowers.Item;
import payment.Payment;
import user.User;

import java.util.LinkedList;
import java.util.List;

public class Order {
    private Payment payment;
    private Delivery delivery;
    private LinkedList<Item> items;
    private List<User> users;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;

        for (Item item : items) {
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void removeUser(User user) {
        this.users.remove(user);
    }

    public void notifyUsers() {
        for (User user : users) {
            user.update("User is notified");
        }
    }

    public void order() {
       notifyUsers();
    }
}
