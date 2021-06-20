package subscriber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import subscriber.entitie.JsonMessage;
import subscriber.sevice.JsonMessageService;

@RestController
public class SubscriberController {
    @Autowired
    private JsonMessageService jsonMessageService;

    @PostMapping
    public ResponseEntity<JsonMessage> getMessage(@RequestBody JsonMessage message) {
        jsonMessageService.saveMessage(message);
        return ResponseEntity.ok(message);
    }
}
