package info.dilsiz.log4jCassandra;


import org.apache.log4j.WriterAppender;
import org.apache.log4j.spi.LoggingEvent;

import java.util.Date;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: azizdilsiz
 * Date: 09.09.2013
 * Time: 19:23
 * To change this template use File | Settings | File Templates.
 */
public class CassandraLog4jAppender extends WriterAppender {



    public CassandraLog4jAppender(){


    }

    public void append(LoggingEvent loggingEvent){

        CassandraConnector client = new CassandraConnector();
        client.connect("localhost");

        String cql =   "INSERT INTO applog.logs (log_id, log_date , logger , level , message ) " +
                "VALUES (" +
                "'"+new Date().getTime()+"'," +
                loggingEvent.getTimeStamp()+"," +
                "'"+loggingEvent.getLoggerName()+"'," +
                "'"+loggingEvent.getLevel().toString()+"'," +
                "'"+loggingEvent.getMessage()+"'" +
                ");";

        client.session.execute(cql);
        client.close();

    }



}
