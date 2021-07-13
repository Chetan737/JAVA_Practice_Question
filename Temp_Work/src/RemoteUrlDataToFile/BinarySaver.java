//First to change the location where we get the data of the url go to line number 55 to chnge the location

package RemoteUrlDataToFile;
//https://www.w3schools.com/
	
	// An highlighted block
	import java.io.BufferedInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.net.URLConnection;

	public class BinarySaver {

	    private final static String url = "https://www.w3schools.com/";

	    public static void main(String[] args) {
	        try {
	            URL root = new URL(url);
	            saveBinary(root);
	        } catch (MalformedURLException e) {
	            // TODO: handle exception
	            System.out.println(url + "is not URL");
	        } catch (IOException e) {
	            // TODO: handle exception
	            System.out.println(e);
	        }
	    }

	    public static void saveBinary(URL u) throws IOException {
	        // TODO Auto-generated method stub
	        URLConnection uc = u.openConnection();
	        String contentType = uc.getContentType();
	        int contentLength = uc.getContentLength();
	        

	        try (InputStream raw = uc.getInputStream()) {
	            InputStream in = new BufferedInputStream(raw);
	            byte[] data = new byte[contentLength];
	            int offset = 0;
	            while (offset < contentLength) {
	                int bytesRead = in.read(data, offset, data.length - offset);
	                if (bytesRead == -1) {
	                    break;
	                }
	                offset += bytesRead;
	            }

	            if (offset != contentLength) {
	                throw new IOException("Only read " + offset
	                        + " bytes; Expected " + contentLength + " bytes");
	            }
	            String filename = "C:\\Users\\Chetan\\Desktop\\abhi\\text1.txt";
	            try (FileOutputStream fout = new FileOutputStream(filename)) {
	                fout.write(data);
	                fout.flush();
	            }
	        }
	    }


	}
