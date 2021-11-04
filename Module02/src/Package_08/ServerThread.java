package Package_08;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;
    public ServerThread(Socket s) {
            this.s = s;
    }

    @Override
    public void run()  {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            int count = 0;
            File file = new File("Module02\\Copy"+count+".java");
            while (file.exists()){
                count++;
                file = new File("Module02\\Copy"+count+".java");
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String line;
            while ((line=br.readLine())!=null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

                BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                bwServer.write("文件已接收");
                bwServer.newLine();
                bwServer.flush();

                s.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
