package com.cdc.apihub.mx.AuditFirma.client.api;

import com.cdc.apihub.mx.AuditFirma.client.ApiClient;
import com.cdc.apihub.mx.AuditFirma.client.ApiException;
import com.cdc.apihub.mx.AuditFirma.client.ApiResponse;
import com.cdc.apihub.mx.AuditFirma.client.Configuration;
import com.cdc.apihub.mx.AuditFirma.client.Pair;
import com.cdc.apihub.mx.AuditFirma.client.ProgressRequestBody;
import com.cdc.apihub.mx.AuditFirma.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.cdc.apihub.mx.AuditFirma.client.model.SustitucionNIPPeticion;
import com.cdc.apihub.mx.AuditFirma.client.model.SustitucionNIPRespuesta;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SustFirmaApi {
	private ApiClient apiClient;

	public SustFirmaApi() {
		this(Configuration.getDefaultApiClient());
	}

	public SustFirmaApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public okhttp3.Call nipCall(String xApiKey, String username, String password,
			SustitucionNIPPeticion body, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = body;
		String localVarPath = "";
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		if (xApiKey != null)
			localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
		if (username != null)
			localVarHeaderParams.put("username", apiClient.parameterToString(username));
		if (password != null)
			localVarHeaderParams.put("password", apiClient.parameterToString(password));
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);
		final String[] localVarContentTypes = { "application/json" };
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);
		if (progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
				@Override
				public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
					okhttp3.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
							.body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {};
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
				localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	private okhttp3.Call nipValidateBeforeCall(String xApiKey, String username, String password,
			SustitucionNIPPeticion body, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		if (xApiKey == null) {
			throw new ApiException("Missing the required parameter 'xApiKey' when calling nip(Async)");
		}
		if (username == null) {
			throw new ApiException("Missing the required parameter 'username' when calling nip(Async)");
		}
		if (password == null) {
			throw new ApiException("Missing the required parameter 'password' when calling nip(Async)");
		}
		if (body == null) {
			throw new ApiException("Missing the required parameter 'body' when calling nip(Async)");
		}

		okhttp3.Call call = nipCall(xApiKey, username, password, body, progressListener,
				progressRequestListener);
		return call;
	}

	public SustitucionNIPRespuesta nip(String xApiKey, String username, String password,
			SustitucionNIPPeticion body) throws ApiException {
		ApiResponse<SustitucionNIPRespuesta> resp = nipWithHttpInfo(xApiKey, username, password, body);
		return resp.getData();
	}

	public ApiResponse<?> genericNIP(String xApiKey, String username, String password,
			SustitucionNIPPeticion body) throws ApiException {
		return nipWithHttpInfo(xApiKey, username, password, body);
	}

	public ApiResponse<SustitucionNIPRespuesta> nipWithHttpInfo(String xApiKey, String username,
			String password, SustitucionNIPPeticion body) throws ApiException {
		okhttp3.Call call = nipValidateBeforeCall(xApiKey, username, password, body, null, null);
		Type localVarReturnType = new TypeToken<SustitucionNIPRespuesta>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}
}
