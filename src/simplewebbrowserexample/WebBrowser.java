/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simplewebbrowserexample;

import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author shuai
 */
public class WebBrowser {

    private static JWebBrowser webBrowser;
    private static JPanel webPanel;
    private static JFrame frame;

    public WebBrowser() {
        webBrowser = new JWebBrowser();
        webPanel = new JPanel(new BorderLayout());
        frame = new JFrame();
    }

    public static void main(String[] args) {
        NativeInterface.open();
        UIUtils.setPreferredLookAndFeel();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new WebBrowser();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                webPanel.add(webBrowser, BorderLayout.CENTER);
                frame.getContentPane().add(webPanel, BorderLayout.CENTER);
                frame.setSize(800, 600);
                frame.setLocationByPlatform(true);
                frame.setVisible(true);
            }
        });
        NativeInterface.runEventPump();
    }
}
