package com.dnk.solutionapi.service;

import java.io.IOException;
import java.util.List;

import com.dnk.solutionapi.dto.*;

public interface KakaoService {
	public void insertLog(ApiUrldto aud);
	public void insertReport(KakaoReportDto krd);
	public String getApiKey(ApiUrldto aud);
	public String getaccounts(ActionDto ad);
	public String getcampaigns(ActionDto ad);
	public String getdetailcampaigns(ActionDto ad);
	public String createcampaigns(ActionDto ad);
	public String campaignsStatus(ActionDto ad);
	public String getadgroup(ActionDto ad);
	public String getdetailadgroup(ActionDto ad);
	public String createadgroup
	(
		ActionDto ad, 
		boolean status1, 
		boolean status2, 
		boolean status3, 
		boolean status4,
		boolean status5, 
		List<String> list, 
		String adgroupname, 
		String adgrouptype, 
		String adgroupsiteId,
		String contentMatchType,
		int dayBudget,
		String adgroupstrategy
	);

	public String adgroupStatus(ActionDto ad);
	public String deleteadgroup(ActionDto ad);
	public String getadcontents(ActionDto ad);
	public String getdetailadcontents(ActionDto ad);
	public String createadcontents(ActionDto ad);
	public String contentsStatus(ActionDto ad);
	public String getSearch(ActionDto ad);
	public String getDetailSearch(ActionDto ad);
	public String CreateKeyword(ActionDto ad);
	public String keyWordStatus(ActionDto ad);
	public String urlUpdate(ActionDto ad);
	public String MaxppcUpdate(ActionDto ad);
	public String deleteKeyword(ActionDto ad);
	public String createReport(ActionDto ad, KakaoReportDto krd);
	public String getReportList(ActionDto ad);
	
	public List<String> getApiKeyList(String clientId);
	
	//kakaomoment
	
	public String getTokenInfo(String path, ActionDto ad);
	public String getAcountInfo(String path, ActionDto ad);
	public String getCampaignInfo(String path, ActionDto ad);
	public String getCampaignsInfo(String path, ActionDto ad);
	public String getAdgroupsInfo(String path, ActionDto ad);
	public String getAdgroupInfo(String path, ActionDto ad);
	public String getCreativesInfo(String path, ActionDto ad);
	public String getCreativeInfo(String path, ActionDto ad);
	public String getReport(String timeunit, String startdt, String enddt, String level, String metricsGroup, String path, ActionDto ad);
	
	public String getAccess_token(int customerId);
	public String getRefresh_token(int customerId);
	public void insertKakaoT_A(ActionDto ad);
	public String adAccountId(String requestParams, String path, ActionDto ad);
	public String updateadAccountId(String requestParams, String path, ActionDto ad);
	public String creatives(String requestParams, String path, ActionDto ad);
	public String multicreatives(String path, ActionDto ad) throws IOException;
	public String updateIves(String requestParams, String path, ActionDto ad);
	public String multiupdateIves(String path, ActionDto ad) throws IOException;
	public ActionDto getTimeofToken(ActionDto ad);
	public void updateAccess_Token(ActionDto ad);
	
}
