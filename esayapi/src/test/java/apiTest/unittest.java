package apiTest;

import org.junit.Test;


import org.json.*;

public class unittest {
	
	public void test() {
		String jsonResult = "{\"code\":1,\"message\":\"操作成功\",\"data\":{\"sortNum\":0,\"list\":[{\"id\":11},{\"id\":22}]}}";
		//获取"data"下JSONArray对象
		JSONObject jsonObject = new JSONObject(jsonResult).getJSONObject("data");
		JSONArray jsonArray = jsonObject.getJSONArray("list");
		//2、循环遍历这个数组
		JSONArray js= new JSONArray();
			 for(int i=0;i<jsonArray.length();i++){
					 JSONObject job = jsonArray.getJSONObject(i);
					 js.put(job.get("id"));
			 //3、把里面的对象转化为JSONObject
		  }
		 System.out.println(js.toString());
	}
	@Test
	public void test2() {
		String id;
		String jsonResult = "{\"code\":1,\"message\":\"操作成功\",\"data\":{\"sortNum\":0,\"list\":[{\"id\":11},{\"id\":22}]}}";
		//获取"data"下JSONArray对象
		JSONObject jsonObject = new JSONObject(jsonResult).getJSONObject("data");
		JSONArray jsonArray = jsonObject.getJSONArray("list");
		JSONObject jb =new JSONObject();
		//2、循环遍历这个数组
		if (jsonArray.length()>=1) {
			jb = jsonArray.getJSONObject(0);
			id=String.valueOf(jb.getInt("id"));
		}else {
			id=null;
		}
		 System.out.println(id);
	}
}
