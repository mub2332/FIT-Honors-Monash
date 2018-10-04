package com.fit3171.allocation.googleOauth;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class Return  {
    public static void main(String [] arg) throws Exception{
        URL url = new URL("https://www.example.com/login");
        URLConnection con = url.openConnection();
        HttpURLConnection http = (HttpURLConnection)con;
        http.setRequestMethod("POST"); // PUT is another valid option
        http.setDoOutput(true);
        http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        http.connect();
        /*try(OutputStream os = http.getOutputStream()) {
            os.write(out);
        }*/
    }

}
//https://accounts.google.com/o/oauth2/auth?redirect_uri=http://localhost:8080&response_type=code&client_id=414244668002-54j4t1igbpdmu4upqajufls8k7fktuur.apps.googleusercontent.com&scope=https://www.googleapis.com/auth/analytics.readonly+https://www.googleapis.com/auth/userinfo.email&approval_prompt=force&access_type=offline
//4/AACbpkMFarNdMwz1qVPV0mWcnfjSt0zMcNcUogSMgr2lcZU2G7qjf7B-f1lmTkhRpfgXFBwxzd9ad3vRD1Oymgk#


//Get access token: http://www.mywebapp.com/oauth2callback?code=>>>>>CLIENTID<<<<<<<
//GET DETAIL
/*
POST /o/oauth2/token HTTP/1.1
Host: accounts.google.com
Content-Type: application/x-www-form-urlencoded

code=4/gXCN77EWLDCO_fake_p2tvfakezOg6Mn0fakej2vA.giyP3fakejxeAeYFZr95uygvU3j0dumQI&
client_id=104608secret-secret-secret-secret.apps.googleusercontent.com&
client_secret=90V0FAKE_WkFAKExrHCZti&
redirect_uri=http://www.mywebapp.com/oauth2callback&
grant_type=authorization_code
 */