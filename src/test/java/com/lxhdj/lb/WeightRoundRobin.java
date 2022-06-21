package com.lxhdj.lb;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeightRoundRobin {

    @Data
    public static class Server {

        private int serverId;

        private String name;

        private int weight;

        private int currentWeight;

        public Server(int serverId, String name) {
            this.serverId = serverId;
            this.name = name;
        }

        public Server(int serverId, String name, int weight) {
            this.serverId = serverId;
            this.name = name;
            this.weight = weight;
        }

        public void selected(int total) {
            this.currentWeight -= total;
        }

        public void incrCurrentWeight() {
            this.currentWeight += weight;
        }
    }

    public static Server selectServer(List<Server> serverList) {
        int total = 0;
        Server selectedServer = null;
        int maxWeight = 0;
        for (Server server : serverList) {
            total += server.getWeight();
            server.incrCurrentWeight();
            //选取当前权重最大的一个服务器
            if (selectedServer == null || maxWeight < server.getCurrentWeight()) {
                selectedServer = server;
                maxWeight = server.getCurrentWeight();
            }
        }
        if (selectedServer == null) {
            Random random = new Random();
            int next = random.nextInt(serverList.size());
            return serverList.get(next);
        }
        selectedServer.selected(total);
        return selectedServer;
    }


    public static void main(String[] args) {
        List<Server> serverList = new ArrayList<>();
        serverList.add(new Server(1, "服务器1", 1));
        serverList.add(new Server(2, "服务器2", 3));
        serverList.add(new Server(3, "服务器3", 10));
        for (int i = 0; i < 10; i++) {
            Server server = selectServer(serverList);
            System.out.format("第%d次请求，选择服务器%s\n", i + 1, server.toString());
        }
    }
}

