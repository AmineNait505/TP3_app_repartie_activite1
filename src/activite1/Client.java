package activite1;
import java.io.IOException;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("localhost", 1234);
		System.out.println("je suis connecté");
		socket.close();
	}

	
}