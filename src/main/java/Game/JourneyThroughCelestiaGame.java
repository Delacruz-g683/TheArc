package Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JourneyThroughCelestiaGame {
    SelectionHandler sHandler = new SelectionHandler();
    JourneyThroughCelestiaGUI gui = new JourneyThroughCelestiaGUI();

    JourneyThroughCelestia journeyThroughCelestia = new JourneyThroughCelestia(this, gui);

    String nextPosition1, nextPosition2, nextPosition3, nextPosition4;

    public JourneyThroughCelestiaGame() {
        gui.setJourneyThroughCelestia(sHandler);
        journeyThroughCelestia.defaultSetup();
    }

    public class SelectionHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            String celestiaSelection = event.getActionCommand();

            switch (celestiaSelection)
            {
                case "CelestiaChoice1":
                    journeyThroughCelestia.selectPosition(nextPosition1);
                    break;
                case "CelestiaChoice2":
                    journeyThroughCelestia.selectPosition(nextPosition2);
                    break;
                case "CelestiaChoice3":
                    journeyThroughCelestia.selectPosition(nextPosition3);
                    break;
                case "CelestiaChoice4":
                    journeyThroughCelestia.selectPosition(nextPosition4);
                    break;

            }
        }
    }
}
