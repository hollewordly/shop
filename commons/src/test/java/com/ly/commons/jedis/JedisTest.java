//package com.ly.commons.jedis;
/*
import javafx.scene.effect.SepiaTone;
import org.junit.Test;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

import java.util.HashSet;
import java.util.Set;

public class JedisTest {
    //单机版
    @Test
    public void testJedis1(){
        Jedis jedis = new Jedis("106.14.171.27",6379);
        jedis.set("jediskey","myjedis");
    }
    //链接池版
    @Test
    public void testJedis2(){
        JedisPool jedisPool = new JedisPool("106.14.171.27",6379);
        Jedis jedis = jedisPool.getResource();
        System.out.println(jedis.get("jediskey"));
        jedis.lpush("mylist1",new String[]{"AA","BB","CC"});
        jedis.close();
    }
    //集群版
    @Test
    public void testJedis3(){
        Set<HostAndPort> nodes = new HashSet<HostAndPort>();
        nodes.add(new HostAndPort("106.14.171.27",9001));
        nodes.add(new HostAndPort("106.14.171.27",9002));
        nodes.add(new HostAndPort("106.14.171.27",9003));
        nodes.add(new HostAndPort("106.14.171.27",9004));
        nodes.add(new HostAndPort("106.14.171.27",9005));
        nodes.add(new HostAndPort("106.14.171.27",9006));
        JedisCluster cluster = new JedisCluster(nodes);
        System.out.println(cluster.lrange("mylist1",0,10));
        cluster.close();
    }*/
//}
