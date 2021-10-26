package com.lxhdj.dao.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mission")
public class Mission {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 任务名
     */
    private String name;

    /**
     * 业务类型
     */
    @Column(name = "business_type")
    private Integer businessType;

    /**
     * 任务类型
     */
    @Column(name = "mission_type")
    private Long missionType;

    /**
     * 任务二级类型
     */
    @Column(name = "mission_type_l2")
    private Long missionTypeL2;

    /**
     * 开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 完成时间
     */
    @Column(name = "finish_time")
    private Date finishTime;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建人misCode
     */
    @Column(name = "create_mis_code")
    private String createMisCode;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 更新人
     */
    @Column(name = "update_mis_code")
    private String updateMisCode;

    /**
     * 更新时间
     */
    private Date utime;

    /**
     * 任务说明
     */
    private String remark;

    /**
     * 与状态一起绑定的排序值
     */
    @Column(name = "sort_order")
    private Integer sortOrder;

    /**
     * 创建人姓名
     */
    @Column(name = "create_mis_name")
    private String createMisName;

    /**
     * 任务类型：BD、团长、大蜂窝、小蜂窝
     */
    @Column(name = "mission_object_type")
    private Integer missionObjectType;

    /**
     * bd收集反馈信息的方式，0表示bd反馈的方式，1表示团长拜访方式
     */
    @Column(name = "collection_type")
    private Integer collectionType;

    /**
     * 0表示无指标，1表示关团预警，2表示AOI点亮指标
     */
    @Column(name = "quota_type")
    private Integer quotaType;

    /**
     * App端展示的tag，无什么实际意义
     */
    private String tags;

    /**
     * 10-紧急，20-高优，30-中优，40-普通
     */
    private Integer priority;

    /**
     * 任务监控类型，0-处理，1-处理加指标，2-指标
     */
    @Column(name = "mission_monitor_type")
    private Integer missionMonitorType;

    /**
     * 预估处理率
     */
    @Column(name = "predict_process_rate")
    private Integer predictProcessRate;

    @Column(name = "show_finish_view_type")
    private Integer showFinishViewType;

    /**
     * 是否自动变更BD，0-不变更，1-变更
     */
    @Column(name = "bd_transfer")
    private Integer bdTransfer;

    /**
     * 计划id
     */
    @Column(name = "plan_id")
    private Long planId;

    /**
     * BD工作过程阀值
     */
    @Column(name = "min_process_threshold")
    private Integer minProcessThreshold;

    /**
     * 策略id
     */
    @Column(name = "strategy_id")
    private Long strategyId;

    /**
     * BD工作包结果阀值
     */
    @Column(name = "min_quota_threshold")
    private Integer minQuotaThreshold;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取任务名
     *
     * @return name - 任务名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置任务名
     *
     * @param name 任务名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取业务类型
     *
     * @return business_type - 业务类型
     */
    public Integer getBusinessType() {
        return businessType;
    }

    /**
     * 设置业务类型
     *
     * @param businessType 业务类型
     */
    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    /**
     * 获取任务类型
     *
     * @return mission_type - 任务类型
     */
    public Long getMissionType() {
        return missionType;
    }

    /**
     * 设置任务类型
     *
     * @param missionType 任务类型
     */
    public void setMissionType(Long missionType) {
        this.missionType = missionType;
    }

    /**
     * 获取任务二级类型
     *
     * @return mission_type_l2 - 任务二级类型
     */
    public Long getMissionTypeL2() {
        return missionTypeL2;
    }

    /**
     * 设置任务二级类型
     *
     * @param missionTypeL2 任务二级类型
     */
    public void setMissionTypeL2(Long missionTypeL2) {
        this.missionTypeL2 = missionTypeL2;
    }

    /**
     * 获取开始时间
     *
     * @return start_time - 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间
     *
     * @param startTime 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取完成时间
     *
     * @return finish_time - 完成时间
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * 设置完成时间
     *
     * @param finishTime 完成时间
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建人misCode
     *
     * @return create_mis_code - 创建人misCode
     */
    public String getCreateMisCode() {
        return createMisCode;
    }

    /**
     * 设置创建人misCode
     *
     * @param createMisCode 创建人misCode
     */
    public void setCreateMisCode(String createMisCode) {
        this.createMisCode = createMisCode;
    }

    /**
     * 获取创建时间
     *
     * @return ctime - 创建时间
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 设置创建时间
     *
     * @param ctime 创建时间
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * 获取更新人
     *
     * @return update_mis_code - 更新人
     */
    public String getUpdateMisCode() {
        return updateMisCode;
    }

    /**
     * 设置更新人
     *
     * @param updateMisCode 更新人
     */
    public void setUpdateMisCode(String updateMisCode) {
        this.updateMisCode = updateMisCode;
    }

    /**
     * 获取更新时间
     *
     * @return utime - 更新时间
     */
    public Date getUtime() {
        return utime;
    }

    /**
     * 设置更新时间
     *
     * @param utime 更新时间
     */
    public void setUtime(Date utime) {
        this.utime = utime;
    }

    /**
     * 获取任务说明
     *
     * @return remark - 任务说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置任务说明
     *
     * @param remark 任务说明
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取与状态一起绑定的排序值
     *
     * @return sort_order - 与状态一起绑定的排序值
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * 设置与状态一起绑定的排序值
     *
     * @param sortOrder 与状态一起绑定的排序值
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * 获取创建人姓名
     *
     * @return create_mis_name - 创建人姓名
     */
    public String getCreateMisName() {
        return createMisName;
    }

    /**
     * 设置创建人姓名
     *
     * @param createMisName 创建人姓名
     */
    public void setCreateMisName(String createMisName) {
        this.createMisName = createMisName;
    }

    /**
     * 获取任务类型：BD、团长、大蜂窝、小蜂窝
     *
     * @return mission_object_type - 任务类型：BD、团长、大蜂窝、小蜂窝
     */
    public Integer getMissionObjectType() {
        return missionObjectType;
    }

    /**
     * 设置任务类型：BD、团长、大蜂窝、小蜂窝
     *
     * @param missionObjectType 任务类型：BD、团长、大蜂窝、小蜂窝
     */
    public void setMissionObjectType(Integer missionObjectType) {
        this.missionObjectType = missionObjectType;
    }

    /**
     * 获取bd收集反馈信息的方式，0表示bd反馈的方式，1表示团长拜访方式
     *
     * @return collection_type - bd收集反馈信息的方式，0表示bd反馈的方式，1表示团长拜访方式
     */
    public Integer getCollectionType() {
        return collectionType;
    }

    /**
     * 设置bd收集反馈信息的方式，0表示bd反馈的方式，1表示团长拜访方式
     *
     * @param collectionType bd收集反馈信息的方式，0表示bd反馈的方式，1表示团长拜访方式
     */
    public void setCollectionType(Integer collectionType) {
        this.collectionType = collectionType;
    }

    /**
     * 获取0表示无指标，1表示关团预警，2表示AOI点亮指标
     *
     * @return quota_type - 0表示无指标，1表示关团预警，2表示AOI点亮指标
     */
    public Integer getQuotaType() {
        return quotaType;
    }

    /**
     * 设置0表示无指标，1表示关团预警，2表示AOI点亮指标
     *
     * @param quotaType 0表示无指标，1表示关团预警，2表示AOI点亮指标
     */
    public void setQuotaType(Integer quotaType) {
        this.quotaType = quotaType;
    }

    /**
     * 获取App端展示的tag，无什么实际意义
     *
     * @return tags - App端展示的tag，无什么实际意义
     */
    public String getTags() {
        return tags;
    }

    /**
     * 设置App端展示的tag，无什么实际意义
     *
     * @param tags App端展示的tag，无什么实际意义
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * 获取10-紧急，20-高优，30-中优，40-普通
     *
     * @return priority - 10-紧急，20-高优，30-中优，40-普通
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * 设置10-紧急，20-高优，30-中优，40-普通
     *
     * @param priority 10-紧急，20-高优，30-中优，40-普通
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取任务监控类型，0-处理，1-处理加指标，2-指标
     *
     * @return mission_monitor_type - 任务监控类型，0-处理，1-处理加指标，2-指标
     */
    public Integer getMissionMonitorType() {
        return missionMonitorType;
    }

    /**
     * 设置任务监控类型，0-处理，1-处理加指标，2-指标
     *
     * @param missionMonitorType 任务监控类型，0-处理，1-处理加指标，2-指标
     */
    public void setMissionMonitorType(Integer missionMonitorType) {
        this.missionMonitorType = missionMonitorType;
    }

    /**
     * 获取预估处理率
     *
     * @return predict_process_rate - 预估处理率
     */
    public Integer getPredictProcessRate() {
        return predictProcessRate;
    }

    /**
     * 设置预估处理率
     *
     * @param predictProcessRate 预估处理率
     */
    public void setPredictProcessRate(Integer predictProcessRate) {
        this.predictProcessRate = predictProcessRate;
    }

    /**
     * @return show_finish_view_type
     */
    public Integer getShowFinishViewType() {
        return showFinishViewType;
    }

    /**
     * @param showFinishViewType
     */
    public void setShowFinishViewType(Integer showFinishViewType) {
        this.showFinishViewType = showFinishViewType;
    }

    /**
     * 获取是否自动变更BD，0-不变更，1-变更
     *
     * @return bd_transfer - 是否自动变更BD，0-不变更，1-变更
     */
    public Integer getBdTransfer() {
        return bdTransfer;
    }

    /**
     * 设置是否自动变更BD，0-不变更，1-变更
     *
     * @param bdTransfer 是否自动变更BD，0-不变更，1-变更
     */
    public void setBdTransfer(Integer bdTransfer) {
        this.bdTransfer = bdTransfer;
    }

    /**
     * 获取计划id
     *
     * @return plan_id - 计划id
     */
    public Long getPlanId() {
        return planId;
    }

    /**
     * 设置计划id
     *
     * @param planId 计划id
     */
    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    /**
     * 获取BD工作过程阀值
     *
     * @return min_process_threshold - BD工作过程阀值
     */
    public Integer getMinProcessThreshold() {
        return minProcessThreshold;
    }

    /**
     * 设置BD工作过程阀值
     *
     * @param minProcessThreshold BD工作过程阀值
     */
    public void setMinProcessThreshold(Integer minProcessThreshold) {
        this.minProcessThreshold = minProcessThreshold;
    }

    /**
     * 获取策略id
     *
     * @return strategy_id - 策略id
     */
    public Long getStrategyId() {
        return strategyId;
    }

    /**
     * 设置策略id
     *
     * @param strategyId 策略id
     */
    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    /**
     * 获取BD工作包结果阀值
     *
     * @return min_quota_threshold - BD工作包结果阀值
     */
    public Integer getMinQuotaThreshold() {
        return minQuotaThreshold;
    }

    /**
     * 设置BD工作包结果阀值
     *
     * @param minQuotaThreshold BD工作包结果阀值
     */
    public void setMinQuotaThreshold(Integer minQuotaThreshold) {
        this.minQuotaThreshold = minQuotaThreshold;
    }
}