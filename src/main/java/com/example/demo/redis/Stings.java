package com.example.demo.redis;

import redis.clients.jedis.util.SafeEncoder;

import java.util.List;

public class Stings {
/*

    *//**
     954          * 根据key获取记录
     955          * @param String  key
     956          * @return 值
     957          * *//*
 958         public String get(String key) {
        959             //ShardedJedis sjedis = getShardedJedis();
        960             Jedis sjedis = getJedis();
        961             String value = sjedis.get(key);
        962             returnJedis(sjedis);
        963             return value;
        964         }
 965
         966         *//**
  967          * 根据key获取记录
  968          * @param byte[] key
  969          * @return 值
  970          * *//*
         971         public byte[] get(byte[] key) {
        972             //ShardedJedis sjedis = getShardedJedis();
        973             Jedis sjedis = getJedis();
        974             byte[] value = sjedis.get(key);
        975             returnJedis(sjedis);
        976             return value;
        977         }
 978
         979         *//**
  980          * 添加有过期时间的记录
  981          *
  982          * @param String  key
  983          * @param int seconds 过期时间，以秒为单位
  984          * @param String value
  985          * @return String 操作状态
  986          * *//*
         987         public String setEx(String key, int seconds, String value) {
        988             Jedis jedis = getJedis();
        989             String str = jedis.setex(key, seconds, value);
        990             returnJedis(jedis);
        991             return str;
        992         }
 993
         994         *//**
  995          * 添加有过期时间的记录
  996          *
  997          * @param String key
  998          * @param int seconds 过期时间，以秒为单位
  999          * @param String  value
  1000          * @return String 操作状态
  1001          * *//*
         1002         public String setEx(byte[] key, int seconds, byte[] value) {
        1003             Jedis jedis = getJedis();
        1004             String str = jedis.setex(key, seconds, value);
        1005             returnJedis(jedis);
        1006             return str;
        1007         }
1008
        1009         *//**
 1010          * 添加一条记录，仅当给定的key不存在时才插入
 1011          * @param String key
 1012          * @param String value
 1013          * @return long 状态码，1插入成功且key不存在，0未插入，key存在
 1014          * *//*
        1015         public long setnx(String key, String value) {
        1016             Jedis jedis = getJedis();
        1017             long str = jedis.setnx(key, value);
        1018             returnJedis(jedis);
        1019             return str;
        1020         }
1021
        1022         *//**
 1023          * 添加记录,如果记录已存在将覆盖原有的value
 1024          * @param String key
 1025          * @param String value
 1026          * @return 状态码
 1027          * *//*
        1028         public String set(String key, String value) {
        1029             return set(SafeEncoder.encode(key), SafeEncoder.encode(value));
        1030         }
1031
        1032         *//**
 1033          * 添加记录,如果记录已存在将覆盖原有的value
 1034          * @param String  key
 1035          * @param String value
 1036          * @return 状态码
 1037          * *//*
        1038         public String set(String key, byte[] value) {
        1039             return set(SafeEncoder.encode(key), value);
        1040         }
1041
        1042         *//**
 1043          * 添加记录,如果记录已存在将覆盖原有的value
 1044          * @param byte[] key
 1045          * @param byte[] value
 1046          * @return 状态码
 1047          * *//*
        1048         public String set(byte[] key, byte[] value) {
        1049             Jedis jedis = getJedis();
        1050             String status = jedis.set(key, value);
        1051             returnJedis(jedis);
        1052             return status;
        1053         }
1054
        1055         *//**
 1056          * 从指定位置开始插入数据，插入的数据会覆盖指定位置以后的数据<br/>
 1057          * 例:String str1="123456789";<br/>
 1058          * 对str1操作后setRange(key,4,0000)，str1="123400009";
 1059          * @param String  key
 1060          * @param long offset
 1061          * @param String  value
 1062          * @return long value的长度
 1063          * *//*
        1064         public long setRange(String key, long offset, String value) {
        1065             Jedis jedis = getJedis();
        1066             long len = jedis.setrange(key, offset, value);
        1067             returnJedis(jedis);
        1068             return len;
        1069         }
1070
        1071         *//**
 1072          * 在指定的key中追加value
 1073          * @param String  key
 1074          * @param String value
 1075          * @return long 追加后value的长度
 1076          * **//*
        1077         public long append(String key, String value) {
        1078             Jedis jedis = getJedis();
        1079             long len = jedis.append(key, value);
        1080             returnJedis(jedis);
        1081             return len;
        1082         }
1083
        1084         *//**
 1085          * 将key对应的value减去指定的值，只有value可以转为数字时该方法才可用
 1086          * @param String key
 1087          * @param long number 要减去的值
 1088          * @return long 减指定值后的值
 1089          * *//*
        1090         public long decrBy(String key, long number) {
        1091             Jedis jedis = getJedis();
        1092             long len = jedis.decrBy(key, number);
        1093             returnJedis(jedis);
        1094             return len;
        1095         }
1096
        1097         *//**
 1098          * <b>可以作为获取唯一id的方法</b><br/>
 1099          * 将key对应的value加上指定的值，只有value可以转为数字时该方法才可用
 1100          * @param String  key
 1101          * @param long number 要减去的值
 1102          * @return long 相加后的值
 1103          * *//*
        1104         public long incrBy(String key, long number) {
        1105             Jedis jedis = getJedis();
        1106             long len = jedis.incrBy(key, number);
        1107             returnJedis(jedis);
        1108             return len;
        1109         }
1110
        1111         *//**
 1112          * 对指定key对应的value进行截取
 1113          * @param String   key
 1114          * @param long startOffset 开始位置(包含)
 1115          * @param long endOffset 结束位置(包含)
 1116          * @return String 截取的值
 1117          * *//*
        1118         public String getrange(String key, long startOffset, long endOffset) {
        1119             //ShardedJedis sjedis = getShardedJedis();
        1120             Jedis sjedis = getJedis();
        1121             String value = sjedis.getrange(key, startOffset, endOffset);
        1122             returnJedis(sjedis);
        1123             return value;
        1124         }
1125
        1126         *//**
 1127          * 获取并设置指定key对应的value<br/>
 1128          * 如果key存在返回之前的value,否则返回null
 1129          * @param String  key
 1130          * @param String value
 1131          * @return String 原始value或null
 1132          * *//*
        1133         public String getSet(String key, String value) {
        1134             Jedis jedis = getJedis();
        1135             String str = jedis.getSet(key, value);
        1136             returnJedis(jedis);
        1137             return str;
        1138         }
1139
        1140         *//**
 1141          * 批量获取记录,如果指定的key不存在返回List的对应位置将是null
 1142          * @param String keys
 1143          * @return List<String> 值得集合
 1144          * *//*
        1145         public List<String> mget(String... keys) {
        1146             Jedis jedis = getJedis();
        1147             List<String> str = jedis.mget(keys);
        1148             returnJedis(jedis);
        1149             return str;
        1150         }
1151
        1152         *//**
 1153          * 批量存储记录
 1154          * @param String keysvalues 例:keysvalues="key1","value1","key2","value2";
 1155          * @return String 状态码
 1156          * *//*
        1157         public String mset(String... keysvalues) {
        1158             Jedis jedis = getJedis();
        1159             String str = jedis.mset(keysvalues);
        1160             returnJedis(jedis);
        1161             return str;
        1162         }
1163
        1164         *//**
 1165          * 获取key对应的值的长度
 1166          * @param String key
 1167          * @return value值得长度
 1168          * *//*
        1169         public long strlen(String key) {
        1170             Jedis jedis = getJedis();
        1171             long len = jedis.strlen(key);
        1172             returnJedis(jedis);
        1173             return len;
        1174         }
1175     }*/
}


