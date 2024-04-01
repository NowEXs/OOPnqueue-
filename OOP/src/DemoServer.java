import java.net.*;
import java.io.*;

public class DemoServer {
    private String txt;
    public DemoServer() {}
    public void server(){
        new Thread(new Runnable() {
            public void run() {
                try( ServerSocket welcomeSocket = new ServerSocket(407);
                     PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Comment.txt", true),"UTF-8")))) {
                    while(true){
                        System.out.println("Please Wait...");
                        Socket soc = welcomeSocket.accept();
                        System.out.println("Connection Complete");
                        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                        txt = in.readLine();
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
    public void writeServer(){
        try (Socket soc = new Socket("localhost",407);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Comment.txt"),"UTF-8"))){
            StringBuilder text = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line).append("\n");
            }
            pw.println(text.toString());
            pw.flush();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        new DemoServer();
    }
}
