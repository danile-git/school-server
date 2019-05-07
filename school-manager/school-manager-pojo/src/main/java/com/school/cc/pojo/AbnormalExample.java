package com.school.cc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AbnormalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AbnormalExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWarnTypeIsNull() {
            addCriterion("warn_type is null");
            return (Criteria) this;
        }

        public Criteria andWarnTypeIsNotNull() {
            addCriterion("warn_type is not null");
            return (Criteria) this;
        }

        public Criteria andWarnTypeEqualTo(String value) {
            addCriterion("warn_type =", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeNotEqualTo(String value) {
            addCriterion("warn_type <>", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeGreaterThan(String value) {
            addCriterion("warn_type >", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("warn_type >=", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeLessThan(String value) {
            addCriterion("warn_type <", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeLessThanOrEqualTo(String value) {
            addCriterion("warn_type <=", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeLike(String value) {
            addCriterion("warn_type like", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeNotLike(String value) {
            addCriterion("warn_type not like", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeIn(List<String> values) {
            addCriterion("warn_type in", values, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeNotIn(List<String> values) {
            addCriterion("warn_type not in", values, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeBetween(String value1, String value2) {
            addCriterion("warn_type between", value1, value2, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeNotBetween(String value1, String value2) {
            addCriterion("warn_type not between", value1, value2, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnRoomIsNull() {
            addCriterion("warn_room is null");
            return (Criteria) this;
        }

        public Criteria andWarnRoomIsNotNull() {
            addCriterion("warn_room is not null");
            return (Criteria) this;
        }

        public Criteria andWarnRoomEqualTo(String value) {
            addCriterion("warn_room =", value, "warnRoom");
            return (Criteria) this;
        }

        public Criteria andWarnRoomNotEqualTo(String value) {
            addCriterion("warn_room <>", value, "warnRoom");
            return (Criteria) this;
        }

        public Criteria andWarnRoomGreaterThan(String value) {
            addCriterion("warn_room >", value, "warnRoom");
            return (Criteria) this;
        }

        public Criteria andWarnRoomGreaterThanOrEqualTo(String value) {
            addCriterion("warn_room >=", value, "warnRoom");
            return (Criteria) this;
        }

        public Criteria andWarnRoomLessThan(String value) {
            addCriterion("warn_room <", value, "warnRoom");
            return (Criteria) this;
        }

        public Criteria andWarnRoomLessThanOrEqualTo(String value) {
            addCriterion("warn_room <=", value, "warnRoom");
            return (Criteria) this;
        }

        public Criteria andWarnRoomLike(String value) {
            addCriterion("warn_room like", value, "warnRoom");
            return (Criteria) this;
        }

        public Criteria andWarnRoomNotLike(String value) {
            addCriterion("warn_room not like", value, "warnRoom");
            return (Criteria) this;
        }

        public Criteria andWarnRoomIn(List<String> values) {
            addCriterion("warn_room in", values, "warnRoom");
            return (Criteria) this;
        }

        public Criteria andWarnRoomNotIn(List<String> values) {
            addCriterion("warn_room not in", values, "warnRoom");
            return (Criteria) this;
        }

        public Criteria andWarnRoomBetween(String value1, String value2) {
            addCriterion("warn_room between", value1, value2, "warnRoom");
            return (Criteria) this;
        }

        public Criteria andWarnRoomNotBetween(String value1, String value2) {
            addCriterion("warn_room not between", value1, value2, "warnRoom");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNull() {
            addCriterion("report_time is null");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNotNull() {
            addCriterion("report_time is not null");
            return (Criteria) this;
        }

        public Criteria andReportTimeEqualTo(Date value) {
            addCriterion("report_time =", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualTo(Date value) {
            addCriterion("report_time <>", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThan(Date value) {
            addCriterion("report_time >", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("report_time >=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThan(Date value) {
            addCriterion("report_time <", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualTo(Date value) {
            addCriterion("report_time <=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeIn(List<Date> values) {
            addCriterion("report_time in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotIn(List<Date> values) {
            addCriterion("report_time not in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeBetween(Date value1, Date value2) {
            addCriterion("report_time between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotBetween(Date value1, Date value2) {
            addCriterion("report_time not between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(String value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(String value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(String value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(String value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(String value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(String value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLike(String value) {
            addCriterion("duration like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotLike(String value) {
            addCriterion("duration not like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<String> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<String> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(String value1, String value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(String value1, String value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumIsNull() {
            addCriterion("abnormal_num is null");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumIsNotNull() {
            addCriterion("abnormal_num is not null");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumEqualTo(Integer value) {
            addCriterion("abnormal_num =", value, "abnormalNum");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumNotEqualTo(Integer value) {
            addCriterion("abnormal_num <>", value, "abnormalNum");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumGreaterThan(Integer value) {
            addCriterion("abnormal_num >", value, "abnormalNum");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("abnormal_num >=", value, "abnormalNum");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumLessThan(Integer value) {
            addCriterion("abnormal_num <", value, "abnormalNum");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumLessThanOrEqualTo(Integer value) {
            addCriterion("abnormal_num <=", value, "abnormalNum");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumIn(List<Integer> values) {
            addCriterion("abnormal_num in", values, "abnormalNum");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumNotIn(List<Integer> values) {
            addCriterion("abnormal_num not in", values, "abnormalNum");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumBetween(Integer value1, Integer value2) {
            addCriterion("abnormal_num between", value1, value2, "abnormalNum");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("abnormal_num not between", value1, value2, "abnormalNum");
            return (Criteria) this;
        }

        public Criteria andRoomStateIsNull() {
            addCriterion("room_state is null");
            return (Criteria) this;
        }

        public Criteria andRoomStateIsNotNull() {
            addCriterion("room_state is not null");
            return (Criteria) this;
        }

        public Criteria andRoomStateEqualTo(String value) {
            addCriterion("room_state =", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateNotEqualTo(String value) {
            addCriterion("room_state <>", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateGreaterThan(String value) {
            addCriterion("room_state >", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateGreaterThanOrEqualTo(String value) {
            addCriterion("room_state >=", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateLessThan(String value) {
            addCriterion("room_state <", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateLessThanOrEqualTo(String value) {
            addCriterion("room_state <=", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateLike(String value) {
            addCriterion("room_state like", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateNotLike(String value) {
            addCriterion("room_state not like", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateIn(List<String> values) {
            addCriterion("room_state in", values, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateNotIn(List<String> values) {
            addCriterion("room_state not in", values, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateBetween(String value1, String value2) {
            addCriterion("room_state between", value1, value2, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateNotBetween(String value1, String value2) {
            addCriterion("room_state not between", value1, value2, "roomState");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNull() {
            addCriterion("hotel_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNotNull() {
            addCriterion("hotel_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelIdEqualTo(String value) {
            addCriterion("hotel_id =", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotEqualTo(String value) {
            addCriterion("hotel_id <>", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThan(String value) {
            addCriterion("hotel_id >", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_id >=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThan(String value) {
            addCriterion("hotel_id <", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThanOrEqualTo(String value) {
            addCriterion("hotel_id <=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLike(String value) {
            addCriterion("hotel_id like", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotLike(String value) {
            addCriterion("hotel_id not like", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdIn(List<String> values) {
            addCriterion("hotel_id in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotIn(List<String> values) {
            addCriterion("hotel_id not in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdBetween(String value1, String value2) {
            addCriterion("hotel_id between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotBetween(String value1, String value2) {
            addCriterion("hotel_id not between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andInterloperIsNull() {
            addCriterion("interloper is null");
            return (Criteria) this;
        }

        public Criteria andInterloperIsNotNull() {
            addCriterion("interloper is not null");
            return (Criteria) this;
        }

        public Criteria andInterloperEqualTo(String value) {
            addCriterion("interloper =", value, "interloper");
            return (Criteria) this;
        }

        public Criteria andInterloperNotEqualTo(String value) {
            addCriterion("interloper <>", value, "interloper");
            return (Criteria) this;
        }

        public Criteria andInterloperGreaterThan(String value) {
            addCriterion("interloper >", value, "interloper");
            return (Criteria) this;
        }

        public Criteria andInterloperGreaterThanOrEqualTo(String value) {
            addCriterion("interloper >=", value, "interloper");
            return (Criteria) this;
        }

        public Criteria andInterloperLessThan(String value) {
            addCriterion("interloper <", value, "interloper");
            return (Criteria) this;
        }

        public Criteria andInterloperLessThanOrEqualTo(String value) {
            addCriterion("interloper <=", value, "interloper");
            return (Criteria) this;
        }

        public Criteria andInterloperLike(String value) {
            addCriterion("interloper like", value, "interloper");
            return (Criteria) this;
        }

        public Criteria andInterloperNotLike(String value) {
            addCriterion("interloper not like", value, "interloper");
            return (Criteria) this;
        }

        public Criteria andInterloperIn(List<String> values) {
            addCriterion("interloper in", values, "interloper");
            return (Criteria) this;
        }

        public Criteria andInterloperNotIn(List<String> values) {
            addCriterion("interloper not in", values, "interloper");
            return (Criteria) this;
        }

        public Criteria andInterloperBetween(String value1, String value2) {
            addCriterion("interloper between", value1, value2, "interloper");
            return (Criteria) this;
        }

        public Criteria andInterloperNotBetween(String value1, String value2) {
            addCriterion("interloper not between", value1, value2, "interloper");
            return (Criteria) this;
        }

        public Criteria andEventDescIsNull() {
            addCriterion("event_desc is null");
            return (Criteria) this;
        }

        public Criteria andEventDescIsNotNull() {
            addCriterion("event_desc is not null");
            return (Criteria) this;
        }

        public Criteria andEventDescEqualTo(String value) {
            addCriterion("event_desc =", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescNotEqualTo(String value) {
            addCriterion("event_desc <>", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescGreaterThan(String value) {
            addCriterion("event_desc >", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescGreaterThanOrEqualTo(String value) {
            addCriterion("event_desc >=", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescLessThan(String value) {
            addCriterion("event_desc <", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescLessThanOrEqualTo(String value) {
            addCriterion("event_desc <=", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescLike(String value) {
            addCriterion("event_desc like", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescNotLike(String value) {
            addCriterion("event_desc not like", value, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescIn(List<String> values) {
            addCriterion("event_desc in", values, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescNotIn(List<String> values) {
            addCriterion("event_desc not in", values, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescBetween(String value1, String value2) {
            addCriterion("event_desc between", value1, value2, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andEventDescNotBetween(String value1, String value2) {
            addCriterion("event_desc not between", value1, value2, "eventDesc");
            return (Criteria) this;
        }

        public Criteria andHandleResultIsNull() {
            addCriterion("handle_result is null");
            return (Criteria) this;
        }

        public Criteria andHandleResultIsNotNull() {
            addCriterion("handle_result is not null");
            return (Criteria) this;
        }

        public Criteria andHandleResultEqualTo(String value) {
            addCriterion("handle_result =", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultNotEqualTo(String value) {
            addCriterion("handle_result <>", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultGreaterThan(String value) {
            addCriterion("handle_result >", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultGreaterThanOrEqualTo(String value) {
            addCriterion("handle_result >=", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultLessThan(String value) {
            addCriterion("handle_result <", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultLessThanOrEqualTo(String value) {
            addCriterion("handle_result <=", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultLike(String value) {
            addCriterion("handle_result like", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultNotLike(String value) {
            addCriterion("handle_result not like", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultIn(List<String> values) {
            addCriterion("handle_result in", values, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultNotIn(List<String> values) {
            addCriterion("handle_result not in", values, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultBetween(String value1, String value2) {
            addCriterion("handle_result between", value1, value2, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultNotBetween(String value1, String value2) {
            addCriterion("handle_result not between", value1, value2, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleStateIsNull() {
            addCriterion("handle_state is null");
            return (Criteria) this;
        }

        public Criteria andHandleStateIsNotNull() {
            addCriterion("handle_state is not null");
            return (Criteria) this;
        }

        public Criteria andHandleStateEqualTo(String value) {
            addCriterion("handle_state =", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateNotEqualTo(String value) {
            addCriterion("handle_state <>", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateGreaterThan(String value) {
            addCriterion("handle_state >", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateGreaterThanOrEqualTo(String value) {
            addCriterion("handle_state >=", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateLessThan(String value) {
            addCriterion("handle_state <", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateLessThanOrEqualTo(String value) {
            addCriterion("handle_state <=", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateLike(String value) {
            addCriterion("handle_state like", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateNotLike(String value) {
            addCriterion("handle_state not like", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateIn(List<String> values) {
            addCriterion("handle_state in", values, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateNotIn(List<String> values) {
            addCriterion("handle_state not in", values, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateBetween(String value1, String value2) {
            addCriterion("handle_state between", value1, value2, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateNotBetween(String value1, String value2) {
            addCriterion("handle_state not between", value1, value2, "handleState");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
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