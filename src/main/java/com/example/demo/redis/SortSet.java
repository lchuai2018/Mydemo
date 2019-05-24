package com.example.demo.redis;

import java.util.Set;

public class SortSet {

/*
    *//**
     518          * 向集合中增加一条记录,如果这个值已存在，这个值对应的权重将被置为新的权重
     519          * @param String  key
     520          * @param double score 权重
     521          * @param String  member 要加入的值，
     522          * @return 状态码 1成功，0已存在member的值
     523          * *//*
 524

    public long zadd(String key, double score, String member) {
        525 Jedis jedis = getJedis();
        526 long s = jedis.zadd(key, score, member);
        527 returnJedis(jedis);
        528 return s;
        529
    }
 530
         531         *//*public long zadd(String key, Map<Double, String> scoreMembers) {
 532             Jedis jedis = getJedis();
 533             long s = jedis.zadd(key, scoreMembers);
 534             returnJedis(jedis);
 535             return s;
 536         }*//*
         537
         538         *//**
  539          * 获取集合中元素的数量
  540          * @param String  key
  541          * @return 如果返回0则集合不存在
  542          * *//*
         543

    public long zcard(String key) {
        544             //ShardedJedis sjedis = getShardedJedis();
        545 Jedis sjedis = getJedis();
        546 long len = sjedis.zcard(key);
        547 returnJedis(sjedis);
        548 return len;
        549
    }
 550
         551         *//**
  552          * 获取指定权重区间内集合的数量
  553          * @param String key
  554          * @param double min 最小排序位置
  555          * @param double max 最大排序位置
  556          * *//*
         557

    public long zcount(String key, double min, double max) {
        558             //ShardedJedis sjedis = getShardedJedis();
        559 Jedis sjedis = getJedis();
        560 long len = sjedis.zcount(key, min, max);
        561 returnJedis(sjedis);
        562 return len;
        563
    }
 564
         565         *//**
  566          * 获得set的长度
  567          *
  568          * @param key
  569          * @return
  570          *//*
         571

    public long zlength(String key) {
        572 long len = 0;
        573 Set<String> set = zrange(key, 0, -1);
        574 len = set.size();
        575 return len;
        576
    }
 577
         578         *//**
  579          * 权重增加给定值，如果给定的member已存在
  580          * @param String  key
  581          * @param double score 要增的权重
  582          * @param String  member 要插入的值
  583          * @return 增后的权重
  584          * *//*
         585

    public double zincrby(String key, double score, String member) {
        586 Jedis jedis = getJedis();
        587 double s = jedis.zincrby(key, score, member);
        588 returnJedis(jedis);
        589 return s;
        590
    }
 591
         592         *//**
  593          * 返回指定位置的集合元素,0为第一个元素，-1为最后一个元素
  594          * @param String key
  595          * @param int start 开始位置(包含)
  596          * @param int end 结束位置(包含)
  597          * @return Set<String>
  598          * *//*
         599

    public Set<String> zrange(String key, int start, int end) {
        600             //ShardedJedis sjedis = getShardedJedis();
        601 Jedis sjedis = getJedis();
        602 Set<String> set = sjedis.zrange(key, start, end);
        603 returnJedis(sjedis);
        604 return set;
        605
    }
 606
         607         *//**
  608          * 返回指定权重区间的元素集合
  609          * @param String key
  610          * @param double min 上限权重
  611          * @param double max 下限权重
  612          * @return Set<String>
  613          * *//*
         614

    public Set<String> zrangeByScore(String key, double min, double max) {
        615             //ShardedJedis sjedis = getShardedJedis();
        616 Jedis sjedis = getJedis();
        617 Set<String> set = sjedis.zrangeByScore(key, min, max);
        618 returnJedis(sjedis);
        619 return set;
        620
    }
 621
         622         *//**
  623          * 获取指定值在集合中的位置，集合排序从低到高
  624          * @see zrevrank
  625          * @param String key
  626          * @param String member
  627          * @return long 位置
  628          * *//*
         629

    public long zrank(String key, String member) {
        630             //ShardedJedis sjedis = getShardedJedis();
        631 Jedis sjedis = getJedis();
        632 long index = sjedis.zrank(key, member);
        633 returnJedis(sjedis);
        634 return index;
        635
    }
 636
         637         *//**
  638          * 获取指定值在集合中的位置，集合排序从高到低
  639          * @see zrank
  640          * @param String key
  641          * @param String member
  642          * @return long 位置
  643          * *//*
         644

    public long zrevrank(String key, String member) {
        645             //ShardedJedis sjedis = getShardedJedis();
        646 Jedis sjedis = getJedis();
        647 long index = sjedis.zrevrank(key, member);
        648 returnJedis(sjedis);
        649 return index;
        650
    }
 651
         652         *//**
  653          * 从集合中删除成员
  654          * @param String key
  655          * @param String member
  656          * @return 返回1成功
  657          * *//*
         658

    public long zrem(String key, String member) {
        659 Jedis jedis = getJedis();
        660 long s = jedis.zrem(key, member);
        661 returnJedis(jedis);
        662 return s;
        663
    }
 664
         665         *//**
  666          * 删除
  667          * @param key
  668          * @return
  669          *//*
         670

    public long zrem(String key) {
        671 Jedis jedis = getJedis();
        672 long s = jedis.del(key);
        673 returnJedis(jedis);
        674 return s;
        675
    }
 676
         677         *//**
  678          * 删除给定位置区间的元素
  679          * @param String  key
  680          * @param int start 开始区间，从0开始(包含)
  681          * @param int end 结束区间,-1为最后一个元素(包含)
  682          * @return 删除的数量
  683          * *//*
         684

    public long zremrangeByRank(String key, int start, int end) {
        685 Jedis jedis = getJedis();
        686 long s = jedis.zremrangeByRank(key, start, end);
        687 returnJedis(jedis);
        688 return s;
        689
    }
 690
         691         *//**
  692          * 删除给定权重区间的元素
  693          * @param String key
  694          * @param double min 下限权重(包含)
  695          * @param double max 上限权重(包含)
  696          * @return 删除的数量
  697          * *//*
         698

    public long zremrangeByScore(String key, double min, double max) {
        699 Jedis jedis = getJedis();
        700 long s = jedis.zremrangeByScore(key, min, max);
        701 returnJedis(jedis);
        702 return s;
        703
    }
 704
         705         *//**
  706          * 获取给定区间的元素，原始按照权重由高到低排序
  707          * @param String  key
  708          * @param int start
  709          * @param int end
  710          * @return Set<String>
  711          * *//*
         712

    public Set<String> zrevrange(String key, int start, int end) {
        713             //ShardedJedis sjedis = getShardedJedis();
        714 Jedis sjedis = getJedis();
        715 Set<String> set = sjedis.zrevrange(key, start, end);
        716 returnJedis(sjedis);
        717 return set;
        718
    }
 719
         720         *//**
  721          * 获取给定值在集合中的权重
  722          * @param String  key
  723          * @param memeber
  724          * @return double 权重
  725          * *//*
         726

    public double zscore(String key, String memebr) {
        727             //ShardedJedis sjedis = getShardedJedis();
        728 Jedis sjedis = getJedis();
        729 Double score = sjedis.zscore(key, memebr);
        730 returnJedis(sjedis);
        731 if (score != null)
            732 return score;
        733 return 0;
        734
    }*/
}
