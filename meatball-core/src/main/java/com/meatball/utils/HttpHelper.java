package com.meatball.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;


public class HttpHelper {

	static boolean proxySet = false;
    static String proxyHost = "211.149.231.26";
    static int proxyPort = 80;
    
    public static String urlEncode(String source,String encode) {  
        String result = source;  
        try {  
            result = java.net.URLEncoder.encode(source,encode);  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
            return "0";  
        }  
        return result;  
    }
    public static String urlEncodeGBK(String source) {  
        String result = source;  
        try {  
            result = java.net.URLEncoder.encode(source,"GBK");  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
            return "0";  
        }  
        return result;  
    }
    /** 
     * 发起http请求获取返回结果 
     * @param req_url 请求地址 
     * @return 
     */ 
    public static String httpRequest(String req_url) {
        StringBuffer buffer = new StringBuffer();  
        try {  
            URL url = new URL(req_url);  
            HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();  
   
            httpUrlConn.setDoOutput(false);  
            httpUrlConn.setDoInput(true);  
            httpUrlConn.setUseCaches(false);  
   
            httpUrlConn.setRequestMethod("GET");  
            httpUrlConn.connect();  
   
            // 将返回的输入流转换成字符串  
            InputStream inputStream = httpUrlConn.getInputStream();  
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");  
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  
   
            String str = null;  
            while ((str = bufferedReader.readLine()) != null) {  
                buffer.append(str);  
            }  
            bufferedReader.close();  
            inputStreamReader.close();  
            // 释放资源  
            inputStream.close();  
            inputStream = null;  
            httpUrlConn.disconnect();  
   
        } catch (Exception e) {  
            System.out.println(e.getStackTrace());  
        }  
        return buffer.toString();  
    }  
       
    /** 
     * 发送http请求取得返回的输入流 
     * @param requestUrl 请求地址 
     * @return InputStream 
     */ 
    public static InputStream httpRequestIO(String requestUrl) {  
        InputStream inputStream = null;  
        try {  
            URL url = new URL(requestUrl);  
            HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();  
            httpUrlConn.setDoInput(true);  
            httpUrlConn.setRequestMethod("GET");  
            httpUrlConn.connect();  
            // 获得返回的输入流  
            inputStream = httpUrlConn.getInputStream();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return inputStream;  
    }
     
     
    /**
     * 向指定URL发送GET方法的请求
     * 
     * @param url
     *            发送请求的URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }
 
    /**
     * 向指定 URL 发送POST方法的请求
     * 
     * @param url
     *            发送请求的 URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @param isproxy
     *               是否使用代理模式
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String url, String param,boolean isproxy) {
        OutputStreamWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            HttpURLConnection conn = null;
            if(isproxy){//使用代理模式
                @SuppressWarnings("static-access")
                Proxy proxy = new Proxy(Proxy.Type.DIRECT.HTTP, new InetSocketAddress(proxyHost, proxyPort));
                conn = (HttpURLConnection) realUrl.openConnection(proxy);
            }else{
                conn = (HttpURLConnection) realUrl.openConnection();
            }
            // 打开和URL之间的连接
             
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");    // POST方法
             
             
            // 设置通用的请求属性
             
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
             
            conn.connect();
             
            // 获取URLConnection对象对应的输出流
            out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
            // 发送请求参数
            out.write(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！"+e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return result;
    }
    
    
    public static String requestGet(String url) {
		String respstring = null;
		HttpClient client = new HttpClient();
		// 设置连接超时时间
		client.getHttpConnectionManager().getParams().setConnectionTimeout(15000);
		GetMethod get = new GetMethod(url);
		try {
			if(get != null) {
				int statusCode = client.executeMethod(get);
				if (statusCode == HttpStatus.SC_OK) {
					respstring = get.getResponseBodyAsString();
				}
			}

		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return respstring;
	}
    
    public static String requestPost(String url) {
		HttpClient client = new HttpClient();
		// 设置连接超时时间
		client.getHttpConnectionManager().getParams().setConnectionTimeout(2000);
		PostMethod post = new PostMethod(url);
		try {
			if(post != null) {
				client.executeMethod(post);
				InputStream ins = post.getResponseBodyAsStream();
				// 按指定的字符集构建文件流
				BufferedReader br = new BufferedReader(new InputStreamReader(ins,
						"utf-8"));
				StringBuffer sbf = new StringBuffer();
				String line = null;
				while ((line = br.readLine()) != null) {
					sbf.append(line);
				}
				br.close();
				return sbf.toString();
			}
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		post.releaseConnection();
		return null;
	}
    
    public static String requestPost(String url, String parm) {

		HttpClient client = new HttpClient();
		// 设置连接超时时间
		client.getHttpConnectionManager().getParams()
				.setConnectionTimeout(2000);
		PostMethod post = new PostMethod(url);
		try {
			RequestEntity entity = new StringRequestEntity(parm, "text/html",
					"utf-8");
			post.setRequestEntity(entity);
			client.executeMethod(post);

			InputStream ins = post.getResponseBodyAsStream();
			// 按指定的字符集构建文件流
			BufferedReader br = new BufferedReader(new InputStreamReader(ins,
					"utf-8"));
			StringBuffer sbf = new StringBuffer();
			String line = null;
			while ((line = br.readLine()) != null) {
				sbf.append(line);
			}

			br.close();
			System.out.println(sbf.toString());
			return sbf.toString();
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		post.releaseConnection();
		return null;

	}
    
    
    public static void main(String[] args) {
    	String para="{\"touser\":\"ouuPRvnyIA8mXHEvb7TGCEA8GzS8\",\"template_id\":\"_FeAEN2HzfZ228xw8v7KnOzrLVUEAQTW0KQdJ8Jo4cI\",\"url\":\"http://weixin.qq.com/download\",\"topcolor\":\"#FF0000\",\"data\":{\"first\": {\"value\":\"您好，您已预约挂号成功。\",\"color\":\"#173177\"},\"patientName\": {\"value\":\"123\",\"color\":\"#173177\"},\"patientSex\": {\"value\":\"未填\",\"color\":\"#173177\"},\"hospitalName\": {\"value\":\"南充市中心医院\",\"color\":\"#173177\"},\"department\": {\"value\":\"心胸外科门诊\",\"color\":\"#173177\"},\"doctor\": {\"value\":\"刘涛\",\"color\":\"#173177\"},\"seq\": {\"value\":\"1010161009201509070813460784\",\"color\":\"#173177\"},\"remark\": {\"value\":\"就诊日期：2015-09-16\",\"color\":\"#173177\"}}}";
    	System.out.println(para);
    	String url = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=5Vco3cxWmp-O_dmC5Zcj-S14AuSEwJOIXzATr17z9HbdIlk4WL5YSkQxhjIZPr8POi5erm125WouY8CBJ7kWF6tj8AZZJtiJpg7_AsWtKKc";
        String sr=HttpHelper.sendPost(url,para,false);
//        String ss=HttpHelper.requestPost(url,para);
//        System.out.println(ss);
        System.out.println(sr);
	}
}