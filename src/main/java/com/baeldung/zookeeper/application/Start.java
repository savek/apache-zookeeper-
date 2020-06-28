package com.baeldung.zookeeper.application;

import com.baeldung.zookeeper.manager.ZKManagerImpl;
import org.apache.zookeeper.KeeperException;
import org.apache.log4j.Logger;

public class Start {

    private static Logger log = Logger.getLogger(Start.class);

    public static void main(String[] args) {
        ZKManagerImpl zkManager = new ZKManagerImpl();
        try {
//            zkManager.create("/test", "Тестовое сообщение".getBytes());
            log.info("Update node /test");
            zkManager.update("/test", "Updated value 4".getBytes());
            zkManager.closeConnection();
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
