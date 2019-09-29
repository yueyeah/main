package compal.tasks;

/**
 * Represents recurring task type with date and time.
 */
public class RecurringTask extends Task {

    /**
     * Constructs RecurringTask object.
     *
     * @param description Description of recurring task.
     * @param date        Starting date of recurring task.
     * @param sTime        Starting time of recurring task.
     * @param priority    priority level of task type
     * @param eTime       End time of deadline
     */
    public RecurringTask(String description, Priority priority, String date, String sTime,String eTime, String symbol) {
        super(description, priority);
        super.symbol = symbol;
        super.setDate(date);
        super.setStartTime(sTime);
        super.setEndTime(eTime);
    }
}
