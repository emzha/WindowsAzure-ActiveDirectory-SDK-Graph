package com.microsoft.windowsazure.activedirectory.sdk.graph.token;

import org.apache.log4j.Logger;

import com.microsoft.windowsazure.activedirectory.sdk.graph.exceptions.SdkException;


public class TokenGenerator {
	
	
	private static Logger logger  = Logger.getLogger(TokenGenerator.class);
	
	
  /**	
	* This method generates an access token for the caller.
	* @param tenantContextId The context Id of the tenant.
	* @param appPrincipalId Application Principal Id.
	* @param stsUrl The Url of ACS (STS).
	* @param acsPrincipalId Principal Id of ACS.
	* @param symmetricKey Symmetric key for generating the self signed token.
	* @param protectedResourcePrincipalId The Principal Id of the protected Resource.
	* @param protectedResourceHostName The host name of the protected Resource host name.
	* @return 
	* @throws SdkException If the operation can't be successfully completed.
	*/
	
//	public static String generateToken(String tenantContextId, String appPrincipalId,
//			String stsUrl, String acsPrincipalId, String symmetricKey, String protectedResourcePrincipalId,
//			String protectedResourceHostName) throws SdkException{
//		
//		JsonWebToken webToken;
//		try {
//			webToken = new JsonWebToken(appPrincipalId, tenantContextId, (new URI(stsUrl)).getHost(), acsPrincipalId, JWTTokenHelper.getCurrentDateTime(), 60*60);
//			
//		} catch (URISyntaxException e) {
//			throw new SdkException(SdkConfig.ErrorGeneratingToken, SdkConfig.ErrorGeneratingTokenMessage, e);
//		}
//		String assertion = JWTTokenHelper.generateAssertion(webToken, symmetricKey);
//		String resource = String.format("%s/%s@%s", protectedResourcePrincipalId, protectedResourceHostName, tenantContextId);
//		logger.info("res ->" + resource);
//		return JWTTokenHelper.getOAuthAccessTokenFromACS(stsUrl, assertion, resource);
//	
//	}
	
	public static String GetTokenFromUrl(String acsUrl, String tenantContextId, String appPrincipalId,
								String protectedResourceHostName, String password) throws SdkException{
		
		return JWTTokenHelper.GetTokenFromUrl(acsUrl, tenantContextId, appPrincipalId, protectedResourceHostName, password);
    }
	
	
}
