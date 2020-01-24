package com.example.retrofittest;

import java.util.List;

public class Post {

    /**
     * caseId : 20150922000001
     * caseName : 前內政部北區兒童之家院長宿舍
     * assetsClassifyCode : 1.1.2
     * assetsClassifyName : 直轄市定古蹟
     * assetsTypeCode : A3
     * assetsTypeName : 宅第
     * pastHistory : 「前內政部北區兒童之家」前身為臺灣省臺北育幼院。育幼院初創於臺北北投，主要收容撫育貧困失養之兒童。後因北投舊址房舍設備老舊、地域狹窄，無法擴院，為配合院務推展需求，遂於民國69年由北投院區搬遷至桃園蘆竹。同時配合桃園院區之設立，興建育幼院獨棟之院長宿舍、二層連棟之員工單身宿舍或家庭宿舍等，共計七棟建物。
     * judgeCriteria : ["具歷史、文化、藝術價值","具建築史上之意義，有再利用之價值及潛力者","具其他古蹟價值者"]
     * registerReason : 1.具歷史、文化、藝術價值:為前臺灣省臺北育幼院由北投搬遷至桃園蘆竹，整體宿舍群具有見證幼教、保育歷史意義。
     2.具建築史上之意義，有再利用之價值及潛力者：
     (1)院長宿舍為本區宿舍群中最具特色之建築，為獨門日式屋舍，略具50年代建築風格。
     (2)建物保存狀況尚佳，場域完整，具再利用發展潛力。
     * lawsReference : 古蹟指定及廢止審查辦法第2條第1項第5、6款。
     * officialDocNo : 府文資字第1040242409號
     * registerDate : 2015-09-22
     * govInstitutionName : 桃園市政府
     * belongAddress : 桃園市蘆竹區吉林路34號
     * belongCity : 桃園市蘆竹區
     * longitude : 121.297441
     * latitude : 25.050319
     * govInstitution : 桃園市政府文化局
     * govDeptName : 文化資產科
     * govDeptAddress : 桃園市桃園區 縣府路21號
     * cityLand : 都市地區 住宅區
     * caseOwnership : [{"ownerType":"土地所有人","ownerName":"中華民國"}]
     * caseUrl : http://nchdb.boch.gov.tw/assets/overview/monument/20150922000001
     * buildingFeatures : 院長宿舍為本區宿舍群中最具特色之建築，為獨門日式屋舍，略具50年代建築風格，惟經整修後已不見日式木構造建築特色。
     * inHouseFeatures : 三房兩廳之配置。
     * buildingActualState : 桃園市歷史建築前內政部北區兒童之家宿舍群整體修復工程107年６月27日竣工，現文化局OT委託經營管理，整體園區命名為「南崁兒童藝術村」。
     * govDeptContactor : 趙嘉華
     * govDeptPhone : 03-3322592分機8603
     * govDeptEmail : 10037610@mail.tycg.gov.tw
     */

    private String caseId;
    private String caseName;
    private String assetsClassifyCode;
    private String assetsClassifyName;
    private String assetsTypeCode;
    private String assetsTypeName;
    private String pastHistory;
    private String registerReason;
    private String lawsReference;
    private String officialDocNo;
    private String registerDate;
    private String govInstitutionName;
    private String belongAddress;
    private String belongCity;
    private double longitude;
    private double latitude;
    private String govInstitution;
    private String govDeptName;
    private String govDeptAddress;
    private String cityLand;
    private String caseUrl;
    private String buildingFeatures;
    private String inHouseFeatures;
    private String buildingActualState;
    private String govDeptContactor;
    private String govDeptPhone;
    private String govDeptEmail;
    private List<String> judgeCriteria;
    private List<CaseOwnershipBean> caseOwnership;

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getAssetsClassifyCode() {
        return assetsClassifyCode;
    }

    public void setAssetsClassifyCode(String assetsClassifyCode) {
        this.assetsClassifyCode = assetsClassifyCode;
    }

    public String getAssetsClassifyName() {
        return assetsClassifyName;
    }

    public void setAssetsClassifyName(String assetsClassifyName) {
        this.assetsClassifyName = assetsClassifyName;
    }

    public String getAssetsTypeCode() {
        return assetsTypeCode;
    }

    public void setAssetsTypeCode(String assetsTypeCode) {
        this.assetsTypeCode = assetsTypeCode;
    }

    public String getAssetsTypeName() {
        return assetsTypeName;
    }

    public void setAssetsTypeName(String assetsTypeName) {
        this.assetsTypeName = assetsTypeName;
    }

    public String getPastHistory() {
        return pastHistory;
    }

    public void setPastHistory(String pastHistory) {
        this.pastHistory = pastHistory;
    }

    public String getRegisterReason() {
        return registerReason;
    }

    public void setRegisterReason(String registerReason) {
        this.registerReason = registerReason;
    }

    public String getLawsReference() {
        return lawsReference;
    }

    public void setLawsReference(String lawsReference) {
        this.lawsReference = lawsReference;
    }

    public String getOfficialDocNo() {
        return officialDocNo;
    }

    public void setOfficialDocNo(String officialDocNo) {
        this.officialDocNo = officialDocNo;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getGovInstitutionName() {
        return govInstitutionName;
    }

    public void setGovInstitutionName(String govInstitutionName) {
        this.govInstitutionName = govInstitutionName;
    }

    public String getBelongAddress() {
        return belongAddress;
    }

    public void setBelongAddress(String belongAddress) {
        this.belongAddress = belongAddress;
    }

    public String getBelongCity() {
        return belongCity;
    }

    public void setBelongCity(String belongCity) {
        this.belongCity = belongCity;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getGovInstitution() {
        return govInstitution;
    }

    public void setGovInstitution(String govInstitution) {
        this.govInstitution = govInstitution;
    }

    public String getGovDeptName() {
        return govDeptName;
    }

    public void setGovDeptName(String govDeptName) {
        this.govDeptName = govDeptName;
    }

    public String getGovDeptAddress() {
        return govDeptAddress;
    }

    public void setGovDeptAddress(String govDeptAddress) {
        this.govDeptAddress = govDeptAddress;
    }

    public String getCityLand() {
        return cityLand;
    }

    public void setCityLand(String cityLand) {
        this.cityLand = cityLand;
    }

    public String getCaseUrl() {
        return caseUrl;
    }

    public void setCaseUrl(String caseUrl) {
        this.caseUrl = caseUrl;
    }

    public String getBuildingFeatures() {
        return buildingFeatures;
    }

    public void setBuildingFeatures(String buildingFeatures) {
        this.buildingFeatures = buildingFeatures;
    }

    public String getInHouseFeatures() {
        return inHouseFeatures;
    }

    public void setInHouseFeatures(String inHouseFeatures) {
        this.inHouseFeatures = inHouseFeatures;
    }

    public String getBuildingActualState() {
        return buildingActualState;
    }

    public void setBuildingActualState(String buildingActualState) {
        this.buildingActualState = buildingActualState;
    }

    public String getGovDeptContactor() {
        return govDeptContactor;
    }

    public void setGovDeptContactor(String govDeptContactor) {
        this.govDeptContactor = govDeptContactor;
    }

    public String getGovDeptPhone() {
        return govDeptPhone;
    }

    public void setGovDeptPhone(String govDeptPhone) {
        this.govDeptPhone = govDeptPhone;
    }

    public String getGovDeptEmail() {
        return govDeptEmail;
    }

    public void setGovDeptEmail(String govDeptEmail) {
        this.govDeptEmail = govDeptEmail;
    }

    public List<String> getJudgeCriteria() {
        return judgeCriteria;
    }

    public void setJudgeCriteria(List<String> judgeCriteria) {
        this.judgeCriteria = judgeCriteria;
    }

    public List<CaseOwnershipBean> getCaseOwnership() {
        return caseOwnership;
    }

    public void setCaseOwnership(List<CaseOwnershipBean> caseOwnership) {
        this.caseOwnership = caseOwnership;
    }

    public static class CaseOwnershipBean {
        /**
         * ownerType : 土地所有人
         * ownerName : 中華民國
         */

        private String ownerType;
        private String ownerName;

        public String getOwnerType() {
            return ownerType;
        }

        public void setOwnerType(String ownerType) {
            this.ownerType = ownerType;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }
    }
}
