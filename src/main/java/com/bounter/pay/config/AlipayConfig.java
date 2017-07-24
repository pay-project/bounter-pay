﻿package com.bounter.pay.config;

public class AlipayConfig {
	 
	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2017050307098828";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCUMiHuBdd4O19XAYTmlr4x2eanMpgRC/cC43BFbsOnM5NhgJh/JwSrJomSMy8dUzwzB3bK6JKDRXYaeTcDUT8pRvMlpZlIRYYNywGy6xysXg40Q4rA+Phssz0blHRRWm/jmjY2h5zddulODSarJhqqZT82KDV1Z1r0k7zopmTkUO2E05H6kLU9e0VId5f34IMdHegrZK6kCfoARf1aBq7YvgbJXba4foW2JPsKQ8YJBxOlLETAjLFYi0N3uJUnOSiPi7cFIO6VtPHlIMm32/BOkr8y6dKjHE5gOKD0FFaPgFfrR4rC+UE7wknaK3Kaphu9fCPLyv/abWHK1VbsOUI7AgMBAAECggEAKxl5bLQeOkVqMO+sKzPkFLN+tVmtiCemqxxiZo8UL+h8EHtJ3pEGdpA6ql5gcXLnqx+cmN6S3cKx2nkuWrSiXerYhDZpIe+2UQSddd+S8z5XezO5gu3lshdeykqemZpnuBX9dlZydKZErAJ/IH9weeYAQEvpYD+y4DanVjIuXYgGf30EjPd39DTL06JGk5lRE6k8zpHlEUuc61WR5MD1f9Ko9uW88UdWIdQ4Trx7iINSTnKiEwHXPWp4XCEMf9nXSfjGWbEEzpo/VirvA2XF4cIpqs+J+B4T56PJQZji58VC+q2xlvLuq3gPT+tC/nQthV4dL/UsthPo1dJuUacyIQKBgQD95gqS1LD+H0ONKoMx028nwI/C3t70akqokXQfeEkZkA3bE8XfYxD80NnKCOSJkzqgSLN0Kk+QkvwporcCVGqd9UFmOwy6SU7qJ3b3NuCmdAOjivpZqGsKvDGwf02qW0i2OsqbHcd431FX97G4pRI4xcY/AvfLXgrhyww/f2UHPQKBgQCVbCD/cZKAAB8c2IN+L556FEORqjyBSbHNqM83u460YViI2QPwKvs3N8iqHZ7sczw281G/6Pn+xhLB2WSG1Kfe9B4mNLtPOEOsgpbJqV9Osf74qvtIGBRVPU8UfLLXY96Eu34dTY/VYlB1IqRz0zRq3w48tGC1OKEM81TGWlPG1wKBgQC6czdqkjSTuWPDA+gqK+mh2J/56+7wsCm5Vm9fONb9pbL3IbMak8aC0eBNpHAns23HDPxznyqksbvp22rnlBRjgRqQt2ZmWrVP8MFFVBBvTBzr+YBVXP+Wd5NJ2IKxSq2/3LayaJD2a5BxuBzTyqzx8hLebRCJULtPCuwoqSYIxQKBgQCDZsiJ+zVrLTAvLNROBtBl6SYWlk+JHuamxjocd+siA61ZAwdskE/Fml/0AgJ9S0V7yXRtwRMAEu3x3RyDWcWa0rEkxiCmpQMWVO0HwNPYn71qruo11z8iSr0ddh/MPL41mbBpUokXjNLWf7WBSg4BodCiX7ngBEHU4rP9jve3lwKBgGg6uHvHea/WGPQBAI6o3kXoLoxlDolJ7B/tmaDH9Y7uGr7jh1ptOodFHp6ioYiUHGeIFtX9VIz51EVSh7APyECjURCxkncAYg37pZzEB5OgYIV7oeZ91coXCIwbs5ONw/t0viux3XRzYjBT92bX10atVz7Ba72fuzIhynvtmAAs";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAiK6013ux+xu9UWVFk1nyBHzaXKNXPKYL52eHAIGZBxePh45tALS5ANjVzjYYY2dxC9ySv1UA78BzWL5HbRJ5yr7EuMAvJWWzBXNGurUlm5+nFEcCkmAwNn2T5lcKetjRN4WNY9uhr5e7eGss46ThyZWZMBnPfEkDM//U5DGredtvg0h4asCGbtzO+TqSaKR2Joi1FmZBE2jxq69IOylSTEQTw+meHevDzX+uKuka3nbZlz9fHfwZvHTmASIqH3jLkIIl+JJg4QbRA1tBDhECl6UxDXynrQi8WmaGYW4B4nb7vgCpEElNT0d1Tu2K79lkG9YjdVp/4QFt7SSlbvaykQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://3707e71f.nat123.cc:46772/notify_url";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://3707e71f.nat123.cc:46772/return_url";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";
	
}
