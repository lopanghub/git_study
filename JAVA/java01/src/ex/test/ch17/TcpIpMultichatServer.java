package ex.test.ch17;

import java.net.*;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TcpIpMultichatServer {
	HashMap clients; // 인스턴스 변수는 선언만하고 생성자에서 초기화한다 여기서 생성해도 문법적으론 이상없다
	// 접속한 클라이언트의 Output 객체 //대화명(K) : Output(V)

	// 차단 단어
	// ArrayList
	ArrayList<String> blockMsg;

	TcpIpMultichatServer() {
		clients = new HashMap();
		Collections.synchronizedMap(clients);

		blockMsg = new ArrayList<>();
//		blockMsg.add("hello"); blockMsg.add("안녕");
		blockMsg.add("[a-zA-Z]");
	}

	public void start() {
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 시작되었습니다.");

			while (true) {
				socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "]" + "에서 접속하였습니다.");
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start(); // run() 호출
				// 반복할때마다 ServerReceiver 스레드 생성
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // start()

	void sendToAll(String msg) {
		// msg = msg.replace(" ","").replace(",","").replace(".","");
		// 이렇게 한줄로 만들어도 된다
		// msg = msg.toLowerCase();// 모두 소문자로 변경

		for (String ch : blockMsg) {
			Pattern p = Pattern.compile(ch);
			Matcher m = p.matcher(msg);
//			if(msg.indexOf(ch)>=0) {
//				msg ="차단된 메시지입니다.";
//				
//			}
			if (m.find()) {
				msg = "영어는 차단대상입니다.";
				break;
			}
		}

//		String [] check = msg.split(" ");
//		for(String ch : check) {
//			if(blockMsg.contains(ch)) {
//				msg = "차단된 메시지 입니다...";
//			}
//		}

		// 특정 대화명에게만 메시지 보내기(귓말)
		// ex)[AA]BB- hello 인 경우 BB에게만 보이게
		int x = msg.indexOf("]");
		int y = msg.indexOf("-");

		if (x != -1 && y != -1 && x < y) {
			String nick = msg.substring(x + 1, y).trim();
			if (clients.containsKey(nick)) {

				DataOutputStream out = (DataOutputStream) clients.get(nick);
				try {
					out.writeUTF(msg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		Iterator it = clients.keySet().iterator();
		// 맵의 키만 반복
		while (it.hasNext()) { // 한명만 있으면 작동x

			DataOutputStream out = (DataOutputStream) clients.get(it.next());
			// 키를알고 get을 하면 해당키의 밸류값
			try {
				out.writeUTF(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} // while

	} // sendToAll

	public static void main(String args[]) {
		new TcpIpMultichatServer().start();
	}

	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;

		ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
			}
		}

		public void run() {
			String name = "";
			try {
				name = in.readUTF();
				sendToAll("#" + name + "님이 들어오셨습니다.");

				clients.put(name, out); // client맵에 키와 값 넣기

				System.out.println("현재 서버접속자 수는 " + clients.size() + "입니다.");
				while (in != null) { // input이 null이 아니면 계속 읽기
					sendToAll(in.readUTF()); // 읽으면 sendToAll로 출력
				}
			} catch (IOException e) {
				// ignore
			} finally {
				sendToAll("#" + name + "님이 나가셨습니다.");
				clients.remove(name);
				System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "]" + "에서 접속을 종료하였습니다.");
				System.out.println("현재 서버접속자 수는 " + clients.size() + "입니다.");
			} // try
		} // run
	} // ReceiverThread
} // class
