package oal.oracle.apps.fnd.qrtz.model.eo;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Dec 08 06:08:48 PST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OalqrtzJobParamsEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        JobParamId {
            public Object get(OalqrtzJobParamsEOImpl obj) {
                return obj.getJobParamId();
            }

            public void put(OalqrtzJobParamsEOImpl obj, Object value) {
                obj.setJobParamId((Number)value);
            }
        }
        ,
        JobId {
            public Object get(OalqrtzJobParamsEOImpl obj) {
                return obj.getJobId();
            }

            public void put(OalqrtzJobParamsEOImpl obj, Object value) {
                obj.setJobId((Number)value);
            }
        }
        ,
        ParamOrder {
            public Object get(OalqrtzJobParamsEOImpl obj) {
                return obj.getParamOrder();
            }

            public void put(OalqrtzJobParamsEOImpl obj, Object value) {
                obj.setParamOrder((Number)value);
            }
        }
        ,
        ParamName {
            public Object get(OalqrtzJobParamsEOImpl obj) {
                return obj.getParamName();
            }

            public void put(OalqrtzJobParamsEOImpl obj, Object value) {
                obj.setParamName((String)value);
            }
        }
        ,
        ParamCode {
            public Object get(OalqrtzJobParamsEOImpl obj) {
                return obj.getParamCode();
            }

            public void put(OalqrtzJobParamsEOImpl obj, Object value) {
                obj.setParamCode((String)value);
            }
        }
        ,
        ParamDataType {
            public Object get(OalqrtzJobParamsEOImpl obj) {
                return obj.getParamDataType();
            }

            public void put(OalqrtzJobParamsEOImpl obj, Object value) {
                obj.setParamDataType((String)value);
            }
        }
        ,
        ParamDefaultVal {
            public Object get(OalqrtzJobParamsEOImpl obj) {
                return obj.getParamDefaultVal();
            }

            public void put(OalqrtzJobParamsEOImpl obj, Object value) {
                obj.setParamDefaultVal((String)value);
            }
        }
        ,
        Description {
            public Object get(OalqrtzJobParamsEOImpl obj) {
                return obj.getDescription();
            }

            public void put(OalqrtzJobParamsEOImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        }
        ,
        Required {
            public Object get(OalqrtzJobParamsEOImpl obj) {
                return obj.getRequired();
            }

            public void put(OalqrtzJobParamsEOImpl obj, Object value) {
                obj.setRequired((String)value);
            }
        }
        ,
        Enabled {
            public Object get(OalqrtzJobParamsEOImpl obj) {
                return obj.getEnabled();
            }

            public void put(OalqrtzJobParamsEOImpl obj, Object value) {
                obj.setEnabled((String)value);
            }
        }
        ,
        CreationDate {
            public Object get(OalqrtzJobParamsEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(OalqrtzJobParamsEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CreatedBy {
            public Object get(OalqrtzJobParamsEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(OalqrtzJobParamsEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(OalqrtzJobParamsEOImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(OalqrtzJobParamsEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(OalqrtzJobParamsEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(OalqrtzJobParamsEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdateLogin {
            public Object get(OalqrtzJobParamsEOImpl obj) {
                return obj.getLastUpdateLogin();
            }

            public void put(OalqrtzJobParamsEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        OalqrtzJobsEO {
            public Object get(OalqrtzJobParamsEOImpl obj) {
                return obj.getOalqrtzJobsEO();
            }

            public void put(OalqrtzJobParamsEOImpl obj, Object value) {
                obj.setOalqrtzJobsEO((OalqrtzJobsEOImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(OalqrtzJobParamsEOImpl object);

        public abstract void put(OalqrtzJobParamsEOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int JOBPARAMID = AttributesEnum.JobParamId.index();
    public static final int JOBID = AttributesEnum.JobId.index();
    public static final int PARAMORDER = AttributesEnum.ParamOrder.index();
    public static final int PARAMNAME = AttributesEnum.ParamName.index();
    public static final int PARAMCODE = AttributesEnum.ParamCode.index();
    public static final int PARAMDATATYPE = AttributesEnum.ParamDataType.index();
    public static final int PARAMDEFAULTVAL = AttributesEnum.ParamDefaultVal.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int REQUIRED = AttributesEnum.Required.index();
    public static final int ENABLED = AttributesEnum.Enabled.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int OALQRTZJOBSEO = AttributesEnum.OalqrtzJobsEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public OalqrtzJobParamsEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("oal.oracle.apps.fnd.qrtz.model.eo.OalqrtzJobParamsEO");
    }

    /**
     * Gets the attribute value for JobParamId, using the alias name JobParamId.
     * @return the JobParamId
     */
    public Number getJobParamId() {
        return (Number)getAttributeInternal(JOBPARAMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for JobParamId.
     * @param value value to set the JobParamId
     */
    public void setJobParamId(Number value) {
        setAttributeInternal(JOBPARAMID, value);
    }

    /**
     * Gets the attribute value for JobId, using the alias name JobId.
     * @return the JobId
     */
    public Number getJobId() {
        return (Number)getAttributeInternal(JOBID);
    }

    /**
     * Sets <code>value</code> as the attribute value for JobId.
     * @param value value to set the JobId
     */
    public void setJobId(Number value) {
        setAttributeInternal(JOBID, value);
    }

    /**
     * Gets the attribute value for ParamOrder, using the alias name ParamOrder.
     * @return the ParamOrder
     */
    public Number getParamOrder() {
        return (Number)getAttributeInternal(PARAMORDER);
    }

    /**
     * Sets <code>value</code> as the attribute value for ParamOrder.
     * @param value value to set the ParamOrder
     */
    public void setParamOrder(Number value) {
        setAttributeInternal(PARAMORDER, value);
    }

    /**
     * Gets the attribute value for ParamName, using the alias name ParamName.
     * @return the ParamName
     */
    public String getParamName() {
        return (String)getAttributeInternal(PARAMNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for ParamName.
     * @param value value to set the ParamName
     */
    public void setParamName(String value) {
        setAttributeInternal(PARAMNAME, value);
    }

    /**
     * Gets the attribute value for ParamCode, using the alias name ParamCode.
     * @return the ParamCode
     */
    public String getParamCode() {
        return (String)getAttributeInternal(PARAMCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ParamCode.
     * @param value value to set the ParamCode
     */
    public void setParamCode(String value) {
        setAttributeInternal(PARAMCODE, value);
    }

    /**
     * Gets the attribute value for ParamDataType, using the alias name ParamDataType.
     * @return the ParamDataType
     */
    public String getParamDataType() {
        return (String)getAttributeInternal(PARAMDATATYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ParamDataType.
     * @param value value to set the ParamDataType
     */
    public void setParamDataType(String value) {
        setAttributeInternal(PARAMDATATYPE, value);
    }

    /**
     * Gets the attribute value for ParamDefaultVal, using the alias name ParamDefaultVal.
     * @return the ParamDefaultVal
     */
    public String getParamDefaultVal() {
        return (String)getAttributeInternal(PARAMDEFAULTVAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for ParamDefaultVal.
     * @param value value to set the ParamDefaultVal
     */
    public void setParamDefaultVal(String value) {
        setAttributeInternal(PARAMDEFAULTVAL, value);
    }

    /**
     * Gets the attribute value for Description, using the alias name Description.
     * @return the Description
     */
    public String getDescription() {
        return (String)getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Description.
     * @param value value to set the Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for Required, using the alias name Required.
     * @return the Required
     */
    public String getRequired() {
        return (String)getAttributeInternal(REQUIRED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Required.
     * @param value value to set the Required
     */
    public void setRequired(String value) {
        setAttributeInternal(REQUIRED, value);
    }

    /**
     * Gets the attribute value for Enabled, using the alias name Enabled.
     * @return the Enabled
     */
    public String getEnabled() {
        return (String)getAttributeInternal(ENABLED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Enabled.
     * @param value value to set the Enabled
     */
    public void setEnabled(String value) {
        setAttributeInternal(ENABLED, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Timestamp getCreationDate() {
        return (Timestamp)getAttributeInternal(CREATIONDATE);
    }


    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }


    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the LastUpdateDate
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp)getAttributeInternal(LASTUPDATEDATE);
    }


    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
    }


    /**
     * Gets the attribute value for LastUpdateLogin, using the alias name LastUpdateLogin.
     * @return the LastUpdateLogin
     */
    public String getLastUpdateLogin() {
        return (String)getAttributeInternal(LASTUPDATELOGIN);
    }


    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity OalqrtzJobsEOImpl.
     */
    public OalqrtzJobsEOImpl getOalqrtzJobsEO() {
        return (OalqrtzJobsEOImpl)getAttributeInternal(OALQRTZJOBSEO);
    }

    /**
     * Sets <code>value</code> as the associated entity OalqrtzJobsEOImpl.
     */
    public void setOalqrtzJobsEO(OalqrtzJobsEOImpl value) {
        setAttributeInternal(OALQRTZJOBSEO, value);
    }


    /**
     * @param jobParamId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number jobParamId) {
        return new Key(new Object[]{jobParamId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl sequence = new SequenceImpl("OALQRTZ_JOB_PARAMS_S",getDBTransaction());
        setJobParamId(sequence.getSequenceNumber());
        setNewRowState(STATUS_INITIALIZED);
    }
}
