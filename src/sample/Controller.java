package sample;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;

public class Controller {

    @FXML
    Label label_00;
    @FXML
    Label label_01;
    @FXML
    Label label_02;
    @FXML
    Label label_03;
    @FXML
    Label label_04;
    @FXML
    Label label_05;
    @FXML
    Label label_06;
    @FXML
    Label label_07;
    @FXML
    Label label_08;
    @FXML
    Label label_10;
    @FXML
    Label label_11;
    @FXML
    Label label_12;
    @FXML
    Label label_13;
    @FXML
    Label label_14;
    @FXML
    Label label_15;
    @FXML
    Label label_16;
    @FXML
    Label label_17;
    @FXML
    Label label_18;
    @FXML
    Label label_20;
    @FXML
    Label label_21;
    @FXML
    Label label_22;
    @FXML
    Label label_23;
    @FXML
    Label label_24;
    @FXML
    Label label_25;
    @FXML
    Label label_26;
    @FXML
    Label label_27;
    @FXML
    Label label_28;
    @FXML
    Label label_30;
    @FXML
    Label label_31;
    @FXML
    Label label_32;
    @FXML
    Label label_33;
    @FXML
    Label label_34;
    @FXML
    Label label_35;
    @FXML
    Label label_36;
    @FXML
    Label label_37;
    @FXML
    Label label_38;
    @FXML
    Label label_40;
    @FXML
    Label label_41;
    @FXML
    Label label_42;
    @FXML
    Label label_43;
    @FXML
    Label label_44;
    @FXML
    Label label_45;
    @FXML
    Label label_46;
    @FXML
    Label label_47;
    @FXML
    Label label_48;
    @FXML
    Label label_50;
    @FXML
    Label label_51;
    @FXML
    Label label_52;
    @FXML
    Label label_53;
    @FXML
    Label label_54;
    @FXML
    Label label_55;
    @FXML
    Label label_56;
    @FXML
    Label label_57;
    @FXML
    Label label_58;
    @FXML
    Label label_60;
    @FXML
    Label label_61;
    @FXML
    Label label_62;
    @FXML
    Label label_63;
    @FXML
    Label label_64;
    @FXML
    Label label_65;
    @FXML
    Label label_66;
    @FXML
    Label label_67;
    @FXML
    Label label_68;
    @FXML
    Label label_70;
    @FXML
    Label label_71;
    @FXML
    Label label_72;
    @FXML
    Label label_73;
    @FXML
    Label label_74;
    @FXML
    Label label_75;
    @FXML
    Label label_76;
    @FXML
    Label label_77;
    @FXML
    Label label_78;
    @FXML
    Label label_80;
    @FXML
    Label label_81;
    @FXML
    Label label_82;
    @FXML
    Label label_83;
    @FXML
    Label label_84;
    @FXML
    Label label_85;
    @FXML
    Label label_86;
    @FXML
    Label label_87;
    @FXML
    Label label_88;
    @FXML
    Rectangle r00;
    @FXML
    Rectangle r01;
    @FXML
    Rectangle r02;
    @FXML
    Rectangle r03;
    @FXML
    Rectangle r04;
    @FXML
    Rectangle r05;
    @FXML
    Rectangle r06;
    @FXML
    Rectangle r07;
    @FXML
    Rectangle r08;
    @FXML
    Rectangle r10;
    @FXML
    Rectangle r11;
    @FXML
    Rectangle r12;
    @FXML
    Rectangle r13;
    @FXML
    Rectangle r14;
    @FXML
    Rectangle r15;
    @FXML
    Rectangle r16;
    @FXML
    Rectangle r17;
    @FXML
    Rectangle r18;
    @FXML
    Rectangle r20;
    @FXML
    Rectangle r21;
    @FXML
    Rectangle r22;
    @FXML
    Rectangle r23;
    @FXML
    Rectangle r24;
    @FXML
    Rectangle r25;
    @FXML
    Rectangle r26;
    @FXML
    Rectangle r27;
    @FXML
    Rectangle r28;
    @FXML
    Rectangle r30;
    @FXML
    Rectangle r31;
    @FXML
    Rectangle r32;
    @FXML
    Rectangle r33;
    @FXML
    Rectangle r34;
    @FXML
    Rectangle r35;
    @FXML
    Rectangle r36;
    @FXML
    Rectangle r37;
    @FXML
    Rectangle r38;
    @FXML
    Rectangle r40;
    @FXML
    Rectangle r41;
    @FXML
    Rectangle r42;
    @FXML
    Rectangle r43;
    @FXML
    Rectangle r44;
    @FXML
    Rectangle r45;
    @FXML
    Rectangle r46;
    @FXML
    Rectangle r47;
    @FXML
    Rectangle r48;
    @FXML
    Rectangle r50;
    @FXML
    Rectangle r51;
    @FXML
    Rectangle r52;
    @FXML
    Rectangle r53;
    @FXML
    Rectangle r54;
    @FXML
    Rectangle r55;
    @FXML
    Rectangle r56;
    @FXML
    Rectangle r57;
    @FXML
    Rectangle r58;
    @FXML
    Rectangle r60;
    @FXML
    Rectangle r61;
    @FXML
    Rectangle r62;
    @FXML
    Rectangle r63;
    @FXML
    Rectangle r64;
    @FXML
    Rectangle r65;
    @FXML
    Rectangle r66;
    @FXML
    Rectangle r67;
    @FXML
    Rectangle r68;
    @FXML
    Rectangle r70;
    @FXML
    Rectangle r71;
    @FXML
    Rectangle r72;
    @FXML
    Rectangle r73;
    @FXML
    Rectangle r74;
    @FXML
    Rectangle r75;
    @FXML
    Rectangle r76;
    @FXML
    Rectangle r77;
    @FXML
    Rectangle r78;
    @FXML
    Rectangle r80;
    @FXML
    Rectangle r81;
    @FXML
    Rectangle r82;
    @FXML
    Rectangle r83;
    @FXML
    Rectangle r84;
    @FXML
    Rectangle r85;
    @FXML
    Rectangle r86;
    @FXML
    Rectangle r87;
    @FXML
    Rectangle r88;
    @FXML
    Button button;

    Label [][]suduko;
    public void initialize(){
        int [][]grid = {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        suduko = new Label[][]{
                {label_00,label_01 ,label_02 , label_03, label_04, label_05, label_06,label_07, label_08},
                {label_10,label_11 ,label_12 , label_13, label_14, label_15, label_16,label_17, label_18},
                {label_20,label_21 ,label_22 , label_23, label_24, label_25, label_26,label_27, label_28},
                {label_30,label_31 ,label_32 , label_33, label_34, label_35, label_36,label_37, label_38},
                {label_40,label_41 ,label_42 , label_43, label_44, label_45, label_46,label_47, label_48},
                {label_50,label_51 ,label_52 , label_53, label_54, label_55, label_56,label_57, label_58},
                {label_60,label_61 ,label_62 , label_63, label_64, label_65, label_66,label_67, label_68},
                {label_70,label_71 ,label_72 , label_73, label_74, label_75, label_76,label_77, label_78},
                {label_80,label_81 ,label_82 , label_83, label_84, label_85, label_86,label_87, label_88}
        };
        int n=suduko.length;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                suduko[i][j].setText(String.valueOf(grid[i][j]));

            }
        }
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                solveSuduko(suduko, n);
            }
        });
        thread.start();
    }
    public boolean isValid(Label[][] suduko,int row, int col,int number)
    {
        for (int d = 0; d < suduko.length; d++)
        {
            if (Integer.parseInt(suduko[row][d].getText()) == number) {
                return false;
            }
        }
        for (int r = 0; r < suduko.length; r++)
        {
            if (Integer.parseInt(suduko[r][col].getText()) == number)
            {
                return false;
            }
        }
        int sqrt = (int)Math.sqrt(suduko.length);
        int bRow = row - row % sqrt;
        int bCol = col - col % sqrt;
        for (int r = bRow;
             r < bRow + sqrt; r++)
        {
            for (int d = bCol;
                 d < bCol + sqrt; d++)
            {
                if (Integer.parseInt(suduko[r][d].getText()) == number)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean   solveSuduko(Label [][] suduko, int n)
    {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (Integer.parseInt(suduko[i][j].getText()) == 0)
                {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }
        if (isEmpty)
        {
            return true;
        }
        for (int number = 1; number <= n; number++)
        {
            if (isValid(suduko, row, col, number))
            {
                int finalRow = row;
                int finalCol = col;
                int finalNumber = number;
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        suduko[finalRow][finalCol].textProperty().setValue(Integer.toString(finalNumber));
                    }
                });

                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                if (  solveSuduko(suduko, n))
                {
                    return true;
                }
                else
                {
                    int finalRow1 = row;
                    int finalCol1 = col;
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            suduko[finalRow1][finalCol1].textProperty().setValue(Integer.toString(0));
                        }
                    });


                     try {
                         Thread.sleep(100);
                         }catch (InterruptedException e){
                           e.printStackTrace();
                         }
                }
            }
        }
        return false;
    }

}
