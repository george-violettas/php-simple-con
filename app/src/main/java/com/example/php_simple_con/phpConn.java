package com.example.php_simple_con;

import android.net.Uri;
import android.util.Log;

import com.koushikdutta.async.http.AsyncHttpClient;
import com.koushikdutta.async.http.AsyncHttpPost;
import com.koushikdutta.async.http.AsyncHttpRequest;
import com.koushikdutta.async.http.AsyncHttpResponse;
import java.net.HttpURLConnection;
import java.net.URL;

public class phpConn {//https://github.com/koush/AndroidAsync

    public void urlCon(String link) {
        Log.v("george:", " trying: " + link);
        AsyncHttpClient.getDefaultInstance().executeString(
                new AsyncHttpPost(Uri.parse(link)), new AsyncHttpClient.StringCallback() {
                    @Override
                    public void onCompleted(Exception e, AsyncHttpResponse response, String result) {

                        if (e != null) {
                            e.printStackTrace();
                            Log.v("george:", "link failed...");
                            return;
                        }
                        Log.v("george urlCon:", "responce:" + response.toString());
                        Log.v("george urlCon:", "result:" + result.toString());
                        //TODO: get the result.toString() and assign it to a var
                    }
                });
    }

}
