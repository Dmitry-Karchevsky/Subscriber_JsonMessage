package subscriber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import subscriber.entitie.JsonMessage;

import java.io.Serializable;

@NoRepositoryBean
public interface JsonMessageRepository<T extends JsonMessage, E extends Serializable> extends JpaRepository<T, E> {
}
