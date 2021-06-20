package subscriber.entitie;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SUBSCRIPTION")
public class Subscription extends JsonMessage{
    public Subscription() {
    }

    public Subscription(JsonMessage jsonMessage) {
        super(jsonMessage);
    }
}
