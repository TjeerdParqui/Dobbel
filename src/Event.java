import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tjeerd on 1/22/17.
 */
public class Event implements  ActionListener{

        public void actionPerformed(ActionEvent e){

            double a = Math.random();
            int b = (int) (a * 6) + 1;
            System.out.println(b);
            switch(b){
                default: ProjectOne.label.setIcon(ProjectOne.img);
                    break;
                case 2:  ProjectOne.label.setIcon(ProjectOne.img2);
                    break;
                case 3:  ProjectOne.label.setIcon(ProjectOne.img3);
                    break;
                case 4:  ProjectOne.label.setIcon(ProjectOne.img4);
                    break;
                case 5:  ProjectOne.label.setIcon(ProjectOne.img5);
                    break;
                case 6:  ProjectOne.label.setIcon(ProjectOne.img6);
                    break;

            }


        }


    }

