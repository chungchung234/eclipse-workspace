package threadex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class ServerThread extends Thread {

	Socket socket;
	List<Socket> list;
	List<String> room;
	
	public ServerThread(Socket socket, List<Socket> list) {
		this.socket = socket;
		this.list = list;
	}

	@Override
	public void run() {		
		super.run();
		System.out.println("1")
		try {
			
			while(true) {
				PrintWriter writer = new PrintWriter(s.getOutputStream());
				// 수신(recv)
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String str = reader.readLine();					
				System.out.println("client로부터 받은 메시지:" + str);
				String[] temp = str.split("/");
				System.out.println(temp.toString());
				if(temp[0].equals("room")) {
						System.out.println("add");
					if(temp[1].equals("add")) {
							
							room.add(temp[2]);
						}else {
							room.remove(room.indexOf(temp[2]));
							
					}
				}else if(temp[0].equals("chat")) {
					for (Socket s : list) {
						if(socket != s) {
							
							writer.println(str);
							writer.flush();
						}
					}	
				}

						
					
			

				String roomlist="room";
				System.out.println(roomlist);
				for(String s:room) {
				roomlist=roomlist+"/"+s;}
				writer.println(roomlist);
				writer.flush();				

				// 송신(send)
				
				Thread.sleep(5000);				
			}
		
		} catch (Exception e) {			
			System.out.println("연결이 끊긴 IP:" + socket.getInetAddress());
			list.remove(socket);
			
			// 접속되어 있는 남아있는 클라이언트 출력
			for (Socket s : list) {
				System.out.println("접속되어 있는 IP:" + s.getInetAddress()
							+ " Post:" + s.getPort());
			}
			
			try {
				socket.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} 	
	}
	
	
}
