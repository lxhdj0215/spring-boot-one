package com.lxhdj.lb;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeightRandom {

    @Data
    public static class Server {

        private int serverId;

        private String name;

        private int weight;

        public Server(int serverId, String name) {
            this.serverId = serverId;
            this.name = name;
        }

        public Server(int serverId, String name, int weight) {
            this.serverId = serverId;
            this.name = name;
            this.weight = weight;
        }
    }

    private static Server selectServer(List<Server> serverList) {
        int sumWeight = 0;
        for (Server server : serverList) {
            sumWeight += server.getWeight();
        }
        Random serverSelector = new Random();
        int nextServerRange = serverSelector.nextInt(sumWeight);
        int sum = 0;
        Server selectedServer = null;
        for (Server server : serverList) {
            if (nextServerRange >= sum && nextServerRange < server.getWeight() + sum) {
                selectedServer = server;
            }
            sum += server.getWeight();
        }
        return selectedServer;
    }


    public static void main(String[] args) {
        List<Server> serverList = new ArrayList<>();
        serverList.add(new Server(1, "服务器1", 1));
        serverList.add(new Server(2, "服务器2", 5));
        serverList.add(new Server(3, "服务器3", 10));
        for (int i = 0; i < 10; i++) {
            Server selectedServer = selectServer(serverList);
            System.out.format("第%d次请求，选择服务器%s\n", i + 1, selectedServer.toString());

        }

    }
}


