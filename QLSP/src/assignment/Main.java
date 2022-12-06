package assignment;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
    
    public static dsConnectDatabase connection = new dsConnectDatabase();
    public static int LuotDangNhap = 1;    
    public static String hienThiTaiKhoan = "";
    public static String hienThiMatKhauNguoiDung = "";
    public static String hienThiTenNguoiDung = "";
    
    public static void main(String[] args) {
        frmDangNhap frmLogin = new frmDangNhap();
        frmLogin.show();
    }
    public static void thongBao(String noiDungThongBao,String tieuDeThongBao,int icon){
        JOptionPane.showMessageDialog(new JFrame(),noiDungThongBao,tieuDeThongBao,icon);
    }
    public static void playSound(String soundName){
        try{
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(
                    new File(soundName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }
        catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println(e.toString());
        }
    }
}
