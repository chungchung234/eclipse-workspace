package TCPServer.Main;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerThread extends Thread{
	Socket socket;
	
	List<Socket> list = new ArrayList<>();
	
	public ServerThread(Socket socket, List<Socket> list) {
		this.socket = socket;
		this.list = list;
	}
	
	@Override
	public void run() {
		super.run();
	}
}
