package hitandblow;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Kiichi
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML Label     lbl_Result;
    @FXML TextField txb_Digit4;
    @FXML TextField txb_Digit3;
    @FXML TextField txb_Digit2;
    @FXML TextField txb_Digit1;
    @FXML Button    btn_Enter;
    
    static Integer digits[];
    static Integer answer[];
    
    static final String msg_answer = "正解です！";
    
    @FXML
    public void Execute(){

        CreateAnswer();
        
//        digits[0] = Integer.parseInt(txb_Digit1.toString());
//        digits[1] = Integer.parseInt(txb_Digit2.toString());
//        digits[2] = Integer.parseInt(txb_Digit3.toString());
//        digits[3] = Integer.parseInt(txb_Digit4.toString());
        
    }
        
    public void CreateAnswer(){

        /* 4桁乱数生成, 格納 */
        Random rnd = new Random();
        for (Integer i = 0; i <= 3; i++){
            int ran = rnd.nextInt(9);
            answer[i] = ran;
        }
    } 

    /***
     * 処理結果の画面表示
     * @param answer
     * @param digits 
     */
    public void Display(Integer[] answer, Integer[] digits){
        
        Integer i = null;
        StringBuilder msg = new StringBuilder();
        Boolean[] result = null;
        
        GetResult(result);
        
        /**
         * 照会結果をチェック
         */
        
        if(!(result[0])){
            Integer msgNumber = 0;
        }
        
        
        if(result[0] 
            && result[1] 
            && result[2] 
            && result[3]){
            System.out.println("全桁正解!!");
        }
        
    }
    
    /***
     * 入力値と乱数値を照会
     * @param result
     * @return 
     */
    protected Integer[] GetResult(Boolean result[]){
    
        for (Integer i = 0; i >= 3; i++){
            result[i] = answer[i].equals(digits[i]);
        }
        return null;

    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
      	// Enterショートカット(CTRL + ENTER)
//        this.btn_Enter.setAccelerator(new KeyCodeCombination(KeyCode.ENTER,KeyCombination.CONTROL_DOWN,KeyCombination.SHORTCUT_ANY));
        
    }    
    
}
