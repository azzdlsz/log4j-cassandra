import org.apache.log4j.Logger;



/**
 * Created with IntelliJ IDEA.
 * User: azizdilsiz
 * Date: 09.09.2013
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class App {


    private static Logger log = Logger.getLogger(App.class);


    public static void main(String[] args) {
        log.debug("lann debug");
        log.error("lann error");
        log.info("lann info");
    }
}
