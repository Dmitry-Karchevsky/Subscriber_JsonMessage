package subscriber.repository;

import org.springframework.stereotype.Repository;
import subscriber.entitie.Purchase;

@Repository
public interface PurchaseRepository extends JsonMessageRepository<Purchase, Long> {
}
