// package praktikum9;

// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.layout.VBox;
// import javafx.scene.media.Media;
// import javafx.scene.media.MediaPlayer;
// import javafx.stage.Stage;


// public class Contoh extends Application {

//     private static final String AUDIO_FILE = "C:\\Users\\Fikri\\Desktop\\PRAKTIKUM SEMESTER 2\\Praktikum\\Pertemuan 9\\app\\src\\main\\resources\\Komang - Raim Laode ( Official Lirik ).mp3";

//     @Override
//     public void start(Stage primaryStage) {
//         // Buat tombol play
//         Button playButton = new Button("Play");
//         playButton.setOnAction(event -> playAudio());

//         // Buat layout
//         VBox root = new VBox(playButton);
//         root.setSpacing(10);

//         // Buat scene
//         Scene scene = new Scene(root, 200, 100);

//         // Set scene ke stage
//         primaryStage.setScene(scene);
//         primaryStage.setTitle("Audio Player");
//         primaryStage.show();
//     }

//     private void playAudio() {
//         // Buat objek Media dengan menggunakan file audio
//         Media media = new Media(new File(AUDIO_FILE).toURI().toString());

//         // Buat objek MediaPlayer
//         MediaPlayer mediaPlayer = new MediaPlayer(media);

//         // Panggil metode play()
//         mediaPlayer.play();
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }