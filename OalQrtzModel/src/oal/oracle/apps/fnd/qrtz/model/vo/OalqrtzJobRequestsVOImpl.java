package oal.oracle.apps.fnd.qrtz.model.vo;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 25 09:39:32 PST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OalqrtzJobRequestsVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public OalqrtzJobRequestsVOImpl() {
    }

    /**
     * Returns the variable value for pJobName.
     * @return variable value for pJobName
     */
    public String getpJobName() {
        return (String)ensureVariableManager().getVariableValue("pJobName");
    }

    /**
     * Sets <code>value</code> for variable pJobName.
     * @param value value to bind as pJobName
     */
    public void setpJobName(String value) {
        ensureVariableManager().setVariableValue("pJobName", value);
    }

    /**
     * Returns the variable value for pJobType.
     * @return variable value for pJobType
     */
    public String getpJobType() {
        return (String)ensureVariableManager().getVariableValue("pJobType");
    }

    /**
     * Sets <code>value</code> for variable pJobType.
     * @param value value to bind as pJobType
     */
    public void setpJobType(String value) {
        ensureVariableManager().setVariableValue("pJobType", value);
    }

    /**
     * Returns the variable value for pResult.
     * @return variable value for pResult
     */
    public String getpResult() {
        return (String)ensureVariableManager().getVariableValue("pResult");
    }

    /**
     * Sets <code>value</code> for variable pResult.
     * @param value value to bind as pResult
     */
    public void setpResult(String value) {
        ensureVariableManager().setVariableValue("pResult", value);
    }

    /**
     * Returns the variable value for pStatus.
     * @return variable value for pStatus
     */
    public String getpStatus() {
        return (String)ensureVariableManager().getVariableValue("pStatus");
    }

    /**
     * Sets <code>value</code> for variable pStatus.
     * @param value value to bind as pStatus
     */
    public void setpStatus(String value) {
        ensureVariableManager().setVariableValue("pStatus", value);
    }
    
    public void executeQueryWithReqId(int requestId)
    {
        setWhereClause("REQUEST_ID = "+requestId);
        executeQuery();
        }

    /**
     * Returns the bind variable value for pRolesList.
     * @return bind variable value for pRolesList
     */
    public String getpRolesList() {
        return (String)getNamedWhereClauseParam("pRolesList");
    }

    /**
     * Sets <code>value</code> for bind variable pRolesList.
     * @param value value to bind as pRolesList
     */
    public void setpRolesList(String value) {
        setNamedWhereClauseParam("pRolesList", value);
    }
}
