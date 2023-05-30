package hellojava;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application {
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("H071221025");

        stage = primaryStage;
        showFirstScene();
        stage.show();
    }

    public void showFirstScene() {
        Image image = new Image("/OIP.jpeg");
        ImageView imageView = new ImageView(image);
    
        Label label = new Label("KALKULATOR");
        label.setFont(Font.font("ELEPHANT", 25));
    
        Button button1 = new Button("Mulai");
        button1.getStyleClass().add("custom-button1");
        button1.setOnAction(action -> {
            showSecondScene();
        });
    
        VBox vBox = new VBox(imageView, label, button1);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        vBox.setStyle("-fx-background-image: url('/background.jpeg');");
    
        Scene scenea = new Scene(vBox, 400, 450);
        scenea.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scenea);
    }
    

    public void showSecondScene() {
        Label label = new Label("Pilih Menu");
        label.setFont(Font.font("ELEPHANT", 25));
    
        Button kubus = new Button("Operasi Kubus");
        kubus.getStyleClass().add("custom-button1");
        kubus.setOnAction(action -> {
            showKubus();
        });
    
        Button suhu = new Button("Konversi Suhu");
        suhu.getStyleClass().add("custom-button1");
        suhu.setOnAction(action -> {
            showSuhu();
        });
    
        Button balok = new Button("Operasi Balok");
        balok.getStyleClass().add("custom-button1");
        balok.setOnAction(action -> {
            showBalok();
        });
    
        Button kembali = new Button("Kembali");
        kembali.getStyleClass().add("custom-button2");
        kembali.setOnAction(action -> {
            showFirstScene();
        });
    
        VBox vBox = new VBox(label, suhu, kubus, balok, kembali);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        vBox.setStyle("-fx-background-image: url('/background.jpeg');");
    
        Scene scene2 = new Scene(vBox, 400, 450);
        scene2.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene2);
    }
    
    
    public void showKubus() {
    Label label = new Label("Operasi Kubus");
    label.setFont(Font.font("ELEPHANT", 30));

    Label label2 = new Label("Masukkan panjang rusuk :");
    label2.setFont(Font.font("Times New Roman", 20));
    TextField input = new TextField();
    Label output = new Label();

    Button keliling = new Button("Keliling");
    keliling.getStyleClass().add("custom-button3");
    keliling.setOnAction(action -> {
        try {
            int angka = Integer.parseInt(input.getText());
            int hasil = 12 * angka;
            output.setText("Hasil = " + hasil + "cm");
            output.setFont(Font.font("Times New Roman", 20));
        } catch (NumberFormatException e) {
            output.setText("Bukan integer");
        }
    });

    Button luas = new Button("Luas");
    luas.getStyleClass().add("custom-button3");
    luas.setOnAction(action -> {
        try {
            int angka = Integer.parseInt(input.getText());
            int hasil = 6 * (angka*angka);
            output.setText("Hasil = " + hasil + "cm");
            output.setFont(Font.font("Times New Roman", 20));
        } catch (NumberFormatException e) {
            output.setText("Bukan integer");
        }
    });

    HBox luke = new HBox(keliling, luas);
    luke.setAlignment(Pos.CENTER);
    luke.setSpacing(5);

    Button volume = new Button("Volume");
    volume.getStyleClass().add("custom-button4");
    volume.setOnAction(action -> {
        try {
            int angka = Integer.parseInt(input.getText());
            int hasil = angka*angka*angka;
            output.setText("Hasil = " + hasil + "cm");
            output.setFont(Font.font("Times New Roman", 20));
        } catch (NumberFormatException e) {
            output.setText("Bukan integer");
        }
    });

    VBox lukevo = new VBox(luke, volume);
    lukevo.setAlignment(Pos.CENTER);
    lukevo.setSpacing(5);

    Button clear = new Button("Clear");
    clear.getStyleClass().add("custom-button1");
    clear.setOnAction(action -> {
        input.setText("");
    });

    Button back = new Button("Kembali");
    back.getStyleClass().add("custom-button2");
    back.setOnAction(action -> {
        showSecondScene();
    });

    VBox vBox = new VBox(label, label2, input, output, lukevo, clear, back);
    vBox.setAlignment(Pos.CENTER);
    vBox.setSpacing(15);
    vBox.setStyle("-fx-background-image: url('/background.jpeg');");

    Scene scene3 = new Scene(vBox, 400, 450);
    scene3.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
    stage.setScene(scene3);
}


    public void showSuhu() {
        Label label = new Label("Konversi Suhu");
        label.setFont(Font.font("ELEPHANT", 25));

        Label label2 = new Label("Celcius :");
        label2.setFont(Font.font("Times New Roman", 20));
        TextField input1 = new TextField();
        Label label3 = new Label("Fahrenheit :");
        label3.setFont(Font.font("Times New Roman", 20));
        TextField input2 = new TextField();
        Label label4 = new Label("Kelvin :");
        label4.setFont(Font.font("Times New Roman", 20));
        TextField input3 = new TextField();
        Label output = new Label();

        Button konversi = new Button("Konversi");
        konversi.getStyleClass().add("custom-button1");
        konversi.setOnAction(action -> {
            try {
                if (!input1.getText().isEmpty()) {
                    double celcius = Double.parseDouble(input1.getText());
                    double fahrenheit = celcius * 9/5 + 32;
                    input2.setText(String.format("%.2f", fahrenheit));
                    double kelvin = celcius + 273.15;
                    input3.setText(String.format("%.2f", kelvin));
                } else if (!input2.getText().isEmpty()) {
                    double fahrenheit = Double.parseDouble(input2.getText());
                    double celcius = (fahrenheit - 32) * 5/9;
                    input1.setText(String.format("%.2f", celcius));
                    double kelvin = (fahrenheit + 459.67) * 5/9;
                    input3.setText(String.format("%.2f", kelvin));
                } else if (!input3.getText().isEmpty()) {
                    double kelvin = Double.parseDouble(input3.getText());
                    double celcius = kelvin - 273.15;
                    input1.setText(String.format("%.2f", celcius));
                    double fahrenheit = kelvin * 9/5 - 459.67;
                    input2.setText(String.format("%.2f", fahrenheit));
                }
            } catch (NumberFormatException e) {
                output.setText("Bukan angka");
            }
        });

        Button clear = new Button("Clear");
        clear.getStyleClass().add("custom-button1");
        clear.setOnAction(action -> {
            input1.setText("");
            input2.setText("");
            input3.setText("");
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-button2");
        back.setOnAction(action -> {
            showSecondScene();
        });


        VBox vBox = new VBox(label, label2, input1, label3, input2, label4, input3, konversi, clear, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(5);
        vBox.setStyle("-fx-background-image: url('/background.jpeg');");

        Scene scene3 = new Scene(vBox, 400, 450);
        scene3.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene3);

    }

    public void showBalok() {
        Label label = new Label("Operasi Balok");
        label.setFont(Font.font("ELEPHANT", 25));
    
        Label label2 = new Label("Masukkan panjang :");
        label2.setFont(Font.font("Times New Roman", 15));
        TextField input1 = new TextField();
        Label label3 = new Label("Masukkan lebar :");
        label3.setFont(Font.font("Times New Roman", 15));
        TextField input2 = new TextField();
        Label label4 = new Label("Masukkan tinggi :");
        label4.setFont(Font.font("Times New Roman", 15));
        TextField input3 = new TextField();
        Label output = new Label();
    
        Button keliling = new Button("Keliling");
        keliling.getStyleClass().add("custom-button3");
        keliling.setOnAction(action -> {
            try {
                int angka1 = Integer.parseInt(input1.getText());
                int angka2 = Integer.parseInt(input2.getText());
                int angka3 = Integer.parseInt(input3.getText());
                int hasil = 4 * (angka1 + angka2 + angka3);
                output.setText("Hasil = " + hasil + "cm");
                output.setFont(Font.font("Times New Roman", 20));
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });
    
        Button luas = new Button("Luas");
        luas.getStyleClass().add("custom-button3");
        luas.setOnAction(action -> {
            try {
                int angka1 = Integer.parseInt(input1.getText());
                int angka2 = Integer.parseInt(input2.getText());
                int angka3 = Integer.parseInt(input3.getText());
                int hasil = 2 * (angka1 * angka2 + angka1 * angka3 + angka2 * angka3);
                output.setText("Hasil = " + hasil + "cm");
                output.setFont(Font.font("Times New Roman", 20));
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });
    
        HBox luke = new HBox(keliling, luas);
        luke.setAlignment(Pos.CENTER);
        luke.setSpacing(5);
    
    Button volume = new Button("Volume");
    volume.getStyleClass().add("custom-button4");
    volume.setOnAction(action -> {
        try {
            int angka1 = Integer.parseInt(input1.getText());
            int angka2 = Integer.parseInt(input2.getText());
            int angka3 = Integer.parseInt(input3.getText());
            int hasil = angka1 * angka2 * angka3;
            output.setText("Hasil = " + hasil + "cm");
            output.setFont(Font.font("Times New Roman", 20));
            } catch (NumberFormatException e) {
            output.setText("Bukan integer");
            }
    });

        VBox lukevo = new VBox(luke, volume);
        lukevo.setAlignment(Pos.CENTER);
        lukevo.setSpacing(5);

        Button clear = new Button("Clear");
        clear.getStyleClass().add("custom-button1");
        clear.setOnAction(action -> {
            input1.setText("");
            input2.setText("");
            input3.setText("");
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-button2");
        back.setOnAction(action -> {
            showSecondScene();
        });

        VBox vBox = new VBox(label, label2, input1, label3, input2, label4, input3, output, lukevo, clear, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        vBox.setStyle("-fx-background-image: url('/background.jpeg');");

        Scene scene3 = new Scene(vBox, 450, 550);
        scene3.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene3);
    }
}