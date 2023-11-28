import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class PicDisplay {
    private String url;
    public PicDisplay(String url){
        this.url = url;
    }

    public JLabel getPicLabel(){
        JLabel displaylabel = new JLabel();
        URL imageURL = null;
        try{
            imageURL = new URL(url);
        }
        catch (
                MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        displaylabel.setIcon(thisImageIcon);
        return displaylabel;
    }

}
