package Examinations;

import java.time.LocalDate;

public abstract class Examination {
    protected LocalDate date;

    public Examination(LocalDate date){
        this.date = date;
    }

    public abstract String getDisplayText();
    public abstract String getConsoleText();
}
