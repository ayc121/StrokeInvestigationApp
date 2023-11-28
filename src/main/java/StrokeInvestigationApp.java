import Examinations.MRIExamination;
import Examinations.BPExamination;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;

public class StrokeInvestigationApp {
    public static void main(String[] args){
        JFrame frame = new JFrame("Stroke Investigation System");
        frame.setSize(450,400);
        JPanel mainPanel = new JPanel(new GridLayout(2,4));


        LocalDate ld1 = LocalDate.of(2023,9,14);
        MRIExamination mriExamination = new MRIExamination(" https://martinh.netfirms.com/BIOE60010/mri1.jpg", ld1,2);

        LocalDate ld2 = LocalDate.of(2023,9,15);
        BPExamination bpExamination = new BPExamination(130,70,ld2,"ST");

        Patient pat1 = new Patient("Daphne Von Oram","https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg",62, mriExamination,bpExamination);



        PicDisplay pat1pic = new PicDisplay(pat1.getPatientPicDisplayText());
        PicDisplay pat1MRI = new PicDisplay(pat1.getMRIResult());
        JLabel displaylabel1 = pat1pic.getPicLabel();
        JLabel displayLabel2 = new JLabel(pat1.getPatientDisplayText());
        JLabel displayLabel3 = pat1MRI.getPicLabel();
        JLabel displayLabel4 =  new JLabel(pat1.getBPResult());
        mainPanel.add(displaylabel1);
        mainPanel.add(displayLabel2);
        mainPanel.add(displayLabel3);
        mainPanel.add(displayLabel4);


        LocalDate ld3 = LocalDate.of(2023,11,19);
        MRIExamination mriExamination2 = new MRIExamination("https://martinh.netfirms.com/BIOE60010/mri2.jpg", ld3,4);

        LocalDate ld4 = LocalDate.of(2023,11,20);
        BPExamination bpExamination2 = new BPExamination(150,180,ld4,"VST");

        Patient pat2 = new Patient("Sebastian Compton","https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg",31, mriExamination2,bpExamination2);



        PicDisplay pat2pic = new PicDisplay(pat2.getPatientPicDisplayText());
        PicDisplay pat2MRI = new PicDisplay(pat2.getMRIResult());
        JLabel displaylabel5 = pat2pic.getPicLabel();
        JLabel displayLabel6 = new JLabel(pat2.getPatientDisplayText());
        JLabel displayLabel7 = pat2MRI.getPicLabel();
        JLabel displayLabel8 =  new JLabel(pat2.getBPResult());
        mainPanel.add(displaylabel5);
        mainPanel.add(displayLabel6);
        mainPanel.add(displayLabel7);
        mainPanel.add(displayLabel8);

        pat1.getConsoleDisplay();
        pat2.getConsoleDisplay();


        frame.setContentPane(mainPanel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
    });
    }
}
