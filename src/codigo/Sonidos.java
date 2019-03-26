package codigo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Sharon
 */
public class Sonidos {

    private static File file;
    private static String ruta;
    public static boolean disparo = true;

    public static void disparo() {
        file = new File(".");
        ruta = file.getAbsolutePath();
        Thread hilo = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                    FileInputStream fis;
                    Player player;
                    try {
                        fis = new FileInputStream(ruta + "/src/sonidos/disparo.mp3");
                    } catch (FileNotFoundException e) {
                        fis = new FileInputStream(ruta + "/src/sonidos/disparo.mp3");
                    }
                    BufferedInputStream bis = new BufferedInputStream(fis);
                    player = new Player(bis);
                    player.play();
                    stop();
                } catch (InterruptedException | JavaLayerException | FileNotFoundException e) {
                }
            }
        };
        hilo.start();
    }

    public static void muerteMarcianos() {
        file = new File(".");
        ruta = file.getAbsolutePath();
        Thread hilo = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                    FileInputStream fis;
                    Player player;
                    try {
                        fis = new FileInputStream(ruta + "/src/sonidos/impacto.mp3");
                    } catch (FileNotFoundException e) {
                        fis = new FileInputStream(ruta + "/complementos/impacto.mp3");
                    }
                    BufferedInputStream bis = new BufferedInputStream(fis);
                    player = new Player(bis);
                    player.play();
                    stop();
                } catch (InterruptedException | JavaLayerException | FileNotFoundException e) {
                }
            }
        };
        hilo.start();
    }

}
