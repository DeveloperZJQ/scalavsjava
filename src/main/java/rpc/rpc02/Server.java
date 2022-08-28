package rpc.rpc02;

import rpc.entity.User;
import rpc.rpc01.UserServiceImpl;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author happy
 * @since 2022/8/28
 */
public class Server {
    private static boolean running = true;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (running) {
            Socket accept = serverSocket.accept();
            process(accept);
            accept.close();
        }
        serverSocket.close();
    }

    private static void process(Socket s) throws IOException {
        InputStream in = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();
        DataInputStream dis = new DataInputStream(in);
        DataOutputStream dos = new DataOutputStream(outputStream);

        int id = dis.readInt();
        System.out.println("server=" + id);
        rpc.rpc01.UserServiceImpl userService = new UserServiceImpl();
        User user = userService.findUserById(id);
        dos.writeInt(user.getId());
        dos.writeUTF(user.getName());
        dos.flush();
    }
}