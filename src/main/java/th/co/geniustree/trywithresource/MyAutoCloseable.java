package th.co.geniustree.trywithresource;

import java.io.Closeable;
import java.io.IOException;

/**
 *
 * @author pramoth
 */
public class MyAutoCloseable implements Closeable{

    public MyAutoCloseable() throws IOException {
        throw new IOException("Exception while constructor.");
    }

    @Override
    public void close()throws IOException{
        System.out.println("=============close was called=============");
        //throw new IOException("Exception while close. Should see in suppress exception");
    }
    
}
