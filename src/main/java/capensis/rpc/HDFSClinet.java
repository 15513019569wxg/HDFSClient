package capensis.rpc;/*
    @author wxg
    @date 2021/6/7-10:05
    */
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import java.io.IOException;
import java.net.InetSocketAddress;

public class HDFSClinet {
    public static void main(String[] args) throws IOException {
        //指定协议、版本ID、服务器网络、配置文件
        RPCProtocol client = RPC.getProxy(RPCProtocol.class,
                                            RPCProtocol.versionID,
                                            new InetSocketAddress("localhost", 8888),
                                            new Configuration());
        System.out.println("我是客户端");
        client.mkdirs("/input");
    }
}
