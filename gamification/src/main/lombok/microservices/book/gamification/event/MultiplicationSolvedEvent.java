package microservices.book.gamification.event;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.io.Serializable;

/**
 * Event received when a multiplication has been solved in the system.
 * Provides some context information about the multiplication.
 */
//@AllArgsConstructor(onConstructor=@__(@JsonCreator))
@AllArgsConstructor 
@Getter
@ToString
@EqualsAndHashCode
public class MultiplicationSolvedEvent implements Serializable {

	private static final long serialVersionUID = 762582488774660776L;
    private Long multiplicationResultAttemptId;
    private Long userId;
    private boolean correct;
    
    public   MultiplicationSolvedEvent() {
    	super();
    }
}
