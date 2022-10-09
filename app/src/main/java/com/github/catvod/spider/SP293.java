package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.B;
import com.github.catvod.spider.merge.Sg;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class SP293 extends Spider {
    public static String W = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAL4cSBLgAtKxA3br\nZ73KA6/uagCFNBqh3+GVWZGyKlrChUrrqcBHmV/fZcH/oVIwZHCxv0rnOesTE7WZ\nhzgbbUEsBDK8W8+paIwQI3Pvpp3JzEvduOfS/4G4EPYpKiGE3+vK9q7h+9xVv6FS\n8uzKAe6uS98qDgHad46cMJVkYR0DAgMBAAECgYAZMBAQiCN3nMJTwC63g4tnhNQA\ni6Vynd3Wun3qgst/yOP2IDEWa6YTgLqvsFnEVOsJz1MD7ozK63UiC1xR/7hCvqTz\niaV7g0lCB9Gk9ZMRIpS8pPtfnDSMjeYzMCQWvdRMOf8BkFp7SISCtlQRm9VKKRKM\nZ27zH3BvIvTed4tYoQJBAOw7Gda7L2CXBdKfpRK6KgUVkki/d9qEcm1kS9TFAxrQ\ncEWdijF7l9w8LnaBPC0uaRKmEB4/uiOMXXN89Vo6CnECQQDOBR57KgMAAKDzFIRD\nyegl1Y6xTpEIi0/YlTlPyZmYpG2vS6czG+OQfJoT/w/vBw7mMGTR3IiQwF2qqYAC\nUNCzAkEA60suwGgvl3i1jwX+iLmu8uN6kkVL3vZ/dyAoO+SD5ChrO5vgMstVBkNX\nUCgHRUVt2OpZMZfuEkxUJJz5UQZwsQJAUCLFnHrW9+VGtcbBO+0Jk83h1y4MVBp8\nUG6bAGIWkL1EvO7cdpDej5EoDack94DzVq50SP1TUZrB1GRiGoR86QJAfy9NP2vD\ntk8MyjIUWjpYTTUhjMk/6WurIBtwEzE56QLFLshm1KwEFh25qrdI4vXChQQKXAgu\n17b+I7qfYh2IMA==";
    public static String a = "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAMNlbdQeVJIW9baQ\n7qAUYL6gbMfKcfxuwTlt+eh8hf9oC2lcztpjwm1s/MWqHk7/yFpps/vup6p+1inh\n5gzlKov9Ay5hHa3feYtKsb07jgKyfUJUhAqRIrqAQz+XL96dtDyaGXd2mT2Vo7OL\ncN6NeDcGR8c5tVG34o3LEDEd9s8dAgMBAAECgYEAvxaGnhc7ZdOGYRDEDVFge4yw\nVYMqjlBSLzPaXv7InMrHvjbBJNrC3fjkCvsfwOpsqd8N4ae32QlJsJP3Q00qmR9I\n8beLjUe50zOSk1ExSdKTAHV8iHFlxxQhfP0y9T7pTYuDFMRC8Qcc2J7d6OUVF3Au\n/GBM6P8yFrKeDx2hXQECQQDjM4V75SmQ+dtPjajzBZt9OctVwAfEVePUX84dioMO\nS1W7KxaHYYpZMPMC9SkAsCYuGhw2bXIiCRQM+6PDm9aRAkEA3CncsOQTLRgpGOo/\nLr5UXybq8EVB5s1ItTd+dCqAH8i220kw5OXH3siMwLJBdv8zUVrAwqocaNRzgjYY\n1WytzQJBAKAjAEKDEvkMIne/8QTZPu7UfWzDHLZVk29s12oa5qR8lMCHbimdplWX\nGrFK+stxXHfCD4CNQ5SZsXg1JQgKHwECQFprxvvPcCDBH3/gFPr5qGU78pmjmCFW\nhloG5KSJH/3tzUvaj34y8ReKfmRV0ZUx0r3C7BAHFYvoVVhRJ3ngHLECQQCC5iTB\nfTdd51Lb5kwxffk/iw+BRAsZ5SAzUlmwRyB0cvX/9yvton8PPK590yYQqkc6BMmN\nePzRypVlYNXzhYfe";
    public static String j1 = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDWHmmu0aFU2m1ZnQb09+/QQRnu\ny3GmcwnTnFwPLR/CsfbsxiNQLULpdwhC1h1U/3yEyc2kZ549+X3iYFed3tHa0NLn\ntcSw6w6IcEAgiaeHasRlzh98IgEai9XChbhLAy7a/s4HnhFXJCsg5/FqrjZ/FuEO\nhbCN3gWcc6Aly+OZhwIDAQAB";
    public static String sX = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAM6T6V5lfKE5miEM\nR88NalNn6CvzQC+PR8bH0ipUege8D/tFgjh22J3Yh1Ibgl1zsoifz3eF8/IKWZ6H\nui7iUeOvbZteCuz7IBLFvnbPsNCP7SbLGPYRasVp3zqwt2NV72aZ/bI9pLczK2+b\n0R+KJXZ5V6fmVFx/QWWAo+NmkerVAgMBAAECgYA0yBQjm1iptRcNhJ7AZ5QYNX9b\n424t+LUFND8ds7HuUf3fXNY16R/VzOJed0rq58nhILwYtPAskrptSA6pNghn56di\nke27vANR6mTaYv+0o1FS/+lGQ1UohSAnzVw30L/tJzrobvvU4joXYjb95typAOiI\nvcOh8WAuwQRU7I5MAQJBAPh/Ji6mKbllYHAn+sHdE0cGm8QISZz+7dvZQQ8L7MzJ\nG1eUYZXCXQ9Fiqrk3kLNwq6IW+eruBsH4HJa9LNyjwECQQDU0Lvy/EnnQNITryXQ\n20gxR+x4e9Nak+4GJbL6JFf9kqCUhei2ni8t/RO7wp+jrKUy2kdzGlRL+cv5dgxz\nv+/VAkBQua2DtgMT8TT0+mfhlpnultz/P9n6IG7Q3rDd3Hfexu4U82UIK43jqimz\n/omdlg5KeI2yovw5+8MUIywfJ3YBAkBanIVp8AGHdRH9T5XKV5NlaDpHEnHrHxE5\njNOnrdHJJaU5l8p99twfuKGuUC+ogNnVzRqe55b8wl8W2Cx1HEQBAkAzWKejO1OW\nmdf+VwgUwShiRMvlNvzO7iPoyE6B4DrLM5dAMk8BN4Cyk1T/4pDfcj9FCydDk3fC\nmtPA0DWngU6A";
    private String TA;
    private String TC;
    private String b;
    private String k;
    private String m;
    private String q = "10000";
    private Map<String, Set<String>> ru;
    private String x;

    public String homeContent(boolean z) {
        String str = "v";
        String str2 = "n";
        String str3 = "filters";
        String str4 = "type_id";
        String str5 = "type_name";
        JSONObject jSONObject = new JSONObject();
        try {
            String str6;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.k);
            stringBuilder.append("api.php/Videoend/nav?device_id=0000000000000000&public_ip=114.114.114.114&city=null&csrf=");
            stringBuilder.append(URLEncoder.encode(TC(q())));
            JSONArray jSONArray = new JSONObject(b(Sg.z(stringBuilder.toString(), null), W)).getJS
