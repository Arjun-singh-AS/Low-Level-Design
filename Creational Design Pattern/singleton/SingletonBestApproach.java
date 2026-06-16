package singleton;

class Logger{
    private static Logger logger;
    private Logger(){}
    public static Logger getInstant(){
        if(logger==null){
            synchronized(Logger.class){
                if(logger==null){
                    logger= new Logger();
                }
            }
        }
        return logger;
    }
    public void log(String message){
        System.out.println("Log: "+message);
    }
}
public class SingletonBestApproach {
    static public void main(String args[]){
        Logger logger=Logger.getInstant();
        logger.log("Hello guys");
    }
}
