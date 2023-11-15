package Project;

import Project.ServerAction.Server;

import java.io.IOException;
import java.util.logging.Logger;

import static java.lang.Thread.sleep;

public class MutipleServer {

    private static MutipleServer MainServer = null;
    public Logger logger = null;
    public Server svr = null;


    MutipleServer(){
        MainServer = this;

    }
    public static void main(String[] args) throws IOException {
        MutipleServer MainSvr = new MutipleServer();
        try{
            MainSvr.initLogger();

            MainSvr.runServer();
        }catch (Exception e){
            //
        }finally {
            MainSvr.closeServer();
        }
    }
    public void runServer(){
        try{
            svr = new Server(1130, MainServer, logger);
        } catch (Exception e) {
            //
        }

        while(true) {
            try {
                sleep(1);
            } catch (Exception e1) {
                //
            }
        }
    }
    public void closeServer(){
        try{
//            svr.close();
        } catch (Exception e) {
            //
        } finally {
            svr = null;
        }
    }
    private void initLogger(){

    }
}