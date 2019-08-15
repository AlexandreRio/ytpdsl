package fr.ytpdsl.ui;

import java.io.IOException;
import java.io.OutputStream;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IOConsole;
import org.eclipse.ui.console.IOConsoleOutputStream;

public class YtpDSLConsole {

	private static YtpDSLConsole self;

	public static YtpDSLConsole getInstance() {
		if (self == null)
			self = new YtpDSLConsole();
		return self;
	}


    private static Color getOutputColor() {
        Display display = Display.getCurrent();
        if (display != null)
            return display.getSystemColor(SWT.COLOR_BLUE);
        return null;
    }

    private static Color getDebugColor() {
        Display display = Display.getCurrent();
        if (display != null)
            return display.getSystemColor(SWT.COLOR_BLACK);
        return null;
    }

    private static Color getErrorColor() {
        Display display = Display.getCurrent();
        if (display != null)
            return display.getSystemColor(SWT.COLOR_RED);
        return null;
    }

    private static Color getWarnColor() {
        Display display = Display.getCurrent();
        if (display != null)
            return display.getSystemColor(SWT.COLOR_MAGENTA);
        return null;
    }

    private IOConsole console;
    private IOConsoleOutputStream dbg;
    private IOConsoleOutputStream msg;
    private IOConsoleOutputStream err;
    private IOConsoleOutputStream warn;

    private YtpDSLConsole() {
        console = new IOConsole("[YtpDSL]", null);

        dbg = console.newOutputStream();
        msg = console.newOutputStream();
        err = console.newOutputStream();
        warn = console.newOutputStream();
        dbg.setColor(getDebugColor());
        msg.setColor(getOutputColor());
        err.setColor(getErrorColor());
        warn.setColor(getWarnColor());

        console.activate();
        ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IOConsole[] { console });
    }

    public OutputStream getMessageSteam() {
        return msg;
    }

    public OutputStream getDebugSteam() {
        return dbg;
    }

    public OutputStream getErrorSteam() {
        return err;
    }

    public OutputStream getWarnSteam() {
        return warn;
    }

    public void printError(String txt) {
        try {
            err.write(txt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printErrorln(String txt) {
        printError(txt + "\n");
    }

    public void printWarn(String txt) {
        try {
            warn.write(txt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printWarnln(String txt) {
        printWarn(txt + "\n");
    }

    public void printMessage(String txt) {
        try {
            msg.write(txt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printMessageln(String txt) {
        printMessage(txt + "\n");
    }

    public void printDebug(String txt) {
        try {
            dbg.write(txt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printDebugln(String txt) {
        printDebug(txt + "\n");
    }

    public void activate() {
        console.activate();
    }

    public void clear() {
        console.clearConsole();
    }

}
