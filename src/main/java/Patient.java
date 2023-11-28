import Examinations.BPExamination;
import Examinations.Examination;
import Examinations.MRIExamination;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Patient  {
    private final String name;
    private String urlPat;
    private int age;

    private MRIExamination mri;
    private BPExamination bp;
    private ArrayList<Examination> examinations = new ArrayList<Examination>();

    public Patient(String name, String urlPat, int age, MRIExamination mri, BPExamination bp){
        this.name = name;
        this.urlPat = urlPat;
        this.age = age;
        this.mri = mri;
        this.bp = bp;
    }

    public void addExamination(Examination examination){
        examinations.add(examination);
    }

    public String getPatientDisplayText(){
        return "Name: " + name + "<br>" + "Age: "+ age;
    }

    public String getMRIResult(){
        return mri.getDisplayText();
    }

    public String getBPResult(){
        return bp.getDisplayText();
    }


    public String getPatientPicDisplayText(){
        return urlPat;
    }


    public String getConsoleDisplay(){
        String display=new String("<html>");
        display+="Patient: "+name+": ";
        for(Examination ex:examinations){
            display+= ex.getConsoleText();
        }
        return display+"<br></html>";

    }
}
