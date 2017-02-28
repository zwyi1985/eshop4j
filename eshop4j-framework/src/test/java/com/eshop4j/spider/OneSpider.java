package com.eshop4j.spider;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class OneSpider {
     private static final String ORDER_URL="http://zhihe.cnyirui.cn/backend/pcgkdd/list?";//293
//     private static final String POSTURL="http://zhihe.cnyirui.cn/backend/pcgk/list?";//890
     private void spiderData() throws Exception{
    	 Map<String, String> cookies = new HashMap<String, String>();
    	 cookies.put("JSESSIONID", "693d6e61-0ff7-4279-a1fc-42865198871d");
    	 cookies.put("loginname", "szadmin");
    	 
    	 FileWriter fw = new FileWriter("E://spider-htmls/order-total.html");
    	 StringBuilder data = new StringBuilder();
    	 for(int n=1;n<=293;n++){
    		 Map<String,String> req=new HashMap<String,String>();
    		 req.put("page", ""+n);
			Document doc = Jsoup.connect(ORDER_URL).cookies(cookies).data(req).get();
			System.out.println(ORDER_URL + "page=" + n);
//			data.append(doc.select("table").html());
			Elements trs = doc.select("table").select("tr");
			for (int i = 0; i < trs.size(); i++) {
				data.append("<br>");
				Elements tds = trs.get(i).select("td");
				for (int j = 0; j < tds.size(); j++) {
					String text = tds.get(j).text();
					data.append(text).append("|");
				}
			}
    	 }
    	 fw.write(data.toString());
    	 fw.flush();
     }
     /**
      * @param args
      * @throws Exception 
      */
     public static void main(String[] args) throws Exception {
         
    	 OneSpider spider=new OneSpider();
         spider.spiderData();
     }
 
 }