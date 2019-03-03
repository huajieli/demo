/**
 * 
 */
package com.daily.demo.fastjson;


import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * ************************************************************************
 * @ClassName:	 TestJson.java 
 * @Description: 
 * @author: lihuajie
 * @date:    2019年1月31日 下午4:46:41     
 * @Copyright: 2018 www.yunzhi.com Inc. All rights reserved. 
 *************************************************************************
 */
public class TestJson {
	//json字符串-简单对象型````````````````
	//json字符串-简单对象型,,,,,,,
	private static final String  JSON_OBJ_STR = "{\"f\":\"lily\",\"studentAge\":12}";
	//json字符串-数组类型
	private static final String  JSON_ARRAY_STR = "[{\"studentName\":\"lily\",\"studentAge\":12},{\"studentName\":\"lucy\",\"studentAge\":15}]";
	//复杂格式json字符串
	private static final String  COMPLEX_JSON_STR = "{\"teacherName\":\"crystall\",\"teacherAge\":27,\"course\":{\"courseName\":\"english\",\"code\":1270},\"students\":[{\"studentName\":\"lily\",\"studentAge\":12},{\"studentName\":\"lucy\",\"studentAge\":15}]}";
	
	
	/**
     * json字符串-简单对象型与JSONObject之间的转换
     */
	@Test
    public void testJSONStrToJSONObject(){

        JSONObject jsonObject = JSON.parseObject(JSON_OBJ_STR);
        JSONObject jsonObject1 = JSONObject.parseObject(JSON_OBJ_STR); //因为JSONObject继承了JSON，所以这样也是可以的
        
       // {"f":"lily","studentAge":12}

        System.out.println(jsonObject.getString("studentName")+":"+jsonObject.getInteger("studentAge"));
        System.out.println(jsonObject1.getString("studentName")+":"+jsonObject1.getInteger("studentAge"));

    }
}
