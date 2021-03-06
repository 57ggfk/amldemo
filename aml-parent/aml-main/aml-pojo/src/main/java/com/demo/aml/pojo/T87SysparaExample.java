package com.demo.aml.pojo;

import java.util.ArrayList;
import java.util.List;

public class T87SysparaExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    public T87SysparaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
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

        public Criteria andParakeyIsNull() {
            addCriterion("PARAKEY is null");
            return (Criteria) this;
        }

        public Criteria andParakeyIsNotNull() {
            addCriterion("PARAKEY is not null");
            return (Criteria) this;
        }

        public Criteria andParakeyEqualTo(String value) {
            addCriterion("PARAKEY =", value, "parakey");
            return (Criteria) this;
        }

        public Criteria andParakeyNotEqualTo(String value) {
            addCriterion("PARAKEY <>", value, "parakey");
            return (Criteria) this;
        }

        public Criteria andParakeyGreaterThan(String value) {
            addCriterion("PARAKEY >", value, "parakey");
            return (Criteria) this;
        }

        public Criteria andParakeyGreaterThanOrEqualTo(String value) {
            addCriterion("PARAKEY >=", value, "parakey");
            return (Criteria) this;
        }

        public Criteria andParakeyLessThan(String value) {
            addCriterion("PARAKEY <", value, "parakey");
            return (Criteria) this;
        }

        public Criteria andParakeyLessThanOrEqualTo(String value) {
            addCriterion("PARAKEY <=", value, "parakey");
            return (Criteria) this;
        }

        public Criteria andParakeyLike(String value) {
            addCriterion("PARAKEY like", value, "parakey");
            return (Criteria) this;
        }

        public Criteria andParakeyNotLike(String value) {
            addCriterion("PARAKEY not like", value, "parakey");
            return (Criteria) this;
        }

        public Criteria andParakeyIn(List<String> values) {
            addCriterion("PARAKEY in", values, "parakey");
            return (Criteria) this;
        }

        public Criteria andParakeyNotIn(List<String> values) {
            addCriterion("PARAKEY not in", values, "parakey");
            return (Criteria) this;
        }

        public Criteria andParakeyBetween(String value1, String value2) {
            addCriterion("PARAKEY between", value1, value2, "parakey");
            return (Criteria) this;
        }

        public Criteria andParakeyNotBetween(String value1, String value2) {
            addCriterion("PARAKEY not between", value1, value2, "parakey");
            return (Criteria) this;
        }

        public Criteria andParadesIsNull() {
            addCriterion("PARADES is null");
            return (Criteria) this;
        }

        public Criteria andParadesIsNotNull() {
            addCriterion("PARADES is not null");
            return (Criteria) this;
        }

        public Criteria andParadesEqualTo(String value) {
            addCriterion("PARADES =", value, "parades");
            return (Criteria) this;
        }

        public Criteria andParadesNotEqualTo(String value) {
            addCriterion("PARADES <>", value, "parades");
            return (Criteria) this;
        }

        public Criteria andParadesGreaterThan(String value) {
            addCriterion("PARADES >", value, "parades");
            return (Criteria) this;
        }

        public Criteria andParadesGreaterThanOrEqualTo(String value) {
            addCriterion("PARADES >=", value, "parades");
            return (Criteria) this;
        }

        public Criteria andParadesLessThan(String value) {
            addCriterion("PARADES <", value, "parades");
            return (Criteria) this;
        }

        public Criteria andParadesLessThanOrEqualTo(String value) {
            addCriterion("PARADES <=", value, "parades");
            return (Criteria) this;
        }

        public Criteria andParadesLike(String value) {
            addCriterion("PARADES like", value, "parades");
            return (Criteria) this;
        }

        public Criteria andParadesNotLike(String value) {
            addCriterion("PARADES not like", value, "parades");
            return (Criteria) this;
        }

        public Criteria andParadesIn(List<String> values) {
            addCriterion("PARADES in", values, "parades");
            return (Criteria) this;
        }

        public Criteria andParadesNotIn(List<String> values) {
            addCriterion("PARADES not in", values, "parades");
            return (Criteria) this;
        }

        public Criteria andParadesBetween(String value1, String value2) {
            addCriterion("PARADES between", value1, value2, "parades");
            return (Criteria) this;
        }

        public Criteria andParadesNotBetween(String value1, String value2) {
            addCriterion("PARADES not between", value1, value2, "parades");
            return (Criteria) this;
        }

        public Criteria andParavalIsNull() {
            addCriterion("PARAVAL is null");
            return (Criteria) this;
        }

        public Criteria andParavalIsNotNull() {
            addCriterion("PARAVAL is not null");
            return (Criteria) this;
        }

        public Criteria andParavalEqualTo(String value) {
            addCriterion("PARAVAL =", value, "paraval");
            return (Criteria) this;
        }

        public Criteria andParavalNotEqualTo(String value) {
            addCriterion("PARAVAL <>", value, "paraval");
            return (Criteria) this;
        }

        public Criteria andParavalGreaterThan(String value) {
            addCriterion("PARAVAL >", value, "paraval");
            return (Criteria) this;
        }

        public Criteria andParavalGreaterThanOrEqualTo(String value) {
            addCriterion("PARAVAL >=", value, "paraval");
            return (Criteria) this;
        }

        public Criteria andParavalLessThan(String value) {
            addCriterion("PARAVAL <", value, "paraval");
            return (Criteria) this;
        }

        public Criteria andParavalLessThanOrEqualTo(String value) {
            addCriterion("PARAVAL <=", value, "paraval");
            return (Criteria) this;
        }

        public Criteria andParavalLike(String value) {
            addCriterion("PARAVAL like", value, "paraval");
            return (Criteria) this;
        }

        public Criteria andParavalNotLike(String value) {
            addCriterion("PARAVAL not like", value, "paraval");
            return (Criteria) this;
        }

        public Criteria andParavalIn(List<String> values) {
            addCriterion("PARAVAL in", values, "paraval");
            return (Criteria) this;
        }

        public Criteria andParavalNotIn(List<String> values) {
            addCriterion("PARAVAL not in", values, "paraval");
            return (Criteria) this;
        }

        public Criteria andParavalBetween(String value1, String value2) {
            addCriterion("PARAVAL between", value1, value2, "paraval");
            return (Criteria) this;
        }

        public Criteria andParavalNotBetween(String value1, String value2) {
            addCriterion("PARAVAL not between", value1, value2, "paraval");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("FLAG like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("FLAG not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 09 14:51:59 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T87_SYSPARA
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
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