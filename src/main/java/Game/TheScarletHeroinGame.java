package Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TheScarletHeroinGame {
    SelectionHandler sHandler = new SelectionHandler();
    theScarletHeroinGui gui = new theScarletHeroinGui();
    theScarletHeroin theScarletHeroin = new theScarletHeroin(this, gui);
    String nextPosition1, nextPosition2, nextPosition3, nextPosition4, nextPosition5, nextPosition6, nextPosition7, nextPosition8;

    public TheScarletHeroinGame() {
        gui.setTheScarletHeroinGui(sHandler);
        theScarletHeroin.defaultSetup();
    }

    public class SelectionHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            String scarletSelection = event.getActionCommand();

            switch (scarletSelection) {
                case "Go to St Mary's Town": theScarletHeroin.selectPosition(nextPosition1);
                    break;
                case "HeroinChoice2":
                    theScarletHeroin.selectPosition(nextPosition2);
                    break;
                case "HeroinChoice3":
                    theScarletHeroin.selectPosition(nextPosition3);
                    break;
                case "HeroinChoice4":
                    theScarletHeroin.selectPosition(nextPosition4);
                    break;
                case "HeroinChoice5":
                    theScarletHeroin.selectPosition(nextPosition5);
                    break;
                case "HeroinChoice6":
                    theScarletHeroin.selectPosition(nextPosition6);
                    break;
                case "HeroinChoice7":
                    theScarletHeroin.selectPosition(nextPosition7);
                    break;
                case "HeroinChoice8":
                    theScarletHeroin.selectPosition(nextPosition8);
                    break;
            }
        }

    }
}
