package subscriber.repository;

import org.springframework.stereotype.Repository;
import subscriber.entitie.Subscription;

@Repository
public interface SubscriptionRepository extends JsonMessageRepository<Subscription, Long> {
}
