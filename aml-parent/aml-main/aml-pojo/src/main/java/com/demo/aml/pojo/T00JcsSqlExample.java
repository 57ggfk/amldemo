package com.demo.aml.pojo;

import java.util.ArrayList;
import java.util.List;

public class T00JcsSqlExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T00_JCS_SQL
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T00_JCS_SQL
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T00_JCS_SQL
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_JCS_SQL
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    public T00JcsSqlExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_JCS_SQL
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_JCS_SQL
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_JCS_SQL
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_JCS_SQL
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_JCS_SQL
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_JCS_SQL
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_JCS_SQL
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
     * This method corresponds to the database table T00_JCS_SQL
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
     * This method corresponds to the database table T00_JCS_SQL
     *
     * @mbg.generated Mon Apr 09 14:51:59 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T00_JCS_SQL
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
     * This class corresponds to the database table T00_JCS_SQL
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

        public Criteria andJnameIsNull() {
            addCriterion("JNAME is null");
            return (Criteria) this;
        }

        public Criteria andJnameIsNotNull() {
            addCriterion("JNAME is not null");
            return (Criteria) this;
        }

        public Criteria andJnameEqualTo(String value) {
            addCriterion("JNAME =", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameNotEqualTo(String value) {
            addCriterion("JNAME <>", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameGreaterThan(String value) {
            addCriterion("JNAME >", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameGreaterThanOrEqualTo(String value) {
            addCriterion("JNAME >=", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameLessThan(String value) {
            addCriterion("JNAME <", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameLessThanOrEqualTo(String value) {
            addCriterion("JNAME <=", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameLike(String value) {
            addCriterion("JNAME like", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameNotLike(String value) {
            addCriterion("JNAME not like", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameIn(List<String> values) {
            addCriterion("JNAME in", values, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameNotIn(List<String> values) {
            addCriterion("JNAME not in", values, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameBetween(String value1, String value2) {
            addCriterion("JNAME between", value1, value2, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameNotBetween(String value1, String value2) {
            addCriterion("JNAME not between", value1, value2, "jname");
            return (Criteria) this;
        }

        public Criteria andJdtoIsNull() {
            addCriterion("JDTO is null");
            return (Criteria) this;
        }

        public Criteria andJdtoIsNotNull() {
            addCriterion("JDTO is not null");
            return (Criteria) this;
        }

        public Criteria andJdtoEqualTo(String value) {
            addCriterion("JDTO =", value, "jdto");
            return (Criteria) this;
        }

        public Criteria andJdtoNotEqualTo(String value) {
            addCriterion("JDTO <>", value, "jdto");
            return (Criteria) this;
        }

        public Criteria andJdtoGreaterThan(String value) {
            addCriterion("JDTO >", value, "jdto");
            return (Criteria) this;
        }

        public Criteria andJdtoGreaterThanOrEqualTo(String value) {
            addCriterion("JDTO >=", value, "jdto");
            return (Criteria) this;
        }

        public Criteria andJdtoLessThan(String value) {
            addCriterion("JDTO <", value, "jdto");
            return (Criteria) this;
        }

        public Criteria andJdtoLessThanOrEqualTo(String value) {
            addCriterion("JDTO <=", value, "jdto");
            return (Criteria) this;
        }

        public Criteria andJdtoLike(String value) {
            addCriterion("JDTO like", value, "jdto");
            return (Criteria) this;
        }

        public Criteria andJdtoNotLike(String value) {
            addCriterion("JDTO not like", value, "jdto");
            return (Criteria) this;
        }

        public Criteria andJdtoIn(List<String> values) {
            addCriterion("JDTO in", values, "jdto");
            return (Criteria) this;
        }

        public Criteria andJdtoNotIn(List<String> values) {
            addCriterion("JDTO not in", values, "jdto");
            return (Criteria) this;
        }

        public Criteria andJdtoBetween(String value1, String value2) {
            addCriterion("JDTO between", value1, value2, "jdto");
            return (Criteria) this;
        }

        public Criteria andJdtoNotBetween(String value1, String value2) {
            addCriterion("JDTO not between", value1, value2, "jdto");
            return (Criteria) this;
        }

        public Criteria andJsqlIsNull() {
            addCriterion("JSQL is null");
            return (Criteria) this;
        }

        public Criteria andJsqlIsNotNull() {
            addCriterion("JSQL is not null");
            return (Criteria) this;
        }

        public Criteria andJsqlEqualTo(String value) {
            addCriterion("JSQL =", value, "jsql");
            return (Criteria) this;
        }

        public Criteria andJsqlNotEqualTo(String value) {
            addCriterion("JSQL <>", value, "jsql");
            return (Criteria) this;
        }

        public Criteria andJsqlGreaterThan(String value) {
            addCriterion("JSQL >", value, "jsql");
            return (Criteria) this;
        }

        public Criteria andJsqlGreaterThanOrEqualTo(String value) {
            addCriterion("JSQL >=", value, "jsql");
            return (Criteria) this;
        }

        public Criteria andJsqlLessThan(String value) {
            addCriterion("JSQL <", value, "jsql");
            return (Criteria) this;
        }

        public Criteria andJsqlLessThanOrEqualTo(String value) {
            addCriterion("JSQL <=", value, "jsql");
            return (Criteria) this;
        }

        public Criteria andJsqlLike(String value) {
            addCriterion("JSQL like", value, "jsql");
            return (Criteria) this;
        }

        public Criteria andJsqlNotLike(String value) {
            addCriterion("JSQL not like", value, "jsql");
            return (Criteria) this;
        }

        public Criteria andJsqlIn(List<String> values) {
            addCriterion("JSQL in", values, "jsql");
            return (Criteria) this;
        }

        public Criteria andJsqlNotIn(List<String> values) {
            addCriterion("JSQL not in", values, "jsql");
            return (Criteria) this;
        }

        public Criteria andJsqlBetween(String value1, String value2) {
            addCriterion("JSQL between", value1, value2, "jsql");
            return (Criteria) this;
        }

        public Criteria andJsqlNotBetween(String value1, String value2) {
            addCriterion("JSQL not between", value1, value2, "jsql");
            return (Criteria) this;
        }

        public Criteria andJdatasourceIsNull() {
            addCriterion("JDATASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andJdatasourceIsNotNull() {
            addCriterion("JDATASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andJdatasourceEqualTo(String value) {
            addCriterion("JDATASOURCE =", value, "jdatasource");
            return (Criteria) this;
        }

        public Criteria andJdatasourceNotEqualTo(String value) {
            addCriterion("JDATASOURCE <>", value, "jdatasource");
            return (Criteria) this;
        }

        public Criteria andJdatasourceGreaterThan(String value) {
            addCriterion("JDATASOURCE >", value, "jdatasource");
            return (Criteria) this;
        }

        public Criteria andJdatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("JDATASOURCE >=", value, "jdatasource");
            return (Criteria) this;
        }

        public Criteria andJdatasourceLessThan(String value) {
            addCriterion("JDATASOURCE <", value, "jdatasource");
            return (Criteria) this;
        }

        public Criteria andJdatasourceLessThanOrEqualTo(String value) {
            addCriterion("JDATASOURCE <=", value, "jdatasource");
            return (Criteria) this;
        }

        public Criteria andJdatasourceLike(String value) {
            addCriterion("JDATASOURCE like", value, "jdatasource");
            return (Criteria) this;
        }

        public Criteria andJdatasourceNotLike(String value) {
            addCriterion("JDATASOURCE not like", value, "jdatasource");
            return (Criteria) this;
        }

        public Criteria andJdatasourceIn(List<String> values) {
            addCriterion("JDATASOURCE in", values, "jdatasource");
            return (Criteria) this;
        }

        public Criteria andJdatasourceNotIn(List<String> values) {
            addCriterion("JDATASOURCE not in", values, "jdatasource");
            return (Criteria) this;
        }

        public Criteria andJdatasourceBetween(String value1, String value2) {
            addCriterion("JDATASOURCE between", value1, value2, "jdatasource");
            return (Criteria) this;
        }

        public Criteria andJdatasourceNotBetween(String value1, String value2) {
            addCriterion("JDATASOURCE not between", value1, value2, "jdatasource");
            return (Criteria) this;
        }

        public Criteria andJdesIsNull() {
            addCriterion("JDES is null");
            return (Criteria) this;
        }

        public Criteria andJdesIsNotNull() {
            addCriterion("JDES is not null");
            return (Criteria) this;
        }

        public Criteria andJdesEqualTo(String value) {
            addCriterion("JDES =", value, "jdes");
            return (Criteria) this;
        }

        public Criteria andJdesNotEqualTo(String value) {
            addCriterion("JDES <>", value, "jdes");
            return (Criteria) this;
        }

        public Criteria andJdesGreaterThan(String value) {
            addCriterion("JDES >", value, "jdes");
            return (Criteria) this;
        }

        public Criteria andJdesGreaterThanOrEqualTo(String value) {
            addCriterion("JDES >=", value, "jdes");
            return (Criteria) this;
        }

        public Criteria andJdesLessThan(String value) {
            addCriterion("JDES <", value, "jdes");
            return (Criteria) this;
        }

        public Criteria andJdesLessThanOrEqualTo(String value) {
            addCriterion("JDES <=", value, "jdes");
            return (Criteria) this;
        }

        public Criteria andJdesLike(String value) {
            addCriterion("JDES like", value, "jdes");
            return (Criteria) this;
        }

        public Criteria andJdesNotLike(String value) {
            addCriterion("JDES not like", value, "jdes");
            return (Criteria) this;
        }

        public Criteria andJdesIn(List<String> values) {
            addCriterion("JDES in", values, "jdes");
            return (Criteria) this;
        }

        public Criteria andJdesNotIn(List<String> values) {
            addCriterion("JDES not in", values, "jdes");
            return (Criteria) this;
        }

        public Criteria andJdesBetween(String value1, String value2) {
            addCriterion("JDES between", value1, value2, "jdes");
            return (Criteria) this;
        }

        public Criteria andJdesNotBetween(String value1, String value2) {
            addCriterion("JDES not between", value1, value2, "jdes");
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

        public Criteria andSystemkeyIsNull() {
            addCriterion("SYSTEMKEY is null");
            return (Criteria) this;
        }

        public Criteria andSystemkeyIsNotNull() {
            addCriterion("SYSTEMKEY is not null");
            return (Criteria) this;
        }

        public Criteria andSystemkeyEqualTo(String value) {
            addCriterion("SYSTEMKEY =", value, "systemkey");
            return (Criteria) this;
        }

        public Criteria andSystemkeyNotEqualTo(String value) {
            addCriterion("SYSTEMKEY <>", value, "systemkey");
            return (Criteria) this;
        }

        public Criteria andSystemkeyGreaterThan(String value) {
            addCriterion("SYSTEMKEY >", value, "systemkey");
            return (Criteria) this;
        }

        public Criteria andSystemkeyGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEMKEY >=", value, "systemkey");
            return (Criteria) this;
        }

        public Criteria andSystemkeyLessThan(String value) {
            addCriterion("SYSTEMKEY <", value, "systemkey");
            return (Criteria) this;
        }

        public Criteria andSystemkeyLessThanOrEqualTo(String value) {
            addCriterion("SYSTEMKEY <=", value, "systemkey");
            return (Criteria) this;
        }

        public Criteria andSystemkeyLike(String value) {
            addCriterion("SYSTEMKEY like", value, "systemkey");
            return (Criteria) this;
        }

        public Criteria andSystemkeyNotLike(String value) {
            addCriterion("SYSTEMKEY not like", value, "systemkey");
            return (Criteria) this;
        }

        public Criteria andSystemkeyIn(List<String> values) {
            addCriterion("SYSTEMKEY in", values, "systemkey");
            return (Criteria) this;
        }

        public Criteria andSystemkeyNotIn(List<String> values) {
            addCriterion("SYSTEMKEY not in", values, "systemkey");
            return (Criteria) this;
        }

        public Criteria andSystemkeyBetween(String value1, String value2) {
            addCriterion("SYSTEMKEY between", value1, value2, "systemkey");
            return (Criteria) this;
        }

        public Criteria andSystemkeyNotBetween(String value1, String value2) {
            addCriterion("SYSTEMKEY not between", value1, value2, "systemkey");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(String value) {
            addCriterion("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(String value) {
            addCriterion("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(String value) {
            addCriterion("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(String value) {
            addCriterion("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(String value) {
            addCriterion("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLike(String value) {
            addCriterion("CREATEDATE like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotLike(String value) {
            addCriterion("CREATEDATE not like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<String> values) {
            addCriterion("CREATEDATE in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<String> values) {
            addCriterion("CREATEDATE not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(String value1, String value2) {
            addCriterion("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(String value1, String value2) {
            addCriterion("CREATEDATE not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("MODIFYDATE is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("MODIFYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(String value) {
            addCriterion("MODIFYDATE =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(String value) {
            addCriterion("MODIFYDATE <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(String value) {
            addCriterion("MODIFYDATE >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFYDATE >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(String value) {
            addCriterion("MODIFYDATE <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(String value) {
            addCriterion("MODIFYDATE <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLike(String value) {
            addCriterion("MODIFYDATE like", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotLike(String value) {
            addCriterion("MODIFYDATE not like", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<String> values) {
            addCriterion("MODIFYDATE in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<String> values) {
            addCriterion("MODIFYDATE not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(String value1, String value2) {
            addCriterion("MODIFYDATE between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(String value1, String value2) {
            addCriterion("MODIFYDATE not between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("MODIFIER =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("MODIFIER <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("MODIFIER >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIER >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("MODIFIER <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("MODIFIER <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("MODIFIER like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("MODIFIER not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("MODIFIER in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("MODIFIER not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("MODIFIER between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("MODIFIER not between", value1, value2, "modifier");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T00_JCS_SQL
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
     * This class corresponds to the database table T00_JCS_SQL
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