package ex.test.ch17;

import java.net.*;
import java.text.SimpleDateFormat;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TcpIpMultichatClient {

	static FileOutputStream fos;

	static {
		try {
			fos = new FileOutputStream("test.txt", true);
		} catch (Exception e) {
			e.printStackTrace();
			// 적절한 예외 처리 로직을 여기에 추가하세요.
		}
	}

	public static void main(String args[]) {
//		if(args.length!=1) {
//			System.out.println("USAGE: java TcpIpMultichatClient 대화명");
//			System.exit(0);
//		}
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("====yyyy년 M월 dd일 HH시 mm분 입장하셨습니다====");
		byte[] day = (sdf.format(d) + "\n").getBytes();
		try {
			fos.write(day);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			String serverIp = "192.168.0.56";
			// 소켓을 생성하여 연결을 요청한다.
			Socket socket = new Socket(serverIp, 7777);
			System.out.println("서버에 연결되었습니다.");

			Thread sender = new Thread(new ClientSender(socket, "이현학"));
			Thread receiver = new Thread(new ClientReceiver(socket));

			sender.start();
			receiver.start();

			Runtime.getRuntime().addShutdownHook(new Thread(() -> {
				try {
					String content = sdf.format(new Date()) + "\n"; // 종료 시간 기록
					fos.write(content.getBytes());
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}));
		} catch (ConnectException ce) {
			ce.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	} // main

	static class ClientSender extends Thread {
		Socket socket;
		DataOutputStream out;
		String name;

		ClientSender(Socket socket, String name) {
			this.socket = socket;
			try {
				out = new DataOutputStream(socket.getOutputStream());
				this.name = name;
			} catch (Exception e) {
			}
		}

		public void run() {
			Scanner scanner = new Scanner(System.in);
			try {
				if (out != null) {
					out.writeUTF(name);
				}

				while (out != null) {
					out.writeUTF("[" + name + "]" + scanner.nextLine());
				}
			} catch (IOException e) {
			}
		} // run()
	}

	static class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		ArrayList<String> blockList;
		
		ClientReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				blockList = new ArrayList<>();
				blockList.add("이현학");
				
			} catch (IOException e) {
			}
		}

		public void run() {
			while (in != null) {
				try {
					//차단 대상 구분
										
					String msg = in.readUTF();
//					String block = msg.substring(1, msg.indexOf("]"));
//					if(block.contains("백종원")) {
//						msg = "차단된 유저 입니다.";
//					}
//					System.out.println(msg);// 대화 내용 출력
					int x = msg.indexOf("]");
					String nick = msg.substring(1, x); //1이상 x미만
					if(blockList.contains(nick)) {
						msg = "차단된 유저입니다.";
					}
					
					msg += "\n";
					byte[] b = msg.getBytes();
					TcpIpMultichatClient.fos.write(b);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} // run
	}
} // class

// 클라이언트 - 차단 대화명 list
// subString(), indexOf("]"), contains
// 차단 메시지 - 영문 대소구문 없이 차단 