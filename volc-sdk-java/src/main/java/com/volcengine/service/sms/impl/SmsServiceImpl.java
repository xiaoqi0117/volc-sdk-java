package com.volcengine.service.sms.impl;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Strings;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.request.*;
import com.volcengine.model.response.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.sms.SmsConfig;
import com.volcengine.service.sms.SmsService;
import com.volcengine.util.ConvertUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpHost;
import org.apache.http.NameValuePair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmsServiceImpl extends BaseServiceImpl implements SmsService {

    public static final String SourceTypeText = "text/string";

    private SmsServiceImpl() {
        super(SmsConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), SmsConfig.apiInfoList);
    }

    private SmsServiceImpl(ServiceInfo serviceInfo) {
        super(serviceInfo, SmsConfig.apiInfoList);
    }

    private SmsServiceImpl(HttpHost proxy) {
        super(SmsConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), proxy, SmsConfig.apiInfoList);
    }

    public static SmsService getInstance() {
        return new SmsServiceImpl();
    }

    public static SmsService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = SmsConfig.serviceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("Edit not support region " + region);
        }
        return new SmsServiceImpl(serviceInfo);
    }

    public static SmsService getInstance(HttpHost proxy) {
        return new SmsServiceImpl(proxy);
    }

    // low-level，需要用户自己定义serviceInfo
    public static SmsService newSmsService(ServiceInfo serviceInfo) throws Exception {
        if (serviceInfo == null) {
            throw new Exception("ServiceInfo is null");
        }
        return new SmsServiceImpl(serviceInfo);
    }

    @Override
    public SmsSendResponse send(SmsSendRequest smsSendRequest) throws Exception {
        RawResponse response = json("SendSms", new ArrayList<>(), JSON.toJSONString(smsSendRequest));
        if (response.getCode() == SdkError.EHTTP.getNumber()) {
            response = json("SendSms", new ArrayList<>(), JSON.toJSONString(smsSendRequest));
        }
        return getSmsSendResponse(response);
    }

    @Override
    public SmsSendResponse sendV2(SmsSendRequest smsSendRequest) throws Exception {
        RawResponse response = json("SendSms", new ArrayList<>(), JSON.toJSONString(smsSendRequest));
        if(response.getCode() == SdkError.EHTTP.getNumber()){
            response = json("SendSms", new ArrayList<>(), JSON.toJSONString(smsSendRequest));
        }
        return getSmsSendResponseV2(response);
    }

    @Override
    public SmsSendResponse sendVms(SmsSendRequest smsSendRequest) throws Exception {
        RawResponse response = json("SendSms", new ArrayList<>(), JSON.toJSONString(smsSendRequest));
        if(response.getCode() == SdkError.EHTTP.getNumber()){
            response = json("SendSms", new ArrayList<>(), JSON.toJSONString(smsSendRequest));
        }
        return getSmsSendResponseV2(response);
    }

    @Override
    public SmsSendResponse batchSend(SmsBatchSendRequest smsBatchSendRequest) throws Exception {
        RawResponse response = json("SendBatchSms", new ArrayList<>(), JSON.toJSONString(smsBatchSendRequest));
        if (response.getCode() == SdkError.EHTTP.getNumber()) {
            response = json("SendBatchSms", new ArrayList<>(), JSON.toJSONString(smsBatchSendRequest));
        }
        return getSmsSendResponse(response);
    }


    @Override
    public SmsSendResponse batchSendV2(SmsBatchSendRequest smsBatchSendRequest) throws Exception {
        RawResponse response = json("SendBatchSms", new ArrayList<>(), JSON.toJSONString(smsBatchSendRequest));
        if(response.getCode() == SdkError.EHTTP.getNumber()){
            response = json("SendBatchSms", new ArrayList<>(), JSON.toJSONString(smsBatchSendRequest));
        }
        return getSmsSendResponseV2(response);
    }
    @Override
    public SmsSendResponse sendVerifyCode(SmsSendVerifyCodeRequest smsSendVerifyCodeRequest) throws Exception {
        RawResponse response =
            json("SendSmsVerifyCode", new ArrayList<>(), JSON.toJSONString(smsSendVerifyCodeRequest));
        return getSmsSendResponse(response);
    }

    @Override
    public SmsSendResponse sendVerifyCodeV2(SmsSendVerifyCodeRequest smsSendVerifyCodeRequest) throws Exception {
        RawResponse response = json("SendSmsVerifyCode", new ArrayList<>(), JSON.toJSONString(smsSendVerifyCodeRequest));
        return getSmsSendResponseV2(response);
    }

    @Override
    public SmsCheckVerifyCodeResponse checkVerifyCode(SmsCheckVerifyCodeRequest smsCheckVerifyCodeRequest)
        throws Exception {
        RawResponse response =
            json("CheckSmsVerifyCode", new ArrayList<>(), JSON.toJSONString(smsCheckVerifyCodeRequest));
        return getSmsCheckResponse(response);
    }

    @Override
    public ConversionResponse conversion(ConversionRequest conversionRequest) throws Exception {
        RawResponse response = json("Conversion", new ArrayList<>(), JSON.toJSONString(conversionRequest));
        return getConversionResponse(response);
    }

    @Override
    public GetSubAccountListResponse getSubAccountList(GetSubAccountListRequest getSubAccountListRequest)
        throws Exception {
        List<NameValuePair> urlParams = ConvertUtils.convertToPair(getSubAccountListRequest);
        RawResponse response = json("GetSubAccountList", urlParams, "");
        return getSubAccountListResponse(response);
    }

    @Override
    public EditMultiReplyConfigResponse editMultiReplyConfig(EditMultiReplyConfigRequest request) throws Exception {
        RawResponse response = json("EditMultiReplyConfig", new ArrayList<>(), JSON.toJSONString(request));
        return editMultiReplyConfigResponse(response);
    }

    @Override
    public GetRelyConfigResponse getRelyConfig(GetRelyConfigRequest request) throws Exception {
        List<NameValuePair> urlParams = ConvertUtils.convertToPair(request);
        RawResponse response = json("GetRelyConfig", urlParams, "");
        return getRelyConfigResponse(response);
    }

    @Override
    public InsertSubAccountResponse insertSubAccount(InsertSubAccountRequest request) throws Exception {
        RawResponse response = json("InsertSubAccount", new ArrayList<>(), JSON.toJSONString(request));
        return insertSubAccountResponse(response);
    }

    @Override
    public GetSubAccountDetailResponse getSubAccountDetail(SubAccountRequest subAccountRequest) throws Exception {
        List<NameValuePair> urlParams = ConvertUtils.convertToPair(subAccountRequest);
        RawResponse response = json("GetSubAccountDetail", urlParams, "");
        return getSubAccountDetailResponse(response);
    }

    @Override
    public GetSmsTemplateAndOrderListResponse getSmsTemplateAndOrderList(
        GetSmsTemplateAndOrderListRequest getSmsTemplateAndOrderListRequest) throws Exception {
        List<NameValuePair> urlParams = ConvertUtils.convertToPair(getSmsTemplateAndOrderListRequest);
        RawResponse response = json("GetSmsTemplateAndOrderList", urlParams, "");
        return getSmsTemplateAndOrderListResponse(response);
    }

    @Override
    public ApplySmsTemplateResponse applySmsTemplate(ApplySmsTemplateRequest applySmsTemplateRequest) throws Exception {
        RawResponse response = json("ApplySmsTemplate", new ArrayList<>(), JSON.toJSONString(applySmsTemplateRequest));
        return applySmsTemplateResponse(response);
    }

    @Override
    public ApplySmsTemplateResponse ApplyVmsTemplate(ApplyVmsTemplateRequest req) throws Exception {
        if (req.getContents() == null || req.getContents().size() == 0) {
            throw new Exception("should contain contents");
        }
        boolean containText = isContainText(req);
        if (!containText) {
            throw new Exception("should contain text in contents");
        }
        if (StringUtils.isBlank(req.getChannelType())) {
            req.setChannelType("CN_VMS");
        }
        req.setCaller("sdk");
        RawResponse response = json("ApplyVmsTemplate", new ArrayList<>(), JSON.toJSONString(req));
        return applySmsTemplateResponse(response);
    }

    private static boolean isContainText(ApplyVmsTemplateRequest req) {
        boolean containText = false;
        for (VmsElement element : req.getContents()) {
            if (element.getSourceType() == SourceTypeText) {
                containText = true;
            }
        }
        return containText;
    }

    @Override
    public ApplySmsTemplateResponse GetVmsTemplateStatus(GetVmsTemplateStatusRequest req) throws Exception{
        RawResponse response = json("GetVmsTemplateStatus", new ArrayList<>(), JSON.toJSONString(req));
        return applySmsTemplateResponse(response);
    }


    @Override
    public DeleteSmsTemplateResponse deleteSmsTemplate(DeleteSmsTemplateRequest deleteSmsTemplateRequest)
        throws Exception {
        RawResponse response =
            json("DeleteSmsTemplate", new ArrayList<>(), JSON.toJSONString(deleteSmsTemplateRequest));
        return deleteSmsTemplateResponse(response);
    }

    @Override
    public GetSignatureAndOrderListResponse getSmsSignatureAndOrderList(
        GetSignatureAndOrderListRequest getSignatureAndOrderListRequest) throws Exception {
        List<NameValuePair> urlParams = ConvertUtils.convertToPair(getSignatureAndOrderListRequest);
        RawResponse response = json("GetSignatureAndOrderList", urlParams, "");
        return getSignatureAndOrderListResponse(response);
    }

    @Override
    public ApplySmsSignatureResponse applySmsSignature(ApplySmsSignatureRequest applySmsSignatureRequest)
        throws Exception {
        RawResponse response =
            json("ApplySmsSignature", new ArrayList<>(), JSON.toJSONString(applySmsSignatureRequest));
        return applySmsSignatureResponse(response);
    }

    @Override
    public DeleteSignatureResponse deleteSmsSignature(DeleteSignatureRequest deleteSignatureRequest) throws Exception {
        RawResponse response = json("DeleteSignature", new ArrayList<>(), JSON.toJSONString(deleteSignatureRequest));
        return deleteSignatureResponse(response);
    }

    private SmsSendResponse getSmsSendResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        SmsSendResponse res = JSON.parseObject(response.getData(), SmsSendResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private SmsSendResponse getSmsSendResponseV2(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            if (response.getException()!=null){
                return new SmsSendResponse(String.valueOf(response.getCode()), response.getException().getMessage());
            }
            return new SmsSendResponse(String.valueOf(response.getCode()), Arrays.toString(response.getData()));
        }
        SmsSendResponse res = JSON.parseObject(response.getData(), SmsSendResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            return new SmsSendResponse(meta.getError().getCode(), meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private SmsCheckVerifyCodeResponse getSmsCheckResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        SmsCheckVerifyCodeResponse res = JSON.parseObject(response.getData(), SmsCheckVerifyCodeResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private ConversionResponse getConversionResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ConversionResponse res = JSON.parseObject(response.getData(), ConversionResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private GetSubAccountListResponse getSubAccountListResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetSubAccountListResponse res = JSON.parseObject(response.getData(), GetSubAccountListResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private GetSubAccountDetailResponse getSubAccountDetailResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetSubAccountDetailResponse res = JSON.parseObject(response.getData(), GetSubAccountDetailResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private GetSmsTemplateAndOrderListResponse getSmsTemplateAndOrderListResponse(RawResponse response)
        throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetSmsTemplateAndOrderListResponse res =
            JSON.parseObject(response.getData(), GetSmsTemplateAndOrderListResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private ApplySmsTemplateResponse applySmsTemplateResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ApplySmsTemplateResponse res = JSON.parseObject(response.getData(), ApplySmsTemplateResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private DeleteSmsTemplateResponse deleteSmsTemplateResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteSmsTemplateResponse res = JSON.parseObject(response.getData(), DeleteSmsTemplateResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private GetSignatureAndOrderListResponse getSignatureAndOrderListResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetSignatureAndOrderListResponse res =
            JSON.parseObject(response.getData(), GetSignatureAndOrderListResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private ApplySmsSignatureResponse applySmsSignatureResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ApplySmsSignatureResponse res = JSON.parseObject(response.getData(), ApplySmsSignatureResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private DeleteSignatureResponse deleteSignatureResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteSignatureResponse res = JSON.parseObject(response.getData(), DeleteSignatureResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private EditMultiReplyConfigResponse editMultiReplyConfigResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        EditMultiReplyConfigResponse res = JSON.parseObject(response.getData(), EditMultiReplyConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private InsertSubAccountResponse insertSubAccountResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        InsertSubAccountResponse res = JSON.parseObject(response.getData(), InsertSubAccountResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }

    private GetRelyConfigResponse getRelyConfigResponse(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetRelyConfigResponse res = JSON.parseObject(response.getData(), GetRelyConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error:" + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("volcSMS");
        return res;
    }
}
