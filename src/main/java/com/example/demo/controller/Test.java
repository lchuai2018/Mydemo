package com.example.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list.subList(0, 2));
        String jsonStrA = "[{\n" +
                "\ttrade_createtime = 2019 - 04 - 14 T10: 47: 37.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\ttrade_id = 409386851261417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 城东街道 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 132000,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 04 - 09 T13: 13: 20.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\ttrade_id = 403045952343417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 城东街道 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 2950,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 04 - 09 T00: 21: 43.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\ttrade_id = 402912929106417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 城东街道 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 1480,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 04 - 04 T15: 53: 45.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\ttrade_id = 398100066284417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 城东街道 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 24147,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 03 - 27 T13: 09: 53.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\ttrade_id = 389828032205417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 城东街道 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 5978,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 03 - 25 T09: 20: 01.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\ttrade_id = 387777888134417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 城东街道 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 6600,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 03 - 25 T09: 20: 01.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\ttrade_id = 387777888135417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 城东街道 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 7360,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 03 - 13 T13: 13: 15.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\ttrade_id = 377601251388417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 城东街道 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 3873,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 03 - 10 T13: 32: 43.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\ttrade_id = 373539552947417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 城东街道 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 1707,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 03 - 10 T13: 32: 43.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\ttrade_id = 373539552953417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 城东街道 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 800,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 03 - 10 T12: 44: 02.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\ttrade_id = 374026210904417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 城东街道 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 1021,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 03 - 10 T12: 41: 52.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\ttrade_id = 373479872609417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 城东街道 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 1803,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 03 - 10 T12: 40: 43.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\ttrade_id = 374286755298417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 城东街道 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 9800,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 03 - 07 T10: 24: 18.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\ttrade_id = 369069888902417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 城东街道 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 1880,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 03 - 02 T12: 42: 51.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\ttrade_id = 363741538853417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 城东街道 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 3760,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 02 - 27 T18: 45: 30.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\ttrade_id = 360548770013417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 城东街道 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 2480,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 02 - 27 T18: 41: 00.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\ttrade_id = 360019648991417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 城东街道 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 2718,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 01 - 20 T18: 43: 21.000 + 08,\n" +
                "\tdeliver_postcode = 362000,\n" +
                "\tdeliver_fixedphone = ,\n" +
                "\ttrade_id = 332652417479417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 鲤城区 新门街甲弟巷舍人巷8号,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 2790,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 01 - 20 T18: 43: 21.000 + 08,\n" +
                "\tdeliver_postcode = 362000,\n" +
                "\tdeliver_fixedphone = ,\n" +
                "\ttrade_id = 332652417480417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 鲤城区 新门街甲弟巷舍人巷8号,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 7500,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 01 - 13 T12: 45: 44.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\tdeliver_fixedphone = ,\n" +
                "\ttrade_id = 325156577868417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 2670,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 01 - 12 T13: 41: 26.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\tdeliver_fixedphone = ,\n" +
                "\ttrade_id = 323661696213417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 980,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 01 - 12 T13: 15: 00.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\tdeliver_fixedphone = ,\n" +
                "\ttrade_id = 324326179333417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 2510,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2019 - 01 - 11 T23: 01: 09.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\tdeliver_fixedphone = ,\n" +
                "\ttrade_id = 323301792659417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 880,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2018 - 12 - 27 T18: 24: 02.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\tdeliver_fixedphone = ,\n" +
                "\ttrade_id = 308053696774417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 丰泽区 奎星电子厂C栋7楼启宏广告,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 3590,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2018 - 12 - 20 T13: 53: 59.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\tdeliver_fixedphone = ,\n" +
                "\ttrade_id = 301993505487417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 晋江市 溜溪路溜石花园2期3栋1009,\n" +
                "\t放丰巢）,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 880,\n" +
                "\tdeliver_name = 朱美美,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2018 - 11 - 30 T13: 15: 07.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\tdeliver_fixedphone = ,\n" +
                "\ttrade_id = 279989347467417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 晋江市 溜溪路溜石花园2期3栋1009,\n" +
                "\t放丰巢）,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 2500,\n" +
                "\tdeliver_name = 朱美美,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2018 - 11 - 27 T16: 47: 03.000 + 08,\n" +
                "\tdeliver_postcode = 000000,\n" +
                "\tdeliver_fixedphone = ,\n" +
                "\ttrade_id = 277108929658417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 晋江市 溜溪路溜石花园2期3栋1009,\n" +
                "\t放丰巢）,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 3460,\n" +
                "\tdeliver_name = 朱美美,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2018 - 11 - 11 T02: 24: 24.000 + 08,\n" +
                "\tdeliver_postcode = 362000,\n" +
                "\ttrade_id = 240268292742417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 鲤城区 鲤中街道 新门街甲弟巷（ 源和堂后门） 旁边巷子电话联系,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 27500,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}, {\n" +
                "\ttrade_createtime = 2018 - 11 - 11 T01: 52: 08.000 + 08,\n" +
                "\tdeliver_postcode = 362000,\n" +
                "\tdeliver_fixedphone = ,\n" +
                "\ttrade_id = 240478694577417071,\n" +
                "\tprovince = 福建,\n" +
                "\tdeliver_address = 福建省 泉州市 鲤城区 新门街甲弟巷（ 源和堂后门） 旁边巷子电话联系,\n" +
                "\tcity = 泉州,\n" +
                "\tactual_fee = 29118,\n" +
                "\tdeliver_name = 黄宝岚,\n" +
                "\tdeliver_mobilephone = 15905937000\n" +
                "}]";
        System.out.println("利用JSONArray中的parse方法来解析json数组字符串");


        JSONArray jsArr = JSONObject.parseArray(jsonStrA);
        System.out.println(jsArr);
    }
    }
