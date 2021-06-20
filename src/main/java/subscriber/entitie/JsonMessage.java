package subscriber.entitie;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@ToString
@Getter
@Setter
public class JsonMessage {
    @Id
    private Long id;
    private Long msisdn;
    private String action;
    private Long timestamp;

    public JsonMessage() {
    }

    public JsonMessage(JsonMessage jsonMessage) {
        this.setId(jsonMessage.getId());
        this.setAction(jsonMessage.getAction());
        this.setMsisdn(jsonMessage.getMsisdn());
        this.setTimestamp(jsonMessage.getTimestamp());
    }
}

