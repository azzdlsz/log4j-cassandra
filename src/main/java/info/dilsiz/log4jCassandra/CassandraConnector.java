package info.dilsiz.log4jCassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Host;
import com.datastax.driver.core.Metadata;
import com.datastax.driver.core.Session;

/**
 * Created with IntelliJ IDEA.
 * User: azizdilsiz
 * Date: 09.09.2013
 * Time: 21:37
 * To change this template use File | Settings | File Templates.
 */
public class CassandraConnector {

    public Cluster cluster;
    public Session session;

    public void connect(String node) {
        cluster = Cluster.builder().addContactPoint(node).build();
        session = cluster.connect();
    }


    public void close() {
        cluster.shutdown();
    }

}
