package compal.tasks;

import java.io.Serializable;

public class Todo extends Task {

    public Todo(String description) {
        super(description);
        super.symbol = "T";
    }


}
