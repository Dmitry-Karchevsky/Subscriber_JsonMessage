package subscriber.sevice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import subscriber.entitie.JsonMessage;
import subscriber.entitie.Purchase;
import subscriber.entitie.Subscription;
import subscriber.repository.PurchaseRepository;
import subscriber.repository.SubscriptionRepository;

@Service
public class JsonMessageService {
    @Autowired
    private PurchaseRepository purchaseRepository;

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void saveMessage(JsonMessage message) {
        if (message.getAction().equals("PURCHASE")) {
            Purchase purchase = new Purchase(message);
            purchaseRepository.save(purchase);
            logger.info("Write to PURCHASE :" + message.toString());
        }
        else if (message.getAction().equals("SUBSCRIPTION")) {
            Subscription subscription = new Subscription(message);
            subscriptionRepository.save(subscription);
            logger.info("Write to SUBSCRIPTION :" + message.toString());
        }
    }
}
