package demo5;

import static org.junit.Assert.assertTrue;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        assertTrue( true );
    }

    @Test
    public void testDemo5(){
        User userInfo = new User();
        String s = ((String) JSONObject.toJSONString(userInfo));
        System.out.println(s);

        User newUserInfo = JSONObject.parseObject(s,User.class);

        System.out.println("===================");

        List<User> arrUserInfo = new ArrayList<>();
        arrUserInfo.add(new User(1));
        arrUserInfo.add(new User(2));
        arrUserInfo.add(new User(3));
        arrUserInfo.add(new User(4));

//        JSONArray array = new JSONArray();
//        JSONObject object;
//        object = new JSONObject();
//        for (int i=0;i<arrUserInfo.size();i++){
//            object = new JSONObject();
//            User u = arrUserInfo.get(i);
//            String istr = Integer.toString(i);
//            object.put(istr,u);
//            array.add(object);
//        }

//        System.out.println(object.toJSONString());
        JSONArray array = new JSONArray();

        JSONObject object;
        object = new JSONObject();
        for (int i=0;i<arrUserInfo.size();i++){
            object = new JSONObject();
            User u = arrUserInfo.get(i);
            String istr = Integer.toString(i);
            object.put(istr,u);
            array.add(object);
        }

        JSONObject putObject = new JSONObject();
        putObject.put("id",1);
        putObject.put("data",array);


        String getStr = ((String) putObject.toJSONString());
        JSONObject getObject = JSONObject.parseObject(getStr);
        JSONArray getArray = (JSONArray) getObject.get("data");
        System.out.println("getArray:"+getArray.toString());
        List<User> l1 = new ArrayList<>();
        for (int i=0;i<getArray.size();i++){
            JSONObject o = getArray.getJSONObject(i);
            User u = JSONObject.parseObject(o.toJSONString(),User.class);
            l1.add(u);
        }

        System.out.println();


//        User arruser = JSONArray.toJavaObject(array, User.class);

    }
}
