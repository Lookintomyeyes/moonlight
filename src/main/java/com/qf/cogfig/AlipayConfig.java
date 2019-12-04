package com.qf.cogfig;

import java.io.FileWriter;
import java.io.IOException;

import static javafx.scene.input.KeyCode.G;
import static javafx.scene.input.KeyCode.X;

/**
 * Created by Administrator on 2019/12/2.
 */
public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101600696323";

    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCt2MsfmFFi5z440hMf5ZgSUpU6U38nhrzaYmR9exmosQcTfxDjiqoURCWTvoy3dTbVc95qXdhjr06UNy+c/ax/q0BP2dUziedqY3xl2vWAGT9fAW2IGVBfxSW37BWuc9NLvN0qfZTo85ZdOntcs+G+FLriv7S0CYRPQ0zgodtwcKpHFCLtKFx5pYjsU55AEdZvUvMzSvw3j/df++RNGju+bAkwDs/lRSXN/oNmj90KUYbkCm368fsO4jvoMTciaxX/rW9txooFHm88U0Ihmrld1ijpMi7vPHMI3In6Asc75zSuEGn4kfgdK6RBgv489M9fwK21F7lDGO68FAlwop17AgMBAAECggEBAIe3CMt/g3msgJynExsBh7g2FB1WdZuLyf7KdRyobx2MJbQIrEyWQbRUhulSBlRqAwabz/RFktovTy7R7i+msXVxYWF08sWrUKdzRvfU+XapPxmR6conyOEa7RkqCrsH3NnxdM7o/sjk8GuTbh6upvpXAJZnhlBOZaXjKi7q7H5Xi4gnRva+yRtBVQNYYZhOxF+t0f/wEnxysAFwWqmM1H6YkirGC9ShWpHCCPzcPm4j6AQbf6ubEBL893Y0u+rUwbxMVFS4uyRTspZ90Qdp3qafTHqb7tRhZs5k1ijPtMRjH2FvDxA6KUkyn0j2pt36ShU3beKpVuaW2kSgCcg+8+ECgYEA5HvQcgOVRXTNKoTnB/rvPlcJSGaSgFGpZ0tHXse7QDUySlnKG/OrSU31iX4sscIi+NfmobGpsOyA53HLQcZrOD0BZd7ep4UD7IV4pWc851nR722lHJaHdV6oWTEfVAArOL6vhAG9fGydCuiOjwBGNkTVqk5FdsiXrZW6ks8OY5kCgYEAwsiEsZfBThHQB/8ZimhmRVx6Nv61Ft7W6z93EME6XXtKNr/Phd29iCRYD6jQZMhgFLKBd/fZKKERqyal6lA3pRK2CqdeX5aEGCoMJDFADtafgRiiteV11ov+RI0YQu1REOC5tjPKBJCA8kuqT3NG2cuugLv1WRDOxIo42N9mtjMCgYEAvaq2T18AE+cwxQIMUsiQv3w6vXpAVPr1GEUaWuiMXXGLbML6jpeI8dIgaGFwMqOIqm93CXTU+4RoQThqVRCkQswJlAodZIx7xGTL0OpRWW9rYUjwjjm6+sh4EYpAileViYZpZriXFmmHN93zMWw13KjpgXV2HnPHzZYEiggN1skCgYEAoExA155aGROTrmED9eHA+KgIdCXdhfrRyDwskn9Stwf1pWTpNfOsPNQcHJcDGU3FtILLBZ3U+xjC36UoudJWWOUzJ0Vh5yyJfRFteIOHgi6iia1qimNSPMRs9qFfLAT9x/QJIacxQ9xgIgafHE90KVz0OUF1wlyQrTJLYj9H2f0CgYBjM13oX5L+U4OiuHSP/OsDB0m4ODiFI1HrHjAdyuEpcg5OGpx+rcLsz0q3L9w9At2E7pIWULnJS+k+YvTFSEpayxR7LpvWaa2BOiABJPcT0fgwEHAjw1IhzVNBYJQ+9NC3LFmIDI49Zk5Z76Us52KPGC3SwDrP8RDJ3ys5J37IXA==";

    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2qIam/bAjWFkSPKNDfjvRxA8Zqb/DbKnNUWAPRvimGSuTGrRTFSjpzcIroRTNVwVWrmG56mQ1sQKVPesdECGRmQbXNwJ7ht4eiT3pP6cSF1qYZh1Ee5Krcw9ApiwK8Ol09WRmXOlxiToSiawDXZ5W6sSXxWME4K2PWqQKH5BuO9blyGlSOBbaa4Lt22dLGtmF3s6L/sOfUy9PnIqVn7dB6OCsg18zKyEoH2sNIwzSjDjV2PgqXTNHhkt94TtBQXCWa6jGsD1TUbZrnOJYk00Zw3zGppD88SA0Rt3tw+ZLT3DjDcCobsDr0I+5Tmkcyn5+1LJvCsAQmBp/1N297SrqQIDAQAB";

// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    //public static String notify_url = "http://localhost:8080/pay/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    //public static String return_url = "http://localhost:8080/pay/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl ="https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

