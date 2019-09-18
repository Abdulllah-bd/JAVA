
import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;

public class Line implements GLEventListener {

    static GLProfile profile = GLProfile.get(GLProfile.GL2);
    static GLCapabilities capabilities = new GLCapabilities(profile);
    // The canvas 
    static GLCanvas glcanvas = new GLCanvas(capabilities);

    public static void main(String[] args) {
        //getting the capabilities object of GL2 profile

        Line l = new Line();
        //creating frame
        glcanvas.addGLEventListener(l);
        glcanvas.setSize(600, 600);

        final JFrame frame = new JFrame();//Name of the frame!
        //adding canvas to frame
        frame.getContentPane().add(glcanvas);
        frame.setSize(frame.getContentPane().getPreferredSize());
        frame.setVisible(true);

    }

    public static float random(int min, int max) {
        float range = max - min;
        return (float) (Math.random() * range) + min;
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
        gl.glBegin(GL2.GL_POINTS);//static field
        Double l1 = -0.55;
        Double l2 = 0.3;
        Double l3 = -0.55;
        Double l4 = -0.3;
        Double L = 0.45;
        gl.glBegin(GL2.GL_LINES);
        gl.glColor3f(.2f, 7f, .2f);
        while (l1 < L) {
            gl.glVertex2d(l1, l2);
            gl.glVertex2d(l3, l4);
            l1 += .001;
            l3 += .001;

        }
        gl.glEnd();

        Double l5 = -0.58;
        Double l6 = 0.3;
        Double l7 = -0.58;
        Double l8 = -0.9;
        L = -0.55;
        gl.glBegin(GL2.GL_LINES);
        gl.glColor3f(.54f, .47f, .3f);
        while (l5 < L) {
            gl.glVertex2d(l5, l6);
            gl.glVertex2d(l7, l8);
            l5 += .001;
            l7 += .001;

        }
        gl.glEnd();

        Double r = .2;
        Double dinit = .0001 - r;
        double x = 0;
        double y = r;

        while (x < y) {
            if (dinit <= 0) {
                dinit += 2 * x + .00001;
            } else {
                dinit += 2 * (x - y) + .00001;
                y -= .00001;
            }
            x += .00001;

            gl.glBegin(GL2.GL_LINES);
            gl.glColor3f(1f, 0f, 0f);
            gl.glVertex2d(0, 0);
            gl.glVertex2d(x, y);
            gl.glVertex2d(0, 0);
            gl.glVertex2d(-x, -y);
            gl.glVertex2d(0, 0);
            gl.glVertex2d(x, -y);
            gl.glVertex2d(0, 0);
            gl.glVertex2d(-x, y);
            gl.glVertex2d(0, 0);
            gl.glVertex2d(y, -x);
            gl.glVertex2d(0, 0);
            gl.glVertex2d(-y, x);
            gl.glVertex2d(0, 0);
            gl.glVertex2d(-y, -x);
            gl.glVertex2d(0, 0);
            gl.glVertex2d(y, x);
            gl.glEnd();
        }

        gl.glEnd();

    }

    public void dispose(GLAutoDrawable arg0) {
        //method body
    }

    public void init(GLAutoDrawable drawable) {
        // method body
        //4. drive the display() in a loop
    }

    public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
        // method body
    }
    //end of main
}//end of classimport javax.media.opengl.GL2;
