package Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AzureGame {
    SelectionHandler sHandler = new SelectionHandler();
    AzureGUI gui = new AzureGUI();
    Azure azure = new Azure(this, gui);
    String nextPosition1, nextPosition2, nextPosition3, nextPosition4;

    public AzureGame(){
        gui.setAzureGUI(sHandler);
        azure.defaultSetUp();
    }

    public class SelectionHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            String azureSelection = event.getActionCommand();

            switch (azureSelection) {
          /*      case "Game": vm.toStorySelection();
                    break;
                case "Story1":cc
                    break;
                case "Story2":
                    break;*/

                case "Azure": azure.homeTownAzure();
                    break;
                case "s1": azure.selectPosition(nextPosition1);
                    break;
                case "s2": azure.selectPosition(nextPosition2);
                    break;
                case "s3": azure.selectPosition(nextPosition3);
                    break;
                case "s4": azure.selectPosition(nextPosition4);
                    break;
            }
        }
    }
}
