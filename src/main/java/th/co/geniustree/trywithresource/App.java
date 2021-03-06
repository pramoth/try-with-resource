package th.co.geniustree.trywithresource;

/**
 *
 * @author pramoth
 */
public class App {

    public static void main(String[] args) {
        try (MyAutoCloseable x = new MyAutoCloseable()) {
            System.out.println("--------- body-" + x + "---------");
            x.mimicError();
            //=============close was called=============
        } catch (Exception e) {
            System.out.println("--------- catch---------");
            System.out.println("---------" + e.getMessage());
            Throwable[] suppressed = e.getSuppressed();
            System.out.println("--------- suppressed lengh = " + suppressed[0].getMessage());
            System.out.println("--------- end catch---------");
        } finally {
            System.out.println("--------- finally---------");
        }
    }
}
