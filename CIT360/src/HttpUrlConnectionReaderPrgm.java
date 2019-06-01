import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/*I got the basic outline for this from 
*https://alvinalexander.com/blog/post/java/how-open-url-read-contents-httpurl-connection-java
*/

public class HttpUrlConnectionReaderPrgm
{
  public static void main(String[] args)
  throws Exception
  {
    new HttpUrlConnectionReaderPrgm();
  }
  
  public HttpUrlConnectionReaderPrgm()
  {
    try
    {
      String myUrl = "https://news.google.com/";

      String results = doHttpUrlConnectionAction(myUrl);
      System.out.println(results);
    }
    catch (Exception e)
    {
      // deal with the exception in the controller
    }
  }

  // Returns the output from the given URL
  
  private String doHttpUrlConnectionAction(String desiredUrl)
  throws Exception
  {
    URL url = null;
    BufferedReader reader = null;
    StringBuilder stringBuilder;

    try
    {
      // creates the HttpURLConnection
    	
      url = new URL(desiredUrl);
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      
      // just want to do an HTTP GET here
      connection.setRequestMethod("GET");
      
      // waits 20 seconds for a response
      
      connection.setReadTimeout(20*1000);
      connection.connect();

      // reads the output from the server
      
      reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      stringBuilder = new StringBuilder();

      String line = null;
      while ((line = reader.readLine()) != null)
      {
        stringBuilder.append(line + "\n");
      }
      return stringBuilder.toString();
    }
    catch (Exception e)
    {
      e.printStackTrace();
      throw e;
    }
    finally
    {
      // closes the reader, but since this can throw an exception it's
      // wrapped it in another try/catch block
    	
      if (reader != null)
      {
        try
        {
          reader.close();
        }
        catch (IOException ioe)
        {
          ioe.printStackTrace();
        }
      }
    }
  }
}
