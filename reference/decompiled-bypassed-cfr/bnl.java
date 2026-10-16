/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 */
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class bnl {
    public int wln;
    public int lls;

    public void _5l() {
        Mouse.setGrabbed((boolean)true);
        this.wln = 0;
        this.lls = 0;
    }

    public void a0w() {
        Mouse.setCursorPosition((int)(Display.getWidth() / 2), (int)(Display.getHeight() / 2));
        Mouse.setGrabbed((boolean)false);
    }

    public void dgn() {
        this.wln = Mouse.getDX();
        this.lls = Mouse.getDY();
    }
}

