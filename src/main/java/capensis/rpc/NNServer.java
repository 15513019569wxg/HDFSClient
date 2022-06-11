package capensis.rpc;/*
    @author wxg
    @date 2021/6/7-9:58
    */
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import java.io.IOException;
public class NNServer implements RPCProtocol{
    @Override
    public void mkdirs(String Path) {
        System.out.println(("服务端接受到了客户端请求" + Path));
    }
    public static void main(String[] args) throws IOException {
        //指定服务器的ip、端口、协议、服务器类
        RPC.Server server = new RPC.Builder(new Configuration())
                                                                .setBindAddress("localhost")
                                                                .setPort(8888)
                                                                .setProtocol(RPCProtocol.class)
                                                                .setInstance(new NNServer())
                                                                .build();
        System.out.println("服务器开始工作");
        //启动服务器
        server.start();
    }
}
