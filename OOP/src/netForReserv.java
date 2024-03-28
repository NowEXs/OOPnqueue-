import java.io.IOException;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

public class netForReserv {
    public netForReserv(){
        try (
                Socket socket = new Socket("localhost", 1111)){
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(2);
        }catch (
                ConnectException e){
            System.out.println("Not have server...");
        } catch (
                UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }
}
