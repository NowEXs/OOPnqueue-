import java.net.*;
import java.io.*;

public class DemoServer {
    public DemoServer() {
        new Thread(new Runnable() {
            public void run() {
                try( ServerSocket welcomeSocket = new ServerSocket(1111);
                    PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Comment.txt", true),"UTF-8")))) {
                    while(true){
                        System.out.println("Please Wait...");
                        Socket soc = welcomeSocket.accept();
                        System.out.println("Connection Complete");
                        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                        String txt = in.readLine();
                        pw.println(txt);
                        pw.flush();
                        soc.close();
                    }
                }
                catch (ConnectException e){
                    System.out.println("wait...");
                }
                catch (BindException e){
                    throw new RuntimeException(e);
                }
                catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
    public static void main(String[] args) {
        new DemoServer();
    }
}
