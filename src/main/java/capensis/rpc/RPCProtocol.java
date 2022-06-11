package capensis.rpc;/*
    @author wxg
    @date 2021/6/7-9:35
    */
public interface RPCProtocol {
    //创建rpc协议
    long versionID = 1;
    void mkdirs(String Path);
}
