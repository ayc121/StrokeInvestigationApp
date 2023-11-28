package Examinations;

import java.time.LocalDate;

public class BPExamination extends Examination {
    private int systolic;
    private int diastolic;
    private String duration;

    public BPExamination(int systolic, int diastolic, LocalDate date, String duration){
        super(date);
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.duration = duration;
    }

    public String getDisplayText(){
        return "Blood pressure " + systolic + " over " + diastolic+ "<br>";
    }
    public String getConsoleText(){
        return "BP: " + duration + ", " + date.toString();
    }
}
