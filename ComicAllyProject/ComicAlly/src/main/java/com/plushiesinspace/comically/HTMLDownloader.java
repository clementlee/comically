package com.plushiesinspace.comically;

import android.os.AsyncTask;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Downloads a string at a specific resource given a string URL.
 * Created by cleme_000 on 10/17/13.
 */
public class HTMLDownloader extends AsyncTask <String, Void, String>{

    @Override
    protected String doInBackground(String[] urls) {
        String responseStr = null;

        try {
            for (String url : urls) {
                DefaultHttpClient httpClient = new DefaultHttpClient();
                HttpGet get = new HttpGet(url);
                HttpResponse httpResponse = httpClient.execute(get);
                HttpEntity httpEntity = httpResponse.getEntity();
                responseStr = EntityUtils.toString(httpEntity);
            }
        } catch (UnsupportedEncodingException e) {

        } catch (ClientProtocolException e) {

        } catch (IOException e) {

        }
        return responseStr;
    }
}
