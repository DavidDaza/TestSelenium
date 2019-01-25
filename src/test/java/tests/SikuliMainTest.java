package tests;

import pages.ActionDesktop;
import pages.ActionGui;

/**
 *
 * @author SQA
 */
public class SikuliMainTest {

    public static void main(String[] args) {
        try {
            ActionDesktop ad = new ActionDesktop();
            ad.iniciarApp("C:\\Program Files (x86)\\MochaSoft\\Mocha TN5250 for Vista\\tn5250.exe", System.getProperty("user.dir") + "\\Winium.Desktop.Driver.exe");
//            ad.clickName("Maximizar");
//            act.captureImage();
            ad.clickId("button_real_trial");
            ad.clickName("Connect");
            ad.espera(4);
            ad.clickName("SESSIONJ");
            ad.espera(4);

            ActionGui act = new ActionGui();
            act.waitSeconds(10);
            act.escribirRobot("WRKSPLF");
            act.enter();
            act.waitSeconds(2);
            act.escribirRobot("5");
            act.enter();
            act.waitSeconds(2);
            act.selectAllA();
            String a = act.copiAllRobot();

            System.out.println(a);
            
            act.imprimirFuncion(12);
            act.imprimirFuncion(12);
            act.imprimirFuncion(12);
            ad.clickName("Cerrar");
            

//            ad.clickId("1");
//1227
//1254
//            act.escape();
//            while (
//ad.isDisplayedId(IdValueElemento)) {
//                
//            }
//            ad.clickId("Item 32807");
        } catch (Exception e) {
        }

    }

}
