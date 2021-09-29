package com.lxhdj.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MissionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(Integer value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(Integer value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(Integer value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(Integer value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(Integer value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<Integer> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<Integer> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(Integer value1, Integer value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeIsNull() {
            addCriterion("mission_type is null");
            return (Criteria) this;
        }

        public Criteria andMissionTypeIsNotNull() {
            addCriterion("mission_type is not null");
            return (Criteria) this;
        }

        public Criteria andMissionTypeEqualTo(Long value) {
            addCriterion("mission_type =", value, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeNotEqualTo(Long value) {
            addCriterion("mission_type <>", value, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeGreaterThan(Long value) {
            addCriterion("mission_type >", value, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("mission_type >=", value, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeLessThan(Long value) {
            addCriterion("mission_type <", value, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeLessThanOrEqualTo(Long value) {
            addCriterion("mission_type <=", value, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeIn(List<Long> values) {
            addCriterion("mission_type in", values, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeNotIn(List<Long> values) {
            addCriterion("mission_type not in", values, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeBetween(Long value1, Long value2) {
            addCriterion("mission_type between", value1, value2, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeNotBetween(Long value1, Long value2) {
            addCriterion("mission_type not between", value1, value2, "missionType");
            return (Criteria) this;
        }

        public Criteria andMissionTypeL2IsNull() {
            addCriterion("mission_type_l2 is null");
            return (Criteria) this;
        }

        public Criteria andMissionTypeL2IsNotNull() {
            addCriterion("mission_type_l2 is not null");
            return (Criteria) this;
        }

        public Criteria andMissionTypeL2EqualTo(Long value) {
            addCriterion("mission_type_l2 =", value, "missionTypeL2");
            return (Criteria) this;
        }

        public Criteria andMissionTypeL2NotEqualTo(Long value) {
            addCriterion("mission_type_l2 <>", value, "missionTypeL2");
            return (Criteria) this;
        }

        public Criteria andMissionTypeL2GreaterThan(Long value) {
            addCriterion("mission_type_l2 >", value, "missionTypeL2");
            return (Criteria) this;
        }

        public Criteria andMissionTypeL2GreaterThanOrEqualTo(Long value) {
            addCriterion("mission_type_l2 >=", value, "missionTypeL2");
            return (Criteria) this;
        }

        public Criteria andMissionTypeL2LessThan(Long value) {
            addCriterion("mission_type_l2 <", value, "missionTypeL2");
            return (Criteria) this;
        }

        public Criteria andMissionTypeL2LessThanOrEqualTo(Long value) {
            addCriterion("mission_type_l2 <=", value, "missionTypeL2");
            return (Criteria) this;
        }

        public Criteria andMissionTypeL2In(List<Long> values) {
            addCriterion("mission_type_l2 in", values, "missionTypeL2");
            return (Criteria) this;
        }

        public Criteria andMissionTypeL2NotIn(List<Long> values) {
            addCriterion("mission_type_l2 not in", values, "missionTypeL2");
            return (Criteria) this;
        }

        public Criteria andMissionTypeL2Between(Long value1, Long value2) {
            addCriterion("mission_type_l2 between", value1, value2, "missionTypeL2");
            return (Criteria) this;
        }

        public Criteria andMissionTypeL2NotBetween(Long value1, Long value2) {
            addCriterion("mission_type_l2 not between", value1, value2, "missionTypeL2");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateMisCodeIsNull() {
            addCriterion("create_mis_code is null");
            return (Criteria) this;
        }

        public Criteria andCreateMisCodeIsNotNull() {
            addCriterion("create_mis_code is not null");
            return (Criteria) this;
        }

        public Criteria andCreateMisCodeEqualTo(String value) {
            addCriterion("create_mis_code =", value, "createMisCode");
            return (Criteria) this;
        }

        public Criteria andCreateMisCodeNotEqualTo(String value) {
            addCriterion("create_mis_code <>", value, "createMisCode");
            return (Criteria) this;
        }

        public Criteria andCreateMisCodeGreaterThan(String value) {
            addCriterion("create_mis_code >", value, "createMisCode");
            return (Criteria) this;
        }

        public Criteria andCreateMisCodeGreaterThanOrEqualTo(String value) {
            addCriterion("create_mis_code >=", value, "createMisCode");
            return (Criteria) this;
        }

        public Criteria andCreateMisCodeLessThan(String value) {
            addCriterion("create_mis_code <", value, "createMisCode");
            return (Criteria) this;
        }

        public Criteria andCreateMisCodeLessThanOrEqualTo(String value) {
            addCriterion("create_mis_code <=", value, "createMisCode");
            return (Criteria) this;
        }

        public Criteria andCreateMisCodeLike(String value) {
            addCriterion("create_mis_code like", value, "createMisCode");
            return (Criteria) this;
        }

        public Criteria andCreateMisCodeNotLike(String value) {
            addCriterion("create_mis_code not like", value, "createMisCode");
            return (Criteria) this;
        }

        public Criteria andCreateMisCodeIn(List<String> values) {
            addCriterion("create_mis_code in", values, "createMisCode");
            return (Criteria) this;
        }

        public Criteria andCreateMisCodeNotIn(List<String> values) {
            addCriterion("create_mis_code not in", values, "createMisCode");
            return (Criteria) this;
        }

        public Criteria andCreateMisCodeBetween(String value1, String value2) {
            addCriterion("create_mis_code between", value1, value2, "createMisCode");
            return (Criteria) this;
        }

        public Criteria andCreateMisCodeNotBetween(String value1, String value2) {
            addCriterion("create_mis_code not between", value1, value2, "createMisCode");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andUpdateMisCodeIsNull() {
            addCriterion("update_mis_code is null");
            return (Criteria) this;
        }

        public Criteria andUpdateMisCodeIsNotNull() {
            addCriterion("update_mis_code is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateMisCodeEqualTo(String value) {
            addCriterion("update_mis_code =", value, "updateMisCode");
            return (Criteria) this;
        }

        public Criteria andUpdateMisCodeNotEqualTo(String value) {
            addCriterion("update_mis_code <>", value, "updateMisCode");
            return (Criteria) this;
        }

        public Criteria andUpdateMisCodeGreaterThan(String value) {
            addCriterion("update_mis_code >", value, "updateMisCode");
            return (Criteria) this;
        }

        public Criteria andUpdateMisCodeGreaterThanOrEqualTo(String value) {
            addCriterion("update_mis_code >=", value, "updateMisCode");
            return (Criteria) this;
        }

        public Criteria andUpdateMisCodeLessThan(String value) {
            addCriterion("update_mis_code <", value, "updateMisCode");
            return (Criteria) this;
        }

        public Criteria andUpdateMisCodeLessThanOrEqualTo(String value) {
            addCriterion("update_mis_code <=", value, "updateMisCode");
            return (Criteria) this;
        }

        public Criteria andUpdateMisCodeLike(String value) {
            addCriterion("update_mis_code like", value, "updateMisCode");
            return (Criteria) this;
        }

        public Criteria andUpdateMisCodeNotLike(String value) {
            addCriterion("update_mis_code not like", value, "updateMisCode");
            return (Criteria) this;
        }

        public Criteria andUpdateMisCodeIn(List<String> values) {
            addCriterion("update_mis_code in", values, "updateMisCode");
            return (Criteria) this;
        }

        public Criteria andUpdateMisCodeNotIn(List<String> values) {
            addCriterion("update_mis_code not in", values, "updateMisCode");
            return (Criteria) this;
        }

        public Criteria andUpdateMisCodeBetween(String value1, String value2) {
            addCriterion("update_mis_code between", value1, value2, "updateMisCode");
            return (Criteria) this;
        }

        public Criteria andUpdateMisCodeNotBetween(String value1, String value2) {
            addCriterion("update_mis_code not between", value1, value2, "updateMisCode");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNull() {
            addCriterion("utime is null");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNotNull() {
            addCriterion("utime is not null");
            return (Criteria) this;
        }

        public Criteria andUtimeEqualTo(Date value) {
            addCriterion("utime =", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotEqualTo(Date value) {
            addCriterion("utime <>", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThan(Date value) {
            addCriterion("utime >", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("utime >=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThan(Date value) {
            addCriterion("utime <", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThanOrEqualTo(Date value) {
            addCriterion("utime <=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeIn(List<Date> values) {
            addCriterion("utime in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotIn(List<Date> values) {
            addCriterion("utime not in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeBetween(Date value1, Date value2) {
            addCriterion("utime between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotBetween(Date value1, Date value2) {
            addCriterion("utime not between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNull() {
            addCriterion("sort_order is null");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNotNull() {
            addCriterion("sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andSortOrderEqualTo(Integer value) {
            addCriterion("sort_order =", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotEqualTo(Integer value) {
            addCriterion("sort_order <>", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThan(Integer value) {
            addCriterion("sort_order >", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_order >=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThan(Integer value) {
            addCriterion("sort_order <", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThanOrEqualTo(Integer value) {
            addCriterion("sort_order <=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderIn(List<Integer> values) {
            addCriterion("sort_order in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotIn(List<Integer> values) {
            addCriterion("sort_order not in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderBetween(Integer value1, Integer value2) {
            addCriterion("sort_order between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_order not between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andCreateMisNameIsNull() {
            addCriterion("create_mis_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateMisNameIsNotNull() {
            addCriterion("create_mis_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateMisNameEqualTo(String value) {
            addCriterion("create_mis_name =", value, "createMisName");
            return (Criteria) this;
        }

        public Criteria andCreateMisNameNotEqualTo(String value) {
            addCriterion("create_mis_name <>", value, "createMisName");
            return (Criteria) this;
        }

        public Criteria andCreateMisNameGreaterThan(String value) {
            addCriterion("create_mis_name >", value, "createMisName");
            return (Criteria) this;
        }

        public Criteria andCreateMisNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_mis_name >=", value, "createMisName");
            return (Criteria) this;
        }

        public Criteria andCreateMisNameLessThan(String value) {
            addCriterion("create_mis_name <", value, "createMisName");
            return (Criteria) this;
        }

        public Criteria andCreateMisNameLessThanOrEqualTo(String value) {
            addCriterion("create_mis_name <=", value, "createMisName");
            return (Criteria) this;
        }

        public Criteria andCreateMisNameLike(String value) {
            addCriterion("create_mis_name like", value, "createMisName");
            return (Criteria) this;
        }

        public Criteria andCreateMisNameNotLike(String value) {
            addCriterion("create_mis_name not like", value, "createMisName");
            return (Criteria) this;
        }

        public Criteria andCreateMisNameIn(List<String> values) {
            addCriterion("create_mis_name in", values, "createMisName");
            return (Criteria) this;
        }

        public Criteria andCreateMisNameNotIn(List<String> values) {
            addCriterion("create_mis_name not in", values, "createMisName");
            return (Criteria) this;
        }

        public Criteria andCreateMisNameBetween(String value1, String value2) {
            addCriterion("create_mis_name between", value1, value2, "createMisName");
            return (Criteria) this;
        }

        public Criteria andCreateMisNameNotBetween(String value1, String value2) {
            addCriterion("create_mis_name not between", value1, value2, "createMisName");
            return (Criteria) this;
        }

        public Criteria andMissionObjectTypeIsNull() {
            addCriterion("mission_object_type is null");
            return (Criteria) this;
        }

        public Criteria andMissionObjectTypeIsNotNull() {
            addCriterion("mission_object_type is not null");
            return (Criteria) this;
        }

        public Criteria andMissionObjectTypeEqualTo(Integer value) {
            addCriterion("mission_object_type =", value, "missionObjectType");
            return (Criteria) this;
        }

        public Criteria andMissionObjectTypeNotEqualTo(Integer value) {
            addCriterion("mission_object_type <>", value, "missionObjectType");
            return (Criteria) this;
        }

        public Criteria andMissionObjectTypeGreaterThan(Integer value) {
            addCriterion("mission_object_type >", value, "missionObjectType");
            return (Criteria) this;
        }

        public Criteria andMissionObjectTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mission_object_type >=", value, "missionObjectType");
            return (Criteria) this;
        }

        public Criteria andMissionObjectTypeLessThan(Integer value) {
            addCriterion("mission_object_type <", value, "missionObjectType");
            return (Criteria) this;
        }

        public Criteria andMissionObjectTypeLessThanOrEqualTo(Integer value) {
            addCriterion("mission_object_type <=", value, "missionObjectType");
            return (Criteria) this;
        }

        public Criteria andMissionObjectTypeIn(List<Integer> values) {
            addCriterion("mission_object_type in", values, "missionObjectType");
            return (Criteria) this;
        }

        public Criteria andMissionObjectTypeNotIn(List<Integer> values) {
            addCriterion("mission_object_type not in", values, "missionObjectType");
            return (Criteria) this;
        }

        public Criteria andMissionObjectTypeBetween(Integer value1, Integer value2) {
            addCriterion("mission_object_type between", value1, value2, "missionObjectType");
            return (Criteria) this;
        }

        public Criteria andMissionObjectTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("mission_object_type not between", value1, value2, "missionObjectType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeIsNull() {
            addCriterion("collection_type is null");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeIsNotNull() {
            addCriterion("collection_type is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeEqualTo(Integer value) {
            addCriterion("collection_type =", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeNotEqualTo(Integer value) {
            addCriterion("collection_type <>", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeGreaterThan(Integer value) {
            addCriterion("collection_type >", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection_type >=", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeLessThan(Integer value) {
            addCriterion("collection_type <", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("collection_type <=", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeIn(List<Integer> values) {
            addCriterion("collection_type in", values, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeNotIn(List<Integer> values) {
            addCriterion("collection_type not in", values, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeBetween(Integer value1, Integer value2) {
            addCriterion("collection_type between", value1, value2, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("collection_type not between", value1, value2, "collectionType");
            return (Criteria) this;
        }

        public Criteria andQuotaTypeIsNull() {
            addCriterion("quota_type is null");
            return (Criteria) this;
        }

        public Criteria andQuotaTypeIsNotNull() {
            addCriterion("quota_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuotaTypeEqualTo(Integer value) {
            addCriterion("quota_type =", value, "quotaType");
            return (Criteria) this;
        }

        public Criteria andQuotaTypeNotEqualTo(Integer value) {
            addCriterion("quota_type <>", value, "quotaType");
            return (Criteria) this;
        }

        public Criteria andQuotaTypeGreaterThan(Integer value) {
            addCriterion("quota_type >", value, "quotaType");
            return (Criteria) this;
        }

        public Criteria andQuotaTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("quota_type >=", value, "quotaType");
            return (Criteria) this;
        }

        public Criteria andQuotaTypeLessThan(Integer value) {
            addCriterion("quota_type <", value, "quotaType");
            return (Criteria) this;
        }

        public Criteria andQuotaTypeLessThanOrEqualTo(Integer value) {
            addCriterion("quota_type <=", value, "quotaType");
            return (Criteria) this;
        }

        public Criteria andQuotaTypeIn(List<Integer> values) {
            addCriterion("quota_type in", values, "quotaType");
            return (Criteria) this;
        }

        public Criteria andQuotaTypeNotIn(List<Integer> values) {
            addCriterion("quota_type not in", values, "quotaType");
            return (Criteria) this;
        }

        public Criteria andQuotaTypeBetween(Integer value1, Integer value2) {
            addCriterion("quota_type between", value1, value2, "quotaType");
            return (Criteria) this;
        }

        public Criteria andQuotaTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("quota_type not between", value1, value2, "quotaType");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andMissionMonitorTypeIsNull() {
            addCriterion("mission_monitor_type is null");
            return (Criteria) this;
        }

        public Criteria andMissionMonitorTypeIsNotNull() {
            addCriterion("mission_monitor_type is not null");
            return (Criteria) this;
        }

        public Criteria andMissionMonitorTypeEqualTo(Integer value) {
            addCriterion("mission_monitor_type =", value, "missionMonitorType");
            return (Criteria) this;
        }

        public Criteria andMissionMonitorTypeNotEqualTo(Integer value) {
            addCriterion("mission_monitor_type <>", value, "missionMonitorType");
            return (Criteria) this;
        }

        public Criteria andMissionMonitorTypeGreaterThan(Integer value) {
            addCriterion("mission_monitor_type >", value, "missionMonitorType");
            return (Criteria) this;
        }

        public Criteria andMissionMonitorTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mission_monitor_type >=", value, "missionMonitorType");
            return (Criteria) this;
        }

        public Criteria andMissionMonitorTypeLessThan(Integer value) {
            addCriterion("mission_monitor_type <", value, "missionMonitorType");
            return (Criteria) this;
        }

        public Criteria andMissionMonitorTypeLessThanOrEqualTo(Integer value) {
            addCriterion("mission_monitor_type <=", value, "missionMonitorType");
            return (Criteria) this;
        }

        public Criteria andMissionMonitorTypeIn(List<Integer> values) {
            addCriterion("mission_monitor_type in", values, "missionMonitorType");
            return (Criteria) this;
        }

        public Criteria andMissionMonitorTypeNotIn(List<Integer> values) {
            addCriterion("mission_monitor_type not in", values, "missionMonitorType");
            return (Criteria) this;
        }

        public Criteria andMissionMonitorTypeBetween(Integer value1, Integer value2) {
            addCriterion("mission_monitor_type between", value1, value2, "missionMonitorType");
            return (Criteria) this;
        }

        public Criteria andMissionMonitorTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("mission_monitor_type not between", value1, value2, "missionMonitorType");
            return (Criteria) this;
        }

        public Criteria andPredictProcessRateIsNull() {
            addCriterion("predict_process_rate is null");
            return (Criteria) this;
        }

        public Criteria andPredictProcessRateIsNotNull() {
            addCriterion("predict_process_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPredictProcessRateEqualTo(Integer value) {
            addCriterion("predict_process_rate =", value, "predictProcessRate");
            return (Criteria) this;
        }

        public Criteria andPredictProcessRateNotEqualTo(Integer value) {
            addCriterion("predict_process_rate <>", value, "predictProcessRate");
            return (Criteria) this;
        }

        public Criteria andPredictProcessRateGreaterThan(Integer value) {
            addCriterion("predict_process_rate >", value, "predictProcessRate");
            return (Criteria) this;
        }

        public Criteria andPredictProcessRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("predict_process_rate >=", value, "predictProcessRate");
            return (Criteria) this;
        }

        public Criteria andPredictProcessRateLessThan(Integer value) {
            addCriterion("predict_process_rate <", value, "predictProcessRate");
            return (Criteria) this;
        }

        public Criteria andPredictProcessRateLessThanOrEqualTo(Integer value) {
            addCriterion("predict_process_rate <=", value, "predictProcessRate");
            return (Criteria) this;
        }

        public Criteria andPredictProcessRateIn(List<Integer> values) {
            addCriterion("predict_process_rate in", values, "predictProcessRate");
            return (Criteria) this;
        }

        public Criteria andPredictProcessRateNotIn(List<Integer> values) {
            addCriterion("predict_process_rate not in", values, "predictProcessRate");
            return (Criteria) this;
        }

        public Criteria andPredictProcessRateBetween(Integer value1, Integer value2) {
            addCriterion("predict_process_rate between", value1, value2, "predictProcessRate");
            return (Criteria) this;
        }

        public Criteria andPredictProcessRateNotBetween(Integer value1, Integer value2) {
            addCriterion("predict_process_rate not between", value1, value2, "predictProcessRate");
            return (Criteria) this;
        }

        public Criteria andShowFinishViewTypeIsNull() {
            addCriterion("show_finish_view_type is null");
            return (Criteria) this;
        }

        public Criteria andShowFinishViewTypeIsNotNull() {
            addCriterion("show_finish_view_type is not null");
            return (Criteria) this;
        }

        public Criteria andShowFinishViewTypeEqualTo(Integer value) {
            addCriterion("show_finish_view_type =", value, "showFinishViewType");
            return (Criteria) this;
        }

        public Criteria andShowFinishViewTypeNotEqualTo(Integer value) {
            addCriterion("show_finish_view_type <>", value, "showFinishViewType");
            return (Criteria) this;
        }

        public Criteria andShowFinishViewTypeGreaterThan(Integer value) {
            addCriterion("show_finish_view_type >", value, "showFinishViewType");
            return (Criteria) this;
        }

        public Criteria andShowFinishViewTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_finish_view_type >=", value, "showFinishViewType");
            return (Criteria) this;
        }

        public Criteria andShowFinishViewTypeLessThan(Integer value) {
            addCriterion("show_finish_view_type <", value, "showFinishViewType");
            return (Criteria) this;
        }

        public Criteria andShowFinishViewTypeLessThanOrEqualTo(Integer value) {
            addCriterion("show_finish_view_type <=", value, "showFinishViewType");
            return (Criteria) this;
        }

        public Criteria andShowFinishViewTypeIn(List<Integer> values) {
            addCriterion("show_finish_view_type in", values, "showFinishViewType");
            return (Criteria) this;
        }

        public Criteria andShowFinishViewTypeNotIn(List<Integer> values) {
            addCriterion("show_finish_view_type not in", values, "showFinishViewType");
            return (Criteria) this;
        }

        public Criteria andShowFinishViewTypeBetween(Integer value1, Integer value2) {
            addCriterion("show_finish_view_type between", value1, value2, "showFinishViewType");
            return (Criteria) this;
        }

        public Criteria andShowFinishViewTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("show_finish_view_type not between", value1, value2, "showFinishViewType");
            return (Criteria) this;
        }

        public Criteria andBdTransferIsNull() {
            addCriterion("bd_transfer is null");
            return (Criteria) this;
        }

        public Criteria andBdTransferIsNotNull() {
            addCriterion("bd_transfer is not null");
            return (Criteria) this;
        }

        public Criteria andBdTransferEqualTo(Integer value) {
            addCriterion("bd_transfer =", value, "bdTransfer");
            return (Criteria) this;
        }

        public Criteria andBdTransferNotEqualTo(Integer value) {
            addCriterion("bd_transfer <>", value, "bdTransfer");
            return (Criteria) this;
        }

        public Criteria andBdTransferGreaterThan(Integer value) {
            addCriterion("bd_transfer >", value, "bdTransfer");
            return (Criteria) this;
        }

        public Criteria andBdTransferGreaterThanOrEqualTo(Integer value) {
            addCriterion("bd_transfer >=", value, "bdTransfer");
            return (Criteria) this;
        }

        public Criteria andBdTransferLessThan(Integer value) {
            addCriterion("bd_transfer <", value, "bdTransfer");
            return (Criteria) this;
        }

        public Criteria andBdTransferLessThanOrEqualTo(Integer value) {
            addCriterion("bd_transfer <=", value, "bdTransfer");
            return (Criteria) this;
        }

        public Criteria andBdTransferIn(List<Integer> values) {
            addCriterion("bd_transfer in", values, "bdTransfer");
            return (Criteria) this;
        }

        public Criteria andBdTransferNotIn(List<Integer> values) {
            addCriterion("bd_transfer not in", values, "bdTransfer");
            return (Criteria) this;
        }

        public Criteria andBdTransferBetween(Integer value1, Integer value2) {
            addCriterion("bd_transfer between", value1, value2, "bdTransfer");
            return (Criteria) this;
        }

        public Criteria andBdTransferNotBetween(Integer value1, Integer value2) {
            addCriterion("bd_transfer not between", value1, value2, "bdTransfer");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNull() {
            addCriterion("plan_id is null");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNotNull() {
            addCriterion("plan_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlanIdEqualTo(Long value) {
            addCriterion("plan_id =", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotEqualTo(Long value) {
            addCriterion("plan_id <>", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThan(Long value) {
            addCriterion("plan_id >", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThanOrEqualTo(Long value) {
            addCriterion("plan_id >=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThan(Long value) {
            addCriterion("plan_id <", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThanOrEqualTo(Long value) {
            addCriterion("plan_id <=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdIn(List<Long> values) {
            addCriterion("plan_id in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotIn(List<Long> values) {
            addCriterion("plan_id not in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdBetween(Long value1, Long value2) {
            addCriterion("plan_id between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotBetween(Long value1, Long value2) {
            addCriterion("plan_id not between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andMinProcessThresholdIsNull() {
            addCriterion("min_process_threshold is null");
            return (Criteria) this;
        }

        public Criteria andMinProcessThresholdIsNotNull() {
            addCriterion("min_process_threshold is not null");
            return (Criteria) this;
        }

        public Criteria andMinProcessThresholdEqualTo(Integer value) {
            addCriterion("min_process_threshold =", value, "minProcessThreshold");
            return (Criteria) this;
        }

        public Criteria andMinProcessThresholdNotEqualTo(Integer value) {
            addCriterion("min_process_threshold <>", value, "minProcessThreshold");
            return (Criteria) this;
        }

        public Criteria andMinProcessThresholdGreaterThan(Integer value) {
            addCriterion("min_process_threshold >", value, "minProcessThreshold");
            return (Criteria) this;
        }

        public Criteria andMinProcessThresholdGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_process_threshold >=", value, "minProcessThreshold");
            return (Criteria) this;
        }

        public Criteria andMinProcessThresholdLessThan(Integer value) {
            addCriterion("min_process_threshold <", value, "minProcessThreshold");
            return (Criteria) this;
        }

        public Criteria andMinProcessThresholdLessThanOrEqualTo(Integer value) {
            addCriterion("min_process_threshold <=", value, "minProcessThreshold");
            return (Criteria) this;
        }

        public Criteria andMinProcessThresholdIn(List<Integer> values) {
            addCriterion("min_process_threshold in", values, "minProcessThreshold");
            return (Criteria) this;
        }

        public Criteria andMinProcessThresholdNotIn(List<Integer> values) {
            addCriterion("min_process_threshold not in", values, "minProcessThreshold");
            return (Criteria) this;
        }

        public Criteria andMinProcessThresholdBetween(Integer value1, Integer value2) {
            addCriterion("min_process_threshold between", value1, value2, "minProcessThreshold");
            return (Criteria) this;
        }

        public Criteria andMinProcessThresholdNotBetween(Integer value1, Integer value2) {
            addCriterion("min_process_threshold not between", value1, value2, "minProcessThreshold");
            return (Criteria) this;
        }

        public Criteria andStrategyIdIsNull() {
            addCriterion("strategy_id is null");
            return (Criteria) this;
        }

        public Criteria andStrategyIdIsNotNull() {
            addCriterion("strategy_id is not null");
            return (Criteria) this;
        }

        public Criteria andStrategyIdEqualTo(Long value) {
            addCriterion("strategy_id =", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdNotEqualTo(Long value) {
            addCriterion("strategy_id <>", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdGreaterThan(Long value) {
            addCriterion("strategy_id >", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("strategy_id >=", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdLessThan(Long value) {
            addCriterion("strategy_id <", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdLessThanOrEqualTo(Long value) {
            addCriterion("strategy_id <=", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdIn(List<Long> values) {
            addCriterion("strategy_id in", values, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdNotIn(List<Long> values) {
            addCriterion("strategy_id not in", values, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdBetween(Long value1, Long value2) {
            addCriterion("strategy_id between", value1, value2, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdNotBetween(Long value1, Long value2) {
            addCriterion("strategy_id not between", value1, value2, "strategyId");
            return (Criteria) this;
        }

        public Criteria andMinQuotaThresholdIsNull() {
            addCriterion("min_quota_threshold is null");
            return (Criteria) this;
        }

        public Criteria andMinQuotaThresholdIsNotNull() {
            addCriterion("min_quota_threshold is not null");
            return (Criteria) this;
        }

        public Criteria andMinQuotaThresholdEqualTo(Integer value) {
            addCriterion("min_quota_threshold =", value, "minQuotaThreshold");
            return (Criteria) this;
        }

        public Criteria andMinQuotaThresholdNotEqualTo(Integer value) {
            addCriterion("min_quota_threshold <>", value, "minQuotaThreshold");
            return (Criteria) this;
        }

        public Criteria andMinQuotaThresholdGreaterThan(Integer value) {
            addCriterion("min_quota_threshold >", value, "minQuotaThreshold");
            return (Criteria) this;
        }

        public Criteria andMinQuotaThresholdGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_quota_threshold >=", value, "minQuotaThreshold");
            return (Criteria) this;
        }

        public Criteria andMinQuotaThresholdLessThan(Integer value) {
            addCriterion("min_quota_threshold <", value, "minQuotaThreshold");
            return (Criteria) this;
        }

        public Criteria andMinQuotaThresholdLessThanOrEqualTo(Integer value) {
            addCriterion("min_quota_threshold <=", value, "minQuotaThreshold");
            return (Criteria) this;
        }

        public Criteria andMinQuotaThresholdIn(List<Integer> values) {
            addCriterion("min_quota_threshold in", values, "minQuotaThreshold");
            return (Criteria) this;
        }

        public Criteria andMinQuotaThresholdNotIn(List<Integer> values) {
            addCriterion("min_quota_threshold not in", values, "minQuotaThreshold");
            return (Criteria) this;
        }

        public Criteria andMinQuotaThresholdBetween(Integer value1, Integer value2) {
            addCriterion("min_quota_threshold between", value1, value2, "minQuotaThreshold");
            return (Criteria) this;
        }

        public Criteria andMinQuotaThresholdNotBetween(Integer value1, Integer value2) {
            addCriterion("min_quota_threshold not between", value1, value2, "minQuotaThreshold");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}