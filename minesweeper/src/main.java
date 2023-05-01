import javafx.application.Application;
import javafx.stage.Stage;

public class main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Minesweeper!");
        stage.show();
    }
    public static void main(String[] args){
        Application.launch();
        MineSweeperPanel newGame= new MineSweeperPanel();
    }

}
