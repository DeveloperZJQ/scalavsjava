package rpc.rpc01;

import rpc.entity.User;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @author happy
 * @since 2022/8/28
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        ByteArrayOutputStream baoS = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baoS);
        dos.writeInt(123);

        socket.getOutputStream().write(baoS.toByteArray());
        socket.getOutputStream().flush();

        DataInputStream dis = new DataInputStream(socket.getInputStream());
        int id = dis.readInt();
        String name = dis.readUTF();
        User user = new User(id, name);

        System.out.println(user);

        dos.close();
        socket.close();
    }
}
