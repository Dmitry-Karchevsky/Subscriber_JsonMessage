package subscriber.entitie;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PURCHASE")
public class Purchase extends JsonMessage{
    public Purchase() {
    }

    public Purchase(JsonMessage jsonMessage) {
        super(jsonMessage);
    }
}
