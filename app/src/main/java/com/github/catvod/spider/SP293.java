
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
            JSONArray jSONArray = new JSONObject(b(Sg.z(stringBuilder.toString(), null), W)).getJSONArray("data");
            JSONArray jSONArray2 = new JSONArray();
            int i = 0;
            while (true) {
                str6 = "class";
                if (i >= jSONArray.length()) {
                    break;
                }
                String str7;
                String str8;
                JSONArray jSONArray3;
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString(str5);
                String string2 = jSONObject2.getString(str4);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(str4, string2);
                jSONObject3.put(str5, string);
                jSONObject2 = jSONObject2.optJSONObject("type_extend");
                if (z) {
                    if (jSONObject2 != null) {
                        JSONArray jSONArray4 = new JSONArray();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put(str6, "剧情");
                        linkedHashMap.put("area", "地区");
                        linkedHashMap.put("lang", "语言");
                        linkedHashMap.put("year", "年份");
                        Iterator it = linkedHashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            Iterator it2;
                            Entry entry = (Entry) it.next();
                            str6 = jSONObject2.getString((String) entry.getKey());
                            if (TextUtils.isEmpty(str6)) {
                                it2 = it;
                                str7 = str4;
                                str8 = str5;
                                jSONArray3 = jSONArray;
                            } else {
                                it2 = it;
                                JSONObject jSONObject4 = new JSONObject();
                                str7 = str4;
                                str8 = str5;
                                jSONObject4.put("key", entry.getKey());
                                jSONObject4.put("name", entry.getValue());
                                jSONArray4.put(jSONObject4);
                                String[] split = str6.split(",");
                                JSONArray jSONArray5 = new JSONArray();
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put(str2, "全部");
                                jSONObject5.put(str, "");
                                jSONArray5.put(jSONObject5);
                                int length = split.length;
                                int i2 = 0;
                                while (i2 < length) {
                                    jSONArray3 = jSONArray;
                                    Object obj = split[i2];
                                    String[] strArr = split;
                                    JSONObject jSONObject6 = new JSONObject();
                                    jSONObject6.put(str2, obj);
                                    jSONObject6.put(str, obj);
                                    jSONArray5.put(jSONObject6);
                                    i2++;
                                    jSONArray = jSONArray3;
                                    split = strArr;
                                }
                                jSONArray3 = jSONArray;
                                jSONObject4.put("value", jSONArray5);
                            }
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                            jSONArray = jSONArray3;
                        }
                        str7 = str4;
                        str8 = str5;
                        jSONArray3 = jSONArray;
                        if (!jSONObject.has(str3)) {
                            jSONObject.put(str3, new JSONObject());
                        }
                        jSONObject.getJSONObject(str3).put(string2, jSONArray4);
                        jSONArray2.put(jSONObject3);
                        i++;
                        str4 = str7;
                        str5 = str8;
                        jSONArray = jSONArray3;
                    }
                }
                str7 = str4;
                str8 = str5;
                jSONArray3 = jSONArray;
                jSONArray2.put(jSONObject3);
                i++;
                str4 = str7;
                str5 = str8;
                jSONArray = jSONArray3;
            }
            jSONObject.put(str6, jSONArray2);
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return jSONObject.toString();
    }

    public String detailContent(List<String> list) {
        JSONObject jSONObject;
        String str = "$$$";
        String str2 = "vod_content";
        String str3 = "vod_actor";
        String str4 = "vod_remarks";
        String str5 = "vod_area";
        String str6 = "vod_year";
        String str7 = "vod_pic";
        String str8 = "vod_name";
        String str9 = "vod_id";
        String str10 = "data";
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            String TC = TC(q());
            jSONObject3.put("time", q());
            String jSONObject4 = new JSONObject(B.W(TC, j1));
            StringBuilder stringBuilder = new StringBuilder();
            JSONObject jSONObject5 = jSONObject2;
            try {
                stringBuilder.append(this.k);
                stringBuilder.append("api.php/Videoend/videoDetail?id=");
                String str11 = str;
                stringBuilder.append((String) list.get(0));
                stringBuilder.append("&ck=");
                stringBuilder.append(URLEncoder.encode(jSONObject4));
                stringBuilder.append("&version=");
                stringBuilder.append(this.m);
                stringBuilder.append("&appId=");
                stringBuilder.append(this.q);
                stringBuilder.append("&csrf=");
                stringBuilder.append(URLEncoder.encode(TC));
                JSONObject jSONObject6 = new JSONObject(Sg.z(stringBuilder.toString(), a()));
                JSONObject optJSONObject = new JSONObject(b(jSONObject6.optString(str10), W)).optJSONObject(str10).optJSONObject("vod_info");
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put(str9, optJSONObject.getString(str9));
                jSONObject7.put(str8, optJSONObject.getString(str8));
                jSONObject7.put(str7, optJSONObject.getString(str7));
                jSONObject7.put("type_name", optJSONObject.optString("vod_class"));
                jSONObject7.put(str6, optJSONObject.optString(str6));
                jSONObject7.put(str5, optJSONObject.optString(str5));
                jSONObject7.put(str4, optJSONObject.optString(str4));
                jSONObject7.put(str3, optJSONObject.optString(str3));
                jSONObject7.put(str2, optJSONObject.optString(str2).trim());
                JSONArray jSONArray = jSONObject6.getJSONArray("video_list");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject8 = jSONArray.getJSONObject(i);
                    str5 = jSONObject8.getString("code");
                    this.TA = jSONObject8.getString("user_agent");
                    linkedHashMap.put(str5, jSONObject8.optString("url"));
                    JSONArray optJSONArray = jSONObject8.optJSONArray("parse_api");
                    if (this.ru.containsKey(str5)) {
                        Set set = (Set) this.ru.get(str5);
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            set.add(optJSONArray.optString(i2));
                        }
                    } else {
                        HashSet hashSet = new HashSet();
                        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                            hashSet.add(optJSONArray.optString(i3));
                        }
                        this.ru.put(str5, hashSet);
                    }
                }
                str3 = str11;
                str = TextUtils.join(str3, linkedHashMap.keySet());
                str2 = TextUtils.join(str3, linkedHashMap.values());
                jSONObject7.put("vod_play_from", str);
                jSONObject7.put("vod_play_url", str2);
                jSONArray = new JSONArray();
                jSONArray.put(jSONObject7);
                jSONObject = jSONObject5;
                try {
                    jSONObject.put("list", jSONArray);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                jSONObject = jSONObject5;
            }
        } catch (Exception unused3) {
            jSONObject = jSONObject2;
        }
        return jSONObject.toString();
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3 = "header";
        String str4 = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("parse", "0");
            jSONObject.put("playUrl", str4);
            SpiderDebug.log(new JSONObject(this.ru).toString());
            if (this.ru.containsKey(str)) {
                for (String append : (Set) this.ru.get(str)) {
                    HashMap hashMap = new HashMap();
                    String str5 = this.TA;
                    if (str5 != null) {
                        this.b = str5;
                    }
                    hashMap.put("User-Agent", this.b);
                    str5 = this.TC;
                    if (str5 != str4) {
                        hashMap.put("Host", str5);
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(append);
                    stringBuilder.append(str2);
                    stringBuilder.append("&appId=");
                    stringBuilder.append(this.q);
                    stringBuilder.append("&version=");
                    stringBuilder.append(this.m);
                    JSONObject jSONObject2 = new JSONObject(Sg.z(stringBuilder.toString(), hashMap));
                    String optString = jSONObject2.optString("data");
                    Integer valueOf = Integer.valueOf(jSONObject2.optInt("encryption"));
                    if (Integer.valueOf(jSONObject2.optInt("code")).intValue() == 1 || (!optString.equals(str4) && valueOf.intValue() >= 0)) {
                        String str6 = "url";
                        if (valueOf.intValue() == 1) {
                            jSONObject2 = new JSONObject(b(optString, sX));
                            optString = jSONObject2.optString(str6);
                            str5 = jSONObject2.optString(str3);
                            if (!TextUtils.isEmpty(optString)) {
                                jSONObject.put(str6, optString);
                                if (!TextUtils.isEmpty(str5) && optString.contains("weiyun")) {
                                    jSONObject.put(str3, str5);
                                }
                            }
                        } else if (valueOf.intValue() == 0) {
                            optString = new JSONObject(optString).optString(str6);
                            if (!TextUtils.isEmpty(optString)) {
                                jSONObject.put(str6, optString);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return jSONObject.toString();
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3 = "vod_remarks";
        String str4 = "vod_pic";
        String str5 = "vod_name";
        String str6 = "vod_id";
        String str7 = "year";
        String str8 = "area";
        String str9 = "class";
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.k);
            stringBuilder.append("api.php/Videoend/video?class=");
            String stringBuilder2 = stringBuilder.toString();
            if (hashMap.containsKey(str9)) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append((String) hashMap.get(str9));
                stringBuilder2 = stringBuilder3.toString();
            }
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder2);
            stringBuilder4.append("&area=");
            str9 = stringBuilder4.toString();
            if (hashMap.containsKey(str8)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str9);
                stringBuilder.append((String) hashMap.get(str8));
                str9 = stringBuilder.toString();
            }
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append(str9);
            stringBuilder5.append("&year=");
            str8 = stringBuilder5.toString();
            if (hashMap.containsKey(str7)) {
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(str8);
                stringBuilder4.append((String) hashMap.get(str7));
                str8 = stringBuilder4.toString();
            }
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append(str8);
            stringBuilder6.append("&tid=");
            stringBuilder6.append(str);
            stringBuilder6.append("&pg=");
            stringBuilder6.append(str2);
            stringBuilder6.append("&device_id=0000000000000000&public_ip=114.114.114.114&city=null&csrf=");
            stringBuilder6.append(URLEncoder.encode(TC(q())));
            JSONArray jSONArray = new JSONObject(b(Sg.z(stringBuilder6.toString(), a()), W)).getJSONArray("data");
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(str6, jSONObject2.getString(str6));
                jSONObject3.put(str5, jSONObject2.getString(str5));
                jSONObject3.put(str4, jSONObject2.getString(str4));
                jSONObject3.put(str3, jSONObject2.getString(str3));
                jSONArray2.put(jSONObject3);
            }
            int parseInt = Integer.parseInt(str2);
            jSONObject.put("page", parseInt);
            if (jSONArray2.length() == 12) {
                parseInt++;
            }
            jSONObject.put("pagecount", parseInt);
            jSONObject.put("limit", 12);
            jSONObject.put("total", Integer.MAX_VALUE);
            jSONObject.put("list", jSONArray2);
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return jSONObject.toString();
    }

    public String homeVideoContent() {
        String str = "vod_remarks";
        String str2 = "vod_pic";
        String str3 = "vod_name";
        String str4 = "vod_id";
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.k);
            stringBuilder.append("api.php/Videoend/indexVideo?device_id=0000000000000000&public_ip=114.114.114.114&city=null&csrf=");
            stringBuilder.append(URLEncoder.encode(TC(q())));
            JSONArray jSONArray2 = new JSONObject(b(Sg.z(stringBuilder.toString(), a()), W)).getJSONArray("data");
            for (int i = 0; i < jSONArray2.length(); i++) {
                JSONArray jSONArray3 = jSONArray2.getJSONObject(i).getJSONArray("vlist");
                for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray3.getJSONObject(i2);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(str4, jSONObject2.getString(str4));
                    jSONObject3.put(str3, jSONObject2.getString(str3));
                    jSONObject3.put(str2, jSONObject2.getString(str2));
                    jSONObject3.put(str, jSONObject2.getString(str));
                    jSONArray.put(jSONObject3);
                }
            }
            jSONObject.put("list", jSONArray);
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return jSONObject.toString();
    }

    public String searchContent(String str, boolean z) {
        String str2 = "vod_remarks";
        String str3 = "vod_pic";
        String str4 = "vod_name";
        String str5 = "vod_id";
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.k);
            stringBuilder.append("api.php/Videoend/search?pg=1&text=");
            stringBuilder.append(URLEncoder.encode(str));
            stringBuilder.append("&pg=1&device_id=0000000000000000&public_ip=114.114.114.114&city=null&csrf=");
            stringBuilder.append(URLEncoder.encode(TC(q())));
            JSONArray optJSONArray = new JSONObject(b(Sg.z(stringBuilder.toString(), a()), W)).optJSONArray("data");
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(str5, jSONObject2.getString(str5));
                jSONObject3.put(str4, jSONObject2.getString(str4));
                jSONObject3.put(str3, jSONObject2.getString(str3));
                jSONObject3.put(str2, jSONObject2.getString(str2));
                jSONArray.put(jSONObject3);
            }
            jSONObject.put("list", jSONArray);
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return jSONObject.toString();
    }

    public SP293() {
        String str = "";
        this.b = str;
        this.TC = str;
        this.x = str;
        this.k = str;
        this.TA = "User-Agent";
        this.ru = new HashMap();
        this.m = "1.3.3";
    }

    public void init(Context context, String str) {
        String str2 = "headers";
        try {
            JSONObject jSONObject = new JSONObject(Sg.z("http://www.dmtv.ml/mao/sites/293.json", null));
            this.q = jSONObject.optString("appid");
            this.m = jSONObject.optString("version");
            this.TC = jSONObject.optJSONObject(str2).optString("host");
            this.b = jSONObject.optJSONObject(str2).optString("User-Agent");
            this.x = jSONObject.optString("mainurl");
            this.k = new JSONObject(b(Sg.z(this.x, a()), a)).optJSONObject("data").optString("url");
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }

    private HashMap<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", "Dalvik/2.1.0 (Linux; U; Android 10; PBEM00 Build/QKQ1.190918.001)");
        return hashMap;
    }

    private String TC(String str) {
        return B.W(str, j1);
    }

    private String b(String str, String str2) {
        return B.a(str, str2);
    }

    private String q() {
        return String.valueOf(System.currentTimeMillis() / 1000);
    }

    public void init(Context context) {
        super.init(context);
    }

    public boolean isVideoFormat(String str) {
        return super.isVideoFormat(str);
    }

    public boolean manualVideoCheck() {
        return super.manualVideoCheck();
    }
}
