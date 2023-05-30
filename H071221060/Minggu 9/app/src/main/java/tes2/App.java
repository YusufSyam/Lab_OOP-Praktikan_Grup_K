package tes2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.scene.text.Font;

public class App extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Kalkulator");

        Image icon = new Image("/image/a.png");
        this.primaryStage.getIcons().add(icon);
        
        halamanPertama();

    }

    private void halamanPertama() {
        //Membuat Nama, Logo, dan Tombol
        ImageView imageView = new ImageView();
        String imagePath = "/image/a.png";
        Image image = new Image(imagePath);
        imageView.setImage(image);
        imageView.setFitHeight(150);
        imageView.setFitWidth(150);

        Label label = new Label("KALKULATOR");
        label.setFont(new Font(20));
        label.setStyle("-fx-font-weight: bold; -fx-font-family: Verdana; -fx-text-fill: white;");

        Button button = new Button("MULAI");
        button.setStyle("-fx-background-color: #e4c200; -fx-font-weight: bold; -fx-text-fill: white; -fx-padding: 8px 36px; -fx-background-radius: 20");
        button.setOnAction(e -> halamanKedua());

        // Membuat layout dan menambahkan komponen ke dalamnya
        VBox layout = new VBox(30);
        layout.setStyle("-fx-background-color: #01031a;");
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(imageView, label, button);
    
        // Membuat scene dengan layout sebagai root
        Scene scene = new Scene(layout, 300, 500);
    
        // Mengatur scene ke dalam stage
        primaryStage.setScene(scene);
    
        // Menampilkan stage
        primaryStage.show();
    }
    
    private void halamanKedua() {
        // membuat label dan tombol
        Label label = new Label("PILIH MENU");
        Label label2 = new Label(" ");

        label.setFont(new Font(20));
        label.setStyle("-fx-font-weight: bold; -fx-font-family: Verdana; -fx-text-fill: white;");

        Button button = new Button("Konversi Suhu");
        button.setStyle("-fx-font-family: Verdana; -fx-font-weight: bold; -fx-padding: 20px 60px; -fx-background-radius: 10;");
        button.setOnAction(e -> konversiSuhu());

        Button button1 = new Button("Bangun Datar");
        button1.setStyle("-fx-font-family: Verdana; -fx-font-weight: bold; -fx-padding: 20px 60px; -fx-background-radius: 10;");
        button1.setOnAction(e -> halamanKetiga());



        // Membuat layout dan menambahkan komponen ke dalamnya
        VBox layout = new VBox(20);
        layout.setStyle("-fx-background-color: #01031a;");
        layout.setAlignment(Pos.TOP_CENTER);
        layout.getChildren().addAll(label2, label, button, button1);
    
        // Membuat scene dengan layout sebagai root
        Scene scene = new Scene(layout, 300, 500);
    
        // Mengatur scene ke dalam stage
        primaryStage.setScene(scene);
    
        // Menampilkan stage
        primaryStage.show();
    }

    private void halamanKetiga() {
        // membuat label dan tombol
        Label label = new Label("PILIH BANGUN DATAR");
        Label label2 = new Label(" ");

        label.setFont(new Font(20));
        label.setStyle("-fx-font-weight: bold; -fx-font-family: Verdana; -fx-text-fill: white;");

        Button button = new Button("Persegi");
        button.setStyle("-fx-font-family: Verdana; -fx-font-weight: bold; -fx-padding: 20px 60px; -fx-background-radius: 10;");
        button.setOnAction(e -> persegi());

        Button button1 = new Button("Persegi Panjang");
        button1.setStyle("-fx-font-family: Verdana; -fx-font-weight: bold; -fx-padding: 20px 60px; -fx-background-radius: 10;");
        button1.setOnAction(e -> persegiPanjang());

        Button buttonHome = new Button("Back to Home");
        buttonHome.setFont(new Font(20));
        buttonHome.setStyle("-fx-background-color: #cc2115; -fx-text-fill: white; -fx-padding: 8px 26px;");
        buttonHome.setOnAction(e -> halamanKedua());

        // Membuat layout dan menambahkan komponen ke dalamnya
        VBox layout = new VBox(20);
        layout.setStyle("-fx-background-color: #01031a;");
        layout.setAlignment(Pos.TOP_CENTER);
        layout.getChildren().addAll(label2, label, button, button1, buttonHome);
    
        // Membuat scene dengan layout sebagai root
        Scene scene = new Scene(layout, 300, 500);
    
        // Mengatur scene ke dalam stage
        primaryStage.setScene(scene);
    
        // Menampilkan stage
        primaryStage.show();
    }

    private void konversiSuhu() {
        // membuat Label
        Label label1 = new Label(" ");
        Label label2 = new Label("Konversi Suhu");
        Label label3 = new Label(" Hasil");
        Label label4 = new Label(" ");

        label2.setFont(new Font(20));
        label2.setStyle("-fx-font-weight: bold; -fx-font-family: Verdana;");
        label3.setFont(new Font(18));
        label3.setStyle("-fx-font-weight: bold; -fx-font-family: Verdana;");  
        label4.setFont(new Font(20));
        label4.setStyle("-fx-font-family: Verdana;");

        // membuat TextField
        TextField input1 = new TextField();
        input1.setPromptText("Celcius : ");


        // membuat Button
        Button button1 = new Button("Clear");
        button1.setFont(new Font(20));
        button1.setStyle("-fx-background-radius: 10;");
        button1.setOnAction(e -> {
            input1.clear();
            label4.setText("");
        });

        Button buttona = new Button("F");
        buttona.setFont(new Font(20));
        buttona.setStyle("-fx-background-radius: 10; -fx-background-color: #e4c200;");
        buttona.setOnAction(e -> {
            String input1text = input1.getText();
            int angka1 = Integer.parseInt(input1text);
            int hasil = (angka1 * 9/5) + 32;
            String jawaban = String.valueOf(hasil);
            label4.setText(jawaban);
        });

        Button buttonb = new Button("K");
        buttonb.setFont(new Font(20));
        buttonb.setStyle("-fx-background-radius: 10; -fx-background-color: #e4c200;");
        buttonb.setOnAction(e -> {
            String input1text = input1.getText();
            int angka1 = Integer.parseInt(input1text);
            int hasil = angka1 + 273;
            String jawaban = String.valueOf(hasil);
            label4.setText(jawaban);
        });


        Button button3 = new Button("Back to Home");
        button3.setFont(new Font(20));
        button3.setStyle("-fx-background-color: #01031a; -fx-text-fill: white; -fx-padding: 8px 26px;");
        button3.setOnAction(e -> halamanKedua());

        // Membuat layout dan menambahkan komponen ke dalamnya
        VBox vBox1 = new VBox(5, label1, label2);
        vBox1.setAlignment(Pos.CENTER);

        VBox vBox2 = new VBox(5, label3);

        HBox hBox1 = new HBox(10, label4);
        
        HBox hBox2 = new HBox(10, buttona, buttonb);
        hBox2.setAlignment(Pos.CENTER);

        HBox hBox3 = new HBox(10, button1);
        hBox3.setAlignment(Pos.CENTER);

        VBox layout = new VBox(10);
        layout.setStyle("-fx-background-color: #b5b6b9;");
        layout.setAlignment(Pos.TOP_CENTER);
        layout.getChildren().addAll(vBox1, input1, vBox2, hBox1, hBox2, hBox3, button3);

        // Membuat scene dengan layout sebagai root
        Scene scene = new Scene(layout, 300, 500);
    
        // Mengatur scene ke dalam stage
        primaryStage.setScene(scene);
    
        // Menampilkan stage
        primaryStage.show();
    }

    private void persegi() {

        // membuat Label
        Label label1 = new Label(" ");
        Label label2 = new Label("Persegi");
        Label label3 = new Label(" Hasil : ");
        Label label4 = new Label(" ");

        label2.setFont(new Font(20));
        label2.setStyle("-fx-font-weight: bold; -fx-font-family: Verdana;");
        label3.setFont(new Font(18));
        label3.setStyle("-fx-font-weight: bold; -fx-font-family: Verdana;"); 
        label4.setFont(new Font(20));
        label4.setStyle("-fx-font-family: Verdana;");  

        // membuat TextField
        TextField input1 = new TextField();
        input1.setPromptText("Input sisi");

        // membuat Button
        Button buttonLuas = new Button("Luas");
        buttonLuas.setFont(new Font(20));
        buttonLuas.setStyle("-fx-background-radius: 10; -fx-background-color: #e4c200;");
        buttonLuas.setOnAction(e -> {
            String input1text = input1.getText();
            int angka1 = Integer.parseInt(input1text);
            int hasil = angka1 * angka1;
            String hasilText = String.valueOf(hasil);
            label4.setText(hasilText);
        });

        Button buttonKeliling = new Button("Keliling");
        buttonKeliling.setFont(new Font(20));
        buttonKeliling.setStyle("-fx-background-radius: 10; -fx-background-color: #e4c200;");
        buttonKeliling.setOnAction(e -> {
            String input1text = input1.getText();
            int angka1 = Integer.parseInt(input1text);
            int hasil = 4 * angka1;
            String hasilText = String.valueOf(hasil);
            label4.setText(hasilText);
        });

        Button buttonClear = new Button("Clear");
        buttonClear.setFont(new Font(20));
        buttonClear.setStyle("-fx-background-radius: 10;");
        buttonClear.setOnAction(e -> {
            input1.clear();
            label4.setText("");;
        });

        Button buttonHome = new Button("Back");
        buttonHome.setFont(new Font(20));
        buttonHome.setStyle("-fx-background-color: #01031a; -fx-text-fill: white; -fx-padding: 8px 26px;");
        buttonHome.setOnAction(e -> halamanKetiga());

        // Membuat layout dan menambahkan komponen ke dalamnya
        VBox vBox1 = new VBox(5, label1, label2);
        vBox1.setAlignment(Pos.CENTER);

        HBox hBox1 = new HBox(10, label3, label4);

        HBox hBox2 = new HBox(10, buttonLuas, buttonKeliling);
        hBox2.setAlignment(Pos.CENTER);

        VBox vBox2 = new VBox(5, buttonClear, buttonHome);
        vBox2.setAlignment(Pos.CENTER);

        VBox layout = new VBox(10);
        layout.setStyle("-fx-background-color: #b5b6b9;");
        layout.setAlignment(Pos.TOP_CENTER);
        layout.getChildren().addAll(vBox1, input1, hBox1, hBox2, vBox2);

        // Membuat scene dengan layout sebagai root
        Scene scene = new Scene(layout, 300, 500);
    
        // Mengatur scene ke dalam stage
        primaryStage.setScene(scene);
    
        // Menampilkan stage
        primaryStage.show();
    }

    private void persegiPanjang() {
        // membuat Gambar
        ImageView imageView = new ImageView();
        String imagePath = "file:D:/persegiPanjang1.png";
        Image image = new Image(imagePath);
        imageView.setImage(image);
        imageView.setFitHeight(120);
        imageView.setFitWidth(170);

        // membuat Label
        Label label1 = new Label(" ");
        Label label2 = new Label("Persegi Panjang");
        Label label3 = new Label(" Hasil : ");
        Label label4 = new Label(" ");

        label2.setFont(new Font(20));
        label2.setStyle("-fx-font-weight: bold; -fx-font-family: Verdana;");
        label3.setFont(new Font(18));
        label3.setStyle("-fx-font-weight: bold; -fx-font-family: Verdana;"); 
        label4.setFont(new Font(20));
        label4.setStyle("-fx-font-family: Verdana;");

        // membuat TextField
        TextField input1 = new TextField();
        input1.setPromptText("Input panjang");
        TextField input2 = new TextField();
        input2.setPromptText("Input lebar");

        // membuat Button
        Button buttonLuas = new Button("Luas");
        buttonLuas.setFont(new Font(20));
        buttonLuas.setStyle("-fx-background-radius: 10; -fx-background-color: #e4c200;");
        buttonLuas.setOnAction(e -> {
            String input1text = input1.getText();
            String input2text = input2.getText();
            int angka1 = Integer.parseInt(input1text);
            int angka2 = Integer.parseInt(input2text);
            int hasil = angka1 * angka2;
            String hasilText = String.valueOf(hasil);
            label4.setText(hasilText);
        });

        Button buttonKeliling = new Button("Keliling");
        buttonKeliling.setFont(new Font(20));
        buttonKeliling.setStyle("-fx-background-radius: 10; -fx-background-color: #e4c200;");
        buttonKeliling.setOnAction(e -> {
            String input1text = input1.getText();
            String input2text = input2.getText();
            int angka1 = Integer.parseInt(input1text);
            int angka2 = Integer.parseInt(input2text);
            int hasil = 2 * (angka1+angka2);
            String hasilText = String.valueOf(hasil);
            label4.setText(hasilText);
        });

        Button buttonClear = new Button("Clear");
        buttonClear.setFont(new Font(20));
        buttonClear.setStyle("-fx-background-radius: 10;");
        buttonClear.setOnAction(e -> {
            input1.clear();
            input2.clear();
            label4.setText("");;
        });

        Button buttonHome = new Button("Back");
        buttonHome.setFont(new Font(20));
        buttonHome.setStyle("-fx-background-color: #01031a; -fx-text-fill: white; -fx-padding: 8px 26px;");
        buttonHome.setOnAction(e -> halamanKetiga());

        // Membuat layout dan menambahkan komponen ke dalamnya
        VBox vBox1 = new VBox(5, label1, label2);
        vBox1.setAlignment(Pos.CENTER);

        HBox hBox1 = new HBox(10, label3, label4);

        HBox hBox2 = new HBox(10, buttonLuas, buttonKeliling);
        hBox2.setAlignment(Pos.CENTER);

        VBox vBox2 = new VBox(5, buttonClear, buttonHome);
        vBox2.setAlignment(Pos.CENTER);

        VBox layout = new VBox(10);
        layout.setStyle("-fx-background-color: #b5b6b9;");
        layout.setAlignment(Pos.TOP_CENTER);
        layout.getChildren().addAll(vBox1, imageView, input1, input2, hBox1, hBox2, vBox2);
    
        // Membuat scene dengan layout sebagai root
        Scene scene = new Scene(layout, 300, 500);
    
        // Mengatur scene ke dalam stage
        primaryStage.setScene(scene);
    
        // Menampilkan stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}