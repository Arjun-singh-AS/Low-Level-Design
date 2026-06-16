package singleton;

class Logger{
    private static Logger logger;
    private Logger(){}
    public static synchronized Logger getInstant(){
        if(logger==null){
            logger= new Logger();
        }
        return logger;
    }
    public void log(String message){
        System.out.println("Log: "+message);
    }
}
public class SingletonBetterApproach {
    static public void main(String args[]){
        Logger logger=Logger.getInstant();
        logger.log("Hello guys");
    }
}
