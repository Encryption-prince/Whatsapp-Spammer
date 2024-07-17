import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class wpSpamer {
    public static void main(String[]args) throws InterruptedException, AWTException {
        Scanner sc =  new Scanner(System.in);
        String msg = new String();
        System.out.print("Enter the msg : ");
        msg = sc.nextLine();
        System.out.print("Enter the no of times to spam : ");
        int num = sc.nextInt();

        StringSelection stringSelection = new StringSelection(msg);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,null);

        Thread.sleep(4000);

        Robot robot = new Robot();

        for(int i = 1; i<=num; i++)
        {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            Thread.sleep(2000);
        }
    }
}
