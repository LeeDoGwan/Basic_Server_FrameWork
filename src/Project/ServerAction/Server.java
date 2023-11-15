package Project.ServerAction;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

import Project.MutipleServer;

public class Server  {
    Server svr = null;
    Logger logger = null;
    MutipleServer MainServer = null;
    ServerHandler svrHandler = null;
//    @Override
    public Server(int port, MutipleServer MainServer, Logger logger) {

        this.MainServer = MainServer;
        this.MainServer.svr = this;
        this.logger = logger;
//        svr.
        try{
            svrHandler = new ServerHandler();
        }catch (Exception e){
//            logger.
        }
    }


}
